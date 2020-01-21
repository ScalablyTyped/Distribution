package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleProviderOptions extends js.Object {
  var keyFilename: String
  var projectId: String
  var provider: google
}

object GoogleProviderOptions {
  @scala.inline
  def apply(keyFilename: String, projectId: String, provider: google): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleProviderOptions]
  }
}

