package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dictionarymatches extends js.Object {
  var `dictionary matches`: Double
  var `fast-path pages deleted`: Double
  var `internal page key bytes discarded using suffix compression`: Double
  var `internal page multi-block writes`: Double
  var `internal-page overflow keys`: Double
  var `leaf page key bytes discarded using prefix compression`: Double
  var `leaf page multi-block writes`: Double
  var `leaf-page overflow keys`: Double
  var `maximum blocks required for a page`: Double
  var `overflow values written`: Double
  var `page checksum matches`: Double
  var `page reconciliation calls`: Double
  var `page reconciliation calls for eviction`: Double
  var `pages deleted`: Double
}

object Anon_Dictionarymatches {
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
  ): Anon_Dictionarymatches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dictionary matches")(`dictionary matches`.asInstanceOf[js.Any])
    __obj.updateDynamic("fast-path pages deleted")(`fast-path pages deleted`.asInstanceOf[js.Any])
    __obj.updateDynamic("internal page key bytes discarded using suffix compression")(`internal page key bytes discarded using suffix compression`.asInstanceOf[js.Any])
    __obj.updateDynamic("internal page multi-block writes")(`internal page multi-block writes`.asInstanceOf[js.Any])
    __obj.updateDynamic("internal-page overflow keys")(`internal-page overflow keys`.asInstanceOf[js.Any])
    __obj.updateDynamic("leaf page key bytes discarded using prefix compression")(`leaf page key bytes discarded using prefix compression`.asInstanceOf[js.Any])
    __obj.updateDynamic("leaf page multi-block writes")(`leaf page multi-block writes`.asInstanceOf[js.Any])
    __obj.updateDynamic("leaf-page overflow keys")(`leaf-page overflow keys`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum blocks required for a page")(`maximum blocks required for a page`.asInstanceOf[js.Any])
    __obj.updateDynamic("overflow values written")(`overflow values written`.asInstanceOf[js.Any])
    __obj.updateDynamic("page checksum matches")(`page checksum matches`.asInstanceOf[js.Any])
    __obj.updateDynamic("page reconciliation calls")(`page reconciliation calls`.asInstanceOf[js.Any])
    __obj.updateDynamic("page reconciliation calls for eviction")(`page reconciliation calls for eviction`.asInstanceOf[js.Any])
    __obj.updateDynamic("pages deleted")(`pages deleted`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dictionarymatches]
  }
}

