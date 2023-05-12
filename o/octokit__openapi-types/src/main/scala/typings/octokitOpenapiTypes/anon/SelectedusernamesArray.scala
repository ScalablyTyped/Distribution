package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedusernamesArray extends StObject {
  
  /** @description The usernames of the organization members whose codespaces should not be billed to the organization. */
  var selected_usernames: js.Array[String]
}
object SelectedusernamesArray {
  
  inline def apply(selected_usernames: js.Array[String]): SelectedusernamesArray = {
    val __obj = js.Dynamic.literal(selected_usernames = selected_usernames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedusernamesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedusernamesArray] (val x: Self) extends AnyVal {
    
    inline def setSelected_usernames(value: js.Array[String]): Self = StObject.set(x, "selected_usernames", value.asInstanceOf[js.Any])
    
    inline def setSelected_usernamesVarargs(value: String*): Self = StObject.set(x, "selected_usernames", js.Array(value*))
  }
}
