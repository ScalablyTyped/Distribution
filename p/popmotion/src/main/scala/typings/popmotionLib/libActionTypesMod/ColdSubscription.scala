package typings
package popmotionLib.libActionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColdSubscription
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Function]] {
  def stop(): scala.Unit
}

object ColdSubscription {
  @scala.inline
  def apply(
    stop: () => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Function]] = null
  ): ColdSubscription = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColdSubscription]
  }
}

