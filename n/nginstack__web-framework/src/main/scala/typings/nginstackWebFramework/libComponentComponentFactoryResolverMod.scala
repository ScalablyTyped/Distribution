package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentComponentFactoryResolverMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/component/ComponentFactoryResolver", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ComponentFactoryResolver {
    
    /* private */ /* CompleteClass */
    var factories_ : Any = js.native
    
    /* CompleteClass */
    override def registerFactory(
      componentName: String,
      factory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentFactory */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def resolve(componentName: String): Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/component/ComponentFactoryResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): ComponentFactoryResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ComponentFactoryResolver]
  
  trait ComponentFactoryResolver extends StObject {
    
    /* private */ var factories_ : Any
    
    def registerFactory(
      componentName: String,
      factory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentFactory */ Any
    ): Unit
    
    def resolve(componentName: String): Any
  }
  object ComponentFactoryResolver {
    
    inline def apply(
      factories_ : Any,
      registerFactory: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentFactory */ Any) => Unit,
      resolve: String => Any
    ): ComponentFactoryResolver = {
      val __obj = js.Dynamic.literal(factories_ = factories_.asInstanceOf[js.Any], registerFactory = js.Any.fromFunction2(registerFactory), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[ComponentFactoryResolver]
    }
    
    extension [Self <: ComponentFactoryResolver](x: Self) {
      
      inline def setFactories_(value: Any): Self = StObject.set(x, "factories_", value.asInstanceOf[js.Any])
      
      inline def setRegisterFactory(
        value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentFactory */ Any) => Unit
      ): Self = StObject.set(x, "registerFactory", js.Any.fromFunction2(value))
      
      inline def setResolve(value: String => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
