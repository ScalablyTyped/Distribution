package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelsResponse extends StObject {
  
  /**
    * List of labels. Note that each label resource only contains an `id`, `name`, `messageListVisibility`, `labelListVisibility`, and `type`. The labels.get method can fetch additional
    * label details.
    */
  var labels: js.UndefOr[js.Array[Label]] = js.undefined
}
object ListLabelsResponse {
  
  inline def apply(): ListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLabelsResponse] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
