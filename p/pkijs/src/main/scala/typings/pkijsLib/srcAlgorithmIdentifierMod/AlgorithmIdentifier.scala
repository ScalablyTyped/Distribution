package typings
package pkijsLib.srcAlgorithmIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmIdentifier extends js.Object {
  var algorithmId: java.lang.String
  var algorithmParams: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  /**
    * Check that two "AlgorithmIdentifiers" are equal
    * @param {AlgorithmIdentifier} algorithmIdentifier
    * @returns {boolean}
    */
  def isEqual(algorithmIdentifier: AlgorithmIdentifier): scala.Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AlgorithmIdentifier {
  @scala.inline
  def apply(
    algorithmId: java.lang.String,
    algorithmParams: js.Any,
    fromSchema: js.Any => scala.Unit,
    isEqual: AlgorithmIdentifier => scala.Boolean,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId, algorithmParams = algorithmParams, fromSchema = js.Any.fromFunction1(fromSchema), isEqual = js.Any.fromFunction1(isEqual), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
}

