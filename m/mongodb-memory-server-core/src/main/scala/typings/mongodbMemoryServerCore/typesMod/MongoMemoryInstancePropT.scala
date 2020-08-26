package typings.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryInstancePropT extends MongoMemoryInstancePropBaseT {
  var auth: js.UndefOr[Boolean] = js.native
  var dbName: js.UndefOr[String] = js.native
  var ip: js.UndefOr[String] = js.native
  var replSet: js.UndefOr[String] = js.native
}

object MongoMemoryInstancePropT {
  @scala.inline
  def apply(): MongoMemoryInstancePropT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryInstancePropT]
  }
  @scala.inline
  implicit class MongoMemoryInstancePropTOps[Self <: MongoMemoryInstancePropT] (val x: Self) extends AnyVal {
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
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbName: Self = this.set("dbName", js.undefined)
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setReplSet(value: String): Self = this.set("replSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplSet: Self = this.set("replSet", js.undefined)
  }
  
}

