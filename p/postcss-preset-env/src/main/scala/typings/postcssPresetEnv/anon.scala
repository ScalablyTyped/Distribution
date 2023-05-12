package typings.postcssPresetEnv

import typings.postcssPresetEnv.distOptionsMod.DirectionFlow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BlockDirection extends StObject {
    
    /** Set the block flow direction. default: top-to-bottom */
    var blockDirection: js.UndefOr[DirectionFlow] = js.undefined
    
    /** Set the inline flow direction. default: left-to-right */
    var inlineDirection: js.UndefOr[DirectionFlow] = js.undefined
  }
  object BlockDirection {
    
    inline def apply(): BlockDirection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockDirection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockDirection] (val x: Self) extends AnyVal {
      
      inline def setBlockDirection(value: DirectionFlow): Self = StObject.set(x, "blockDirection", value.asInstanceOf[js.Any])
      
      inline def setBlockDirectionUndefined: Self = StObject.set(x, "blockDirection", js.undefined)
      
      inline def setInlineDirection(value: DirectionFlow): Self = StObject.set(x, "inlineDirection", value.asInstanceOf[js.Any])
      
      inline def setInlineDirectionUndefined: Self = StObject.set(x, "inlineDirection", js.undefined)
    }
  }
}
