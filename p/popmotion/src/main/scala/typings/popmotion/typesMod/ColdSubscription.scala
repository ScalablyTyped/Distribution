package typings.popmotion.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColdSubscription
  extends /* key */ StringDictionary[js.UndefOr[js.Function]] {
  def stop(): Unit
}

object ColdSubscription {
  @scala.inline
  def apply(stop: () => Unit, StringDictionary: /* key */ StringDictionary[js.UndefOr[js.Function]] = null): ColdSubscription = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColdSubscription]
  }
}

