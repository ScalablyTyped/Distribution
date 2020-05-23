package typings.postcss.mod

import typings.postcss.anon.Fast
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Containers can store any content. If you write a rule inside a rule,
  * PostCSS will parse it.
  */
@js.native
trait ContainerBase extends NodeBase {
  /**
    * @returns The container's first child.
    */
  var first: js.UndefOr[ChildNode] = js.native
  /**
    * @returns The container's last child.
    */
  var last: js.UndefOr[ChildNode] = js.native
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.native
  /**
    * Inserts new nodes to the end of the container.
    * Because each node class is identifiable by unique properties, use the
    * following shortcuts to create nodes in insert methods:
    *     root.append({ name: '@charset', params: '"UTF-8"' }); // at-rule
    *     root.append({ selector: 'a' });                       // rule
    *     rule.append({ prop: 'color', value: 'black' });       // declaration
    *     rule.append({ text: 'Comment' })                      // comment
    * A string containing the CSS of the new element can also be used. This
    * approach is slower than the above shortcuts.
    *     root.append('a {}');
    *     root.first.append('color: black; z-index: 1');
    * @param nodes New nodes.
    * @returns This container for chaining.
    */
  def append(nodes: (Node | js.Object | String)*): this.type = js.native
  /**
    * Iterates through the container's immediate children, calling the
    * callback function for each child. If you need to recursively iterate
    * through all the container's descendant nodes, use container.walk().
    * Unlike the for {} -cycle or Array#forEach() this iterator is safe if
    * you are mutating the array of child nodes during iteration.
    * @param callback Iterator. Returning false will break iteration. Safe
    * if you are mutating the array of child nodes during iteration. PostCSS
    * will adjust the current index to match the mutations.
    * @returns False if the callback returns false during iteration.
    */
  def each(callback: js.Function2[/* node */ ChildNode, /* index */ Double, _]): Boolean | Unit = js.native
  /**
    * Determines whether all child nodes satisfy the specified test.
    * @param callback A function that accepts up to three arguments. The
    * every method calls the callback function for each node until the
    * callback returns false, or until the end of the array.
    * @returns True if the callback returns true for all of the container's
    * children.
    */
  def every(
    callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], _]
  ): Boolean = js.native
  def every(
    callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], _],
    thisArg: js.Any
  ): Boolean = js.native
  def index(child: Double): Double = js.native
  /**
    * @param child Child of the current container.
    * @returns The child's index within the container's "nodes" array.
    */
  def index(child: ChildNode): Double = js.native
  def insertAfter(oldNode: Double, newNode: String): this.type = js.native
  def insertAfter(oldNode: Double, newNode: js.Object): this.type = js.native
  def insertAfter(oldNode: Double, newNode: ChildNode): this.type = js.native
  def insertAfter(oldNode: ChildNode, newNode: String): this.type = js.native
  def insertAfter(oldNode: ChildNode, newNode: js.Object): this.type = js.native
  /**
    * Insert newNode after oldNode within the container.
    * @param oldNode Child or child's index.
    * @returns This container for chaining.
    */
  def insertAfter(oldNode: ChildNode, newNode: ChildNode): this.type = js.native
  def insertBefore(oldNode: Double, newNode: String): this.type = js.native
  def insertBefore(oldNode: Double, newNode: js.Object): this.type = js.native
  def insertBefore(oldNode: Double, newNode: ChildNode): this.type = js.native
  def insertBefore(oldNode: ChildNode, newNode: String): this.type = js.native
  def insertBefore(oldNode: ChildNode, newNode: js.Object): this.type = js.native
  /**
    * Insert newNode before oldNode within the container.
    * @param oldNode Child or child's index.
    * @returns This container for chaining.
    */
  def insertBefore(oldNode: ChildNode, newNode: ChildNode): this.type = js.native
  /**
    * Inserts new nodes to the beginning of the container.
    * Because each node class is identifiable by unique properties, use the
    * following shortcuts to create nodes in insert methods:
    *     root.prepend({ name: '@charset', params: '"UTF-8"' }); // at-rule
    *     root.prepend({ selector: 'a' });                       // rule
    *     rule.prepend({ prop: 'color', value: 'black' });       // declaration
    *     rule.prepend({ text: 'Comment' })                      // comment
    * A string containing the CSS of the new element can also be used. This
    * approach is slower than the above shortcuts.
    *     root.prepend('a {}');
    *     root.first.prepend('color: black; z-index: 1');
    * @param nodes New nodes.
    * @returns This container for chaining.
    */
  def prepend(nodes: (Node | js.Object | String)*): this.type = js.native
  /**
    * Removes all children from the container and cleans their parent
    * properties.
    * @returns This container for chaining.
    */
  def removeAll(): this.type = js.native
  def removeChild(child: Double): this.type = js.native
  /**
    * Removes child from the container and cleans the parent properties
    * from the node and its children.
    * @param child Child or child's index.
    * @returns This container for chaining.
    */
  def removeChild(child: ChildNode): this.type = js.native
  def replaceValues(pattern: String, callbackOrReplaceValue: String): this.type = js.native
  def replaceValues(
    pattern: String,
    callbackOrReplaceValue: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): this.type = js.native
  /**
    * Passes all declaration values within the container that match pattern
    * through the callback, replacing those values with the returned result of
    * callback. This method is useful if you are using a custom unit or
    * function and need to iterate through all values.
    * @param pattern Pattern that we need to replace.
    * @param options Options to speed up the search.
    * @param callbackOrReplaceValue String to replace pattern or callback
    * that will return a new value. The callback will receive the same
    * arguments as those passed to a function parameter of String#replace.
    */
  def replaceValues(pattern: String, options: Fast, callbackOrReplaceValue: String): this.type = js.native
  def replaceValues(
    pattern: String,
    options: Fast,
    callbackOrReplaceValue: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): this.type = js.native
  def replaceValues(pattern: RegExp, callbackOrReplaceValue: String): this.type = js.native
  def replaceValues(
    pattern: RegExp,
    callbackOrReplaceValue: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): this.type = js.native
  def replaceValues(pattern: RegExp, options: Fast, callbackOrReplaceValue: String): this.type = js.native
  def replaceValues(
    pattern: RegExp,
    options: Fast,
    callbackOrReplaceValue: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): this.type = js.native
  /**
    * Determines whether the specified callback returns true for any child node.
    * @param callback A function that accepts up to three arguments. The some
    * method calls the callback for each node until the callback returns true,
    * or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the
    * callback function. If thisArg is omitted, undefined is used as the
    * this value.
    * @returns True if callback returns true for (at least) one of the
    * container's children.
    */
  def some(
    callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], Boolean]
  ): Boolean = js.native
  def some(
    callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Traverses the container's descendant nodes, calling `callback` for each
    * node. Like container.each(), this method is safe to use if you are
    * mutating arrays during iteration. If you only need to iterate through
    * the container's immediate children, use container.each().
    * @param callback Iterator.
    */
  def walk(callback: js.Function2[/* node */ ChildNode, /* index */ Double, _]): Boolean | Unit = js.native
  def walkAtRules(callback: js.Function2[/* atRule */ AtRule_, /* index */ Double, _]): Boolean | Unit = js.native
  /**
    * Traverses the container's descendant nodes, calling `callback` for each
    * at-rule. Like container.each(), this method is safe to use if you are
    * mutating arrays during iteration.
    * @param nameFilter Filters at-rules by name. If provided, iteration
    * will only happen over at-rules that have matching names.
    * @param callback Iterator called for each at-rule node within the
    * container.
    */
  def walkAtRules(nameFilter: String, callback: js.Function2[/* atRule */ AtRule_, /* index */ Double, _]): Boolean | Unit = js.native
  def walkAtRules(nameFilter: RegExp, callback: js.Function2[/* atRule */ AtRule_, /* index */ Double, _]): Boolean | Unit = js.native
  /**
    * Traverses the container's descendant nodes, calling `callback` for each
    * comment. Like container.each(), this method is safe to use if you are
    * mutating arrays during iteration.
    * @param callback Iterator called for each comment node within the container.
    */
  def walkComments(callback: js.Function2[/* comment */ Comment_, /* indexed */ Double, _]): Unit | Boolean = js.native
  def walkDecls(callback: js.Function2[/* decl */ Declaration, /* index */ Double, _]): Boolean | Unit = js.native
  /**
    * Traverses the container's descendant nodes, calling `callback` for each
    * declaration. Like container.each(), this method is safe to use if you
    * are mutating arrays during iteration.
    * @param propFilter Filters declarations by property name. Only those
    * declarations whose property matches propFilter will be iterated over.
    * @param callback Called for each declaration node within the container.
    */
  def walkDecls(propFilter: String): Boolean | Unit = js.native
  def walkDecls(propFilter: String, callback: js.Function2[/* decl */ Declaration, /* index */ Double, _]): Boolean | Unit = js.native
  def walkDecls(propFilter: RegExp): Boolean | Unit = js.native
  def walkDecls(propFilter: RegExp, callback: js.Function2[/* decl */ Declaration, /* index */ Double, _]): Boolean | Unit = js.native
  def walkRules(callback: js.Function2[/* atRule */ Rule_, /* index */ Double, _]): Boolean | Unit = js.native
  /**
    * Traverses the container's descendant nodes, calling `callback` for each
    * rule. Like container.each(), this method is safe to use if you are
    * mutating arrays during iteration.
    * @param selectorFilter Filters rules by selector. If provided,
    * iteration will only happen over rules that have matching names.
    * @param callback Iterator called for each rule node within the
    * container.
    */
  def walkRules(selectorFilter: String, callback: js.Function2[/* atRule */ Rule_, /* index */ Double, _]): Boolean | Unit = js.native
  def walkRules(selectorFilter: js.Any): Boolean | Unit = js.native
  def walkRules(selectorFilter: js.Any, callback: js.Function2[/* atRule */ Rule_, /* index */ Double, _]): Boolean | Unit = js.native
  def walkRules(selectorFilter: RegExp, callback: js.Function2[/* atRule */ Rule_, /* index */ Double, _]): Boolean | Unit = js.native
}

