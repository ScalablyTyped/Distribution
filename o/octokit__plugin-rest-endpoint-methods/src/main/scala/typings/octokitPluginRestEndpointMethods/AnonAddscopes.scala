package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddscopes extends js.Object {
  var add_scopes: AnonType
  var authorization_id: AnonRequired
  var fingerprint: AnonType
  var note: AnonType
  var note_url: AnonType
  var remove_scopes: AnonType
  var scopes: AnonType
}

object AnonAddscopes {
  @scala.inline
  def apply(
    add_scopes: AnonType,
    authorization_id: AnonRequired,
    fingerprint: AnonType,
    note: AnonType,
    note_url: AnonType,
    remove_scopes: AnonType,
    scopes: AnonType
  ): AnonAddscopes = {
    val __obj = js.Dynamic.literal(add_scopes = add_scopes.asInstanceOf[js.Any], authorization_id = authorization_id.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], remove_scopes = remove_scopes.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddscopes]
  }
}

