package typings.playable

import typings.playable.distSrcCoreDependencyContainerCreateContainerMod.Container
import typings.playable.distSrcCoreDependencyContainerTypesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreDependencyContainerMod {
  
  object default {
    
    @JSImport("playable/dist/src/core/dependency-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/core/dependency-container", "default.Lifetime")
    @js.native
    def Lifetime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Lifetime */ Any = js.native
    inline def Lifetime_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Lifetime */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lifetime")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/core/dependency-container", "default.asClass")
    @js.native
    def asClass: Any = js.native
    inline def asClass_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asClass")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/core/dependency-container", "default.asFunction")
    @js.native
    def asFunction: Any = js.native
    inline def asFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asFunction")(x.asInstanceOf[js.Any])
    
    inline def asValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asValue")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createContainer(): Container = ^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")().asInstanceOf[Container]
    inline def createContainer(options: Unit, __parentContainer: Container): Container = (^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(options.asInstanceOf[js.Any], __parentContainer.asInstanceOf[js.Any])).asInstanceOf[Container]
    inline def createContainer(options: IOptions): Container = ^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(options.asInstanceOf[js.Any]).asInstanceOf[Container]
    inline def createContainer(options: IOptions, __parentContainer: Container): Container = (^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(options.asInstanceOf[js.Any], __parentContainer.asInstanceOf[js.Any])).asInstanceOf[Container]
    @JSImport("playable/dist/src/core/dependency-container", "default.createContainer")
    @js.native
    def createContainer_Fdefault: js.Function2[
        /* options */ js.UndefOr[IOptions], 
        /* __parentContainer */ js.UndefOr[Container], 
        Container
      ] = js.native
    
    inline def createContainer_Fdefault_=(
      x: js.Function2[
          /* options */ js.UndefOr[IOptions], 
          /* __parentContainer */ js.UndefOr[Container], 
          Container
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createContainer")(x.asInstanceOf[js.Any])
  }
}
