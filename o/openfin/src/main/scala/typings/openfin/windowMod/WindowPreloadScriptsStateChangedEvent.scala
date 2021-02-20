package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowPreloadScriptsStateChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any] = js.native
}
object WindowPreloadScriptsStateChangedEvent {
  
  @scala.inline
  def apply[Topic, Type](
    name: String,
    preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any],
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPreloadScriptsStateChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPreloadScriptsStateChangedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowPreloadScriptsStateChangedEventMutableBuilder[Self <: WindowPreloadScriptsStateChangedEvent[_, _], Topic, Type] (val x: Self with (WindowPreloadScriptsStateChangedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setPreloadScripts(value: js.Array[PreloadScriptInfoRunning with js.Any]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadScriptsVarargs(value: (PreloadScriptInfoRunning with js.Any)*): Self = StObject.set(x, "preloadScripts", js.Array(value :_*))
  }
}
