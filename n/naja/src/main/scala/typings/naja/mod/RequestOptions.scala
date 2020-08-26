package typings.naja.mod

import typings.naja.najaStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait RequestOptions extends js.Object {
  var abort: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var dataType: js.UndefOr[String] = js.native
  var history: js.UndefOr[Boolean | replace] = js.native
  var historyUiCache: js.UndefOr[Boolean] = js.native
  var responseType: js.UndefOr[String] = js.native
  var unique: js.UndefOr[Boolean] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setAbort(value: Boolean): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setHistory(value: Boolean | replace): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setHistoryUiCache(value: Boolean): Self = this.set("historyUiCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryUiCache: Self = this.set("historyUiCache", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

