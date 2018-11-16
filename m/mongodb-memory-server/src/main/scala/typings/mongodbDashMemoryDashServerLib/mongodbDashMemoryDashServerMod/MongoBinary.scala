package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// disable error for a class with all static functions,
// so the TypeScript declaration would map the implementation with flow types for easier support.
// tslint:disable-next-line:no-unnecessary-class
@JSImport("mongodb-memory-server", "MongoBinary")
@js.native
class MongoBinary ()
  extends mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinary

// disable error for a class with all static functions,
// so the TypeScript declaration would map the implementation with flow types for easier support.
// tslint:disable-next-line:no-unnecessary-class
@JSImport("mongodb-memory-server", "MongoBinary")
@js.native
object MongoBinary extends js.Object {
  var cache: mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryCache = js.native
  def getPath(): stdLib.Promise[java.lang.String] = js.native
  def getPath(
    opts: mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs.MongoBinaryOpts
  ): stdLib.Promise[java.lang.String] = js.native
  def hasValidBinPath(files: js.Array[java.lang.String]): scala.Boolean = js.native
}

