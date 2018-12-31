package typings
package pkijsLib.srcRelativeDistinguishedNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDistinguishedNames extends js.Object {
  var typesAndValues: js.Array[pkijsLib.srcAttributeTypeAndValueMod.default]
  var valueBeforeDecode: stdLib.ArrayBuffer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

