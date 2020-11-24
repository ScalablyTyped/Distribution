package typings.portfinder.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("portfinder", "getPorts")
@js.native
object getPorts extends js.Object {
  
  def apply(
    count: Double,
    options: PortFinderOptions,
    callback: js.Function2[/* err */ Error, /* ports */ js.Array[Double], Unit]
  ): Unit = js.native
}
