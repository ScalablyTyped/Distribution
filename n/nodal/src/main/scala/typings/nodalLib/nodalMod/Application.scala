package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "Application")
@js.native
class Application ()
  extends fxnLib.fxnMod.Application {
  /**
     * HTTP Error
     */
  def error(
    req: js.Any,
    res: js.Any,
    start: js.Any,
    status: scala.Double,
    message: java.lang.String,
    err: js.Any
  ): scala.Unit = js.native
}

