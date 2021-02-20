package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setterMod {
  
  @JSImport("@opentelemetry/api/build/src/context/propagation/setter", "defaultSetter")
  @js.native
  def defaultSetter(carrier: js.Any, key: String, value: js.Any): Unit = js.native
  
  type SetterFunction[Carrier] = js.Function3[/* carrier */ Carrier, /* key */ String, /* value */ js.Any, Unit]
}
