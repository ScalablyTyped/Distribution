package typings.pkijs.revocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/RevocationInfoChoices", JSImport.Default)
@js.native
class default () extends RevocationInfoChoices {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var crls: js.Array[typings.pkijs.certificateRevocationListMod.default] = js.native
  /* CompleteClass */
  override var otherRevocationInfos: js.Array[typings.pkijs.otherRevocationInfoFormatMod.default] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/RevocationInfoChoices", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

