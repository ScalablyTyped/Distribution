package typings
package pkijsLib.srcRSAPrivateKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/RSAPrivateKey", JSImport.Default)
@js.native
class default () extends RSAPrivateKey {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var coefficient: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var exponent1: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var exponent2: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var modulus: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var prime1: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var prime2: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var privateExponent: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var publicExponent: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var version: scala.Double = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  /* CompleteClass */
  override def fromJSON(json: stdLib.JsonWebKey): scala.Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/RSAPrivateKey", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

