package typings.node

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.NodeJS.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BuiltinModules
  extends Instantiable1[/* id */ java.lang.String, Module]
     with Instantiable2[/* id */ java.lang.String, /* parent */ Module, Module] {
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequireFromPath(path: java.lang.String): js.Function1[/* path */ java.lang.String, _] = js.native
  def runMain(): Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

