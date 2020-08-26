package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BBG extends /* key */ StringDictionary[String] {
  var BBG: js.UndefOr[String] = js.native
  var CUSIP: js.UndefOr[String] = js.native
  var FIGI: js.UndefOr[String] = js.native
  var ISIN: js.UndefOr[String] = js.native
  var PERMID: js.UndefOr[String] = js.native
  var RIC: js.UndefOr[String] = js.native
  var SEDOL: js.UndefOr[String] = js.native
  var ticker: js.UndefOr[String] = js.native
}

object BBG {
  @scala.inline
  def apply(): BBG = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BBG]
  }
  @scala.inline
  implicit class BBGOps[Self <: BBG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBBG(value: String): Self = this.set("BBG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBBG: Self = this.set("BBG", js.undefined)
    @scala.inline
    def setCUSIP(value: String): Self = this.set("CUSIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCUSIP: Self = this.set("CUSIP", js.undefined)
    @scala.inline
    def setFIGI(value: String): Self = this.set("FIGI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFIGI: Self = this.set("FIGI", js.undefined)
    @scala.inline
    def setISIN(value: String): Self = this.set("ISIN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteISIN: Self = this.set("ISIN", js.undefined)
    @scala.inline
    def setPERMID(value: String): Self = this.set("PERMID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePERMID: Self = this.set("PERMID", js.undefined)
    @scala.inline
    def setRIC(value: String): Self = this.set("RIC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRIC: Self = this.set("RIC", js.undefined)
    @scala.inline
    def setSEDOL(value: String): Self = this.set("SEDOL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSEDOL: Self = this.set("SEDOL", js.undefined)
    @scala.inline
    def setTicker(value: String): Self = this.set("ticker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicker: Self = this.set("ticker", js.undefined)
  }
  
}

