package typings.mongodbMemoryServerCore.anon

import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var auth: js.UndefOr[Boolean] = js.native
  var dbPath: js.UndefOr[String] = js.native
  var ip: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var replSet: js.UndefOr[String] = js.native
  var storageEngine: js.UndefOr[StorageEngineT] = js.native
}

object Args {
  @scala.inline
  def apply(): Args = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDbPath(value: String): Self = this.set("dbPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbPath: Self = this.set("dbPath", js.undefined)
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setReplSet(value: String): Self = this.set("replSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplSet: Self = this.set("replSet", js.undefined)
    @scala.inline
    def setStorageEngine(value: StorageEngineT): Self = this.set("storageEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEngine: Self = this.set("storageEngine", js.undefined)
  }
  
}

