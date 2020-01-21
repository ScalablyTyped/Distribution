package typings.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "MemoryContentCache")
@js.native
class MemoryContentCache protected ()
  extends typings.ndnJs.memoryContentCacheMod.MemoryContentCache {
  def this(face: typings.ndnJs.faceMod.Face) = this()
  def this(face: typings.ndnJs.faceMod.Face, cleanupIntervalMilliseconds: Double) = this()
}

