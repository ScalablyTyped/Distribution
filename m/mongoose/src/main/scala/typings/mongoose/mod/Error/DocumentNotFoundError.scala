package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentNotFoundError
  extends typings.mongoose.mod.Error {
  var filter: js.Any = js.native
  @JSName("name")
  var name_DocumentNotFoundError: typings.mongoose.mongooseStrings.DocumentNotFoundError = js.native
  var query: js.Any = js.native
}

object DocumentNotFoundError {
  @scala.inline
  def apply(filter: js.Any, name: typings.mongoose.mongooseStrings.DocumentNotFoundError, query: js.Any): DocumentNotFoundError = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentNotFoundError]
  }
  @scala.inline
  implicit class DocumentNotFoundErrorOps[Self <: DocumentNotFoundError] (val x: Self) extends AnyVal {
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
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: typings.mongoose.mongooseStrings.DocumentNotFoundError): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

