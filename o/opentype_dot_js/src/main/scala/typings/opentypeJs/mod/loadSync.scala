package typings.opentypeJs.mod

import typings.opentypeJs.anon.LowMemory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "loadSync")
@js.native
object loadSync extends js.Object {
  
  def apply(url: String): Font = js.native
  def apply(url: String, opt: LowMemory): Font = js.native
}
