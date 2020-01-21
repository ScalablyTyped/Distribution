package typings.monk

import org.scalablytyped.runtime.StringDictionary
import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon01AvgObjSize extends js.Object {
  var avgObjSize: Double
  var capped: Boolean
  var count: Double
  var indexDetails: StringDictionary[js.Any]
  var indexSizes: StringDictionary[Double]
  var nindexes: Double
  var ns: String
  var ok: `1` | `0`
  var size: Double
  var storageSize: Double
  var totalIndexSize: Double
  var wiredTiger: js.Any
}

object Anon01AvgObjSize {
  @scala.inline
  def apply(
    avgObjSize: Double,
    capped: Boolean,
    count: Double,
    indexDetails: StringDictionary[js.Any],
    indexSizes: StringDictionary[Double],
    nindexes: Double,
    ns: String,
    ok: `1` | `0`,
    size: Double,
    storageSize: Double,
    totalIndexSize: Double,
    wiredTiger: js.Any
  ): Anon01AvgObjSize = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize.asInstanceOf[js.Any], capped = capped.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], indexDetails = indexDetails.asInstanceOf[js.Any], indexSizes = indexSizes.asInstanceOf[js.Any], nindexes = nindexes.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageSize = storageSize.asInstanceOf[js.Any], totalIndexSize = totalIndexSize.asInstanceOf[js.Any], wiredTiger = wiredTiger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon01AvgObjSize]
  }
}

