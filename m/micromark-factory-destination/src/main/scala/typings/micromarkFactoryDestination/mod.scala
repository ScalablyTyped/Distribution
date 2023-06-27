package typings.micromarkFactoryDestination

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-destination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryDestination(
    effects: Effects,
    ok: State,
    nok: State,
    `type`: TokenType,
    literalType: TokenType,
    literalMarkerType: TokenType,
    rawType: TokenType,
    stringType: TokenType
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryDestination")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], nok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], literalType.asInstanceOf[js.Any], literalMarkerType.asInstanceOf[js.Any], rawType.asInstanceOf[js.Any], stringType.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def factoryDestination(
    effects: Effects,
    ok: State,
    nok: State,
    `type`: TokenType,
    literalType: TokenType,
    literalMarkerType: TokenType,
    rawType: TokenType,
    stringType: TokenType,
    max: Double
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryDestination")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], nok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], literalType.asInstanceOf[js.Any], literalMarkerType.asInstanceOf[js.Any], rawType.asInstanceOf[js.Any], stringType.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenType = typings.micromarkUtilTypes.mod.TokenType
}
