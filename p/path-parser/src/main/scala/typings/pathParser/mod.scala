package typings.pathParser

import typings.pathParser.pathMod.PathOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-parser", "Path")
  @js.native
  class Path[T /* <: Record[String, js.Any] */] protected ()
    extends typings.pathParser.pathMod.Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object Path {
    
    @JSImport("path-parser", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createPath[T /* <: Record[String, js.Any] */](path: String): typings.pathParser.pathMod.Path[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.pathParser.pathMod.Path[T]]
    inline def createPath[T /* <: Record[String, js.Any] */](path: String, options: PathOptions): typings.pathParser.pathMod.Path[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pathParser.pathMod.Path[T]]
  }
}
