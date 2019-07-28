package typings.pkijs.srcRelativeDistinguishedNamesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeDistinguishedNames extends js.Object {
  var typesAndValues: js.Array[typings.pkijs.srcAttributeTypeAndValueMod.default] = js.native
  var valueBeforeDecode: ArrayBuffer = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Compare two RDN values, or RDN with ArrayBuffer value
    * @param {(RelativeDistinguishedNames|ArrayBuffer)} compareTo The value compare to current
    * @returns {boolean}
    */
  def isEqual(compareTo: RelativeDistinguishedNames): Boolean = js.native
  def isEqual(compareTo: ArrayBuffer): Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

