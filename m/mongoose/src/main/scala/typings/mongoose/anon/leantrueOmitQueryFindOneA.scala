package typings.mongoose.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mod.ClientSession
import typings.mongoose.mongooseBooleans.`true`
import typings.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  lean :true} & mongoose.mongoose.Omit<mongoose.mongoose.QueryFindOneAndUpdateOptions, 'lean'> */
@js.native
trait leantrueOmitQueryFindOneA extends js.Object {
  
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[js.Any | String] = js.native
  
  var lean: `true` = js.native
  
  var maxTimeMS: js.UndefOr[Double] = js.native
  
  var multipleCastError: js.UndefOr[Boolean] = js.native
  
  var `new`: js.UndefOr[Boolean] = js.native
  
  var omitUndefined: js.UndefOr[Boolean] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var projection: js.UndefOr[js.Any] = js.native
  
  var rawResult: js.UndefOr[Boolean] = js.native
  
  var runValidators: js.UndefOr[Boolean] = js.native
  
  var select: js.UndefOr[js.Any] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
  
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[js.Any] = js.native
  
  var strict: js.UndefOr[Boolean | `throw`] = js.native
  
  var timestamps: js.UndefOr[Boolean] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
  
  var useFindAndModify: js.UndefOr[Boolean] = js.native
}
object leantrueOmitQueryFindOneA {
  
  @scala.inline
  def apply(lean: `true`): leantrueOmitQueryFindOneA = {
    val __obj = js.Dynamic.literal(lean = lean.asInstanceOf[js.Any])
    __obj.asInstanceOf[leantrueOmitQueryFindOneA]
  }
  
  @scala.inline
  implicit class leantrueOmitQueryFindOneAOps[Self <: leantrueOmitQueryFindOneA] (val x: Self) extends AnyVal {
    
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
    def setLean(value: `true`): Self = this.set("lean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersVarargs(value: StringDictionary[js.Any]*): Self = this.set("arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setArrayFilters(value: js.Array[StringDictionary[_]]): Self = this.set("arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFilters: Self = this.set("arrayFilters", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setFields(value: js.Any | String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    
    @scala.inline
    def setMultipleCastError(value: Boolean): Self = this.set("multipleCastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleCastError: Self = this.set("multipleCastError", js.undefined)
    
    @scala.inline
    def setNew(value: Boolean): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
    
    @scala.inline
    def setOmitUndefined(value: Boolean): Self = this.set("omitUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitUndefined: Self = this.set("omitUndefined", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setProjection(value: js.Any): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRawResult(value: Boolean): Self = this.set("rawResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawResult: Self = this.set("rawResult", js.undefined)
    
    @scala.inline
    def setRunValidators(value: Boolean): Self = this.set("runValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunValidators: Self = this.set("runValidators", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Any): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSetDefaultsOnInsert(value: Boolean): Self = this.set("setDefaultsOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDefaultsOnInsert: Self = this.set("setDefaultsOnInsert", js.undefined)
    
    @scala.inline
    def setSort(value: js.Any): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean | `throw`): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
    
    @scala.inline
    def setUseFindAndModify(value: Boolean): Self = this.set("useFindAndModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFindAndModify: Self = this.set("useFindAndModify", js.undefined)
  }
}
