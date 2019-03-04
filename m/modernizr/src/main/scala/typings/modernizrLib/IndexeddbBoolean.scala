package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexeddbBoolean
  extends stdLib.Boolean {
  var deletedatabase: scala.Boolean
}

object IndexeddbBoolean {
  @scala.inline
  def apply(deletedatabase: scala.Boolean): IndexeddbBoolean = {
    val __obj = js.Dynamic.literal(deletedatabase = deletedatabase)
  
    __obj.asInstanceOf[IndexeddbBoolean]
  }
}

