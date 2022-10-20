package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.FactoryProvider
import typings.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphTransformDotdiMod {
  
  @JSImport("ng-packagr/lib/graph/transform.di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def provideTransform(module: TransformProvider): TransformProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideTransform")(module.asInstanceOf[js.Any]).asInstanceOf[TransformProvider]
  
  trait TransformProvider
    extends StObject
       with FactoryProvider {
    
    /**
      * An injection token for the `Transform` provided by this provider.
      */
    @JSName("provide")
    var provide_TransformProvider: InjectionToken[Transform]
    
    /**
      * A function to invoke to create the `Transform`.
      *
      * The factory function is invoked with resolved values of tokens in the `deps` field.
      */
    @JSName("useFactory")
    def useFactory_MTransformProvider(args: Any*): Transform
  }
  object TransformProvider {
    
    inline def apply(provide: InjectionToken[Transform], useFactory: /* repeated */ Any => Transform): TransformProvider = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = js.Any.fromFunction1(useFactory))
      __obj.asInstanceOf[TransformProvider]
    }
    
    extension [Self <: TransformProvider](x: Self) {
      
      inline def setProvide(value: InjectionToken[Transform]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setUseFactory(value: /* repeated */ Any => Transform): Self = StObject.set(x, "useFactory", js.Any.fromFunction1(value))
    }
  }
}
