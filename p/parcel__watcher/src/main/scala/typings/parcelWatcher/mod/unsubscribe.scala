package typings.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@parcel/watcher", "unsubscribe")
@js.native
object unsubscribe extends js.Object {
  
  def apply(dirPath: String, callback: ParcelWatcherCallback): js.Promise[Unit] = js.native
  def apply(dirPath: String, callback: ParcelWatcherCallback, options: ParcelWatcherOptions): js.Promise[Unit] = js.native
}
