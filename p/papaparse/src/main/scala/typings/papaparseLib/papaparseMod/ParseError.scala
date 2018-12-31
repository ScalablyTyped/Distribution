package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
       // A generalization of the error
  var code: java.lang.String
       // Standardized error code
  var message: java.lang.String
    // Human-readable details
  var row: scala.Double
  var `type`: java.lang.String
}

