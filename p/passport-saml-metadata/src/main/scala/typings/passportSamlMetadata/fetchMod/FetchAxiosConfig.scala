package typings.passportSamlMetadata.fetchMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchAxiosConfig extends js.Object {
  var backupStore: Map[String, String] = js.native
  var responseType: String = js.native
  var timeout: Double = js.native
}

object FetchAxiosConfig {
  @scala.inline
  def apply(backupStore: Map[String, String], responseType: String, timeout: Double): FetchAxiosConfig = {
    val __obj = js.Dynamic.literal(backupStore = backupStore.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchAxiosConfig]
  }
  @scala.inline
  implicit class FetchAxiosConfigOps[Self <: FetchAxiosConfig] (val x: Self) extends AnyVal {
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
    def setBackupStore(value: Map[String, String]): Self = this.set("backupStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

