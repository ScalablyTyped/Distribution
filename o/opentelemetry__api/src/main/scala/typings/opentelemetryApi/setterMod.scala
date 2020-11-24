package typings.opentelemetryApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/context/propagation/setter", JSImport.Namespace)
@js.native
object setterMod extends js.Object {
  
  def defaultSetter(carrier: js.Any, key: String, value: js.Any): Unit = js.native
  
  type SetterFunction[Carrier] = js.Function3[/* carrier */ Carrier, /* key */ String, /* value */ js.Any, Unit]
}
