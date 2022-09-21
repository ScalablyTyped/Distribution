package typings.micromarkFactoryWhitespace

import typings.micromarkUtilTypes.mod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-whitespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryWhitespace(effects: Effects, ok: State): js.Function1[/* code */ Code, Unit | typings.micromarkUtilTypes.mod.State] = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryWhitespace")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* code */ Code, Unit | typings.micromarkUtilTypes.mod.State]]
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type State = typings.micromarkUtilTypes.mod.State
}
