package typings.pkijs.policyInformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PolicyInformation", JSImport.Default)
@js.native
class default () extends PolicyInformation {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var policyIdentifier: String = js.native
  /**
    * Value of the TIME class
    */
  /* CompleteClass */
  override var policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PolicyInformation", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

