package typings.popmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpolateMod {
  type Mix[T] = js.Function1[/* v */ scala.Double, T]
  type MixEasing = typings.popmotionEasing.mod.Easing | js.Array[typings.popmotionEasing.mod.Easing]
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, typings.popmotionPopcorn.interpolateMod.Mix[T]]
}
