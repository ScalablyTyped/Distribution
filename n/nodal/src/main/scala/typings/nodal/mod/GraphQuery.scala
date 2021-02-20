package typings.nodal.mod

import typings.nodal.anon.Joins
import typings.nodal.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /**
    * Format a parsed syntax tree in a way that the Composer expects
    */
  @JSImport("nodal", "GraphQuery.formatTree")
  @js.native
  def formatTree(tree: js.Array[_], max: Double, joins: js.Any): js.Array[_] = js.native
  @JSImport("nodal", "GraphQuery.formatTree")
  @js.native
  def formatTree(tree: js.Array[_], max: Double, joins: js.Any, parents: js.Any): js.Array[_] = js.native
  
  /**
    * Fully parse a GraphQL query, get necessary joins to make in SQL
    */
  @JSImport("nodal", "GraphQuery.parse")
  @js.native
  def parse(str: String, max: Double): Joins = js.native
  
  /**
    * Parse syntax tree of a GraphQL query
    */
  @JSImport("nodal", "GraphQuery.parseSyntaxTree")
  @js.native
  def parseSyntaxTree(str: String): js.Any = js.native
  @JSImport("nodal", "GraphQuery.parseSyntaxTree")
  @js.native
  def parseSyntaxTree(str: String, state: js.UndefOr[scala.Nothing], arr: js.Array[_]): js.Any = js.native
  @JSImport("nodal", "GraphQuery.parseSyntaxTree")
  @js.native
  def parseSyntaxTree(str: String, state: String): js.Any = js.native
  @JSImport("nodal", "GraphQuery.parseSyntaxTree")
  @js.native
  def parseSyntaxTree(str: String, state: String, arr: js.Array[_]): js.Any = js.native
  
  /**
    * Create and execute a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Function} callback The function to execute upon completion
    */
  @JSImport("nodal", "GraphQuery.query")
  @js.native
  def query(str: String, maxDepth: Double, callback: js.Function): Boolean = js.native
}
