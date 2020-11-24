package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "hash")
@js.native
object hash extends js.Object {
  
  /**
    * Calculate hash values for files
    * @param target Target files to calculate the hash of
    * @param options Seven Zip Options
    */
  def apply(target: String): ZipStream = js.native
  def apply(target: String, options: SevenZipOptions): ZipStream = js.native
  def apply(target: js.Array[String]): ZipStream = js.native
  def apply(target: js.Array[String], options: SevenZipOptions): ZipStream = js.native
}
