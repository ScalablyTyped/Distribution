package typings.pkijs.srcAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/Attribute", JSImport.Default)
@js.native
class default () extends Attribute {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var value: js.Array[_] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/Attribute", JSImport.Default)
@js.native
object default extends js.Object {
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

