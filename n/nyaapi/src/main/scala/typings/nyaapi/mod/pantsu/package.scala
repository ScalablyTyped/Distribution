package typings.nyaapi.mod.pantsu

import typings.nyaapi.mod.pantsu.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def checkHeader(id: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkHeader")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

inline def checkUser(id: Double): js.Promise[js.Array[User]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[User]]]

inline def infoRequest(id: Double): js.Promise[Torrent] = ^.asInstanceOf[js.Dynamic].applyDynamic("infoRequest")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Torrent]]

inline def login(opts: Credentials): js.Promise[Response[LoginResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response[LoginResult]]]

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

inline def update(opts: UpdateOptions): js.Promise[Response[Torrent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response[Torrent]]]

inline def upload(opts: UploadOptions): js.Promise[Response[Torrent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("upload")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response[Torrent]]]

type UserStatus = Double
