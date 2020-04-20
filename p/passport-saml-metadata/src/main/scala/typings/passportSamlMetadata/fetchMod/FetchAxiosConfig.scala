package typings.passportSamlMetadata.fetchMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchAxiosConfig extends js.Object {
  var backupStore: Map[String, String]
  var responseType: String
  var timeout: Double
}

object FetchAxiosConfig {
  @scala.inline
  def apply(backupStore: Map[String, String], responseType: String, timeout: Double): FetchAxiosConfig = {
    val __obj = js.Dynamic.literal(backupStore = backupStore.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchAxiosConfig]
  }
}

