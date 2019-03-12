package typings
package pgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  def create(source: js.Any, transform: pgDashTypesLib.pgDashTypesMod.TypeParser): pgDashTypesLib.Anon_Parse
}

object Anon_Create {
  @scala.inline
  def apply(create: (js.Any, pgDashTypesLib.pgDashTypesMod.TypeParser) => pgDashTypesLib.Anon_Parse): Anon_Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[Anon_Create]
  }
}

