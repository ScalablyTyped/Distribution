package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWktMod {
  
  @JSImport("ol/format/WKT", JSImport.Default)
  @js.native
  open class default () extends WKT {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var splitCollection: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSplitCollection(value: Boolean): Self = StObject.set(x, "splitCollection", value.asInstanceOf[js.Any])
      
      inline def setSplitCollectionUndefined: Self = StObject.set(x, "splitCollection", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var position: Double
    
    var `type`: Double
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object Token {
    
    inline def apply(position: Double, `type`: Double): Token = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait WKT
    extends typings.ol.formatTextFeatureMod.default
}
