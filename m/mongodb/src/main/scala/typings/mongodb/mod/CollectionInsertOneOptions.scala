package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionInsertOneOptions extends CommonOptions {
  //Allow driver to bypass schema validation in MongoDB 3.2 or higher.
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  //Force server to assign _id values instead of driver.
  var forceServerObjectId: js.UndefOr[Boolean] = js.native
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
}

object CollectionInsertOneOptions {
  @scala.inline
  def apply(): CollectionInsertOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionInsertOneOptions]
  }
  @scala.inline
  implicit class CollectionInsertOneOptionsOps[Self <: CollectionInsertOneOptions] (val x: Self) extends AnyVal {
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
    def setBypassDocumentValidation(value: Boolean): Self = this.set("bypassDocumentValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassDocumentValidation: Self = this.set("bypassDocumentValidation", js.undefined)
    @scala.inline
    def setForceServerObjectId(value: Boolean): Self = this.set("forceServerObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceServerObjectId: Self = this.set("forceServerObjectId", js.undefined)
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
  }
  
}

