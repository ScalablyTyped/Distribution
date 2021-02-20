package typings.pathParser

import typings.pathParser.pathMod.PathOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-parser", "Path")
  @js.native
  class Path[T /* <: Record[String, _] */] protected ()
    extends typings.pathParser.pathMod.Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object Path {
    
    @JSImport("path-parser", "Path.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String): typings.pathParser.pathMod.Path[T] = js.native
    @JSImport("path-parser", "Path.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): typings.pathParser.pathMod.Path[T] = js.native
  }
}
