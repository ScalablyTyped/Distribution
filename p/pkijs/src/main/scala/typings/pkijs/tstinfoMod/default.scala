package typings.pkijs.tstinfoMod

import typings.asn1js.mod.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/TSTInfo", JSImport.Default)
@js.native
class default () extends TSTInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var genTime: Date = js.native
  /* CompleteClass */
  override var messageImprint: typings.pkijs.messageImprintMod.default = js.native
  /* CompleteClass */
  override var policy: String = js.native
  /* CompleteClass */
  override var serialNumber: Integer = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
  /* CompleteClass */
  override def verify(params: VerifyParams): js.Thenable[Boolean] = js.native
}

/* static members */
@JSImport("pkijs/src/TSTInfo", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

