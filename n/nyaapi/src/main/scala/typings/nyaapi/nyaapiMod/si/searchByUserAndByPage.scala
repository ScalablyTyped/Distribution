package typings.nyaapi.nyaapiMod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nyaapi", "si.searchByUserAndByPage")
@js.native
object searchByUserAndByPage extends js.Object {
  def apply(user: String, term: String, p: Double, n: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: String, term: String, p: Double, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: SearchOptionsTerm, term: String, p: Double, n: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: SearchOptionsTerm, term: String, p: Double, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
}

