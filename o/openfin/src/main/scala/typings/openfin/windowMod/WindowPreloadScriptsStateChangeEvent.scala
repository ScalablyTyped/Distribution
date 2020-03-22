package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowPreloadScriptsStateChangeEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any]
}

object WindowPreloadScriptsStateChangeEvent {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    preloadScripts: js.Array[PreloadScriptInfoRunning with js.Any],
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPreloadScriptsStateChangeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], preloadScripts = preloadScripts.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPreloadScriptsStateChangeEvent[Topic, Type]]
  }
}

