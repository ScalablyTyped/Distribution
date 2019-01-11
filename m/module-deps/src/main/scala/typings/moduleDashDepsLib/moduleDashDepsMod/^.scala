package typings
package moduleDashDepsLib.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module-deps", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Return an object transform stream 'd' that expects entry filenames or '{ id: ..., file: ... }' objects
    * as input and produces objects for every dependency from a recursive module traversal as output.
    */
  def apply(): moduleDashDepsLib.moduleDashDepsMod.moduleDepsNs.ModuleDepsObject = js.native
  def apply(opts: moduleDashDepsLib.moduleDashDepsMod.moduleDepsNs.Options): moduleDashDepsLib.moduleDashDepsMod.moduleDepsNs.ModuleDepsObject = js.native
}

