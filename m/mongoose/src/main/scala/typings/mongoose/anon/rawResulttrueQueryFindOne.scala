package typings.mongoose.anon

import typings.mongoose.mod.ClientSession
import typings.mongoose.mongooseBooleans.`true`
import typings.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  rawResult :true} & mongoose.mongoose.QueryFindOneAndRemoveOptions */
@js.native
trait rawResulttrueQueryFindOne extends js.Object {
  
  /** puts a time limit on the query - requires mongodb >= 2.6.0 */
  var maxTimeMS: js.UndefOr[Double] = js.native
  
  /** like select, it determines which fields to return */
  var projection: js.UndefOr[js.Any] = js.native
  
  /** if true, returns the raw result from the MongoDB driver */
  var rawResult: `true` with js.UndefOr[Boolean] = js.native
  
  /** sets the document fields to return */
  var select: js.UndefOr[js.Any] = js.native
  
  /** use client session for transaction */
  var session: js.UndefOr[ClientSession] = js.native
  
  /**
    * if multiple docs are found by the conditions, sets the sort order to choose
    * which doc to update
    */
  var sort: js.UndefOr[js.Any] = js.native
  
  /** overwrites the schema's strict mode option for this update */
  var strict: js.UndefOr[Boolean | `throw`] = js.native
}
object rawResulttrueQueryFindOne {
  
  @scala.inline
  def apply(rawResult: `true` with js.UndefOr[Boolean]): rawResulttrueQueryFindOne = {
    val __obj = js.Dynamic.literal(rawResult = rawResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[rawResulttrueQueryFindOne]
  }
  
  @scala.inline
  implicit class rawResulttrueQueryFindOneOps[Self <: rawResulttrueQueryFindOne] (val x: Self) extends AnyVal {
    
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
    def setRawResult(value: `true` with js.UndefOr[Boolean]): Self = this.set("rawResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMS(value: Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    
    @scala.inline
    def setProjection(value: js.Any): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Any): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSort(value: js.Any): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean | `throw`): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
