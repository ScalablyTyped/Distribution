package typings
package passportDashSamlLib.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheItem extends js.Object {
  var createdAt: stdLib.Date
  var value: js.Any
}

object CacheItem {
  @scala.inline
  def apply(createdAt: stdLib.Date, value: js.Any): CacheItem = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, value = value)
  
    __obj.asInstanceOf[CacheItem]
  }
}

