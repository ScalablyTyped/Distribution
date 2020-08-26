package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIndexesResponse[Content /* <: js.Object */] extends js.Object {
  var indexes: js.Array[Index] = js.native
}

object GetIndexesResponse {
  @scala.inline
  def apply[/* <: js.Object */ Content](indexes: js.Array[Index]): GetIndexesResponse[Content] = {
    val __obj = js.Dynamic.literal(indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIndexesResponse[Content]]
  }
  @scala.inline
  implicit class GetIndexesResponseOps[Self <: GetIndexesResponse[_], /* <: js.Object */ Content] (val x: Self with GetIndexesResponse[Content]) extends AnyVal {
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
    def setIndexesVarargs(value: Index*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[Index]): Self = this.set("indexes", value.asInstanceOf[js.Any])
  }
  
}

