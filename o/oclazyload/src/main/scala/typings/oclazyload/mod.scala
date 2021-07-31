package typings.oclazyload

import org.scalablytyped.runtime.Shortcut
import typings.oclazyload.oc.IModuleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("oclazyload", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  object angularAugmentingMod {
    
    @js.native
    trait IAngularStatic extends StObject {
      
      /**
        * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
        *
        * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
        *
        * @param name The name of the module to create or retrieve.
        * @param requires The names of modules this module depends on, and/or ocLazyLoad module configurations. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
        * @param configFn Optional configuration function for the module.
        */
      def module(name: String): js.Any = js.native
      def module(name: String, requires: js.Array[String | IModuleConfig]): js.Any = js.native
      def module(name: String, requires: js.Array[String | IModuleConfig], configFn: js.Function): js.Any = js.native
      def module(name: String, requires: Unit, configFn: js.Function): js.Any = js.native
    }
  }
}
