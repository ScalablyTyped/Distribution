package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetArtifactResponse extends js.Object {
  var archive_download_url: String
  var created_at: String
  var expired: Boolean
  var expires_at: String
  var id: Double
  var name: String
  var node_id: String
  var size_in_bytes: Double
  var url: String
}

object ActionsGetArtifactResponse {
  @scala.inline
  def apply(
    archive_download_url: String,
    created_at: String,
    expired: Boolean,
    expires_at: String,
    id: Double,
    name: String,
    node_id: String,
    size_in_bytes: Double,
    url: String
  ): ActionsGetArtifactResponse = {
    val __obj = js.Dynamic.literal(archive_download_url = archive_download_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetArtifactResponse]
  }
}

