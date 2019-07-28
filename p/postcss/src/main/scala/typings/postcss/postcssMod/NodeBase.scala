package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeBase extends js.Object {
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
  var source: js.UndefOr[NodeSource] = js.native
  def after(newNode: String): this.type = js.native
  def after(newNode: js.Array[Node]): this.type = js.native
  def after(newNode: js.Object): this.type = js.native
  /**
    * Insert new node after current node to current node’s parent.
    *
    * Just an alias for `node.parent.insertAfter(node, newNode)`.
    *
    * @returns this node for method chaining.
    *
    * @example
    * decl.after('color: black');
    */
  def after(newNode: Node): this.type = js.native
  def before(newNode: String): this.type = js.native
  def before(newNode: js.Array[Node]): this.type = js.native
  def before(newNode: js.Object): this.type = js.native
  /**
    * Insert new node before current node to current node’s parent.
    *
    * Just an alias for `node.parent.insertBefore(node, newNode)`.
    *
    * @returns this node for method chaining.
    *
    * @example
    * decl.before('content: ""');
    */
  def before(newNode: Node): this.type = js.native
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
  message: String): CssSyntaxError = js.native
  def error(/**
    * Error description.
    */
  message: String, options: NodeErrorOptions): CssSyntaxError = js.native
  /**
    * @returns The next child of the node's parent; or, returns undefined if
    * the current node is the last child.
    */
  def next(): ChildNode | Unit = js.native
  /**
    * @returns The previous child of the node's parent; or, returns undefined
    * if the current node is the first child.
    */
  def prev(): ChildNode | Unit = js.native
  /**
    * @param prop Name or code style property.
    * @param defaultType Name of default value. It can be easily missed if the
    * value is the same as prop.
    * @returns A code style property value. If the node is missing the code
    * style property (because the node was manually built or cloned), PostCSS
    * will try to autodetect the code style property by looking at other nodes
    * in the tree.
    */
  def raw(prop: String): js.Any = js.native
  def raw(prop: String, defaultType: String): js.Any = js.native
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
  def warn(result: Result, text: String): Unit = js.native
  def warn(result: Result, text: String, opts: WarningOptions): Unit = js.native
}

