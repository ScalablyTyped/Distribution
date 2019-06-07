package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleProviderOptions extends js.Object {
  var keyFilename: java.lang.String
  var projectId: java.lang.String
  var provider: pkgcloudLib.pkgcloudLibStrings.google
}

object GoogleProviderOptions {
  @scala.inline
  def apply(
    keyFilename: java.lang.String,
    projectId: java.lang.String,
    provider: pkgcloudLib.pkgcloudLibStrings.google
  ): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename, projectId = projectId, provider = provider)
  
    __obj.asInstanceOf[GoogleProviderOptions]
  }
}

