package typings.nivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Colors = js.Array[java.lang.String] | java.lang.String
  type GetColor[T] = js.Function1[/* datum */ T, java.lang.String]
  type SvgFillMatcher[T] = js.Function1[/* datum */ T, scala.Boolean]
}
