package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "listen")
@js.native
object listen extends js.Object {
  
  /**
    * Registers the child process given by the $childProcess option.
    * Must be deferred with the $defer option during creation.
    * @param stream ZipStream to register listeners on
    */
  def apply(stream: ZipStream): ZipStream = js.native
}
