package typings.nyaapi.nyaapiMod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nyaapi", "si.searchPage")
@js.native
object searchPage extends js.Object {
  def apply(term: String, p: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, p: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, p: Double, opts: SearchOptions, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double, opts: SearchOptions, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = js.native
}

