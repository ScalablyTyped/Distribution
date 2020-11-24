package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "Application")
@js.native
class Application ()
  extends typings.fxn.mod.Application {
  
  /**
    * HTTP Error
    */
  def error(req: js.Any, res: js.Any, start: js.Any, status: Double, message: String, err: js.Any): Unit = js.native
}
