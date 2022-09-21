package typings.nyaapi.mod.si

import typings.nyaapi.mod.si.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def search(term: String): js.Promise[js.Array[Torrent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: String, n: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: String, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: String, n: Unit, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: SearchOptionsTerm): js.Promise[js.Array[Torrent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: SearchOptionsTerm, n: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: SearchOptionsTerm, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def search(term: SearchOptionsTerm, n: Unit, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]

inline def searchAll(term: String): js.Promise[js.Array[Torrent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchAll(term: String, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchAll(term: SearchOptionsTerm): js.Promise[js.Array[Torrent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchAll(term: SearchOptionsTerm, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchAll")(term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]

inline def searchAllByUser(user: String, term: String): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchAllByUser(user: String, term: String, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchAllByUser(user: SearchOptionsTerm, term: String): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchAllByUser(user: SearchOptionsTerm, term: String, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchAllByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]

inline def searchByUser(user: String, term: String, n: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchByUser(user: String, term: String, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchByUser(user: SearchOptionsTerm, term: String, n: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchByUser(user: SearchOptionsTerm, term: String, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUser")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]

inline def searchByUserAndByPage(user: String, term: String, p: Double, n: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchByUserAndByPage(user: String, term: String, p: Double, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchByUserAndByPage(user: SearchOptionsTerm, term: String, p: Double, n: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchByUserAndByPage(user: SearchOptionsTerm, term: String, p: Double, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchByUserAndByPage")(user.asInstanceOf[js.Any], term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]

inline def searchPage(term: String, p: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: String, p: Double, opts: Unit, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: String, p: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: String, p: Double, opts: SearchOptions, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: SearchOptionsTerm, p: Double): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: SearchOptionsTerm, p: Double, opts: Unit, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: SearchOptionsTerm, p: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]
inline def searchPage(term: SearchOptionsTerm, p: Double, opts: SearchOptions, includeMaxPage: Boolean): js.Promise[js.Array[Torrent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPage")(term.asInstanceOf[js.Any], p.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], includeMaxPage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Torrent]]]

inline def upload(opts: UploadOptions): js.Promise[Torrent] = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Torrent]]

type UserStatus = Double
