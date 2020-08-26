package typings.pouchdbLiveFind.PouchDB.LiveFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.PouchDB.Find.Selector
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.asc
import typings.pouchdbLiveFind.pouchdbLiveFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<pouchdb-find.PouchDB.Find.FindRequest<Content>, std.Exclude<keyof pouchdb-find.PouchDB.Find.FindRequest<Content>, 'use_index'>> */
@js.native
trait RequestDef[Content /* <: js.Object */] extends js.Object {
  var aggregate: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var selector: Selector = js.native
  var skip: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
}

object RequestDef {
  @scala.inline
  def apply[/* <: js.Object */ Content](selector: Selector): RequestDef[Content] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDef[Content]]
  }
  @scala.inline
  implicit class RequestDefOps[Self <: RequestDef[_], /* <: js.Object */ Content] (val x: Self with RequestDef[Content]) extends AnyVal {
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
    def setSelector(value: Selector): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregate(value: Boolean): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
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

