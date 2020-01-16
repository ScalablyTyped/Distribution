package typings.nyaapi.nyaapiMod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nyaapi", "pantsu.searchAll")
@js.native
object searchAll extends js.Object {
  def apply(term: String): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
}

