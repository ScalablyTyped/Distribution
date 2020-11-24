package typings.playable

import typings.playable.createContainerMod.Container
import typings.playable.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/core/dependency-container", JSImport.Namespace)
@js.native
object dependencyContainerMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var Lifetime: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Lifetime */ js.Any = js.native
    
    var asClass: js.Any = js.native
    
    var asFunction: js.Any = js.native
    
    def asValue(value: js.Any): js.Any = js.native
    
    def createContainer(): Container = js.native
    def createContainer(options: js.UndefOr[scala.Nothing], __parentContainer: Container): Container = js.native
    def createContainer(options: IOptions): Container = js.native
    def createContainer(options: IOptions, __parentContainer: Container): Container = js.native
    @JSName("createContainer")
    var createContainer_Original: js.Function2[
        /* options */ js.UndefOr[IOptions], 
        /* __parentContainer */ js.UndefOr[Container], 
        Container
      ] = js.native
  }
}
