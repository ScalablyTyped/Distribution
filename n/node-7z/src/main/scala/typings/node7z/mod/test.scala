package typings.node7z.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-7z", "test")
@js.native
object test extends js.Object {
  
  /**
    * Tests archive files
    * @param archive Archive to test
    * @param options Seven Zip Options
    */
  def apply(archive: String, options: SevenZipOptions): ZipStream = js.native
}
