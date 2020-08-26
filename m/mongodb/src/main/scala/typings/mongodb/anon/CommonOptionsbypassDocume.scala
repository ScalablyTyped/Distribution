package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.CommonOptions & {  bypassDocumentValidation :boolean | undefined} */
@js.native
trait CommonOptionsbypassDocume extends js.Object {
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.native
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.native
}

object CommonOptionsbypassDocume {
  @scala.inline
  def apply(): CommonOptionsbypassDocume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptionsbypassDocume]
  }
  @scala.inline
  implicit class CommonOptionsbypassDocumeOps[Self <: CommonOptionsbypassDocume] (val x: Self) extends AnyVal {
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
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setW(value: Double | majority | String): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    @scala.inline
    def setWtimeout(value: Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
  
}

