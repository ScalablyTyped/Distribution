package typings
package pkijsLib.srcGeneralNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeneralName extends js.Object {
  /**
           * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
           * 
           * @type {number}
           * @memberOf GeneralName
           */
  var `type`: scala.Double
  /**
           * asn1js object having GENERAL_NAME value (type depends on "type" value)
           * 
           * @type {*}
           * @memberOf GeneralName
           */
  var value: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

