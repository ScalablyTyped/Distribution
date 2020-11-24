package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "update")
@js.native
object update extends js.Object {
  
  /**
    * Update older files in the archive and add files that are not already in the archiv
    * @param archive Archive to update
    * @param source Source files to update from the file-system to the archive
    * @param options Seven Zip Options
    */
  def apply(archive: String, files: String): ZipStream = js.native
  def apply(archive: String, files: String, options: SevenZipOptions): ZipStream = js.native
  def apply(archive: String, files: js.Array[String]): ZipStream = js.native
  def apply(archive: String, files: js.Array[String], options: SevenZipOptions): ZipStream = js.native
}
