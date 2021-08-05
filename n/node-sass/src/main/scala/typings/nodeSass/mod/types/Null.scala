package typings.nodeSass.mod.types

import typings.nodeSass.mod._ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Null
  extends StObject
     with Value
     with _ImporterReturnType {
  
  /**
    * This property doesn't exist, but its presence forces the typescript
    * compiler to properly type check this type. Without it, it seems to
    * allow things that aren't types.Null to match it in case statements and
    * assignments.
    */
  val ___NULL___ : js.Symbol
}
object Null {
  
  @JSImport("node-sass", "types.Null")
  @js.native
  val ^ : NullConstructor = js.native
  
  extension [Self <: Null](x: Self) {
    
    inline def set___NULL___(value: js.Symbol): Self = StObject.set(x, "___NULL___", value.asInstanceOf[js.Any])
  }
}
