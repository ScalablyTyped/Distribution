package typings.pg

import typings.pgDashTypes.Anon_Parse
import typings.pgDashTypes.pgDashTypesMod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofarrayParser extends js.Object {
  def create(source: js.Any, transform: TypeParser): Anon_Parse
}

object TypeofarrayParser {
  @scala.inline
  def apply(create: (js.Any, TypeParser) => Anon_Parse): TypeofarrayParser = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[TypeofarrayParser]
  }
}

