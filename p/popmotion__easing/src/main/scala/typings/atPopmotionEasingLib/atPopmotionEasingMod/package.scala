package typings
package atPopmotionEasingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPopmotionEasingMod {
  type Easing = js.Function1[/* v */ scala.Double, scala.Double]
  type EasingModifier = js.Function1[/* easing */ Easing, Easing]
}
