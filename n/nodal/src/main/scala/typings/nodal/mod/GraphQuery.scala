package typings.nodal.mod

import typings.nodal.anon.Joins
import typings.nodal.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "GraphQuery")
@js.native
class GraphQuery protected () extends StObject {
  /**
    * Create a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Nodal.Model} [Model=null] The Model to base your query around (used for testing)
    */
  def this(str: String, maxDepth: Double) = this()
  def this(str: String, maxDepth: Double, mModel: TypeofModel) = this()
  
  var Model: TypeofModel = js.native
  
  var constructor: js.Any = js.native
  
  var identifier: String = js.native
  
  var joins: js.Any = js.native
  
  var name: String = js.native
  
  /**
    * Query the GraphQuery object from the database
    * @param {Function} callback The function to execute upon completion
    */
  def query(callback: js.Function): this.type = js.native
  
  var structure: js.Any = js.native
}
/* static members */
object GraphQuery {
  
  @JSImport("nodal", "GraphQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format a parsed syntax tree in a way that the Composer expects
    */
  @scala.inline
  def formatTree(tree: js.Array[js.Any], max: Double, joins: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTree")(tree.asInstanceOf[js.Any], max.asInstanceOf[js.Any], joins.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def formatTree(tree: js.Array[js.Any], max: Double, joins: js.Any, parents: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTree")(tree.asInstanceOf[js.Any], max.asInstanceOf[js.Any], joins.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Fully parse a GraphQL query, get necessary joins to make in SQL
    */
  @scala.inline
  def parse(str: String, max: Double): Joins = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Joins]
  
  /**
    * Parse syntax tree of a GraphQL query
    */
  @scala.inline
  def parseSyntaxTree(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parseSyntaxTree(str: String, state: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parseSyntaxTree(str: String, state: String, arr: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any], state.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def parseSyntaxTree(str: String, state: Unit, arr: js.Array[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSyntaxTree")(str.asInstanceOf[js.Any], state.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Create and execute a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Function} callback The function to execute upon completion
    */
  @scala.inline
  def query(str: String, maxDepth: Double, callback: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(str.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
