package typings.pkijs.srcIssuerAndSerialNumberMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
@js.native
class default () extends IssuerAndSerialNumber {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var issuer: typings.pkijs.srcRelativeDistinguishedNamesMod.default = js.native
  /* CompleteClass */
  override var serialNumber: Integer = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

