package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinExternalApplicationStatic extends js.Object {
  /**
    * Returns an External Application object that represents an existing external application.
    */
  def wrap(uuid: String): OpenFinExternalApplication
}

object OpenFinExternalApplicationStatic {
  @scala.inline
  def apply(wrap: String => OpenFinExternalApplication): OpenFinExternalApplicationStatic = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction1(wrap))
  
    __obj.asInstanceOf[OpenFinExternalApplicationStatic]
  }
}

