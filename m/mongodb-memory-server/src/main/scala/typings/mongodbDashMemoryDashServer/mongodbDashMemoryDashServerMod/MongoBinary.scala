package typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod

import typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryCache
import typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// disable error for a class with all static functions,
// so the TypeScript declaration would map the implementation with flow types for easier support.
// tslint:disable-next-line:no-unnecessary-class
@JSImport("mongodb-memory-server", "MongoBinary")
@js.native
class MongoBinary ()
  extends typings.mongodbDashMemoryDashServer.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinary

/* static members */
@JSImport("mongodb-memory-server", "MongoBinary")
@js.native
object MongoBinary extends js.Object {
  var cache: MongoBinaryCache = js.native
  def getPath(): js.Promise[String] = js.native
  def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
  def hasValidBinPath(files: js.Array[String]): Boolean = js.native
}

