package typings.atOracleOraclejet.ojmessageMod.ojMessageNs

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.header
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DisplayOptions extends js.Object {
  var category: js.UndefOr[header | none | auto] = js.undefined
}

object DisplayOptions {
  @scala.inline
  def apply(category: header | none | auto = null): DisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
}

