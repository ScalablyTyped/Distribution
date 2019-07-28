package typings.pkijs.srcRSAPrivateKeyMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/RSAPrivateKey", JSImport.Default)
@js.native
class default () extends RSAPrivateKey {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var coefficient: Integer = js.native
  /* CompleteClass */
  override var exponent1: Integer = js.native
  /* CompleteClass */
  override var exponent2: Integer = js.native
  /* CompleteClass */
  override var modulus: Integer = js.native
  /* CompleteClass */
  override var prime1: Integer = js.native
  /* CompleteClass */
  override var prime2: Integer = js.native
  /* CompleteClass */
  override var privateExponent: Integer = js.native
  /* CompleteClass */
  override var publicExponent: Integer = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  /* CompleteClass */
  override def fromJSON(json: JsonWebKey): Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/RSAPrivateKey", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

