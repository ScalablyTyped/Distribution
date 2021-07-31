package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentFilter extends StObject {
  
  /** The android:name value of the tag. */
  var actionNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The android:name value of the tag. */
  var categoryNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The android:mimeType value of the tag. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object IntentFilter {
  
  @scala.inline
  def apply(): IntentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentFilter]
  }
  
  @scala.inline
  implicit class IntentFilterMutableBuilder[Self <: IntentFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionNames(value: js.Array[String]): Self = StObject.set(x, "actionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNamesUndefined: Self = StObject.set(x, "actionNames", js.undefined)
    
    @scala.inline
    def setActionNamesVarargs(value: String*): Self = StObject.set(x, "actionNames", js.Array(value :_*))
    
    @scala.inline
    def setCategoryNames(value: js.Array[String]): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
    
    @scala.inline
    def setCategoryNamesVarargs(value: String*): Self = StObject.set(x, "categoryNames", js.Array(value :_*))
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
