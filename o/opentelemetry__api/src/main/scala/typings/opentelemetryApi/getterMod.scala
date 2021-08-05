package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getterMod {
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/getter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetter(carrier: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetter")(carrier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type GetterFunction[Carrier] = js.Function2[/* carrier */ Carrier, /* key */ String, js.Any]
}
