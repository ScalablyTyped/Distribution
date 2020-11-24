package typings.pouchdbLiveFind.PouchDB.LiveFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, 'sort' | 'skip' | 'limit'> */
@js.native
trait PaginateOptions[Content /* <: js.Object */] extends js.Object {
  
  var limit: js.UndefOr[Double] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
}
object PaginateOptions {
  
  @scala.inline
  def apply[Content /* <: js.Object */](): PaginateOptions[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginateOptions[Content]]
  }
  
  @scala.inline
  implicit class PaginateOptionsOps[Self <: PaginateOptions[_], Content /* <: js.Object */] (val x: Self with PaginateOptions[Content]) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: (String | (StringDictionary[asc | desc]))*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
