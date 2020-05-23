package typings.openfin.eventsBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEventMap
  extends /**
  * @hidden
  * Custom properties and metadata. This can be extended in specific context object.
  */
/* key */ StringDictionary[js.Any] {
  var listenerRemoved: String
  var newListener: String
}

object BaseEventMap {
  @scala.inline
  def apply(
    listenerRemoved: String,
    newListener: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): BaseEventMap = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BaseEventMap]
  }
}

