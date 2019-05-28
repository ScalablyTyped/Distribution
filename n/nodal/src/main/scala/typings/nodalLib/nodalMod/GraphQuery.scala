package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "GraphQuery")
@js.native
class GraphQuery protected () extends js.Object {
  /**
    * Create a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Nodal.Model} [Model=null] The Model to base your query around (used for testing)
    */
  def this(str: java.lang.String, maxDepth: scala.Double) = this()
  def this(str: java.lang.String, maxDepth: scala.Double, mModel: nodalLib.TypeofClassModel) = this()
  var Model: nodalLib.TypeofClassModel = js.native
  var constructor: js.Any = js.native
  var identifier: java.lang.String = js.native
  var joins: js.Any = js.native
  var name: java.lang.String = js.native
  var structure: js.Any = js.native
  /**
    * Query the GraphQuery object from the database
    * @param {Function} callback The function to execute upon completion
    */
  def query(callback: js.Function): this.type = js.native
}

/* static members */
@JSImport("nodal", "GraphQuery")
@js.native
object GraphQuery extends js.Object {
  /**
    * Format a parsed syntax tree in a way that the Composer expects
    */
  def formatTree(tree: js.Array[_], max: scala.Double, joins: js.Any): js.Array[_] = js.native
  def formatTree(tree: js.Array[_], max: scala.Double, joins: js.Any, parents: js.Any): js.Array[_] = js.native
  /**
    * Fully parse a GraphQL query, get necessary joins to make in SQL
    */
  def parse(str: java.lang.String, max: scala.Double): nodalLib.Anon_Joins = js.native
  /**
    * Parse syntax tree of a GraphQL query
    */
  def parseSyntaxTree(str: java.lang.String): js.Any = js.native
  def parseSyntaxTree(str: java.lang.String, state: java.lang.String): js.Any = js.native
  def parseSyntaxTree(str: java.lang.String, state: java.lang.String, arr: js.Array[_]): js.Any = js.native
  /**
    * Create and execute a GraphQuery object
    * @param {String} str The query to execute
    * @param {Number} maxDepth The maximum depth of graph to traverse
    * @param {Function} callback The function to execute upon completion
    */
  def query(str: java.lang.String, maxDepth: scala.Double, callback: js.Function): scala.Boolean = js.native
}

