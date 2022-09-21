package typings.micromarkFactorySpace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-space", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factorySpace(effects: Effects, ok: State, `type`: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factorySpace")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def factorySpace(effects: Effects, ok: State, `type`: String, max: Double): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factorySpace")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type State = typings.micromarkUtilTypes.mod.State
}
