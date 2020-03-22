package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowPreloadScriptsStateChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var preloadScripts: (js.Array[PreloadScriptInfoRunning with js.Any]) with (js.Array[PreloadScriptInfo with js.Any])
}

object WindowPreloadScriptsStateChangedEvent {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    preloadScripts: (js.Array[PreloadScriptInfoRunning with js.Any]) with (js.Array[PreloadScriptInfo with js.Any]),
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPreloadScriptsStateChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPreloadScriptsStateChangedEvent[Topic, Type]]
  }
}

