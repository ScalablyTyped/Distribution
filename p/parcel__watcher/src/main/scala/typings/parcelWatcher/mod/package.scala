package typings.parcelWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ParcelWatcherCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* events */ js.UndefOr[js.Array[typings.parcelWatcher.mod.ParcelWatcherEvent]], 
    js.Any
  ]
}
