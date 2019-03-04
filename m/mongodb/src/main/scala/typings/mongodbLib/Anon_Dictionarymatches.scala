package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dictionarymatches extends js.Object {
  var `dictionary matches`: scala.Double
  var `fast-path pages deleted`: scala.Double
  var `internal page key bytes discarded using suffix compression`: scala.Double
  var `internal page multi-block writes`: scala.Double
  var `internal-page overflow keys`: scala.Double
  var `leaf page key bytes discarded using prefix compression`: scala.Double
  var `leaf page multi-block writes`: scala.Double
  var `leaf-page overflow keys`: scala.Double
  var `maximum blocks required for a page`: scala.Double
  var `overflow values written`: scala.Double
  var `page checksum matches`: scala.Double
  var `page reconciliation calls`: scala.Double
  var `page reconciliation calls for eviction`: scala.Double
  var `pages deleted`: scala.Double
}

object Anon_Dictionarymatches {
  @scala.inline
  def apply(
    `dictionary matches`: scala.Double,
    `fast-path pages deleted`: scala.Double,
    `internal page key bytes discarded using suffix compression`: scala.Double,
    `internal page multi-block writes`: scala.Double,
    `internal-page overflow keys`: scala.Double,
    `leaf page key bytes discarded using prefix compression`: scala.Double,
    `leaf page multi-block writes`: scala.Double,
    `leaf-page overflow keys`: scala.Double,
    `maximum blocks required for a page`: scala.Double,
    `overflow values written`: scala.Double,
    `page checksum matches`: scala.Double,
    `page reconciliation calls`: scala.Double,
    `page reconciliation calls for eviction`: scala.Double,
    `pages deleted`: scala.Double
  ): Anon_Dictionarymatches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dictionary matches")(`dictionary matches`)
    __obj.updateDynamic("fast-path pages deleted")(`fast-path pages deleted`)
    __obj.updateDynamic("internal page key bytes discarded using suffix compression")(`internal page key bytes discarded using suffix compression`)
    __obj.updateDynamic("internal page multi-block writes")(`internal page multi-block writes`)
    __obj.updateDynamic("internal-page overflow keys")(`internal-page overflow keys`)
    __obj.updateDynamic("leaf page key bytes discarded using prefix compression")(`leaf page key bytes discarded using prefix compression`)
    __obj.updateDynamic("leaf page multi-block writes")(`leaf page multi-block writes`)
    __obj.updateDynamic("leaf-page overflow keys")(`leaf-page overflow keys`)
    __obj.updateDynamic("maximum blocks required for a page")(`maximum blocks required for a page`)
    __obj.updateDynamic("overflow values written")(`overflow values written`)
    __obj.updateDynamic("page checksum matches")(`page checksum matches`)
    __obj.updateDynamic("page reconciliation calls")(`page reconciliation calls`)
    __obj.updateDynamic("page reconciliation calls for eviction")(`page reconciliation calls for eviction`)
    __obj.updateDynamic("pages deleted")(`pages deleted`)
    __obj.asInstanceOf[Anon_Dictionarymatches]
  }
}

