package typings.pathwatcher.pathwatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathwatcher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def closeAllWatchers(): Unit = js.native
  def getWatchedPaths(): js.Array[String] = js.native
  def watch(): PathWatcher = js.native
}

