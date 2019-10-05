package typings.pathDashType

import typings.pathDashType.pathDashTypeMod.PathTypeFunction
import typings.pathDashType.pathDashTypeMod.PathTypeSyncFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-type", JSImport.Namespace)
@js.native
object pathDashTypeMod extends js.Object {
  val isDirectory: PathTypeFunction = js.native
  val isDirectorySync: PathTypeSyncFunction = js.native
  val isFile: PathTypeFunction = js.native
  val isFileSync: PathTypeSyncFunction = js.native
  val isSymlink: PathTypeFunction = js.native
  val isSymlinkSync: PathTypeSyncFunction = js.native
  type PathTypeFunction = js.Function1[/* path */ String, js.Promise[Boolean]]
  type PathTypeSyncFunction = js.Function1[/* path */ String, Boolean]
}

