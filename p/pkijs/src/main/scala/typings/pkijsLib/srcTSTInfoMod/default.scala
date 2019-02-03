package typings
package pkijsLib.srcTSTInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/TSTInfo", JSImport.Default)
@js.native
class default () extends TSTInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var genTime: stdLib.Date = js.native
  /* CompleteClass */
  override var messageImprint: pkijsLib.srcMessageImprintMod.default = js.native
  /* CompleteClass */
  override var policy: java.lang.String = js.native
  /* CompleteClass */
  override var serialNumber: asn1jsLib.asn1jsMod.Integer = js.native
  /* CompleteClass */
  override var version: scala.Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
  /* CompleteClass */
  override def verify(params: VerifyParams): js.Thenable[scala.Boolean] = js.native
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
  def compareWithDefault(memberName: java.lang.String, memberValue: js.Any): scala.Boolean = js.native
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

