package typings.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@parcel/watcher", "writeSnapshot")
@js.native
object writeSnapshot extends js.Object {
  
  def apply(dirPath: String, snapshotPath: String): js.Promise[Unit] = js.native
  def apply(dirPath: String, snapshotPath: String, options: ParcelWatcherOptions): js.Promise[Unit] = js.native
}
