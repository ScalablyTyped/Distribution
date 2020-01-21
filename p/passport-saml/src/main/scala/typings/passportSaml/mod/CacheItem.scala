package typings.passportSaml.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheItem extends js.Object {
  var createdAt: Date
  var value: js.Any
}

object CacheItem {
  @scala.inline
  def apply(createdAt: Date, value: js.Any): CacheItem = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheItem]
  }
}

