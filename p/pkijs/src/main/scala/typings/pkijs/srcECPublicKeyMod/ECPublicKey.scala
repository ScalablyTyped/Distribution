package typings.pkijs.srcECPublicKeyMod

import typings.std.ArrayBuffer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPublicKey extends js.Object {
  var namedCurve: String
  var x: ArrayBuffer
  var y: ArrayBuffer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECPublicKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    namedCurve: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    x: ArrayBuffer,
    y: ArrayBuffer
  ): ECPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), namedCurve = namedCurve, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), x = x, y = y)
  
    __obj.asInstanceOf[ECPublicKey]
  }
}

