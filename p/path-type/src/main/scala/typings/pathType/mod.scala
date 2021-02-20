package typings.pathType

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-type", "isDirectory")
  @js.native
  val isDirectory: PathTypeFunction = js.native
  
  @JSImport("path-type", "isDirectorySync")
  @js.native
  val isDirectorySync: PathTypeSyncFunction = js.native
  
  @JSImport("path-type", "isFile")
  @js.native
  val isFile: PathTypeFunction = js.native
  
  @JSImport("path-type", "isFileSync")
  @js.native
  val isFileSync: PathTypeSyncFunction = js.native
  
  @JSImport("path-type", "isSymlink")
  @js.native
  val isSymlink: PathTypeFunction = js.native
  
  @JSImport("path-type", "isSymlinkSync")
  @js.native
  val isSymlinkSync: PathTypeSyncFunction = js.native
  
  type PathTypeFunction = js.Function1[/* path */ String, js.Promise[Boolean]]
  
  type PathTypeSyncFunction = js.Function1[/* path */ String, Boolean]
}
