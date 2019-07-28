package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnNameMappers extends js.Object {
  def format(json: Pojo): Pojo
  def parse(json: Pojo): Pojo
}

object ColumnNameMappers {
  @scala.inline
  def apply(format: Pojo => Pojo, parse: Pojo => Pojo): ColumnNameMappers = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[ColumnNameMappers]
  }
}

