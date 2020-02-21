package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientidClientsecret extends js.Object {
  var client_id: AnonRequired
  var client_secret: AnonRequired
  var fingerprint: AnonType
  var note: AnonType
  var note_url: AnonType
  var scopes: AnonType
}

object AnonClientidClientsecret {
  @scala.inline
  def apply(
    client_id: AnonRequired,
    client_secret: AnonRequired,
    fingerprint: AnonType,
    note: AnonType,
    note_url: AnonType,
    scopes: AnonType
  ): AnonClientidClientsecret = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientidClientsecret]
  }
}

