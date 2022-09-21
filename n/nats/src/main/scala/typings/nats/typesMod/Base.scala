package typings.nats.typesMod

import typings.nats.errorMod.NatsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends StObject {
  
  def callback(error: Null, msg: Msg): Unit = js.native
  def callback(error: NatsError, msg: Msg): Unit = js.native
  
  var draining: Boolean = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var received: Double = js.native
  
  var subject: String = js.native
  
  var timeout: js.UndefOr[Double | Null] = js.native
}
