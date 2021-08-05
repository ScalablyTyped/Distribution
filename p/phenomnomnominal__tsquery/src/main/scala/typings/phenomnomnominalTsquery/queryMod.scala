package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def query[T /* <: Node */](ast: String, selector: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def query[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def query[T /* <: Node */](ast: Node, selector: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def query[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
