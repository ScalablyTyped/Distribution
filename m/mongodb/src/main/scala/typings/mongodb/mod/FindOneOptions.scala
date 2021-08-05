package typings.mongodb.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneOptions[T] extends StObject {
  
  var awaitData: js.UndefOr[Boolean] = js.undefined
  
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var comment: js.UndefOr[String] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Use options.projection instead
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean | number}
    */ typings.mongodb.mongodbStrings.FindOneOptions & TopLevel[js.Any]
  ] = js.undefined
  
  var hint: js.UndefOr[js.Object] = js.undefined
  
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var maxScan: js.UndefOr[scala.Double] = js.undefined
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var min: js.UndefOr[scala.Double] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
  
  var projection: js.UndefOr[SchemaMember[T, ProjectionOperators | scala.Double | Boolean | js.Any]] = js.undefined
  
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var returnKey: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var showDiskLoc: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[scala.Double] = js.undefined
  
  var snapshot: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[(js.Array[js.Tuple2[String, scala.Double]]) | SortOptionObject[T]] = js.undefined
  
  var tailable: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Boolean] = js.undefined
}
object FindOneOptions {
  
  inline def apply[T](): FindOneOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneOptions[T]]
  }
  
  extension [Self <: FindOneOptions[?], T](x: Self & FindOneOptions[T]) {
    
    inline def setAwaitData(value: Boolean): Self = StObject.set(x, "awaitData", value.asInstanceOf[js.Any])
    
    inline def setAwaitDataUndefined: Self = StObject.set(x, "awaitData", js.undefined)
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: boolean | number}
      */ typings.mongodb.mongodbStrings.FindOneOptions & TopLevel[js.Any]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHint(value: js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxScan(value: scala.Double): Self = StObject.set(x, "maxScan", value.asInstanceOf[js.Any])
    
    inline def setMaxScanUndefined: Self = StObject.set(x, "maxScan", js.undefined)
    
    inline def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setProjection(value: SchemaMember[T, ProjectionOperators | scala.Double | Boolean | js.Any]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
    
    inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
    
    inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
    
    inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setReturnKey(value: Boolean): Self = StObject.set(x, "returnKey", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyUndefined: Self = StObject.set(x, "returnKey", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setShowDiskLoc(value: Boolean): Self = StObject.set(x, "showDiskLoc", value.asInstanceOf[js.Any])
    
    inline def setShowDiskLocUndefined: Self = StObject.set(x, "showDiskLoc", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setSort(value: (js.Array[js.Tuple2[String, scala.Double]]) | SortOptionObject[T]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: (js.Tuple2[String, scala.Double])*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
    
    inline def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
    
    inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
