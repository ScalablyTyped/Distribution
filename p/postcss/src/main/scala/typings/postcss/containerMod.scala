package typings.postcss

import typings.postcss.nodeMod.ChildNode
import typings.postcss.nodeMod.ChildProps
import typings.postcss.nodeMod.NodeProps
import typings.postcss.postcssBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("postcss/lib/container", JSImport.Default)
  @js.native
  abstract class default[Child /* <: typings.postcss.nodeMod.default */] () extends Container[Child]
  
  @js.native
  trait Container[Child /* <: typings.postcss.nodeMod.default */]
    extends typings.postcss.nodeMod.default {
    
    /**
      * Inserts new nodes to the end of the container.
      *
      * ```js
      * const decl1 = new Declaration({ prop: 'color', value: 'black' })
      * const decl2 = new Declaration({ prop: 'background-color', value: 'white' })
      * rule.append(decl1, decl2)
      *
      * root.append({ name: 'charset', params: '"UTF-8"' })  // at-rule
      * root.append({ selector: 'a' })                       // rule
      * rule.append({ prop: 'color', value: 'black' })       // declaration
      * rule.append({ text: 'Comment' })                     // comment
      *
      * root.append('a {}')
      * root.first.append('color: black; z-index: 1')
      * ```
      *
      * @param nodes New nodes.
      * @return This node for methods chain.
      */
    def append(
      nodes: (typings.postcss.nodeMod.default | (js.Array[ChildProps | String | typings.postcss.nodeMod.default]) | ChildProps | String)*
    ): this.type = js.native
    
    /**
      * Iterates through the container’s immediate children,
      * calling `callback` for each child.
      *
      * Returning `false` in the callback will break iteration.
      *
      * This method only iterates through the container’s immediate children.
      * If you need to recursively iterate through all the container’s descendant
      * nodes, use `Container#walk`.
      *
      * Unlike the for `{}`-cycle or `Array#forEach` this iterator is safe
      * if you are mutating the array of child nodes during iteration.
      * PostCSS will adjust the current index to match the mutations.
      *
      * ```js
      * const root = postcss.parse('a { color: black; z-index: 1 }')
      * const rule = root.first
      *
      * for (const decl of rule.nodes) {
      *   decl.cloneBefore({ prop: '-webkit-' + decl.prop })
      *   // Cycle will be infinite, because cloneBefore moves the current node
      *   // to the next index
      * }
      *
      * rule.each(decl => {
      *   decl.cloneBefore({ prop: '-webkit-' + decl.prop })
      *   // Will be executed only for color and z-index
      * })
      * ```
      *
      * @param callback Iterator receives each node and index.
      * @return Returns `false` if iteration was broke.
      */
    @JSName("each")
    def each_false(callback: js.Function2[/* node */ Child, /* index */ Double, `false` | Unit]): js.UndefOr[`false`] = js.native
    
    /**
      * Returns `true` if callback returns `true`
      * for all of the container’s children.
      *
      * ```js
      * const noPrefixes = rule.every(i => i.prop[0] !== '-')
      * ```
      *
      * @param condition Iterator returns true or false.
      * @return Is every child pass condition.
      */
    def every(
      condition: js.Function3[/* node */ Child, /* index */ Double, /* nodes */ js.Array[Child], Boolean]
    ): Boolean = js.native
    
    /**
      * The container’s first child.
      *
      * ```js
      * rule.first === rules.nodes[0]
      * ```
      */
    def first: js.UndefOr[Child] = js.native
    
    /**
      * Returns a `child`’s index within the `Container#nodes` array.
      *
      * ```js
      * rule.index( rule.nodes[2] ) //=> 2
      * ```
      *
      * @param child Child of the current container.
      * @return Child index.
      */
    def index(child: Child): Double = js.native
    def index(child: Double): Double = js.native
    
    /**
      * Insert new node after old node within the container.
      *
      * @param oldNode Child or child’s index.
      * @param newNode New node.
      * @return This node for methods chain.
      */
    def insertAfter(oldNode: Child, newNode: Child): this.type = js.native
    def insertAfter(oldNode: Child, newNode: String): this.type = js.native
    def insertAfter(oldNode: Child, newNode: js.Array[Child | ChildProps | String]): this.type = js.native
    def insertAfter(oldNode: Child, newNode: ChildProps): this.type = js.native
    def insertAfter(oldNode: Double, newNode: Child): this.type = js.native
    def insertAfter(oldNode: Double, newNode: String): this.type = js.native
    def insertAfter(oldNode: Double, newNode: js.Array[Child | ChildProps | String]): this.type = js.native
    def insertAfter(oldNode: Double, newNode: ChildProps): this.type = js.native
    
    /**
      * Insert new node before old node within the container.
      *
      * ```js
      * rule.insertBefore(decl, decl.clone({ prop: '-webkit-' + decl.prop }))
      * ```
      *
      * @param oldNode Child or child’s index.
      * @param newNode New node.
      * @return This node for methods chain.
      */
    def insertBefore(oldNode: Child, newNode: Child): this.type = js.native
    def insertBefore(oldNode: Child, newNode: String): this.type = js.native
    def insertBefore(oldNode: Child, newNode: js.Array[Child | ChildProps | String]): this.type = js.native
    def insertBefore(oldNode: Child, newNode: ChildProps): this.type = js.native
    def insertBefore(oldNode: Double, newNode: Child): this.type = js.native
    def insertBefore(oldNode: Double, newNode: String): this.type = js.native
    def insertBefore(oldNode: Double, newNode: js.Array[Child | ChildProps | String]): this.type = js.native
    def insertBefore(oldNode: Double, newNode: ChildProps): this.type = js.native
    
    /**
      * The container’s last child.
      *
      * ```js
      * rule.last === rule.nodes[rule.nodes.length - 1]
      * ```
      */
    def last: js.UndefOr[Child] = js.native
    
    /**
      * An array containing the container’s children.
      *
      * ```js
      * const root = postcss.parse('a { color: black }')
      * root.nodes.length           //=> 1
      * root.nodes[0].selector      //=> 'a'
      * root.nodes[0].nodes[0].prop //=> 'color'
      * ```
      */
    var nodes: js.Array[Child] = js.native
    
    /**
      * Inserts new nodes to the start of the container.
      *
      * ```js
      * const decl1 = new Declaration({ prop: 'color', value: 'black' })
      * const decl2 = new Declaration({ prop: 'background-color', value: 'white' })
      * rule.prepend(decl1, decl2)
      *
      * root.append({ name: 'charset', params: '"UTF-8"' })  // at-rule
      * root.append({ selector: 'a' })                       // rule
      * rule.append({ prop: 'color', value: 'black' })       // declaration
      * rule.append({ text: 'Comment' })                     // comment
      *
      * root.append('a {}')
      * root.first.append('color: black; z-index: 1')
      * ```
      *
      * @param nodes New nodes.
      * @return This node for methods chain.
      */
    def prepend(
      nodes: (typings.postcss.nodeMod.default | (js.Array[ChildProps | String | typings.postcss.nodeMod.default]) | ChildProps | String)*
    ): this.type = js.native
    
    /**
      * Add child to the end of the node.
      *
      * ```js
      * rule.push(new Declaration({ prop: 'color', value: 'black' }))
      * ```
      *
      * @param child New node.
      * @return This node for methods chain.
      */
    def push(child: Child): this.type = js.native
    
    /**
      * Removes all children from the container
      * and cleans their parent properties.
      *
      * ```js
      * rule.removeAll()
      * rule.nodes.length //=> 0
      * ```
      *
      * @return This node for methods chain.
      */
    def removeAll(): this.type = js.native
    
    /**
      * Removes node from the container and cleans the parent properties
      * from the node and its children.
      *
      * ```js
      * rule.nodes.length  //=> 5
      * rule.removeChild(decl)
      * rule.nodes.length  //=> 4
      * decl.parent        //=> undefined
      * ```
      *
      * @param child Child or child’s index.
      * @return This node for methods chain.
      */
    def removeChild(child: Child): this.type = js.native
    def removeChild(child: Double): this.type = js.native
    
    /**
      * Passes all declaration values within the container that match pattern
      * through callback, replacing those values with the returned result
      * of callback.
      *
      * This method is useful if you are using a custom unit or function
      * and need to iterate through all values.
      *
      * ```js
      * root.replaceValues(/\d+rem/, { fast: 'rem' }, string => {
      *   return 15 * parseInt(string) + 'px'
      * })
      * ```
      *
      * @param pattern      Replace pattern.
      * @param {object} opts                Options to speed up the search.
      * @param callback   String to replace pattern or callback
      *                                     that returns a new value. The callback
      *                                     will receive the same arguments
      *                                     as those passed to a function parameter
      *                                     of `String#replace`.
      * @return This node for methods chain.
      */
    def replaceValues(pattern: String, options: ValueOptions, replaced: String): this.type = js.native
    def replaceValues(
      pattern: String,
      options: ValueOptions,
      replaced: js.Function2[/* substring */ String, /* repeated */ Any, String]
    ): this.type = js.native
    def replaceValues(pattern: String, replaced: String): this.type = js.native
    def replaceValues(pattern: String, replaced: js.Function2[/* substring */ String, /* repeated */ Any, String]): this.type = js.native
    def replaceValues(pattern: js.RegExp, options: ValueOptions, replaced: String): this.type = js.native
    def replaceValues(
      pattern: js.RegExp,
      options: ValueOptions,
      replaced: js.Function2[/* substring */ String, /* repeated */ Any, String]
    ): this.type = js.native
    def replaceValues(pattern: js.RegExp, replaced: String): this.type = js.native
    def replaceValues(pattern: js.RegExp, replaced: js.Function2[/* substring */ String, /* repeated */ Any, String]): this.type = js.native
    
    /**
      * Returns `true` if callback returns `true` for (at least) one
      * of the container’s children.
      *
      * ```js
      * const hasPrefix = rule.some(i => i.prop[0] === '-')
      * ```
      *
      * @param condition Iterator returns true or false.
      * @return Is some child pass condition.
      */
    def some(
      condition: js.Function3[/* node */ Child, /* index */ Double, /* nodes */ js.Array[Child], Boolean]
    ): Boolean = js.native
    
    @JSName("walkAtRules")
    def walkAtRules_false(
      callback: js.Function2[/* atRule */ typings.postcss.atRuleMod.default, /* index */ Double, `false` | Unit]
    ): js.UndefOr[`false`] = js.native
    /**
      * Traverses the container’s descendant nodes, calling callback
      * for each at-rule node.
      *
      * If you pass a filter, iteration will only happen over at-rules
      * that have matching names.
      *
      * Like `Container#each`, this method is safe
      * to use if you are mutating arrays during iteration.
      *
      * ```js
      * root.walkAtRules(rule => {
      *   if (isOld(rule.name)) rule.remove()
      * })
      *
      * let first = false
      * root.walkAtRules('charset', rule => {
      *   if (!first) {
      *     first = true
      *   } else {
      *     rule.remove()
      *   }
      * })
      * ```
      *
      * @param name     String or regular expression to filter at-rules by name.
      * @param callback Iterator receives each node and index.
      * @return Returns `false` if iteration was broke.
      */
    @JSName("walkAtRules")
    def walkAtRules_false(
      nameFilter: String,
      callback: js.Function2[/* atRule */ typings.postcss.atRuleMod.default, /* index */ Double, `false` | Unit]
    ): js.UndefOr[`false`] = js.native
    @JSName("walkAtRules")
    def walkAtRules_false(
      nameFilter: js.RegExp,
      callback: js.Function2[/* atRule */ typings.postcss.atRuleMod.default, /* index */ Double, `false` | Unit]
    ): js.UndefOr[`false`] = js.native
    
    /**
      * Traverses the container’s descendant nodes, calling callback
      * for each comment node.
      *
      * Like `Container#each`, this method is safe
      * to use if you are mutating arrays during iteration.
      *
      * ```js
      * root.walkComments(comment => {
      *   comment.remove()
      * })
      * ```
      *
      * @param callback Iterator receives each node and index.
      * @return Returns `false` if iteration was broke.
      */
    @JSName("walkComments")
    def walkComments_false(
      callback: js.Function2[
          /* comment */ typings.postcss.commentMod.default, 
          /* indexed */ Double, 
          `false` | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    
    @JSName("walkDecls")
    def walkDecls_false(
      callback: js.Function2[
          /* decl */ typings.postcss.declarationMod.default, 
          /* index */ Double, 
          `false` | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    /**
      * Traverses the container’s descendant nodes, calling callback
      * for each declaration node.
      *
      * If you pass a filter, iteration will only happen over declarations
      * with matching properties.
      *
      * ```js
      * root.walkDecls(decl => {
      *   checkPropertySupport(decl.prop)
      * })
      *
      * root.walkDecls('border-radius', decl => {
      *   decl.remove()
      * })
      *
      * root.walkDecls(/^background/, decl => {
      *   decl.value = takeFirstColorFromGradient(decl.value)
      * })
      * ```
      *
      * Like `Container#each`, this method is safe
      * to use if you are mutating arrays during iteration.
      *
      * @param prop     String or regular expression to filter declarations
      *                 by property name.
      * @param callback Iterator receives each node and index.
      * @return Returns `false` if iteration was broke.
      */
    @JSName("walkDecls")
    def walkDecls_false(
      propFilter: String,
      callback: js.Function2[
          /* decl */ typings.postcss.declarationMod.default, 
          /* index */ Double, 
          `false` | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    @JSName("walkDecls")
    def walkDecls_false(
      propFilter: js.RegExp,
      callback: js.Function2[
          /* decl */ typings.postcss.declarationMod.default, 
          /* index */ Double, 
          `false` | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    
    @JSName("walkRules")
    def walkRules_false(
      callback: js.Function2[/* rule */ typings.postcss.ruleMod.default, /* index */ Double, `false` | Unit]
    ): js.UndefOr[`false`] = js.native
    /**
      * Traverses the container’s descendant nodes, calling callback
      * for each rule node.
      *
      * If you pass a filter, iteration will only happen over rules
      * with matching selectors.
      *
      * Like `Container#each`, this method is safe
      * to use if you are mutating arrays during iteration.
      *
      * ```js
      * const selectors = []
      * root.walkRules(rule => {
      *   selectors.push(rule.selector)
      * })
      * console.log(`Your CSS uses ${ selectors.length } selectors`)
      * ```
      *
      * @param selector String or regular expression to filter rules by selector.
      * @param callback Iterator receives each node and index.
      * @return Returns `false` if iteration was broke.
      */
    @JSName("walkRules")
    def walkRules_false(
      selectorFilter: String,
      callback: js.Function2[/* rule */ typings.postcss.ruleMod.default, /* index */ Double, `false` | Unit]
    ): js.UndefOr[`false`] = js.native
    @JSName("walkRules")
    def walkRules_false(
      selectorFilter: js.RegExp,
      callback: js.Function2[/* rule */ typings.postcss.ruleMod.default, /* index */ Double, `false` | Unit]
    ): js.UndefOr[`false`] = js.native
    
    /**
      * Traverses the container’s descendant nodes, calling callback
      * for each node.
      *
      * Like container.each(), this method is safe to use
      * if you are mutating arrays during iteration.
      *
      * If you only need to iterate through the container’s immediate children,
      * use `Container#each`.
      *
      * ```js
      * root.walk(node => {
      *   // Traverses all descendant nodes.
      * })
      * ```
      *
      * @param callback Iterator receives each node and index.
      * @return  Returns `false` if iteration was broke.
      */
    @JSName("walk")
    def walk_false(callback: js.Function2[/* node */ ChildNode, /* index */ Double, `false` | Unit]): js.UndefOr[`false`] = js.native
  }
  
  trait ContainerProps
    extends StObject
       with NodeProps {
    
    var nodes: js.UndefOr[js.Array[ChildNode | ChildProps]] = js.undefined
  }
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    extension [Self <: ContainerProps](x: Self) {
      
      inline def setNodes(value: js.Array[ChildNode | ChildProps]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: (ChildNode | ChildProps)*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait ValueOptions extends StObject {
    
    /**
      * String that’s used to narrow down values and speed up the regexp search.
      */
    var fast: js.UndefOr[String] = js.undefined
    
    /**
      * An array of property names.
      */
    var props: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ValueOptions {
    
    inline def apply(): ValueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueOptions]
    }
    
    extension [Self <: ValueOptions](x: Self) {
      
      inline def setFast(value: String): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
      
      inline def setFastUndefined: Self = StObject.set(x, "fast", js.undefined)
      
      inline def setProps(value: js.Array[String]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: String*): Self = StObject.set(x, "props", js.Array(value*))
    }
  }
}
