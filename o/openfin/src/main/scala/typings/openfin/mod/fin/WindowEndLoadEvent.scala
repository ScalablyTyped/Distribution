package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEndLoadEvent
  extends StObject
     with WindowEvent {
  
  var documentName: String
  
  var isMain: Boolean
}
object WindowEndLoadEvent {
  
  inline def apply(
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
  
  extension [Self <: WindowEndLoadEvent](x: Self) {
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
  }
}
