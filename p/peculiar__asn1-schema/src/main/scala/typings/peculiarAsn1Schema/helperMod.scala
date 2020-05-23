package typings.peculiarAsn1Schema

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  def isArrayEqual(bytes1: ArrayBuffer, bytes2: ArrayBuffer): Boolean = js.native
  def isConvertible(target: js.Any): /* is @peculiar/asn1-schema.@peculiar/asn1-schema/build/types/types.IAsnConvertible<any> */ Boolean = js.native
  def isTypeOfArray(target: js.Any): Boolean = js.native
}

