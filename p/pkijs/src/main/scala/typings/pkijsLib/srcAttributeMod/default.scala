package typings
package pkijsLib.srcAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/Attribute", JSImport.Default)
@js.native
class default () extends Attribute {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override var value: js.Array[_] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/Attribute", JSImport.Default)
@js.native
object default extends js.Object {
  def compareWithDefault(memberName: java.lang.String, memberValue: js.Any): scala.Boolean = js.native
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

