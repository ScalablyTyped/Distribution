package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.password
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCredential extends StObject {
  
  var `type`: text | password
}
object NodeCredential {
  
  inline def apply(`type`: text | password): NodeCredential = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeCredential] (val x: Self) extends AnyVal {
    
    inline def setType(value: text | password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
