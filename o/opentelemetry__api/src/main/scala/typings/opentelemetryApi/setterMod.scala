package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setterMod {
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/setter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultSetter(carrier: js.Any, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSetter")(carrier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type SetterFunction[Carrier] = js.Function3[/* carrier */ Carrier, /* key */ String, /* value */ js.Any, Unit]
}
