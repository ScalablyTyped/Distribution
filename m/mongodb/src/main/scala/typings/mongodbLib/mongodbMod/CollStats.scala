package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollStats extends js.Object {
  /**
    * Average object size in bytes.
    */
  var avgObjSize: scala.Double
  /**
    * `true` if the collection is capped.
    */
  var capped: scala.Boolean
  /**
    * Number of documents.
    */
  var count: scala.Double
  var indexDetails: js.UndefOr[js.Any] = js.undefined
  /**
    * Size of specific indexes in bytes.
    */
  var indexSizes: mongodbLib.Anon_Id
  /**
    * Size of the most recently created extent in bytes.
    */
  var lastExtentSize: scala.Double
  /**
    * The maximum number of documents that may be present in a capped collection.
    */
  var max: scala.Double
  /**
    * The maximum size of a capped collection.
    */
  var maxSize: scala.Double
  /**
    * Number of indexes.
    */
  var nindexes: scala.Double
  /**
    * Namespace.
    */
  var ns: java.lang.String
  /**
    * Number of extents (contiguously allocated chunks of datafile space).
    */
  var numExtents: scala.Double
  var ok: scala.Double
  /**
    * Padding can speed up updates if documents grow.
    */
  var paddingFactor: scala.Double
  /**
    * Collection size in bytes.
    */
  var size: scala.Double
  /**
    * (Pre)allocated space for the collection in bytes.
    */
  var storageSize: scala.Double
  /**
    * Total index size in bytes.
    */
  var totalIndexSize: scala.Double
  /**
    * A number that indicates the user-set flags on the collection. userFlags only appears when using the mmapv1 storage engine.
    */
  var userFlags: js.UndefOr[scala.Double] = js.undefined
  var wiredTiger: js.UndefOr[WiredTigerData] = js.undefined
}

object CollStats {
  @scala.inline
  def apply(
    avgObjSize: scala.Double,
    capped: scala.Boolean,
    count: scala.Double,
    indexSizes: mongodbLib.Anon_Id,
    lastExtentSize: scala.Double,
    max: scala.Double,
    maxSize: scala.Double,
    nindexes: scala.Double,
    ns: java.lang.String,
    numExtents: scala.Double,
    ok: scala.Double,
    paddingFactor: scala.Double,
    size: scala.Double,
    storageSize: scala.Double,
    totalIndexSize: scala.Double,
    indexDetails: js.Any = null,
    userFlags: scala.Int | scala.Double = null,
    wiredTiger: WiredTigerData = null
  ): CollStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avgObjSize")(avgObjSize)
    __obj.updateDynamic("capped")(capped)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("indexSizes")(indexSizes)
    __obj.updateDynamic("lastExtentSize")(lastExtentSize)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("maxSize")(maxSize)
    __obj.updateDynamic("nindexes")(nindexes)
    __obj.updateDynamic("ns")(ns)
    __obj.updateDynamic("numExtents")(numExtents)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("paddingFactor")(paddingFactor)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("storageSize")(storageSize)
    __obj.updateDynamic("totalIndexSize")(totalIndexSize)
    if (indexDetails != null) __obj.updateDynamic("indexDetails")(indexDetails)
    if (userFlags != null) __obj.updateDynamic("userFlags")(userFlags.asInstanceOf[js.Any])
    if (wiredTiger != null) __obj.updateDynamic("wiredTiger")(wiredTiger)
    __obj.asInstanceOf[CollStats]
  }
}

