package typings.phenomnomnominalTsquery

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/utils", "getPath")
  @js.native
  def getPath(obj: js.Any, path: String): js.Any = js.native
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/utils", "inPath")
  @js.native
  def inPath(node: Node, ancestor: Node, path: js.Array[String]): Boolean = js.native
}
