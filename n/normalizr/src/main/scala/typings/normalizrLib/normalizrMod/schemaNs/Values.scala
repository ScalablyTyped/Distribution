package typings
package normalizrLib.normalizrMod.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values
  extends normalizrLib.normalizrMod._Schema {
  def define(definition: normalizrLib.normalizrMod.Schema): scala.Unit
}

object Values {
  @scala.inline
  def apply(define: js.Function1[normalizrLib.normalizrMod.Schema, scala.Unit]): Values = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("define")(define)
    __obj.asInstanceOf[Values]
  }
}

