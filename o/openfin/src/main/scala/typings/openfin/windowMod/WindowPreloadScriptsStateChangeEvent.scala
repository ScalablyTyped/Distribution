package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowPreloadScriptsStateChangeEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var preloadScripts: js.Array[PreloadScriptInfoRunning & Any]
}
object WindowPreloadScriptsStateChangeEvent {
  
  inline def apply[Topic, Type](
    name: String,
    preloadScripts: js.Array[PreloadScriptInfoRunning & Any],
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPreloadScriptsStateChangeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPreloadScriptsStateChangeEvent[Topic, Type]]
  }
  
  extension [Self <: WindowPreloadScriptsStateChangeEvent[?, ?], Topic, Type](x: Self & (WindowPreloadScriptsStateChangeEvent[Topic, Type])) {
    
    inline def setPreloadScripts(value: js.Array[PreloadScriptInfoRunning & Any]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
    
    inline def setPreloadScriptsVarargs(value: (PreloadScriptInfoRunning & Any)*): Self = StObject.set(x, "preloadScripts", js.Array(value*))
  }
}
