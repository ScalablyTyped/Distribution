package typings.pkijs.pbkdf2paramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PBKDF2Params", JSImport.Default)
@js.native
class default () extends PBKDF2Params {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var iterationCount: Double = js.native
  /* CompleteClass */
  override var keyLength: Double = js.native
  /* CompleteClass */
  override var prf: typings.pkijs.algorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var salt: js.Any = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PBKDF2Params", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

