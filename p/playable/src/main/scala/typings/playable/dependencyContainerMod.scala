package typings.playable

import typings.playable.createContainerMod.Container
import typings.playable.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependencyContainerMod {
  
  object default {
    
    @JSImport("playable/dist/src/core/dependency-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/core/dependency-container", "default.Lifetime")
    @js.native
    def Lifetime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Lifetime */ js.Any = js.native
    @scala.inline
    def Lifetime_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Lifetime */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lifetime")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/core/dependency-container", "default.asClass")
    @js.native
    def asClass: js.Any = js.native
    @scala.inline
    def asClass_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asClass")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/core/dependency-container", "default.asFunction")
    @js.native
    def asFunction: js.Any = js.native
    @scala.inline
    def asFunction_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/core/dependency-container", "default.asValue")
    @js.native
    def asValue(value: js.Any): js.Any = js.native
    
    @JSImport("playable/dist/src/core/dependency-container", "default.createContainer")
    @js.native
    def createContainer(): Container = js.native
    @JSImport("playable/dist/src/core/dependency-container", "default.createContainer")
    @js.native
    def createContainer(options: js.UndefOr[scala.Nothing], __parentContainer: Container): Container = js.native
    @JSImport("playable/dist/src/core/dependency-container", "default.createContainer")
    @js.native
    def createContainer(options: IOptions): Container = js.native
    @JSImport("playable/dist/src/core/dependency-container", "default.createContainer")
    @js.native
    def createContainer(options: IOptions, __parentContainer: Container): Container = js.native
    @JSImport("playable/dist/src/core/dependency-container", "default.createContainer")
    @js.native
    def createContainer_Fdefault: js.Function2[
        /* options */ js.UndefOr[IOptions], 
        /* __parentContainer */ js.UndefOr[Container], 
        Container
      ] = js.native
    
    @scala.inline
    def createContainer_Fdefault_=(
      x: js.Function2[
          /* options */ js.UndefOr[IOptions], 
          /* __parentContainer */ js.UndefOr[Container], 
          Container
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createContainer")(x.asInstanceOf[js.Any])
  }
}
