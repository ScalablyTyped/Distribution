package typings.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nyaapi", "si.searchPage")
@js.native
object searchPage extends js.Object {
  
  def apply(term: String, p: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, p: Double, opts: js.UndefOr[scala.Nothing], includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, p: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, p: Double, opts: SearchOptions, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double, opts: js.UndefOr[scala.Nothing], includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, p: Double, opts: SearchOptions, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = js.native
}
