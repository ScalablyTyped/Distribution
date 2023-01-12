package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesFluidRangeConfigurationMod {
  
  trait FluidRangeConfiguration extends StObject {
    
    var fromSize: String | Double
    
    var prop: String
    
    var toSize: String | Double
  }
  object FluidRangeConfiguration {
    
    inline def apply(fromSize: String | Double, prop: String, toSize: String | Double): FluidRangeConfiguration = {
      val __obj = js.Dynamic.literal(fromSize = fromSize.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], toSize = toSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidRangeConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluidRangeConfiguration] (val x: Self) extends AnyVal {
      
      inline def setFromSize(value: String | Double): Self = StObject.set(x, "fromSize", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setToSize(value: String | Double): Self = StObject.set(x, "toSize", value.asInstanceOf[js.Any])
    }
  }
}
