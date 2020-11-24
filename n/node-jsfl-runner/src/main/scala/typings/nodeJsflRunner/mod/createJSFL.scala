package typings.nodeJsflRunner.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-jsfl-runner", "createJSFL")
@js.native
object createJSFL extends js.Object {
  
  def apply(
    jsfl: JSFL,
    fileName: String,
    initParams: js.Array[_],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}
