package typings.pkijs.srcAlgorithmIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/AlgorithmIdentifier", JSImport.Default)
@js.native
class default () extends AlgorithmIdentifier {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var algorithmId: String = js.native
  /* CompleteClass */
  override var algorithmParams: js.Any = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Check that two "AlgorithmIdentifiers" are equal
    * @param {AlgorithmIdentifier} algorithmIdentifier
    * @returns {boolean}
    */
  /* CompleteClass */
  override def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/AlgorithmIdentifier", JSImport.Default)
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

