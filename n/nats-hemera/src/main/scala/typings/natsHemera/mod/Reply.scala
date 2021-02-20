package typings.natsHemera.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reply extends StObject {
  
  var error: Error = js.native
  
  var log: typings.pino.mod.Logger | Logger = js.native
  
  def next(message: js.Any): Unit = js.native
  def next(message: Error): Unit = js.native
  
  var payload: HemeraMessagePayload = js.native
  
  def send(message: js.Any): Unit = js.native
  def send(message: Error): Unit = js.native
  
  var sent: Boolean = js.native
}
