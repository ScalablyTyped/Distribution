package typings.moduleDeps.mod

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
  def apply(): ModuleDepsObject = js.native
  def apply(opts: Options): ModuleDepsObject = js.native
}

