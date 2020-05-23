package typings.peculiarAsn1Schema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsnConverter[T, AsnType] extends js.Object {
  /**
    * Returns JS value from ASN.1 object
    * @param value ASN.1 object from asn1js module
    */
  def fromASN(value: AsnType): T
  /**
    * Returns ASN.1 object from JS value
    * @param value JS value
    */
  def toASN(value: T): AsnType
}

object IAsnConverter {
  @scala.inline
  def apply[T, AsnType](fromASN: AsnType => T, toASN: T => AsnType): IAsnConverter[T, AsnType] = {
    val __obj = js.Dynamic.literal(fromASN = js.Any.fromFunction1(fromASN), toASN = js.Any.fromFunction1(toASN))
    __obj.asInstanceOf[IAsnConverter[T, AsnType]]
  }
}

