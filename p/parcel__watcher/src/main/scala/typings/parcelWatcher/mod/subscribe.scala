package typings.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@parcel/watcher", "subscribe")
@js.native
object subscribe extends js.Object {
  
  def apply(dirPath: String, callback: ParcelWatcherCallback): js.Promise[ParcelWatcherSubscription] = js.native
  def apply(dirPath: String, callback: ParcelWatcherCallback, options: ParcelWatcherOptions): js.Promise[ParcelWatcherSubscription] = js.native
}
