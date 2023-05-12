package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosMinimumOperatingSystem extends StObject {
  
  /**
    * When TRUE, only Version 10.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v10_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 11.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v11_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 12.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v12_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 13.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v13_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 14.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v14_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 15.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v15_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 8.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v8_0: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, only Version 9.0 or later is supported. Default value is FALSE. Exactly one of the minimum operating system
    * boolean values will be TRUE.
    */
  var v9_0: js.UndefOr[Boolean] = js.undefined
}
object IosMinimumOperatingSystem {
  
  inline def apply(): IosMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMinimumOperatingSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosMinimumOperatingSystem] (val x: Self) extends AnyVal {
    
    inline def setV10_0(value: Boolean): Self = StObject.set(x, "v10_0", value.asInstanceOf[js.Any])
    
    inline def setV10_0Undefined: Self = StObject.set(x, "v10_0", js.undefined)
    
    inline def setV11_0(value: Boolean): Self = StObject.set(x, "v11_0", value.asInstanceOf[js.Any])
    
    inline def setV11_0Undefined: Self = StObject.set(x, "v11_0", js.undefined)
    
    inline def setV12_0(value: Boolean): Self = StObject.set(x, "v12_0", value.asInstanceOf[js.Any])
    
    inline def setV12_0Undefined: Self = StObject.set(x, "v12_0", js.undefined)
    
    inline def setV13_0(value: Boolean): Self = StObject.set(x, "v13_0", value.asInstanceOf[js.Any])
    
    inline def setV13_0Undefined: Self = StObject.set(x, "v13_0", js.undefined)
    
    inline def setV14_0(value: Boolean): Self = StObject.set(x, "v14_0", value.asInstanceOf[js.Any])
    
    inline def setV14_0Undefined: Self = StObject.set(x, "v14_0", js.undefined)
    
    inline def setV15_0(value: Boolean): Self = StObject.set(x, "v15_0", value.asInstanceOf[js.Any])
    
    inline def setV15_0Undefined: Self = StObject.set(x, "v15_0", js.undefined)
    
    inline def setV8_0(value: Boolean): Self = StObject.set(x, "v8_0", value.asInstanceOf[js.Any])
    
    inline def setV8_0Undefined: Self = StObject.set(x, "v8_0", js.undefined)
    
    inline def setV9_0(value: Boolean): Self = StObject.set(x, "v9_0", value.asInstanceOf[js.Any])
    
    inline def setV9_0Undefined: Self = StObject.set(x, "v9_0", js.undefined)
  }
}
