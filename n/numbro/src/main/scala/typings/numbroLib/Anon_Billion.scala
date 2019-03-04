package typings
package numbroLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Billion extends js.Object {
  var billion: java.lang.String
  var million: java.lang.String
  var spaced: js.UndefOr[scala.Boolean] = js.undefined
  var thousand: java.lang.String
  var trillion: java.lang.String
}

object Anon_Billion {
  @scala.inline
  def apply(
    billion: java.lang.String,
    million: java.lang.String,
    thousand: java.lang.String,
    trillion: java.lang.String,
    spaced: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Billion = {
    val __obj = js.Dynamic.literal(billion = billion, million = million, thousand = thousand, trillion = trillion)
    if (!js.isUndefined(spaced)) __obj.updateDynamic("spaced")(spaced)
    __obj.asInstanceOf[Anon_Billion]
  }
}

