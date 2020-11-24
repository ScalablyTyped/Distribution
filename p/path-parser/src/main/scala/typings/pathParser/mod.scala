package typings.pathParser

import typings.pathParser.pathMod.PathOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Path[T /* <: Record[String, _] */] protected ()
    extends typings.pathParser.pathMod.Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  @js.native
  object Path extends js.Object {
    
    def createPath[T /* <: Record[String, _] */](path: String): typings.pathParser.pathMod.Path[T] = js.native
    def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): typings.pathParser.pathMod.Path[T] = js.native
  }
}
