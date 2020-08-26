package typings.mongooseSeeder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var dropCollections: js.UndefOr[Boolean] = js.native
  var dropDatabase: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setDropCollections(value: Boolean): Self = this.set("dropCollections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropCollections: Self = this.set("dropCollections", js.undefined)
    @scala.inline
    def setDropDatabase(value: Boolean): Self = this.set("dropDatabase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDatabase: Self = this.set("dropDatabase", js.undefined)
  }
  
}

