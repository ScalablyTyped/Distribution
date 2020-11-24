package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.Iterable
import typings.minappEnv.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends typings.minappEnv.Map[K, V] {
  def this(entries: typings.minappEnv.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}
@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]
