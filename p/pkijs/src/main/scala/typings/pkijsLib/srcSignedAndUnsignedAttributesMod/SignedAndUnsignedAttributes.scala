package typings
package pkijsLib.srcSignedAndUnsignedAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SignedAndUnsignedAttributes extends js.Object {
  var attributes: js.Array[pkijsLib.srcAttributeMod.default]
  var encodedValue: stdLib.ArrayBuffer
  var `type`: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

