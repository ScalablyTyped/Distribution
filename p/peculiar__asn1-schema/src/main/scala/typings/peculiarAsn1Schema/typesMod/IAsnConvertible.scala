package typings.peculiarAsn1Schema.typesMod

import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.LocalValueBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsnConvertible[T] extends js.Object {
  def fromASN(asn: T): this.type
  def toASN(): T
  def toSchema(name: String): BaseBlock[LocalValueBlock]
}

object IAsnConvertible {
  @scala.inline
  def apply[T](fromASN: T => IAsnConvertible[T], toASN: () => T, toSchema: String => BaseBlock[LocalValueBlock]): IAsnConvertible[T] = {
    val __obj = js.Dynamic.literal(fromASN = js.Any.fromFunction1(fromASN), toASN = js.Any.fromFunction0(toASN), toSchema = js.Any.fromFunction1(toSchema))
    __obj.asInstanceOf[IAsnConvertible[T]]
  }
}

