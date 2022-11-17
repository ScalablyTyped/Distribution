package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlink {
  
  inline def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(target: PathLike, path: PathLike, `type`: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs", "symlink")
  @js.native
  val ^ : js.Any = js.native
  
  object Type {
    
    inline def dir: "dir" = "dir".asInstanceOf["dir"]
    
    inline def file: "file" = "file".asInstanceOf["file"]
    
    inline def junction: "junction" = "junction".asInstanceOf["junction"]
  }
  type Type = "dir" | "file" | "junction"
}
