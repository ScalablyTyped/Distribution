package typings.next

import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibFlushEffectsMod {
  
  @JSImport("next/dist/shared/lib/flush-effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/shared/lib/flush-effects", "FlushEffectsContext")
  @js.native
  val FlushEffectsContext: Context[FlushEffectsHook | Null] = js.native
  
  inline def useFlushEffects(callback: js.Function0[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlushEffects")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FlushEffectsHook = js.Function1[/* callbacks */ js.Function0[ReactNode], Unit]
}
