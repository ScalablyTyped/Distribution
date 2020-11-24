package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "rename")
@js.native
object rename extends js.Object {
  
  /**
    * Rename files in an archive
    * @param archive Archive to target
    * @param target Pairs of target names and new names to rename to
    * @param options Seven Zip Options
    */
  def apply(archive: String, target: js.Array[js.Array[String]]): ZipStream = js.native
  def apply(archive: String, target: js.Array[js.Array[String]], options: SevenZipOptions): ZipStream = js.native
}
