package typings.nodal.mod

import typings.nodal.anon.Joins
import typings.nodal.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "GraphQuery")
@js.native
open class GraphQuery protected () extends StObject {
  /**
    * Create a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Nodal.Model} [Model=null] The Model to base your query around (used for testing)
    */
  def this(str: String, maxDepth: Double) = this()
  def this(str: String, maxDepth: Double, mModel: TypeofModel) = this()
  
  var Model: TypeofModel = js.native
  
  /* private */ var constructor: Any = js.native
  
  var identifier: String = js.native
  
  var joins: Any = js.native
  
  var name: String = js.native
  
  /**
    * Query the GraphQuery object from the database
    * @param {Function} callback The function to execute upon completion
    */
  def query(callback: js.Function): this.type = js.native
  
  var structure: Any = js.native
}
/* static members */
object GraphQuery {
  
  @JSImport("nodal", "GraphQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format a parsed syntax tree in a way that the Composer expects
    */
  inline def formatTree(tree: js.Array[Any], max: Double, joins: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTree")(tree.asInstanceOf[js.Any], max.asInstanceOf[js.Any], joins.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def formatTree(tree: js.Array[Any], max: Double, joins: Any, parents: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTree")(tree.asInstanceOf[js.Any], max.asInstanceOf[js.Any], joins.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * Fully parse a GraphQL query, get necessary joins to make in SQL
    */
  inline def parse(str: String, max: Double): Joins = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Joins]
  
  /**
    * Parse syntax tree of a GraphQL query
    */
  inline def parseSyntaxTree(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parseSyntaxTree(str: String, state: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseSyntaxTree(str: String, state: String, arr: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any], state.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseSyntaxTree(str: String, state: Unit, arr: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any], state.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Create and execute a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Function} callback The function to execute upon completion
    */
  inline def query(str: String, maxDepth: Double, callback: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(str.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
