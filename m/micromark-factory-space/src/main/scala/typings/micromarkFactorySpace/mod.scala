package typings.micromarkFactorySpace

import typings.micromarkUtilTypes.mod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-space", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factorySpace(effects: Effects, ok: State, `type`: TokenType): js.Function1[/* code */ Code, Unit | typings.micromarkUtilTypes.mod.State] = (^.asInstanceOf[js.Dynamic].applyDynamic("factorySpace")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* code */ Code, Unit | typings.micromarkUtilTypes.mod.State]]
  inline def factorySpace(effects: Effects, ok: State, `type`: TokenType, max: Double): js.Function1[/* code */ Code, Unit | typings.micromarkUtilTypes.mod.State] = (^.asInstanceOf[js.Dynamic].applyDynamic("factorySpace")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* code */ Code, Unit | typings.micromarkUtilTypes.mod.State]]
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenType = typings.micromarkUtilTypes.mod.TokenType
}
