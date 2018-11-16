package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILazyLoad extends js.Object {
  /**
       * Gets the specified module config object.
       * @param name The name of the module config object to get
       */
  def getModuleConfig(name: java.lang.String): IModuleConfig = js.native
  /**
       * Gets the list of loaded module names.
       */
  def getModules(): js.Array[java.lang.String] = js.native
  /**
       * Injects a module with the associated name into Angular. Useful for manual injection when loading through RequireJS, SystemJS, etc. Useful in
       * conjunction with the toggleWatch() method.
       */
  def inject(moduleName: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Injects a module with the associated name into Angular. Useful for manual injection when loading through RequireJS, SystemJS, etc. Useful in
       * conjunction with the toggleWatch() method.
       */
  def inject(moduleName: js.Array[java.lang.String]): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Checks if a module name, or list of modules names, has been previously loaded into Angular.
       */
  def isLoaded(moduleName: java.lang.String): scala.Boolean = js.native
  /**
       * Checks if a module name, or list of modules names, has been previously loaded into Angular.
       */
  def isLoaded(moduleName: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: java.lang.String, config: IOptionsConfig): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: js.Array[java.lang.String | ITypedModuleConfig | IModuleConfig]): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: js.Array[java.lang.String | ITypedModuleConfig | IModuleConfig], config: IOptionsConfig): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: IModuleConfig): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: IModuleConfig, config: IOptionsConfig): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: ITypedModuleConfig): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Loads a module or a list of modules into Angular.
       *
       * @param module The name of a predefined module config object, or a module config object, or an array of either
       * @param config Options to be used when loading the modules
       */
  def load(module: ITypedModuleConfig, config: IOptionsConfig): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
       * Defines a module config object.
       * @param config The module config object
       * @returns The module config object that was passed in
       */
  def setModuleConfig(config: IModuleConfig): IModuleConfig = js.native
  /**
       * Enables or disables watching Angular for new modules. Useful in conjunction with the inject() method. Make sure to not keep the watch enabled
       * indefinitely, or unexpected results may occur.
       */
  def toggleWatch(watch: scala.Boolean): scala.Unit = js.native
}

