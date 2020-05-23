package typings.pg.anon

import typings.pgTypes.anon.Parse
import typings.pgTypes.mod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofarrayParser extends js.Object {
  def create(source: js.Any, transform: TypeParser): Parse
}

object TypeofarrayParser {
  @scala.inline
  def apply(create: (js.Any, TypeParser) => Parse): TypeofarrayParser = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[TypeofarrayParser]
  }
}

