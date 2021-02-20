package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEndLoadEvent extends WindowEvent {
  
  var documentName: String = js.native
  
  var isMain: Boolean = js.native
}
object WindowEndLoadEvent {
  
  @scala.inline
  def apply(
    documentName: String,
    isMain: Boolean,
    name: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    uuid: String
  ): WindowEndLoadEvent = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent]
  }
  
  @scala.inline
  implicit class WindowEndLoadEventMutableBuilder[Self <: WindowEndLoadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
  }
}
