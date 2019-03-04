package typings
package normalizrLib.normalizrMod.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity
  extends normalizrLib.normalizrMod._Schema {
  var key: java.lang.String
  def define(definition: normalizrLib.normalizrMod.Schema): scala.Unit
}

object Entity {
  @scala.inline
  def apply(define: js.Function1[normalizrLib.normalizrMod.Schema, scala.Unit], key: java.lang.String): Entity = {
    val __obj = js.Dynamic.literal(define = define, key = key)
  
    __obj.asInstanceOf[Entity]
  }
}

