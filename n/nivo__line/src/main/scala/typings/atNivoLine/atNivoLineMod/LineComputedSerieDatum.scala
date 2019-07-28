package typings.atNivoLine.atNivoLineMod

import typings.atNivoLine.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineComputedSerieDatum extends js.Object {
  var data: LineDatum
  var position: Anon_X
}

object LineComputedSerieDatum {
  @scala.inline
  def apply(data: LineDatum, position: Anon_X): LineComputedSerieDatum = {
    val __obj = js.Dynamic.literal(data = data, position = position)
  
    __obj.asInstanceOf[LineComputedSerieDatum]
  }
}

