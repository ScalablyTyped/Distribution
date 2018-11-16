package typings
package pkijsLib.srcExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/Extension", JSImport.Default)
@js.native
class default () extends Extension {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var critical: scala.Boolean = js.native
  /* CompleteClass */
  override var extnID: java.lang.String = js.native
  /* CompleteClass */
  override var extnValue: asn1jsLib.asn1jsMod.OctetString = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/Extension", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

