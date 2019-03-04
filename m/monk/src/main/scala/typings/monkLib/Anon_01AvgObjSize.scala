package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01AvgObjSize extends js.Object {
  var avgObjSize: scala.Double
  var capped: scala.Boolean
  var count: scala.Double
  var indexDetails: org.scalablytyped.runtime.StringDictionary[js.Any]
  var indexSizes: org.scalablytyped.runtime.StringDictionary[scala.Double]
  var nindexes: scala.Double
  var ns: java.lang.String
  var ok: monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`0`
  var size: scala.Double
  var storageSize: scala.Double
  var totalIndexSize: scala.Double
  var wiredTiger: js.Any
}

object Anon_01AvgObjSize {
  @scala.inline
  def apply(
    avgObjSize: scala.Double,
    capped: scala.Boolean,
    count: scala.Double,
    indexDetails: org.scalablytyped.runtime.StringDictionary[js.Any],
    indexSizes: org.scalablytyped.runtime.StringDictionary[scala.Double],
    nindexes: scala.Double,
    ns: java.lang.String,
    ok: monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`0`,
    size: scala.Double,
    storageSize: scala.Double,
    totalIndexSize: scala.Double,
    wiredTiger: js.Any
  ): Anon_01AvgObjSize = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize, capped = capped, count = count, indexDetails = indexDetails, indexSizes = indexSizes, nindexes = nindexes, ns = ns, ok = ok.asInstanceOf[js.Any], size = size, storageSize = storageSize, totalIndexSize = totalIndexSize, wiredTiger = wiredTiger)
  
    __obj.asInstanceOf[Anon_01AvgObjSize]
  }
}

