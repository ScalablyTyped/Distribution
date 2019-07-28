package typings.pkgcloud.pkgcloudMod

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
    val __obj = js.Dynamic.literal(keyFilename = keyFilename, projectId = projectId, provider = provider)
  
    __obj.asInstanceOf[GoogleProviderOptions]
  }
}

