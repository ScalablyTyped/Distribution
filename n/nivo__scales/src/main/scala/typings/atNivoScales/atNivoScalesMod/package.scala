package typings.atNivoScales

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoScalesMod {
  type ScaleFunc = js.Function1[/* value */ String | Double | Date, Double]
}
