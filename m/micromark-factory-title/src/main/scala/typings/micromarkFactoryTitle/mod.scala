package typings.micromarkFactoryTitle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryTitle(effects: Effects, ok: State, nok: State, `type`: String, markerType: String, stringType: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryTitle")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], nok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], stringType.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Code = typings.micromarkUtilTypes.mod.Code
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type State = typings.micromarkUtilTypes.mod.State
}
