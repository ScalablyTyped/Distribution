package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnNameMappers extends js.Object {
  def format(json: Pojo): Pojo
  def parse(json: Pojo): Pojo
}

object ColumnNameMappers {
  @scala.inline
  def apply(format: js.Function1[Pojo, Pojo], parse: js.Function1[Pojo, Pojo]): ColumnNameMappers = {
    val __obj = js.Dynamic.literal(format = format, parse = parse)
  
    __obj.asInstanceOf[ColumnNameMappers]
  }
}

