package typings.memfs.libVolumeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type NestedDirectoryJSON = {[key: string] : memfs.memfs/lib/volume.DirectoryContent | memfs.memfs/lib/volume.NestedDirectoryJSON}
}}}
to avoid circular code involving: 
- memfs.memfs/lib/volume.NestedDirectoryJSON
*/
trait NestedDirectoryJSON
  extends StObject
     with /* key */ StringDictionary[DirectoryContent | NestedDirectoryJSON]
object NestedDirectoryJSON {
  
  inline def apply(): NestedDirectoryJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedDirectoryJSON]
  }
}
