package typings.monk.mod

import org.scalablytyped.runtime.TopLevel
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollationDocument
import typings.mongodb.mod.ProjectionOperators
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.SchemaMember
import typings.mongodb.mod.SortOptionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.FindOneOptions<T> & {  rawCursor :boolean | undefined} */
@js.native
trait FindOptions[T] extends js.Object {
  
  var awaitData: js.UndefOr[Boolean] = js.native
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated Use options.projection instead
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean | number}
    */ typings.monk.monkStrings.FindOptions with TopLevel[js.Any]
  ] = js.native
  
  var hint: js.UndefOr[js.Object] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxScan: js.UndefOr[Double] = js.native
  
  var maxTimeMS: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var partial: js.UndefOr[Boolean] = js.native
  
  var projection: js.UndefOr[SchemaMember[T, ProjectionOperators | Double | Boolean | _]] = js.native
  
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  
  var promoteLongs: js.UndefOr[Boolean] = js.native
  
  var promoteValues: js.UndefOr[Boolean] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var rawCursor: js.UndefOr[Boolean] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var returnKey: js.UndefOr[Boolean] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
  
  var showDiskLoc: js.UndefOr[Boolean] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var snapshot: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[(js.Array[js.Tuple2[String, Double]]) | SortOptionObject[T]] = js.native
  
  var tailable: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Boolean] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply[T](): FindOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions[T]]
  }
  
  @scala.inline
  implicit class FindOptionsOps[Self <: FindOptions[_], T] (val x: Self with FindOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwaitData(value: Boolean): Self = this.set("awaitData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwaitData: Self = this.set("awaitData", js.undefined)
    
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: boolean | number}
      */ typings.monk.monkStrings.FindOptions with TopLevel[js.Any]
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHint(value: js.Object): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxScan(value: Double): Self = this.set("maxScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScan: Self = this.set("maxScan", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    
    @scala.inline
    def setProjection(value: SchemaMember[T, ProjectionOperators | Double | Boolean | _]): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = this.set("promoteBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteBuffers: Self = this.set("promoteBuffers", js.undefined)
    
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = this.set("promoteLongs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteLongs: Self = this.set("promoteLongs", js.undefined)
    
    @scala.inline
    def setPromoteValues(value: Boolean): Self = this.set("promoteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteValues: Self = this.set("promoteValues", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setRawCursor(value: Boolean): Self = this.set("rawCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawCursor: Self = this.set("rawCursor", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setReturnKey(value: Boolean): Self = this.set("returnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKey: Self = this.set("returnKey", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setShowDiskLoc(value: Boolean): Self = this.set("showDiskLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDiskLoc: Self = this.set("showDiskLoc", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Boolean): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: (js.Tuple2[String, Double])*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: (js.Array[js.Tuple2[String, Double]]) | SortOptionObject[T]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setTailable(value: Boolean): Self = this.set("tailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailable: Self = this.set("tailable", js.undefined)
    
    @scala.inline
    def setTimeout(value: Boolean): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
