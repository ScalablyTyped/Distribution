package typings.postcssValueParser

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.postcssValueParser.postcssValueParserBooleans.`false`
import typings.postcssValueParser.postcssValueParserBooleans.`true`
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

object libMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("postcss-value-parser/lib", JSImport.Namespace)
  @js.native
  open class ^ protected ()
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
    
    inline def apply(after: String, before: String): AdjacentAwareNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjacentAwareNode]
    }
    
    extension [Self <: AdjacentAwareNode](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseNode extends StObject {
    
    /**
      * The offset, exclusive, inside the CSS value at which the node ends.
      */
    var sourceEndIndex: Double
    
    /**
      * The offset, inclusive, inside the CSS value at which the node starts.
      */
    var sourceIndex: Double
    
    /**
      * The node's characteristic value
      */
    var value: String
  }
  object BaseNode {
    
    inline def apply(sourceEndIndex: Double, sourceIndex: Double, value: String): BaseNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseNode]
    }
    
    extension [Self <: BaseNode](x: Self) {
      
      inline def setSourceEndIndex(value: Double): Self = StObject.set(x, "sourceEndIndex", value.asInstanceOf[js.Any])
      
      inline def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClosableNode extends StObject {
    
    /**
      * Whether the parsed CSS value ended before the node was properly closed
      */
    var unclosed: js.UndefOr[`true`] = js.undefined
  }
  object ClosableNode {
    
    inline def apply(): ClosableNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClosableNode]
    }
    
    extension [Self <: ClosableNode](x: Self) {
      
      inline def setUnclosed(value: `true`): Self = StObject.set(x, "unclosed", value.asInstanceOf[js.Any])
      
      inline def setUnclosedUndefined: Self = StObject.set(x, "unclosed", js.undefined)
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
    
    inline def apply(sourceEndIndex: Double, sourceIndex: Double, value: String): CommentNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[CommentNode]
    }
    
    extension [Self <: CommentNode](x: Self) {
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(number: String, unit: String): Dimension = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    extension [Self <: Dimension](x: Self) {
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
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
    
    inline def apply(after: String, before: String, sourceEndIndex: Double, sourceIndex: Double, value: String): DivNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("div")
      __obj.asInstanceOf[DivNode]
    }
    
    extension [Self <: DivNode](x: Self) {
      
      inline def setType(value: div): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      after: String,
      before: String,
      nodes: js.Array[Node],
      sourceEndIndex: Double,
      sourceIndex: Double,
      value: String
    ): FunctionNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[FunctionNode]
    }
    
    extension [Self <: FunctionNode](x: Self) {
      
      inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setType(value: function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Any node parsed from a CSS value
    */
  /* Rewritten from type alias, can be one of: 
    - typings.postcssValueParser.libMod.CommentNode
    - typings.postcssValueParser.libMod.DivNode
    - typings.postcssValueParser.libMod.FunctionNode
    - typings.postcssValueParser.libMod.SpaceNode
    - typings.postcssValueParser.libMod.StringNode
    - typings.postcssValueParser.libMod.UnicodeRangeNode
    - typings.postcssValueParser.libMod.WordNode
  */
  trait Node extends StObject
  object Node {
    
    inline def CommentNode(sourceEndIndex: Double, sourceIndex: Double, value: String): typings.postcssValueParser.libMod.CommentNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.CommentNode]
    }
    
    inline def DivNode(after: String, before: String, sourceEndIndex: Double, sourceIndex: Double, value: String): typings.postcssValueParser.libMod.DivNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("div")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.DivNode]
    }
    
    inline def FunctionNode(
      after: String,
      before: String,
      nodes: js.Array[Node],
      sourceEndIndex: Double,
      sourceIndex: Double,
      value: String
    ): typings.postcssValueParser.libMod.FunctionNode = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.FunctionNode]
    }
    
    inline def SpaceNode(sourceEndIndex: Double, sourceIndex: Double, value: String): typings.postcssValueParser.libMod.SpaceNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("space")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.SpaceNode]
    }
    
    inline def StringNode(
      quote: Quotationmark | (/* ' */ String),
      sourceEndIndex: Double,
      sourceIndex: Double,
      value: String
    ): typings.postcssValueParser.libMod.StringNode = {
      val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.StringNode]
    }
    
    inline def UnicodeRangeNode(sourceEndIndex: Double, sourceIndex: Double, value: String): typings.postcssValueParser.libMod.UnicodeRangeNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unicode-range")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.UnicodeRangeNode]
    }
    
    inline def WordNode(sourceEndIndex: Double, sourceIndex: Double, value: String): typings.postcssValueParser.libMod.WordNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("word")
      __obj.asInstanceOf[typings.postcssValueParser.libMod.WordNode]
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
    
    inline def apply(sourceEndIndex: Double, sourceIndex: Double, value: String): SpaceNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("space")
      __obj.asInstanceOf[SpaceNode]
    }
    
    extension [Self <: SpaceNode](x: Self) {
      
      inline def setType(value: space): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    var quote: Quotationmark | (/* ' */ String)
    
    var `type`: string
  }
  object StringNode {
    
    inline def apply(
      quote: Quotationmark | (/* ' */ String),
      sourceEndIndex: Double,
      sourceIndex: Double,
      value: String
    ): StringNode = {
      val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[StringNode]
    }
    
    extension [Self <: StringNode](x: Self) {
      
      inline def setQuote(value: Quotationmark | (/* ' */ String)): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnicodeRangeNode
    extends StObject
       with BaseNode
       with Node {
    
    var `type`: `unicode-range`
  }
  object UnicodeRangeNode {
    
    inline def apply(sourceEndIndex: Double, sourceIndex: Double, value: String): UnicodeRangeNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unicode-range")
      __obj.asInstanceOf[UnicodeRangeNode]
    }
    
    extension [Self <: UnicodeRangeNode](x: Self) {
      
      inline def setType(value: `unicode-range`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(sourceEndIndex: Double, sourceIndex: Double, value: String): WordNode = {
      val __obj = js.Dynamic.literal(sourceEndIndex = sourceEndIndex.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("word")
      __obj.asInstanceOf[WordNode]
    }
    
    extension [Self <: WordNode](x: Self) {
      
      inline def setType(value: word): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ValueParser
  
  /* This means you don't have to write `^`, but can instead just say `libMod.foo` */
  override def _to: ValueParser = ^
}
