package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineComputedSerieDatum extends js.Object {
  var data: LineDatum
  var position: atNivoLineLib.Anon_X
}

object LineComputedSerieDatum {
  @scala.inline
  def apply(data: LineDatum, position: atNivoLineLib.Anon_X): LineComputedSerieDatum = {
    val __obj = js.Dynamic.literal(data = data, position = position)
  
    __obj.asInstanceOf[LineComputedSerieDatum]
  }
}

