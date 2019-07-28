package typings.monk

import org.scalablytyped.runtime.StringDictionary
import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AvgObjSize extends js.Object {
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

object Anon_01AvgObjSize {
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
  ): Anon_01AvgObjSize = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize, capped = capped, count = count, indexDetails = indexDetails, indexSizes = indexSizes, nindexes = nindexes, ns = ns, ok = ok.asInstanceOf[js.Any], size = size, storageSize = storageSize, totalIndexSize = totalIndexSize, wiredTiger = wiredTiger)
  
    __obj.asInstanceOf[Anon_01AvgObjSize]
  }
}

