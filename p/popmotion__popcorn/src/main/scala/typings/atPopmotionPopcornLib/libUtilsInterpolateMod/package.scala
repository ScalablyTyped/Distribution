package typings
package atPopmotionPopcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsInterpolateMod {
  type Mix[T] = js.Function1[/* v */ scala.Double, T]
  type MixEasing = atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing]
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, Mix[T]]
}
