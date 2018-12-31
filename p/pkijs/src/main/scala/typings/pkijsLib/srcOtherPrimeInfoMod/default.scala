package typings
package pkijsLib.srcOtherPrimeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
@js.native
class default () extends OtherPrimeInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var coefficient: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var exponent: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var prime: asn1jsLib.asn1jsMod.Integer = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  /* CompleteClass */
  override def fromJSON(json: pkijsLib.JsonOtherPrimeInfo): scala.Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

