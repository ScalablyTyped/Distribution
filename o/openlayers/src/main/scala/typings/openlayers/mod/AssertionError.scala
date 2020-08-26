package typings.openlayers.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "AssertionError")
@js.native
class AssertionError protected () extends Error {
  /**
    * Error object thrown when an assertion failed. This is an ECMA-262 Error,
    * extended with a `code` property.
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error}
    * @param code Error code.
    */
  def this(code: Double) = this()
  /**
    * Error code. The meaning of the code can be found on
    * {@link http://openlayers.org/en/latest/errors.html} (replace `latest` with
    * the version found in the OpenLayers script's header comment if a version
    * other than the latest is used).
    * @api
    */
  var code: Double = js.native
}

