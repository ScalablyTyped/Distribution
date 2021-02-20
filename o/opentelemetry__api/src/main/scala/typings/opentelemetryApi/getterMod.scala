package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getterMod {
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/getter", "defaultGetter")
  @js.native
  def defaultGetter(carrier: js.Any, key: String): js.Any = js.native
  
  type GetterFunction[Carrier] = js.Function2[/* carrier */ Carrier, /* key */ String, js.Any]
}
