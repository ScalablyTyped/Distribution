package typings
package pkijsLib.srcPolicyInformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PolicyInformation", JSImport.Default)
@js.native
class default () extends PolicyInformation {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var policyIdentifier: java.lang.String = js.native
  /**
           * Value of the TIME class 
           */
  /* CompleteClass */
  override var policyQualifiers: js.Array[pkijsLib.srcPolicyQualifierInfoMod.default] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/PolicyInformation", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

