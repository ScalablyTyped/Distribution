package typings
package pkijsLib.srcCertificateSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CertificateSet", JSImport.Default)
@js.native
class default () extends CertificateSet {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var certificates: js.Array[pkijsLib.srcCertificateMod.default] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/CertificateSet", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

