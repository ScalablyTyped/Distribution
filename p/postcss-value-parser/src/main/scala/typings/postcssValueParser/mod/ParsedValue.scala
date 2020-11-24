package typings.postcssValueParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper around a parsed CSS value that allows for inspecting and walking nodes
  */
@js.native
trait ParsedValue extends js.Object {
  
  /**
    * The series of parsed nodes
    */
  var nodes: js.Array[Node] = js.native
  
  /**
    * Walk all parsed nodes, applying a callback
    *
    * @param callback A visitor callback that will be executed for each node
    * @param bubble   When set to `true`, walking will be done inside-out instead of outside-in
    */
  def walk(callback: WalkCallback): this.type = js.native
  def walk(callback: WalkCallback, bubble: Boolean): this.type = js.native
}
