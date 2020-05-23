package typings.poi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDirectory extends js.Object {
  var cacheDirectory: String
  var cacheIdentifier: String
}

object CacheDirectory {
  @scala.inline
  def apply(cacheDirectory: String, cacheIdentifier: String): CacheDirectory = {
    val __obj = js.Dynamic.literal(cacheDirectory = cacheDirectory.asInstanceOf[js.Any], cacheIdentifier = cacheIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDirectory]
  }
}

