package typings
package pkijsLib.srcRelativeDistinguishedNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeDistinguishedNames extends js.Object {
  var typesAndValues: js.Array[pkijsLib.srcAttributeTypeAndValueMod.default] = js.native
  var valueBeforeDecode: stdLib.ArrayBuffer = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
    * Compare two RDN values, or RDN with ArrayBuffer value
    * @param {(RelativeDistinguishedNames|ArrayBuffer)} compareTo The value compare to current
    * @returns {boolean}
    */
  def isEqual(compareTo: RelativeDistinguishedNames): scala.Boolean = js.native
  def isEqual(compareTo: stdLib.ArrayBuffer): scala.Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

