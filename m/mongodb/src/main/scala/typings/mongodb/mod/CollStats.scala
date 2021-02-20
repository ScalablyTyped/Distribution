package typings.mongodb.mod

import typings.mongodb.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollStats extends StObject {
  
  /**
    * Average object size in bytes.
    */
  var avgObjSize: scala.Double = js.native
  
  /**
    * `true` if the collection is capped.
    */
  var capped: Boolean = js.native
  
  /**
    * Number of documents.
    */
  var count: scala.Double = js.native
  
  var indexDetails: js.UndefOr[js.Any] = js.native
  
  /**
    * Size of specific indexes in bytes.
    */
  var indexSizes: Dictindex = js.native
  
  /**
    * Size of the most recently created extent in bytes.
    */
  var lastExtentSize: scala.Double = js.native
  
  /**
    * The maximum number of documents that may be present in a capped collection.
    */
  var max: scala.Double = js.native
  
  /**
    * The maximum size of a capped collection.
    */
  var maxSize: scala.Double = js.native
  
  /**
    * Number of indexes.
    */
  var nindexes: scala.Double = js.native
  
  /**
    * Namespace.
    */
  var ns: String = js.native
  
  /**
    * Number of extents (contiguously allocated chunks of datafile space).
    */
  var numExtents: scala.Double = js.native
  
  var ok: scala.Double = js.native
  
  /**
    * Padding can speed up updates if documents grow.
    */
  var paddingFactor: scala.Double = js.native
  
  /**
    * Collection size in bytes.
    */
  var size: scala.Double = js.native
  
  /**
    * (Pre)allocated space for the collection in bytes.
    */
  var storageSize: scala.Double = js.native
  
  /**
    * Total index size in bytes.
    */
  var totalIndexSize: scala.Double = js.native
  
  /**
    * A number that indicates the user-set flags on the collection. userFlags only appears when using the mmapv1 storage engine.
    */
  var userFlags: js.UndefOr[scala.Double] = js.native
  
  var wiredTiger: js.UndefOr[WiredTigerData] = js.native
}
object CollStats {
  
  @scala.inline
  def apply(
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
    size: scala.Double,
    storageSize: scala.Double,
    totalIndexSize: scala.Double
  ): CollStats = {
    val __obj = js.Dynamic.literal(avgObjSize = avgObjSize.asInstanceOf[js.Any], capped = capped.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], indexSizes = indexSizes.asInstanceOf[js.Any], lastExtentSize = lastExtentSize.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], nindexes = nindexes.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], numExtents = numExtents.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], paddingFactor = paddingFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageSize = storageSize.asInstanceOf[js.Any], totalIndexSize = totalIndexSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollStats]
  }
  
  @scala.inline
  implicit class CollStatsMutableBuilder[Self <: CollStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvgObjSize(value: scala.Double): Self = StObject.set(x, "avgObjSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapped(value: Boolean): Self = StObject.set(x, "capped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: scala.Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexDetails(value: js.Any): Self = StObject.set(x, "indexDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexDetailsUndefined: Self = StObject.set(x, "indexDetails", js.undefined)
    
    @scala.inline
    def setIndexSizes(value: Dictindex): Self = StObject.set(x, "indexSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExtentSize(value: scala.Double): Self = StObject.set(x, "lastExtentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: scala.Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNindexes(value: scala.Double): Self = StObject.set(x, "nindexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumExtents(value: scala.Double): Self = StObject.set(x, "numExtents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: scala.Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingFactor(value: scala.Double): Self = StObject.set(x, "paddingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: scala.Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageSize(value: scala.Double): Self = StObject.set(x, "storageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalIndexSize(value: scala.Double): Self = StObject.set(x, "totalIndexSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFlags(value: scala.Double): Self = StObject.set(x, "userFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFlagsUndefined: Self = StObject.set(x, "userFlags", js.undefined)
    
    @scala.inline
    def setWiredTiger(value: WiredTigerData): Self = StObject.set(x, "wiredTiger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiredTigerUndefined: Self = StObject.set(x, "wiredTiger", js.undefined)
  }
}
