package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEndLoadEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var documentName: String
  
  var isMain: Boolean
}
object WindowEndLoadEvent {
  
  inline def apply[Topic, Type](documentName: String, isMain: Boolean, name: String, topic: Topic, `type`: Type, uuid: String): WindowEndLoadEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent[Topic, Type]]
  }
  
  extension [Self <: WindowEndLoadEvent[?, ?], Topic, Type](x: Self & (WindowEndLoadEvent[Topic, Type])) {
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
  }
}
