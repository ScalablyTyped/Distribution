package typings.opentelemetryApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/context/propagation/getter", JSImport.Namespace)
@js.native
object getterMod extends js.Object {
  
  def defaultGetter(carrier: js.Any, key: String): js.Any = js.native
  
  type GetterFunction[Carrier] = js.Function2[/* carrier */ Carrier, /* key */ String, js.Any]
}
