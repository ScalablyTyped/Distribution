package typings.ow

import typings.ow.predicatesMod.Predicates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersMod {
  
  @JSImport("ow/dist/source/modifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](`object`: T): T & Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[T & Modifiers]
  
  trait Modifiers extends StObject {
    
    /**
      Make the following predicate optional so it doesn't fail when the value is `undefined`.
      */
    val optional: Predicates
  }
  object Modifiers {
    
    inline def apply(optional: Predicates): Modifiers = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modifiers]
    }
    
    extension [Self <: Modifiers](x: Self) {
      
      inline def setOptional(value: Predicates): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
}
