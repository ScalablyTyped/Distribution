package typings
package pkijsLib.srcIssuerAndSerialNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
@js.native
class default () extends IssuerAndSerialNumber {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var issuer: pkijsLib.srcRelativeDistinguishedNamesMod.default = js.native
  /* CompleteClass */
  override var serialNumber: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/IssuerAndSerialNumber", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

