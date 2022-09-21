package typings.natsHemera.mod

import typings.pino.mod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reply extends StObject {
  
  var error: js.Error = js.native
  
  var log: typings.pino.mod.Logger[LoggerOptions] | Logger = js.native
  
  def next(message: js.Error): Unit = js.native
  def next(message: Any): Unit = js.native
  
  var payload: HemeraMessagePayload = js.native
  
  def send(message: js.Error): Unit = js.native
  def send(message: Any): Unit = js.native
  
  var sent: Boolean = js.native
}
