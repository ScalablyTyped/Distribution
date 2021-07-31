package typings.postcssValueParser

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.postcssValueParser.postcssValueParserBooleans.`false`
import typings.postcssValueParser.postcssValueParserBooleans.`true`
import typings.postcssValueParser.postcssValueParserStrings.Apostrophe
import typings.postcssValueParser.postcssValueParserStrings.Quotationmark
import typings.postcssValueParser.postcssValueParserStrings.`unicode-range`
import typings.postcssValueParser.postcssValueParserStrings.comment
import typings.postcssValueParser.postcssValueParserStrings.div
import typings.postcssValueParser.postcssValueParserStrings.function
import typings.postcssValueParser.postcssValueParserStrings.space
import typings.postcssValueParser.postcssValueParserStrings.string
import typings.postcssValueParser.postcssValueParserStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("postcss-value-parser/lib", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ParsedValue {
    /**
      * Parse a CSS value into a series of nodes to operate on
      *
      * @param value The value to parse
      */
    def this(value: String) = this()
  }
  @JSImport("postcss-value-parser/lib", JSImport.Namespace)
  @js.native
  val ^ : ValueParser = js.native
  
  trait AdjacentAwareNode extends StObject {
    
    /**
      * The token at the end of the node
      */
    var after: String
    
    /**
      * The token at the start of the node
      */
    var before: String
  }
  object AdjacentAwareNode {
    
    @scala.inline
    def apply(after: String, before: String): AdjacentAwareNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjacentAwareNode]
    }
    
    @scala.inline
    implicit class AdjacentAwareNodeMutableBuilder[Self <: AdjacentAwareNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseNode extends StObject {
    
    /**
      * The offset inside the CSS value at which the node starts
      */
    var sourceIndex: Double
    
    /**
      * The node's characteristic value
      */
    var value: String
  }
  object BaseNode {
    
    @scala.inline
    def apply(sourceIndex: Double, value: String): BaseNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseNode]
    }
    
    @scala.inline
    implicit class BaseNodeMutableBuilder[Self <: BaseNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClosableNode extends StObject {
    
    /**
      * Whether the parsed CSS value ended before the node was properly closed
      */
    var unclosed: js.UndefOr[`true`] = js.undefined
  }
  object ClosableNode {
    
    @scala.inline
    def apply(): ClosableNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClosableNode]
    }
    
    @scala.inline
    implicit class ClosableNodeMutableBuilder[Self <: ClosableNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnclosed(value: `true`): Self = StObject.set(x, "unclosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnclosedUndefined: Self = StObject.set(x, "unclosed", js.undefined)
    }
  }
  
  trait CommentNode
    extends StObject
       with BaseNode
       with ClosableNode
       with Node {
    
    var `type`: comment
  }
  object CommentNode {
    
    @scala.inline
    def apply(sourceIndex: Double, value: String): CommentNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[CommentNode]
    }
    
    @scala.inline
    implicit class CommentNodeMutableBuilder[Self <: CommentNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomStringifierCallback = js.Function1[/* nodes */ Node, js.UndefOr[String]]
  
  /**
    * A CSS dimension, decomposed into its numeric and unit parts
    */
  trait Dimension extends StObject {
    
    var number: String
    
    var unit: String
  }
  object Dimension {
    
    @scala.inline
    def apply(number: String, unit: String): Dimension = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    @scala.inline
    implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait DivNode
    extends StObject
       with BaseNode
       with AdjacentAwareNode
       with Node {
    
    var `type`: div
  }
  object DivNode {
    
    @scala.inline
    def apply(after: String, before: String, sourceIndex: Double, value: String): DivNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("div")
      __obj.asInstanceOf[DivNode]
    }
    
    @scala.inline
    implicit class DivNodeMutableBuilder[Self <: DivNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: div): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionNode
    extends StObject
       with BaseNode
       with ClosableNode
       with AdjacentAwareNode
       with Node {
    
    /**
      * Nodes inside the function
      */
    var nodes: js.Array[Node]
    
    var `type`: function
  }
  object FunctionNode {
    
    @scala.inline
    def apply(after: String, before: String, nodes: js.Array[Node], sourceIndex: Double, value: String): FunctionNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[FunctionNode]
    }
    
    @scala.inline
    implicit class FunctionNodeMutableBuilder[Self <: FunctionNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Any node parsed from a CSS value
    */
  /* Rewritten from type alias, can be one of: 
    - typings.postcssValueParser.mod.CommentNode
    - typings.postcssValueParser.mod.DivNode
    - typings.postcssValueParser.mod.FunctionNode
    - typings.postcssValueParser.mod.SpaceNode
    - typings.postcssValueParser.mod.StringNode
    - typings.postcssValueParser.mod.UnicodeRangeNode
    - typings.postcssValueParser.mod.WordNode
  */
  trait Node extends StObject
  object Node {
    
    @scala.inline
    def CommentNode(sourceIndex: Double, value: String): typings.postcssValueParser.mod.CommentNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[typings.postcssValueParser.mod.CommentNode]
    }
    
    @scala.inline
    def DivNode(after: String, before: String, sourceIndex: Double, value: String): typings.postcssValueParser.mod.DivNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("div")
      __obj.asInstanceOf[typings.postcssValueParser.mod.DivNode]
    }
    
    @scala.inline
    def FunctionNode(after: String, before: String, nodes: js.Array[Node], sourceIndex: Double, value: String): typings.postcssValueParser.mod.FunctionNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typings.postcssValueParser.mod.FunctionNode]
    }
    
    @scala.inline
    def SpaceNode(sourceIndex: Double, value: String): typings.postcssValueParser.mod.SpaceNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("space")
      __obj.asInstanceOf[typings.postcssValueParser.mod.SpaceNode]
    }
    
    @scala.inline
    def StringNode(quote: Quotationmark | Apostrophe, sourceIndex: Double, value: String): typings.postcssValueParser.mod.StringNode = {
      val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typings.postcssValueParser.mod.StringNode]
    }
    
    @scala.inline
    def UnicodeRangeNode(sourceIndex: Double, value: String): typings.postcssValueParser.mod.UnicodeRangeNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unicode-range")
      __obj.asInstanceOf[typings.postcssValueParser.mod.UnicodeRangeNode]
    }
    
    @scala.inline
    def WordNode(sourceIndex: Double, value: String): typings.postcssValueParser.mod.WordNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("word")
      __obj.asInstanceOf[typings.postcssValueParser.mod.WordNode]
    }
  }
  
  /**
    * A wrapper around a parsed CSS value that allows for inspecting and walking nodes
    */
  @js.native
  trait ParsedValue extends StObject {
    
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
  
  trait SpaceNode
    extends StObject
       with BaseNode
       with Node {
    
    var `type`: space
  }
  object SpaceNode {
    
    @scala.inline
    def apply(sourceIndex: Double, value: String): SpaceNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("space")
      __obj.asInstanceOf[SpaceNode]
    }
    
    @scala.inline
    implicit class SpaceNodeMutableBuilder[Self <: SpaceNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: space): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringNode
    extends StObject
       with BaseNode
       with ClosableNode
       with Node {
    
    /**
      * The quote type delimiting the string
      */
    var quote: Quotationmark | Apostrophe
    
    var `type`: string
  }
  object StringNode {
    
    @scala.inline
    def apply(quote: Quotationmark | Apostrophe, sourceIndex: Double, value: String): StringNode = {
      val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[StringNode]
    }
    
    @scala.inline
    implicit class StringNodeMutableBuilder[Self <: StringNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuote(value: Quotationmark | Apostrophe): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnicodeRangeNode
    extends StObject
       with BaseNode
       with Node {
    
    var `type`: `unicode-range`
  }
  object UnicodeRangeNode {
    
    @scala.inline
    def apply(sourceIndex: Double, value: String): UnicodeRangeNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unicode-range")
      __obj.asInstanceOf[UnicodeRangeNode]
    }
    
    @scala.inline
    implicit class UnicodeRangeNodeMutableBuilder[Self <: UnicodeRangeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `unicode-range`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValueParser
    extends StObject
       with /**
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
  
  type WalkCallback = js.Function3[/* node */ Node, /* index */ Double, /* nodes */ js.Array[Node], Unit | Boolean]
  
  trait WordNode
    extends StObject
       with BaseNode
       with Node {
    
    var `type`: word
  }
  object WordNode {
    
    @scala.inline
    def apply(sourceIndex: Double, value: String): WordNode = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("word")
      __obj.asInstanceOf[WordNode]
    }
    
    @scala.inline
    implicit class WordNodeMutableBuilder[Self <: WordNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: word): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ValueParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ValueParser = ^
}
