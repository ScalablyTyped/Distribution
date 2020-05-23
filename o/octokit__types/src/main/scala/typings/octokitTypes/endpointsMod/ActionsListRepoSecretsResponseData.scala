package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Updatedat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRepoSecretsResponseData extends js.Object {
  var secrets: js.Array[Updatedat]
  var total_count: Double
}

object ActionsListRepoSecretsResponseData {
  @scala.inline
  def apply(secrets: js.Array[Updatedat], total_count: Double): ActionsListRepoSecretsResponseData = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoSecretsResponseData]
  }
}

