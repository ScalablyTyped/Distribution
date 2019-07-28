package typings.pkijs.srcGeneralNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/GeneralName", JSImport.Default)
@js.native
class default () extends GeneralName {
  def this(params: js.Any) = this()
  /**
    * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
    * 
    * @type {number}
    * @memberOf GeneralName
    */
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * asn1js object having GENERAL_NAME value (type depends on "type" value)
    * 
    * @type {*}
    * @memberOf GeneralName
    */
  /* CompleteClass */
  override var value: js.Any = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/GeneralName", JSImport.Default)
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

