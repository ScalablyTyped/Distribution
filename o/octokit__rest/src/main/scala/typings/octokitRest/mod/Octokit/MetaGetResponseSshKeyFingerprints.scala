package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaGetResponseSshKeyFingerprints extends js.Object {
  var MD5_DSA: String
  var MD5_RSA: String
  var SHA256_DSA: String
  var SHA256_RSA: String
}

object MetaGetResponseSshKeyFingerprints {
  @scala.inline
  def apply(MD5_DSA: String, MD5_RSA: String, SHA256_DSA: String, SHA256_RSA: String): MetaGetResponseSshKeyFingerprints = {
    val __obj = js.Dynamic.literal(MD5_DSA = MD5_DSA.asInstanceOf[js.Any], MD5_RSA = MD5_RSA.asInstanceOf[js.Any], SHA256_DSA = SHA256_DSA.asInstanceOf[js.Any], SHA256_RSA = SHA256_RSA.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaGetResponseSshKeyFingerprints]
  }
}

