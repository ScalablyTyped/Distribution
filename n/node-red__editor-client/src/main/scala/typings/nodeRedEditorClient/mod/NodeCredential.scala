package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.password
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCredential extends StObject {
  
  var `type`: text | password = js.native
}
object NodeCredential {
  
  @scala.inline
  def apply(`type`: text | password): NodeCredential = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCredential]
  }
  
  @scala.inline
  implicit class NodeCredentialMutableBuilder[Self <: NodeCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: text | password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
