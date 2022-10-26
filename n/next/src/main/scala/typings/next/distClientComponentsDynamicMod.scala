package typings.next

import typings.next.anon.Default
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsDynamicMod {
  
  @JSImport("next/dist/client/components/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](loader: Loader[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(loader.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  
  trait DynamicOptions[P] extends StObject {
    
    var loader: js.UndefOr[Loader[P]] = js.undefined
  }
  object DynamicOptions {
    
    inline def apply[P](): DynamicOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicOptions[P]]
    }
    
    extension [Self <: DynamicOptions[?], P](x: Self & DynamicOptions[P]) {
      
      inline def setLoader(value: () => js.Promise[Default[P]]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    }
  }
  
  type LoadableComponent[P] = ComponentType[P]
  
  type Loader[P] = js.Function0[js.Promise[Default[P]]]
  
  type LoaderComponent[P] = js.Promise[Default[P]]
}
