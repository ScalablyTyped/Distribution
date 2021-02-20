package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlink {
  
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.dir
    - typings.node.nodeStrings.file
    - typings.node.nodeStrings.junction
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def dir: typings.node.nodeStrings.dir = "dir".asInstanceOf[typings.node.nodeStrings.dir]
    
    @scala.inline
    def file: typings.node.nodeStrings.file = "file".asInstanceOf[typings.node.nodeStrings.file]
    
    @scala.inline
    def junction: typings.node.nodeStrings.junction = "junction".asInstanceOf[typings.node.nodeStrings.junction]
  }
}
