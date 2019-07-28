package typings.numbro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Billion extends js.Object {
  var billion: String
  var million: String
  var spaced: js.UndefOr[Boolean] = js.undefined
  var thousand: String
  var trillion: String
}

object Anon_Billion {
  @scala.inline
  def apply(
    billion: String,
    million: String,
    thousand: String,
    trillion: String,
    spaced: js.UndefOr[Boolean] = js.undefined
  ): Anon_Billion = {
    val __obj = js.Dynamic.literal(billion = billion, million = million, thousand = thousand, trillion = trillion)
    if (!js.isUndefined(spaced)) __obj.updateDynamic("spaced")(spaced)
    __obj.asInstanceOf[Anon_Billion]
  }
}

