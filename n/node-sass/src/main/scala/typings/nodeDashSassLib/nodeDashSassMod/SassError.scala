package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassError
  extends nodeLib.Error {
  var column: scala.Double
  var file: java.lang.String
  var line: scala.Double
  var message: java.lang.String
  var status: scala.Double
}

