package typings.nodePgMigrate.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunnerOptionUrl extends js.Object {
  var databaseUrl: String | ClientConfig = js.native
}

object RunnerOptionUrl {
  @scala.inline
  def apply(databaseUrl: String | ClientConfig): RunnerOptionUrl = {
    val __obj = js.Dynamic.literal(databaseUrl = databaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionUrl]
  }
  @scala.inline
  implicit class RunnerOptionUrlOps[Self <: RunnerOptionUrl] (val x: Self) extends AnyVal {
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
    def setDatabaseUrl(value: String | ClientConfig): Self = this.set("databaseUrl", value.asInstanceOf[js.Any])
  }
  
}

