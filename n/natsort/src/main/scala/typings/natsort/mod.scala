package typings.natsort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("natsort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function2[/* a */ String | Double, /* b */ String | Double, Double]]
  inline def default(options: OptionsType): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ String | Double, /* b */ String | Double, Double]]
  
  trait OptionsType extends StObject {
    
    var desc: js.UndefOr[Boolean] = js.undefined
    
    var insensitive: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsType {
    
    inline def apply(): OptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsType] (val x: Self) extends AnyVal {
      
      inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setInsensitive(value: Boolean): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
    }
  }
}
