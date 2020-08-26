package typings.monk.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollationDocument
import typings.monk.monkBooleans.`true`
import typings.monk.monkStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.FindOneAndReplaceOption & {  replaceOne :true} */
@js.native
trait FindOneAndReplaceOptionre extends js.Object {
  var collation: js.UndefOr[CollationDocument] = js.native
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.native
  var maxTimeMS: js.UndefOr[Double] = js.native
  var projection: js.UndefOr[js.Object] = js.native
  var replaceOne: `true` = js.native
  var returnOriginal: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession] = js.native
  var sort: js.UndefOr[js.Object] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
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

object FindOneAndReplaceOptionre {
  @scala.inline
  def apply(replaceOne: `true`): FindOneAndReplaceOptionre = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneAndReplaceOptionre]
  }
  @scala.inline
  implicit class FindOneAndReplaceOptionreOps[Self <: FindOneAndReplaceOptionre] (val x: Self) extends AnyVal {
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
    def setReplaceOne(value: `true`): Self = this.set("replaceOne", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    @scala.inline
    def setMaxTimeMS(value: Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setProjection(value: js.Object): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setReturnOriginal(value: Boolean): Self = this.set("returnOriginal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnOriginal: Self = this.set("returnOriginal", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
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

