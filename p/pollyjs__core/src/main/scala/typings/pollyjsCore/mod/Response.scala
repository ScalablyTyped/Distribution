package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends HTTPBase {
  
  def end(): this.type = js.native
  
  var isBinary: Boolean = js.native
  
  val ok: Boolean = js.native
  
  def sendStatus(status: Double): this.type = js.native
  
  def status(status: Double): this.type = js.native
  
  var statusCode: Double = js.native
  
  val statusText: String = js.native
}
