package typings
package pkijsLib.srcECPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPublicKey extends js.Object {
  var namedCurve: java.lang.String
  var x: stdLib.ArrayBuffer
  var y: stdLib.ArrayBuffer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: stdLib.JsonWebKey): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECPublicKey {
  @scala.inline
  def apply(
    fromJSON: js.Function1[stdLib.JsonWebKey, scala.Unit],
    fromSchema: js.Function1[js.Any, scala.Unit],
    namedCurve: java.lang.String,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    x: stdLib.ArrayBuffer,
    y: stdLib.ArrayBuffer
  ): ECPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = fromJSON, fromSchema = fromSchema, namedCurve = namedCurve, toJSON = toJSON, toSchema = toSchema, x = x, y = y)
  
    __obj.asInstanceOf[ECPublicKey]
  }
}

