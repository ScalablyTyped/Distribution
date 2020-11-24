package typings.multerGridfsStorage.mod

import typings.expressServeStaticCore.mod.global.Express.Request
import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import typings.multer.mod.StorageEngine
import typings.multerGridfsStorage.mod.global.Express.Multer.File
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulterGridfsStorage
  extends EventEmitter
     with StorageEngine {
  
  def _handleFile(
    req: Request,
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit = js.native
  
  def _removeFile(req: Request, file: File, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  var cacheIndex: js.Object = js.native
  
  var cacheName: String = js.native
  
  var caching: Boolean = js.native
  
  var client: MongoClient = js.native
  
  var configuration: UrlStorageOptions | DbStorageOptions = js.native
  
  var connected: Boolean = js.native
  
  var connecting: Boolean = js.native
  
  var db: Db = js.native
  
  var error: Error = js.native
  
  def ready(): js.Promise[ConnectionResult] = js.native
}
