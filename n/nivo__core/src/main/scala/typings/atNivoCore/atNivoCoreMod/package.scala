package typings.atNivoCore

import typings.atNivoCore.Anon_Animate
import typings.atNivoCore.Anon_Axis
import typings.atNivoCore.Anon_Bottom
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoCoreMod {
  type Box = Partial[Anon_Bottom]
  type Colors = js.Array[String] | String
  type GetColor[T] = js.Function1[/* datum */ T, String]
  type MotionProps = Partial[Anon_Animate]
  type SvgFillMatcher[T] = js.Function1[/* datum */ T, Boolean]
  type Theme = Partial[Anon_Axis]
}
