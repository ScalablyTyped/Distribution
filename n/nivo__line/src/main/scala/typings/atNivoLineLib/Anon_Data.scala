package typings
package atNivoLineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Anon_XY
  var position: Anon_X
  var serie: atNivoLineLib.atNivoLineMod.LineComputedSerieData
}

object Anon_Data {
  @scala.inline
  def apply(data: Anon_XY, position: Anon_X, serie: atNivoLineLib.atNivoLineMod.LineComputedSerieData): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, position = position, serie = serie)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

