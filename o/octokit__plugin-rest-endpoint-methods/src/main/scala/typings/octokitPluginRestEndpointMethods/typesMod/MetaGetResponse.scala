package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaGetResponse extends js.Object {
  var api: js.Array[String]
  var git: js.Array[String]
  var hooks: js.Array[String]
  var importer: js.Array[String]
  var pages: js.Array[String]
  var ssh_key_fingerprints: MetaGetResponseSshKeyFingerprints
  var verifiable_password_authentication: Boolean
  var web: js.Array[String]
}

object MetaGetResponse {
  @scala.inline
  def apply(
    api: js.Array[String],
    git: js.Array[String],
    hooks: js.Array[String],
    importer: js.Array[String],
    pages: js.Array[String],
    ssh_key_fingerprints: MetaGetResponseSshKeyFingerprints,
    verifiable_password_authentication: Boolean,
    web: js.Array[String]
  ): MetaGetResponse = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], importer = importer.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], ssh_key_fingerprints = ssh_key_fingerprints.asInstanceOf[js.Any], verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaGetResponse]
  }
}

