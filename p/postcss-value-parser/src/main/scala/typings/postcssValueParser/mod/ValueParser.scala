package typings.postcssValueParser.mod

import org.scalablytyped.runtime.Instantiable1
import typings.postcssValueParser.postcssValueParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueParser extends /**
  * Parse a CSS value into a series of nodes to operate on
  *
  * @param value The value to parse
  */
Instantiable1[/* value */ String, ParsedValue] {
  
  /**
    * Parse a CSS value into a series of nodes to operate on
    *
    * @param value The value to parse
    */
  def apply(value: String): ParsedValue = js.native
  
  def stringify(nodes: js.Array[Node]): String = js.native
  def stringify(nodes: js.Array[Node], custom: CustomStringifierCallback): String = js.native
  /**
    * Serialize a series of nodes into a CSS value
    *
    * @param nodes  The nodes to stringify
    * @param custom A custom stringifier callback
    * @returns The generated CSS value
    */
  def stringify(nodes: Node): String = js.native
  def stringify(nodes: Node, custom: CustomStringifierCallback): String = js.native
  
  /**
    * Decompose a CSS dimension into its numeric and unit part
    *
    * @param value The dimension to decompose
    * @returns An object representing `number` and `unit` part of the dimension or `false` if the decomposing fails
    */
  def unit(value: String): Dimension | `false` = js.native
  
  /**
    * Walk a series of nodes, applying a callback
    *
    * @param nodes    The nodes to walk
    * @param callback A visitor callback that will be executed for each node
    * @param bubble   When set to `true`, walking will be done inside-out instead of outside-in
    */
  def walk(nodes: js.Array[Node], callback: WalkCallback): Unit = js.native
  def walk(nodes: js.Array[Node], callback: WalkCallback, bubble: Boolean): Unit = js.native
}
