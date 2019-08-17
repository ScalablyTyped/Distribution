package typings.atNivoScales

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoScalesMod {
  import typings.std.Date

  type ScaleFunc = js.Function1[/* value */ String | Double | Date, Double]
}
