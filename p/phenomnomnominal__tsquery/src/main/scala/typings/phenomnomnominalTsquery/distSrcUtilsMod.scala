package typings.phenomnomnominalTsquery

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPath(obj: Any, path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def inPath(node: Node, ancestor: Node, path: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inPath")(node.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
