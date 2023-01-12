package typings.omitEmpty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("omit-empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default(obj: js.Object, options: OmitOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait OmitOptions extends StObject {
    
    var omitZero: js.UndefOr[Boolean] = js.undefined
  }
  object OmitOptions {
    
    inline def apply(): OmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitOptions] (val x: Self) extends AnyVal {
      
      inline def setOmitZero(value: Boolean): Self = StObject.set(x, "omitZero", value.asInstanceOf[js.Any])
      
      inline def setOmitZeroUndefined: Self = StObject.set(x, "omitZero", js.undefined)
    }
  }
}
