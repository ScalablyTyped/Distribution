package typings.atNivoLine

import typings.atNivoLine.atNivoLineMod.LineComputedSerieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Anon_XY
  var position: Anon_X
  var serie: LineComputedSerieData
}

object Anon_Data {
  @scala.inline
  def apply(data: Anon_XY, position: Anon_X, serie: LineComputedSerieData): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], serie = serie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

