package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatWatcher extends StObject {
  
  /**
    * When called, requests that the Node.js event loop _not_ exit so long as the `fs.StatWatcher` is active. Calling `watcher.ref()` multiple times will have
    * no effect.
    *
    * By default, all `fs.StatWatcher` objects are "ref'ed", making it normally
    * unnecessary to call `watcher.ref()` unless `watcher.unref()` had been
    * called previously.
    * @since v14.3.0, v12.20.0
    */
  def ref(): this.type = js.native
  
  /**
    * When called, the active `fs.StatWatcher` object will not require the Node.js
    * event loop to remain active. If there is no other activity keeping the
    * event loop running, the process may exit before the `fs.StatWatcher` object's
    * callback is invoked. Calling `watcher.unref()` multiple times will have
    * no effect.
    * @since v14.3.0, v12.20.0
    */
  def unref(): this.type = js.native
}
