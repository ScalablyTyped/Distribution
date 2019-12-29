package typings.node

import typings.node.NodeJS.Require
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", JSImport.Namespace)
@js.native
object moduleMod extends js.Object {
  @js.native
  class Module protected ()
    extends typings.node.NodeJS.Module {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
  }
  
  /* static members */
  @js.native
  object Module extends js.Object {
    var Module: TypeofClassModule = js.native
    var builtinModules: js.Array[java.lang.String] = js.native
    def createRequire(path: java.lang.String): Require = js.native
    def createRequire(path: URL): Require = js.native
    /**
      * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
      */
    def createRequireFromPath(path: java.lang.String): Require = js.native
    def runMain(): Unit = js.native
    def wrap(code: java.lang.String): java.lang.String = js.native
  }
  
}

