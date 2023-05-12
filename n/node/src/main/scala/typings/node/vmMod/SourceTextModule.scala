package typings.node.vmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This feature is only available with the `--experimental-vm-modules` command
  * flag enabled.
  *
  *
  *
  * The `vm.SourceTextModule` class provides the [Source Text Module Record](https://tc39.es/ecma262/#sec-source-text-module-records) as
  * defined in the ECMAScript specification.
  * @since v9.6.0
  * @experimental
  */
@JSImport("vm", "SourceTextModule")
@js.native
open class SourceTextModule protected () extends Module {
  /**
    * Creates a new `SourceTextModule` instance.
    * @param code JavaScript Module code to parse
    */
  def this(code: String) = this()
  def this(code: String, options: SourceTextModuleOptions) = this()
}
