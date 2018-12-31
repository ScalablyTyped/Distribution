package typings
package oclazyloadLib.oclazyloadMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAngularStatic extends js.Object {
  /**
    * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
    *
    * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
    *
    * @param name The name of the module to create or retrieve.
    * @param requires The names of modules this module depends on, and/or ocLazyLoad module configurations. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
    * @param configFn Optional configuration function for the module.
    */
  def module(name: java.lang.String): angularLib.angularMod.angularNs.IModule = js.native
  def module(
    name: java.lang.String,
    requires: js.Array[java.lang.String | oclazyloadLib.oclazyloadMod.IModuleConfig]
  ): angularLib.angularMod.angularNs.IModule = js.native
  def module(
    name: java.lang.String,
    requires: js.Array[java.lang.String | oclazyloadLib.oclazyloadMod.IModuleConfig],
    configFn: angularLib.angularMod.Global.Function
  ): angularLib.angularMod.angularNs.IModule = js.native
}

