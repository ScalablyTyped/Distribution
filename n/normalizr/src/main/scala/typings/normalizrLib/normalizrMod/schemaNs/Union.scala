package typings
package normalizrLib.normalizrMod.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Union
  extends normalizrLib.normalizrMod._Schema {
  def define(definition: normalizrLib.normalizrMod.Schema): scala.Unit
}

object Union {
  @scala.inline
  def apply(define: js.Function1[normalizrLib.normalizrMod.Schema, scala.Unit]): Union = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("define")(define)
    __obj.asInstanceOf[Union]
  }
}

