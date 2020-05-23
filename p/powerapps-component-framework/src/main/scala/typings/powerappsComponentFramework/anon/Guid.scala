package typings.powerappsComponentFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guid extends js.Object {
  var guid: String
}

object Guid {
  @scala.inline
  def apply(guid: String): Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
}

