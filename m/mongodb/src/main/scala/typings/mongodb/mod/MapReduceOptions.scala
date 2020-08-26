package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapReduceOptions extends js.Object {
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  @JSName("finalize")
  var finalize_FMapReduceOptions: js.UndefOr[js.Function | String] = js.native
  var jsMode: js.UndefOr[Boolean] = js.native
  var keeptemp: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[scala.Double] = js.native
  var out: js.UndefOr[js.Object] = js.native
  var query: js.UndefOr[js.Object] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var scope: js.UndefOr[js.Object] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  var sort: js.UndefOr[js.Object] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object MapReduceOptions {
  @scala.inline
  def apply(): MapReduceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapReduceOptions]
  }
  @scala.inline
  implicit class MapReduceOptionsOps[Self <: MapReduceOptions] (val x: Self) extends AnyVal {
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
    def setBypassDocumentValidation(value: Boolean): Self = this.set("bypassDocumentValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassDocumentValidation: Self = this.set("bypassDocumentValidation", js.undefined)
    @scala.inline
    def setFinalize(value: js.Function | String): Self = this.set("finalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalize: Self = this.set("finalize", js.undefined)
    @scala.inline
    def setJsMode(value: Boolean): Self = this.set("jsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsMode: Self = this.set("jsMode", js.undefined)
    @scala.inline
    def setKeeptemp(value: Boolean): Self = this.set("keeptemp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeeptemp: Self = this.set("keeptemp", js.undefined)
    @scala.inline
    def setLimit(value: scala.Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOut(value: js.Object): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setScope(value: js.Object): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

