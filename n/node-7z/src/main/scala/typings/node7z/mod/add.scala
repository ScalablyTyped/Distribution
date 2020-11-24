package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "add")
@js.native
object add extends js.Object {
  
  /**
    * Add files to an archive
    * @param archive Archive to create
    * @param source Source files to add to the archive
    * @param options Seven Zip Options
    */
  def apply(archive: String, source: String): ZipStream = js.native
  def apply(archive: String, source: String, options: SevenZipOptions): ZipStream = js.native
  def apply(archive: String, source: js.Array[String]): ZipStream = js.native
  def apply(archive: String, source: js.Array[String], options: SevenZipOptions): ZipStream = js.native
}
