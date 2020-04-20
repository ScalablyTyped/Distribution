package typings.poi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheDirectory extends js.Object {
  var cacheDirectory: String
  var cacheIdentifier: String
}

object AnonCacheDirectory {
  @scala.inline
  def apply(cacheDirectory: String, cacheIdentifier: String): AnonCacheDirectory = {
    val __obj = js.Dynamic.literal(cacheDirectory = cacheDirectory.asInstanceOf[js.Any], cacheIdentifier = cacheIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheDirectory]
  }
}

