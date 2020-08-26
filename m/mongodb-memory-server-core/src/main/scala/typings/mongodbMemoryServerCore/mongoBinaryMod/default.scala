package typings.mongodbMemoryServerCore.mongoBinaryMod

import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
@js.native
class default () extends MongoBinary

/* static members */
@JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
@js.native
object default extends js.Object {
  var cache: MongoBinaryCache = js.native
  def getCachePath(version: String): js.Promise[String] = js.native
  def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = js.native
  def getPath(): js.Promise[String] = js.native
  def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
  def getSystemPath(systemBinary: String): js.Promise[String] = js.native
  def hasValidBinPath(files: js.Array[String]): Boolean = js.native
}

