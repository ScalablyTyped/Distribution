package typings
package pgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofarrayParser extends js.Object {
  def create(source: js.Any, transform: pgDashTypesLib.pgDashTypesMod.TypeParser): pgDashTypesLib.Anon_Parse
}

object TypeofarrayParser {
  @scala.inline
  def apply(create: (js.Any, pgDashTypesLib.pgDashTypesMod.TypeParser) => pgDashTypesLib.Anon_Parse): TypeofarrayParser = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[TypeofarrayParser]
  }
}

