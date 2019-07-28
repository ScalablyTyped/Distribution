package typings.atPopmotionEasing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPopmotionEasingMod {
  type Easing = js.Function1[/* v */ Double, Double]
  type EasingModifier = js.Function1[/* easing */ Easing, Easing]
}
