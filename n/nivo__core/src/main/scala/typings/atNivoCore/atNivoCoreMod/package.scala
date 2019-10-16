package typings.atNivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoCoreMod {
  type Colors = js.Array[String] | String
  type GetColor[T] = js.Function1[/* datum */ T, String]
  type SvgFillMatcher[T] = js.Function1[/* datum */ T, Boolean]
}
