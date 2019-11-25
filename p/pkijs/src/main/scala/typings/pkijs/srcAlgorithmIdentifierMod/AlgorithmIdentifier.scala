package typings.pkijs.srcAlgorithmIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmIdentifier extends js.Object {
  var algorithmId: String
  var algorithmParams: js.Any
  def fromSchema(schema: js.Any): Unit
  /**
    * Check that two "AlgorithmIdentifiers" are equal
    * @param {AlgorithmIdentifier} algorithmIdentifier
    * @returns {boolean}
    */
  def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AlgorithmIdentifier {
  @scala.inline
  def apply(
    algorithmId: String,
    algorithmParams: js.Any,
    fromSchema: js.Any => Unit,
    isEqual: AlgorithmIdentifier => Boolean,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], algorithmParams = algorithmParams.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), isEqual = js.Any.fromFunction1(isEqual), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
}

