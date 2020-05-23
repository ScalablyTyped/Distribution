package typings.peculiarJsonSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonConvertible[T] extends js.Object {
  def fromJSON(json: T): this.type
  def toJSON(): T
}

object IJsonConvertible {
  @scala.inline
  def apply[T](fromJSON: T => IJsonConvertible[T], toJSON: () => T): IJsonConvertible[T] = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[IJsonConvertible[T]]
  }
}

