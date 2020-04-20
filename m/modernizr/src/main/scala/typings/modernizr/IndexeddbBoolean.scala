package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexeddbBoolean extends Boolean {
  var deletedatabase: scala.Boolean
}

object IndexeddbBoolean {
  @scala.inline
  def apply(deletedatabase: scala.Boolean): IndexeddbBoolean = {
    val __obj = js.Dynamic.literal(deletedatabase = deletedatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexeddbBoolean]
  }
}

