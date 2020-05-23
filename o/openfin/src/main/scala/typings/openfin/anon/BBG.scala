package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBG extends /* key */ StringDictionary[String] {
  var BBG: js.UndefOr[String] = js.undefined
  var CUSIP: js.UndefOr[String] = js.undefined
  var FIGI: js.UndefOr[String] = js.undefined
  var ISIN: js.UndefOr[String] = js.undefined
  var PERMID: js.UndefOr[String] = js.undefined
  var RIC: js.UndefOr[String] = js.undefined
  var SEDOL: js.UndefOr[String] = js.undefined
  var ticker: js.UndefOr[String] = js.undefined
}

object BBG {
  @scala.inline
  def apply(
    BBG: String = null,
    CUSIP: String = null,
    FIGI: String = null,
    ISIN: String = null,
    PERMID: String = null,
    RIC: String = null,
    SEDOL: String = null,
    StringDictionary: /* name */ StringDictionary[String] = null,
    ticker: String = null
  ): BBG = {
    val __obj = js.Dynamic.literal()
    if (BBG != null) __obj.updateDynamic("BBG")(BBG.asInstanceOf[js.Any])
    if (CUSIP != null) __obj.updateDynamic("CUSIP")(CUSIP.asInstanceOf[js.Any])
    if (FIGI != null) __obj.updateDynamic("FIGI")(FIGI.asInstanceOf[js.Any])
    if (ISIN != null) __obj.updateDynamic("ISIN")(ISIN.asInstanceOf[js.Any])
    if (PERMID != null) __obj.updateDynamic("PERMID")(PERMID.asInstanceOf[js.Any])
    if (RIC != null) __obj.updateDynamic("RIC")(RIC.asInstanceOf[js.Any])
    if (SEDOL != null) __obj.updateDynamic("SEDOL")(SEDOL.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ticker != null) __obj.updateDynamic("ticker")(ticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBG]
  }
}

