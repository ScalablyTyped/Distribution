package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodespacenameString extends StObject {
  
  /** The name of the codespace. */
  var codespace_name: String
}
object CodespacenameString {
  
  inline def apply(codespace_name: String): CodespacenameString = {
    val __obj = js.Dynamic.literal(codespace_name = codespace_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodespacenameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodespacenameString] (val x: Self) extends AnyVal {
    
    inline def setCodespace_name(value: String): Self = StObject.set(x, "codespace_name", value.asInstanceOf[js.Any])
  }
}
