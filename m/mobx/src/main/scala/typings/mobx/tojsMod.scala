package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tojsMod {
  
  @JSImport("mobx/lib/api/tojs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJS(source: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def toJS(source: js.Any, options: ToJSOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def toJS[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def toJS[T](source: T, options: ToJSOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait ToJSOptions extends StObject {
    
    var detectCycles: js.UndefOr[Boolean] = js.undefined
    
    var exportMapsAsObjects: js.UndefOr[Boolean] = js.undefined
    
    var recurseEverything: js.UndefOr[Boolean] = js.undefined
  }
  object ToJSOptions {
    
    inline def apply(): ToJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToJSOptions]
    }
    
    extension [Self <: ToJSOptions](x: Self) {
      
      inline def setDetectCycles(value: Boolean): Self = StObject.set(x, "detectCycles", value.asInstanceOf[js.Any])
      
      inline def setDetectCyclesUndefined: Self = StObject.set(x, "detectCycles", js.undefined)
      
      inline def setExportMapsAsObjects(value: Boolean): Self = StObject.set(x, "exportMapsAsObjects", value.asInstanceOf[js.Any])
      
      inline def setExportMapsAsObjectsUndefined: Self = StObject.set(x, "exportMapsAsObjects", js.undefined)
      
      inline def setRecurseEverything(value: Boolean): Self = StObject.set(x, "recurseEverything", value.asInstanceOf[js.Any])
      
      inline def setRecurseEverythingUndefined: Self = StObject.set(x, "recurseEverything", js.undefined)
    }
  }
}
