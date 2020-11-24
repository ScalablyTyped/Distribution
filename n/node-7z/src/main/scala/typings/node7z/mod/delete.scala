package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "delete")
@js.native
object delete extends js.Object {
  
  /**
    * Delete files from an archive
    * @param archive Archive to target
    * @param output Target files to remove from the archive
    * @param options Seven Zip Options
    */
  def apply(archive: String, target: String): ZipStream = js.native
  def apply(archive: String, target: String, options: SevenZipOptions): ZipStream = js.native
  def apply(archive: String, target: js.Array[String]): ZipStream = js.native
  def apply(archive: String, target: js.Array[String], options: SevenZipOptions): ZipStream = js.native
}
