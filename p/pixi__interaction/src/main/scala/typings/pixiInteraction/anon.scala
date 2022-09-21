package typings.pixiInteraction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<@pixi/interaction.@pixi/interaction.InteractionTrackingFlags> */
  trait ReadonlyInteractionTracki extends StObject {
    
    val LEFT_DOWN: Double
    
    val NONE: Double
    
    val OVER: Double
    
    val RIGHT_DOWN: Double
  }
  object ReadonlyInteractionTracki {
    
    inline def apply(LEFT_DOWN: Double, NONE: Double, OVER: Double, RIGHT_DOWN: Double): ReadonlyInteractionTracki = {
      val __obj = js.Dynamic.literal(LEFT_DOWN = LEFT_DOWN.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], OVER = OVER.asInstanceOf[js.Any], RIGHT_DOWN = RIGHT_DOWN.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyInteractionTracki]
    }
    
    extension [Self <: ReadonlyInteractionTracki](x: Self) {
      
      inline def setLEFT_DOWN(value: Double): Self = StObject.set(x, "LEFT_DOWN", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setOVER(value: Double): Self = StObject.set(x, "OVER", value.asInstanceOf[js.Any])
      
      inline def setRIGHT_DOWN(value: Double): Self = StObject.set(x, "RIGHT_DOWN", value.asInstanceOf[js.Any])
    }
  }
}
