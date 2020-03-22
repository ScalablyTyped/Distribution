package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowPerformanceReport[Topic, Type] extends WindowEvent[Topic, Type] {
  var navigation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.navigation */ js.Any
  var timeOrigin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timeOrigin */ js.Any
  var timing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timing */ js.Any
}

object WindowPerformanceReport {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    navigation: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.navigation */ js.Any,
    timeOrigin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timeOrigin */ js.Any,
    timing: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.performance.timing */ js.Any,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowPerformanceReport[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], timeOrigin = timeOrigin.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPerformanceReport[Topic, Type]]
  }
}

