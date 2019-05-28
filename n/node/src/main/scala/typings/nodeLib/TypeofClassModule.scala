package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassModule
  extends org.scalablytyped.runtime.Instantiable1[/* id */ java.lang.String, nodeLib.NodeJSNs.Module]
     with org.scalablytyped.runtime.Instantiable2[
      /* id */ java.lang.String, 
      /* parent */ nodeLib.NodeJSNs.Module, 
      nodeLib.NodeJSNs.Module
    ] {
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequireFromPath(path: java.lang.String): js.Function1[/* path */ java.lang.String, _] = js.native
  def runMain(): scala.Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

