package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlink {
  
  @scala.inline
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(target: PathLike, path: PathLike, `type`: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs", "symlink")
  @js.native
  val ^ : js.Any = js.native
  
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
