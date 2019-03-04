package typings
package normalizrLib.normalizrMod.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object
  extends normalizrLib.normalizrMod._Schema {
  def define(definition: normalizrLib.normalizrMod.Schema): scala.Unit
}

object Object {
  @scala.inline
  def apply(define: js.Function1[normalizrLib.normalizrMod.Schema, scala.Unit]): Object = {
    val __obj = js.Dynamic.literal(define = define)
  
    __obj.asInstanceOf[Object]
  }
}

