package typings.pathParse

import typings.node.pathMod.ParsedPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String): ParsedPath = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  @JSImport("path-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
