package typings
package pkijsLib.srcGeneralSubtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/GeneralSubtree", JSImport.Default)
@js.native
class default () extends GeneralSubtree {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var base: pkijsLib.srcGeneralNameMod.default = js.native
  /* CompleteClass */
  override var minimum: scala.Double | asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/GeneralSubtree", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

