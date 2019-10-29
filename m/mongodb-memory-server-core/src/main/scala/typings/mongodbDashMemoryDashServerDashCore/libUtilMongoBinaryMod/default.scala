package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod

import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.DebugFn
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
  @JSName("debug")
  var debug_Original: DebugFn = js.native
  def debug(args: js.Any*): js.Any = js.native
  def getCachePath(version: String): js.Promise[String] = js.native
  def getDownloadPath(options: js.Any): js.Promise[String] = js.native
  def getPath(): js.Promise[String] = js.native
  def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
  def getSystemPath(systemBinary: String): js.Promise[String] = js.native
  def hasValidBinPath(files: js.Array[String]): Boolean = js.native
}

