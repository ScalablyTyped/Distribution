package typings.pkijs.srcPolicyQualifierInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PolicyQualifierInfo", JSImport.Default)
@js.native
class default () extends PolicyQualifierInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var policyQualifierId: String = js.native
  /* CompleteClass */
  override var qualifier: js.Any = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PolicyQualifierInfo", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

