package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListSecretsForRepoResponse extends js.Object {
  var secrets: js.Array[ActionsListSecretsForRepoResponseSecretsItem]
  var total_count: Double
}

object ActionsListSecretsForRepoResponse {
  @scala.inline
  def apply(secrets: js.Array[ActionsListSecretsForRepoResponseSecretsItem], total_count: Double): ActionsListSecretsForRepoResponse = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListSecretsForRepoResponse]
  }
}

