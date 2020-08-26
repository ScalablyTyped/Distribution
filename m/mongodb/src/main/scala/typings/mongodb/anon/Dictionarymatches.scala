package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionarymatches extends js.Object {
  var `dictionary matches`: Double = js.native
  var `fast-path pages deleted`: Double = js.native
  var `internal page key bytes discarded using suffix compression`: Double = js.native
  var `internal page multi-block writes`: Double = js.native
  var `internal-page overflow keys`: Double = js.native
  var `leaf page key bytes discarded using prefix compression`: Double = js.native
  var `leaf page multi-block writes`: Double = js.native
  var `leaf-page overflow keys`: Double = js.native
  var `maximum blocks required for a page`: Double = js.native
  var `overflow values written`: Double = js.native
  var `page checksum matches`: Double = js.native
  var `page reconciliation calls`: Double = js.native
  var `page reconciliation calls for eviction`: Double = js.native
  var `pages deleted`: Double = js.native
}

object Dictionarymatches {
  @scala.inline
  def apply(
    `dictionary matches`: Double,
    `fast-path pages deleted`: Double,
    `internal page key bytes discarded using suffix compression`: Double,
    `internal page multi-block writes`: Double,
    `internal-page overflow keys`: Double,
    `leaf page key bytes discarded using prefix compression`: Double,
    `leaf page multi-block writes`: Double,
    `leaf-page overflow keys`: Double,
    `maximum blocks required for a page`: Double,
    `overflow values written`: Double,
    `page checksum matches`: Double,
    `page reconciliation calls`: Double,
    `page reconciliation calls for eviction`: Double,
    `pages deleted`: Double
  ): Dictionarymatches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dictionary matches")((`dictionary matches`).asInstanceOf[js.Any])
    __obj.updateDynamic("fast-path pages deleted")((`fast-path pages deleted`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal page key bytes discarded using suffix compression")((`internal page key bytes discarded using suffix compression`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal page multi-block writes")((`internal page multi-block writes`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal-page overflow keys")((`internal-page overflow keys`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf page key bytes discarded using prefix compression")((`leaf page key bytes discarded using prefix compression`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf page multi-block writes")((`leaf page multi-block writes`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf-page overflow keys")((`leaf-page overflow keys`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum blocks required for a page")((`maximum blocks required for a page`).asInstanceOf[js.Any])
    __obj.updateDynamic("overflow values written")((`overflow values written`).asInstanceOf[js.Any])
    __obj.updateDynamic("page checksum matches")((`page checksum matches`).asInstanceOf[js.Any])
    __obj.updateDynamic("page reconciliation calls")((`page reconciliation calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("page reconciliation calls for eviction")((`page reconciliation calls for eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages deleted")((`pages deleted`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionarymatches]
  }
  @scala.inline
  implicit class DictionarymatchesOps[Self <: Dictionarymatches] (val x: Self) extends AnyVal {
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
    def `setDictionary matches`(value: Double): Self = this.set("dictionary matches", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFast-path pages deleted`(value: Double): Self = this.set("fast-path pages deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def `setInternal page key bytes discarded using suffix compression`(value: Double): Self = this.set("internal page key bytes discarded using suffix compression", value.asInstanceOf[js.Any])
    @scala.inline
    def `setInternal page multi-block writes`(value: Double): Self = this.set("internal page multi-block writes", value.asInstanceOf[js.Any])
    @scala.inline
    def `setInternal-page overflow keys`(value: Double): Self = this.set("internal-page overflow keys", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLeaf page key bytes discarded using prefix compression`(value: Double): Self = this.set("leaf page key bytes discarded using prefix compression", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLeaf page multi-block writes`(value: Double): Self = this.set("leaf page multi-block writes", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLeaf-page overflow keys`(value: Double): Self = this.set("leaf-page overflow keys", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMaximum blocks required for a page`(value: Double): Self = this.set("maximum blocks required for a page", value.asInstanceOf[js.Any])
    @scala.inline
    def `setOverflow values written`(value: Double): Self = this.set("overflow values written", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage checksum matches`(value: Double): Self = this.set("page checksum matches", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage reconciliation calls`(value: Double): Self = this.set("page reconciliation calls", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPage reconciliation calls for eviction`(value: Double): Self = this.set("page reconciliation calls for eviction", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPages deleted`(value: Double): Self = this.set("pages deleted", value.asInstanceOf[js.Any])
  }
  
}

