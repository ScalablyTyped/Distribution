package typings
package normalizrLib.normalizrMod.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array
  extends normalizrLib.normalizrMod._Schema {
  def define(definition: normalizrLib.normalizrMod.Schema): scala.Unit
}

object Array {
  @scala.inline
  def apply(define: js.Function1[normalizrLib.normalizrMod.Schema, scala.Unit]): Array = {
    val __obj = js.Dynamic.literal(define = define)
  
    __obj.asInstanceOf[Array]
  }
}

