package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "list")
@js.native
object list extends js.Object {
  
  /**
    * Lists contents of archive
    * @param archive Archive to list the contents from
    * @param options Seven Zip Options
    */
  def apply(archive: String): ZipStream = js.native
  def apply(archive: String, options: SevenZipOptions): ZipStream = js.native
}
