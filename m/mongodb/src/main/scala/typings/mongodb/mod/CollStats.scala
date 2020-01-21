package typings.mongodb.mod

import typings.mongodb.AnonId
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
  var capped: Boolean
  /**
    * Number of documents.
    */
  var count: scala.Double
  var indexDetails: js.UndefOr[js.Any] = js.undefined
  /**
    * Size of specific indexes in bytes.
    */
  var indexSizes: AnonId
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
  var ns: String
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
    capped: Boolean,
    count: scala.Double,
    indexSizes: AnonId,
    lastExtentSize: scala.Double,
    max: scala.Double,
    maxSize: scala.Double,
    nindexes: scala.Double,
    ns: String,
    numExtents: scala.Double,
    ok: scala.Double,
    paddingFactor: scala.Double,
    size: scala.Double,
    storageSize: scala.Double,
    totalIndexSize: scala.Double,
    indexDetails: js.Any = null,
    userFlags: Int | scala.Double = null,
    wiredTiger: WiredTigerData = null
  ): CollStats = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize.asInstanceOf[js.Any], capped = capped.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], indexSizes = indexSizes.asInstanceOf[js.Any], lastExtentSize = lastExtentSize.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], nindexes = nindexes.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], numExtents = numExtents.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], paddingFactor = paddingFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageSize = storageSize.asInstanceOf[js.Any], totalIndexSize = totalIndexSize.asInstanceOf[js.Any])
    if (indexDetails != null) __obj.updateDynamic("indexDetails")(indexDetails.asInstanceOf[js.Any])
    if (userFlags != null) __obj.updateDynamic("userFlags")(userFlags.asInstanceOf[js.Any])
    if (wiredTiger != null) __obj.updateDynamic("wiredTiger")(wiredTiger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollStats]
  }
}

