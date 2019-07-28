package typings.pkijs.srcOtherPrimeInfoMod

import typings.asn1js.asn1jsMod.Integer
import typings.pkijs.JsonOtherPrimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
@js.native
class default () extends OtherPrimeInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var coefficient: Integer = js.native
  /* CompleteClass */
  override var exponent: Integer = js.native
  /* CompleteClass */
  override var prime: Integer = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  /* CompleteClass */
  override def fromJSON(json: JsonOtherPrimeInfo): Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

