package typings
package pkijsLib.srcPolicyMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PolicyMapping", JSImport.Default)
@js.native
class default () extends PolicyMapping {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var issuerDomainPolicy: java.lang.String = js.native
  /* CompleteClass */
  override var subjectDomainPolicy: java.lang.String = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PolicyMapping", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

