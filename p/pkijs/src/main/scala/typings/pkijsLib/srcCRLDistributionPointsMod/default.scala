package typings
package pkijsLib.srcCRLDistributionPointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CRLDistributionPoints", JSImport.Default)
@js.native
class default () extends CRLDistributionPoints {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var distributionPoints: js.Array[pkijsLib.srcDistributionPointMod.default] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/CRLDistributionPoints", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

