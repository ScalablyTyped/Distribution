package typings.nyaapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pantsu {
  
  type UserStatus = scala.Double
  
  @scala.inline
  def checkHeader(id: scala.Double): js.Promise[java.lang.String] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("checkHeader")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def checkUser(id: scala.Double): js.Promise[js.Array[typings.nyaapi.mod.pantsu.User]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("checkUser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.User]]]
  
  @scala.inline
  def infoRequest(id: scala.Double): js.Promise[typings.nyaapi.mod.pantsu.Torrent] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("infoRequest")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nyaapi.mod.pantsu.Torrent]]
  
  @scala.inline
  def login(opts: typings.nyaapi.mod.pantsu.LoginData): js.Promise[typings.nyaapi.mod.pantsu.Response[typings.nyaapi.mod.pantsu.LoginResult]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("login")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nyaapi.mod.pantsu.Response[typings.nyaapi.mod.pantsu.LoginResult]]]
  
  @scala.inline
  def search(term: java.lang.String): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(
    term: java.lang.String,
    n: js.UndefOr[scala.Nothing],
    opts: typings.nyaapi.mod.pantsu.SearchOptions
  ): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(term: java.lang.String, n: scala.Double): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(term: java.lang.String, n: scala.Double, opts: typings.nyaapi.mod.pantsu.SearchOptions): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(term: typings.nyaapi.mod.pantsu.SearchOptionsTerm): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(
    term: typings.nyaapi.mod.pantsu.SearchOptionsTerm,
    n: js.UndefOr[scala.Nothing],
    opts: typings.nyaapi.mod.pantsu.SearchOptions
  ): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(term: typings.nyaapi.mod.pantsu.SearchOptionsTerm, n: scala.Double): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def search(
    term: typings.nyaapi.mod.pantsu.SearchOptionsTerm,
    n: scala.Double,
    opts: typings.nyaapi.mod.pantsu.SearchOptions
  ): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  
  @scala.inline
  def searchAll(term: java.lang.String): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def searchAll(term: java.lang.String, opts: typings.nyaapi.mod.pantsu.SearchOptions): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def searchAll(term: typings.nyaapi.mod.pantsu.SearchOptionsTerm): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  @scala.inline
  def searchAll(term: typings.nyaapi.mod.pantsu.SearchOptionsTerm, opts: typings.nyaapi.mod.pantsu.SearchOptions): js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]] = (typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.nyaapi.mod.pantsu.Torrent]]]
  
  @scala.inline
  def update(opts: typings.nyaapi.mod.pantsu.UpdateData): js.Promise[typings.nyaapi.mod.pantsu.Response[typings.nyaapi.mod.pantsu.Torrent]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("update")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nyaapi.mod.pantsu.Response[typings.nyaapi.mod.pantsu.Torrent]]]
  
  @scala.inline
  def upload(opts: typings.nyaapi.mod.pantsu.UploadData): js.Promise[typings.nyaapi.mod.pantsu.Response[typings.nyaapi.mod.pantsu.Torrent]] = typings.nyaapi.mod.pantsu.^.asInstanceOf[js.Dynamic].applyDynamic("upload")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nyaapi.mod.pantsu.Response[typings.nyaapi.mod.pantsu.Torrent]]]
}
