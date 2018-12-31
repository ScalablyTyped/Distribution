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

