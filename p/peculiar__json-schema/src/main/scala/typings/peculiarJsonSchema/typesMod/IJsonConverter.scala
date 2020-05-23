package typings.peculiarJsonSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonConverter[T, S] extends js.Object {
  def fromJSON(value: S, target: js.Any): T
  def toJSON(value: T, target: js.Any): S
}

object IJsonConverter {
  @scala.inline
  def apply[T, S](fromJSON: (S, js.Any) => T, toJSON: (T, js.Any) => S): IJsonConverter[T, S] = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction2(fromJSON), toJSON = js.Any.fromFunction2(toJSON))
    __obj.asInstanceOf[IJsonConverter[T, S]]
  }
}

