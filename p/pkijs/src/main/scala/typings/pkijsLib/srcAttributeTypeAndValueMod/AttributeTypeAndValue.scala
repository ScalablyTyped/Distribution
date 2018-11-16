package typings
package pkijsLib.srcAttributeTypeAndValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeTypeAndValue extends js.Object {
  /**
           * 
           * 
           * @type {ObjectIdentifier}
           * @memberOf AttributeTypeAndValue
           */
  var `type`: asn1jsLib.asn1jsMod.ObjectIdentifier = js.native
  /**
           * 
           * 
           * @type {*}
           * @memberOf AttributeTypeAndValue
           */
  var value: js.Any = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
           * Compare two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
           * 
           * @param {(AttributeTypeAndValue|ArrayBuffer)} compareTo The value compare to current
           * @returns {boolean}
           * 
           * @memberOf AttributeTypeAndValue
           */
  def isEqual(compareTo: AttributeTypeAndValue): scala.Boolean = js.native
  /**
           * Compare two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
           * 
           * @param {(AttributeTypeAndValue|ArrayBuffer)} compareTo The value compare to current
           * @returns {boolean}
           * 
           * @memberOf AttributeTypeAndValue
           */
  def isEqual(compareTo: stdLib.ArrayBuffer): scala.Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

