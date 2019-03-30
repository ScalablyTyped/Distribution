package typings
package atNivoCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoCoreMod {
  type Box = stdLib.Partial[atNivoCoreLib.Anon_Bottom]
  type Colors = js.Array[java.lang.String] | java.lang.String
  type GetColor[T] = js.Function1[/* datum */ T, java.lang.String]
  type MotionProps = stdLib.Partial[atNivoCoreLib.Anon_Animate]
  type SvgFillMatcher[T] = js.Function1[/* datum */ T, scala.Boolean]
  type Theme = stdLib.Partial[atNivoCoreLib.Anon_Axis]
}
