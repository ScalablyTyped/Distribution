package typings.opentelemetryApi

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.typesMod.Baggage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextHelpersMod {
  
  @JSImport("@opentelemetry/api/build/src/baggage/context-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteBaggage(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteBaggage")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def getBaggage(context: Context): js.UndefOr[Baggage] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaggage")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Baggage]]
  
  inline def setBaggage(context: Context, baggage: Baggage): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setBaggage")(context.asInstanceOf[js.Any], baggage.asInstanceOf[js.Any])).asInstanceOf[Context]
}
