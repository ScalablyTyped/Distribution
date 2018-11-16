package typings
package pkijsLib.srcIssuingDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
@js.native
class default () extends IssuingDistributionPoint {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var indirectCRL: scala.Boolean = js.native
  /* CompleteClass */
  override var onlyContainsAttributeCerts: scala.Boolean = js.native
  /* CompleteClass */
  override var onlyContainsUserCerts: scala.Boolean = js.native
  /* CompleteClass */
  override var onlySomeReasons: scala.Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

