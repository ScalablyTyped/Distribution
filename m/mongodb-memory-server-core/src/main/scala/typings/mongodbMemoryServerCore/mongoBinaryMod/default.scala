package typings.mongodbMemoryServerCore.mongoBinaryMod

import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
@js.native
class default () extends MongoBinary
/* static members */
@JSImport("mongodb-memory-server-core/lib/util/MongoBinary", JSImport.Default)
@js.native
object default extends js.Object {
  
  var cache: MongoBinaryCache = js.native
  
  /**
    * Check if specified version already exists in the cache
    * @param version The Version to check for
    */
  def getCachePath(version: String): String = js.native
  
  /**
    * Probe download path and download the binary
    * @param options Options Configuring which binary to download and to which path
    * @returns The BinaryPath the binary has been downloaded to
    */
  def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = js.native
  
  /**
    * Probe all supported paths for an binary and return the binary path
    * @param opts Options configuring which binary to search for
    * @throws {Error} if no valid BinaryPath has been found
    * @return The first found BinaryPath
    */
  def getPath(): js.Promise[String] = js.native
  def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
  
  /**
    * Probe if the provided "systemBinary" is an existing path
    * @param systemBinary The Path to probe for an System-Binary
    * @return System Binary path or empty string
    */
  def getSystemPath(systemBinary: String): js.Promise[String] = js.native
}
