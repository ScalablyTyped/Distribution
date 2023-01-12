package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollStats
  extends StObject
     with Document {
  
  /** Average object size in bytes */
  var avgObjSize: scala.Double
  
  /** `true` if the collection is capped */
  var capped: Boolean
  
  /** Number of documents */
  var count: scala.Double
  
  /** The amount of storage available for reuse. The scale argument affects this value. */
  var freeStorageSize: js.UndefOr[scala.Double] = js.undefined
  
  /** An array that contains the names of the indexes that are currently being built on the collection */
  var indexBuilds: js.UndefOr[scala.Double] = js.undefined
  
  /** The fields in this document are the names of the indexes, while the values themselves are documents that contain statistics for the index provided by the storage engine */
  var indexDetails: js.UndefOr[Any] = js.undefined
  
  /** Size of specific indexes in bytes */
  var indexSizes: Dictindex
  
  /** Size of the most recently created extent in bytes */
  var lastExtentSize: scala.Double
  
  /** The maximum number of documents that may be present in a capped collection */
  var max: scala.Double
  
  /** The maximum size of a capped collection */
  var maxSize: scala.Double
  
  /** Number of indexes */
  var nindexes: scala.Double
  
  /** Namespace */
  var ns: String
  
  /** Number of extents (contiguously allocated chunks of datafile space) */
  var numExtents: scala.Double
  
  var ok: scala.Double
  
  /** Padding can speed up updates if documents grow */
  var paddingFactor: scala.Double
  
  /** The scale value used by the command. */
  var scaleFactor: scala.Double
  
  /** Collection size in bytes */
  var size: scala.Double
  
  /** (Pre)allocated space for the collection in bytes */
  var storageSize: scala.Double
  
  /** Total index size in bytes */
  var totalIndexSize: scala.Double
  
  /** The sum of the storageSize and totalIndexSize. The scale argument affects this value */
  var totalSize: scala.Double
  
  /** A number that indicates the user-set flags on the collection. userFlags only appears when using the mmapv1 storage engine */
  var userFlags: js.UndefOr[scala.Double] = js.undefined
  
  /** This document contains data reported directly by the WiredTiger engine and other data for internal diagnostic use */
  var wiredTiger: js.UndefOr[WiredTigerData] = js.undefined
}
object CollStats {
  
  inline def apply(
    avgObjSize: scala.Double,
    capped: Boolean,
    count: scala.Double,
    indexSizes: Dictindex,
    lastExtentSize: scala.Double,
    max: scala.Double,
    maxSize: scala.Double,
    nindexes: scala.Double,
    ns: String,
    numExtents: scala.Double,
    ok: scala.Double,
    paddingFactor: scala.Double,
    scaleFactor: scala.Double,
    size: scala.Double,
    storageSize: scala.Double,
    totalIndexSize: scala.Double,
    totalSize: scala.Double
  ): CollStats = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize.asInstanceOf[js.Any], capped = capped.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], indexSizes = indexSizes.asInstanceOf[js.Any], lastExtentSize = lastExtentSize.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], nindexes = nindexes.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], numExtents = numExtents.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], paddingFactor = paddingFactor.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageSize = storageSize.asInstanceOf[js.Any], totalIndexSize = totalIndexSize.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollStats] (val x: Self) extends AnyVal {
    
    inline def setAvgObjSize(value: scala.Double): Self = StObject.set(x, "avgObjSize", value.asInstanceOf[js.Any])
    
    inline def setCapped(value: Boolean): Self = StObject.set(x, "capped", value.asInstanceOf[js.Any])
    
    inline def setCount(value: scala.Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFreeStorageSize(value: scala.Double): Self = StObject.set(x, "freeStorageSize", value.asInstanceOf[js.Any])
    
    inline def setFreeStorageSizeUndefined: Self = StObject.set(x, "freeStorageSize", js.undefined)
    
    inline def setIndexBuilds(value: scala.Double): Self = StObject.set(x, "indexBuilds", value.asInstanceOf[js.Any])
    
    inline def setIndexBuildsUndefined: Self = StObject.set(x, "indexBuilds", js.undefined)
    
    inline def setIndexDetails(value: Any): Self = StObject.set(x, "indexDetails", value.asInstanceOf[js.Any])
    
    inline def setIndexDetailsUndefined: Self = StObject.set(x, "indexDetails", js.undefined)
    
    inline def setIndexSizes(value: Dictindex): Self = StObject.set(x, "indexSizes", value.asInstanceOf[js.Any])
    
    inline def setLastExtentSize(value: scala.Double): Self = StObject.set(x, "lastExtentSize", value.asInstanceOf[js.Any])
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: scala.Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setNindexes(value: scala.Double): Self = StObject.set(x, "nindexes", value.asInstanceOf[js.Any])
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNumExtents(value: scala.Double): Self = StObject.set(x, "numExtents", value.asInstanceOf[js.Any])
    
    inline def setOk(value: scala.Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setPaddingFactor(value: scala.Double): Self = StObject.set(x, "paddingFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactor(value: scala.Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setSize(value: scala.Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStorageSize(value: scala.Double): Self = StObject.set(x, "storageSize", value.asInstanceOf[js.Any])
    
    inline def setTotalIndexSize(value: scala.Double): Self = StObject.set(x, "totalIndexSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSize(value: scala.Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setUserFlags(value: scala.Double): Self = StObject.set(x, "userFlags", value.asInstanceOf[js.Any])
    
    inline def setUserFlagsUndefined: Self = StObject.set(x, "userFlags", js.undefined)
    
    inline def setWiredTiger(value: WiredTigerData): Self = StObject.set(x, "wiredTiger", value.asInstanceOf[js.Any])
    
    inline def setWiredTigerUndefined: Self = StObject.set(x, "wiredTiger", js.undefined)
  }
}
