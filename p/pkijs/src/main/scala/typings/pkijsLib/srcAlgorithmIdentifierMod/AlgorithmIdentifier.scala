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
    fromSchema: js.Function1[js.Any, scala.Unit],
    isEqual: js.Function1[AlgorithmIdentifier, scala.Boolean],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId, algorithmParams = algorithmParams, fromSchema = fromSchema, isEqual = isEqual, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
}

