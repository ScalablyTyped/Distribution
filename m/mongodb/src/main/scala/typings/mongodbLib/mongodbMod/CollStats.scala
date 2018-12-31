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
  var indexSizes: mongodbLib.Anon_Index
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

