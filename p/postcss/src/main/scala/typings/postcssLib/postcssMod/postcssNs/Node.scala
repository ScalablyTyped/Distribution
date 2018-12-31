package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * Returns the node's parent node.
    */
  var parent: Container = js.native
  /**
    * Contains information to generate byte-to-byte equal node string as it
    * was in origin input.
    */
  var raws: NodeRaws = js.native
  /**
    * Returns the input source of the node. The property is used in source
    * map generation. If you create a node manually
    * (e.g., with postcss.decl() ), that node will not have a source
    * property and will be absent from the source map. For this reason, the
    * plugin developer should consider cloning nodes to create new ones
    * (in which case the new node's source will reference the original,
    * cloned node) or setting the source property manually.
    */
  var source: NodeSource = js.native
  /**
    * Returns a string representing the node's type. Possible values are
    * root, atrule, rule, decl or comment.
    */
  var `type`: java.lang.String = js.native
  def clone(overrides: js.Object): this.type = js.native
  /**
    * Shortcut to clone the node and insert the resulting cloned node after
    * the current node.
    * @param overrides New Properties to override in the clone.
    * @returns The cloned node.
    */
  def cloneAfter(): this.type = js.native
  def cloneAfter(overrides: js.Object): this.type = js.native
  /**
    * Shortcut to clone the node and insert the resulting cloned node before
    * the current node.
    * @param overrides New Properties to override in the clone.
    * @returns The cloned node.
    */
  def cloneBefore(): this.type = js.native
  def cloneBefore(overrides: js.Object): this.type = js.native
  /**
    * This method produces very useful error messages. If present, an input
    * source map will be used to get the original position of the source, even
    * from a previous compilation step (e.g., from Sass compilation).
    * @returns The original position of the node in the source, showing line
    * and column numbers and also a small excerpt to facilitate debugging.
    */
  def error(/**
    * Error description.
    */
  message: java.lang.String): CssSyntaxError = js.native
  def error(/**
    * Error description.
    */
  message: java.lang.String, options: NodeErrorOptions): CssSyntaxError = js.native
  /**
    * Removes the node from its current parent and inserts it into a new
    * parent after otherNode. This will also clean the node's code style
    * properties just as it would in node.moveTo(newParent).
    * @param otherNode Will be before the current node after moving.
    * @returns This node for chaining.
    */
  def moveAfter(otherNode: Node): this.type = js.native
  /**
    * Removes the node from its current parent and inserts it into a new
    * parent before otherNode. This will also clean the node's code style
    * properties just as it would in node.moveTo(newParent).
    * @param otherNode Will be after the current node after moving.
    * @returns This node for chaining.
    */
  def moveBefore(otherNode: Node): this.type = js.native
  /**
    * Removes the node from its current parent and inserts it at the end of
    * newParent. This will clean the before and after code style properties
    * from the node and replace them with the indentation style of newParent.
    * It will also clean the between property if newParent is in another Root.
    * @param newParent Where the current node will be moved.
    * @returns This node for chaining.
    */
  def moveTo(newParent: Container): this.type = js.native
  /**
    * @returns The next child of the node's parent; or, returns undefined if
    * the current node is the last child.
    */
  def next(): Node = js.native
  /**
    * @returns The previous child of the node's parent; or, returns undefined
    * if the current node is the first child.
    */
  def prev(): Node = js.native
  /**
    * @param prop Name or code style property.
    * @param defaultType Name of default value. It can be easily missed if the
    * value is the same as prop.
    * @returns A code style property value. If the node is missing the code
    * style property (because the node was manually built or cloned), PostCSS
    * will try to autodetect the code style property by looking at other nodes
    * in the tree.
    */
  def raw(prop: java.lang.String): js.Any = js.native
  def raw(prop: java.lang.String, defaultType: java.lang.String): js.Any = js.native
  /**
    * Removes the node from its parent and cleans the parent property in the
    * node and its children.
    * @returns This node for chaining.
    */
  def remove(): this.type = js.native
  /**
    * Inserts node(s) before the current node and removes the current node.
    * @returns This node for chaining.
    */
  def replaceWith(nodes: (Node | js.Object)*): this.type = js.native
  /**
    * @returns The Root instance of the node's tree.
    */
  def root(): Root = js.native
  /**
    * Creates an instance of Warning and adds it to messages. This method is
    * provided as a convenience wrapper for Result#warn.
    * Note that `opts.node` is automatically passed to Result#warn for you.
    * @param result The result that will receive the warning.
    * @param text Warning message. It will be used in the `text` property of
    * the message object.
    * @param opts Properties to assign to the message object.
    */
  def warn(result: Result, text: java.lang.String): scala.Unit = js.native
  def warn(result: Result, text: java.lang.String, opts: WarningOptions): scala.Unit = js.native
}

