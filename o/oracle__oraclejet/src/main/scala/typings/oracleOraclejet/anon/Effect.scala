package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojanimationMod.AnimationMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effect
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var effect: AnimationMethods
}
object Effect {
  
  inline def apply(effect: AnimationMethods): Effect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  
  extension [Self <: Effect](x: Self) {
    
    inline def setEffect(value: AnimationMethods): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
  }
}
