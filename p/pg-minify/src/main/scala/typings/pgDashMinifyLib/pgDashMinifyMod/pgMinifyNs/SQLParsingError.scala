package typings
package pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SQLParsingError
  extends stdLib.Error {
  var code: parsingErrorCode
  var error: java.lang.String
  var position: IErrorPosition
  @JSName("stack")
  var stack_SQLParsingError: java.lang.String
}

