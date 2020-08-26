package typings.postcssLess

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.mod.AtRule_
import typings.postcss.mod.Builder
import typings.postcss.mod.Comment_
import typings.postcss.mod.Node
import typings.postcss.mod.Parser
import typings.postcss.mod.ParserInput
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.postcss.mod.Stringifier
import typings.postcssLess.postcssLessBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss-less", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.postcssLess.mod.ImportAtRule
    - typings.postcssLess.mod.VariableAtRule
    - typings.postcssLess.mod.MixinAtRule
    - typings.postcssLess.mod.FunctionAtRule
  */
  trait AtRule extends js.Object
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/LessParser.js#L187
  @js.native
  trait ExtendRule extends Rule_ {
    var extend: `true` = js.native
  }
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/LessParser.js#L57
  @js.native
  trait FunctionAtRule
    extends AtRule_
       with AtRule {
    var function: `true` = js.native
  }
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/nodes/import.js
  @js.native
  trait ImportAtRule
    extends AtRule_
       with AtRule {
    var filename: String = js.native
    var `import`: `true` = js.native
    var options: js.UndefOr[String] = js.native
  }
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/LessParser.js#L73
  @js.native
  trait InlineComment extends Comment_ {
    var `inline`: `true` = js.native
  }
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/LessParser.js#L147-L151
  @js.native
  trait MixinAtRule
    extends AtRule_
       with AtRule {
    var important: js.UndefOr[`true`] = js.native
    var mixin: `true` = js.native
  }
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/nodes/variable.js
  @js.native
  trait VariableAtRule
    extends AtRule_
       with AtRule {
    var variable: `true` = js.native
  }
  
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parser] = js.native
  @JSName("parse")
  var parse_Original: Parser = js.native
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.native
  @JSName("stringify")
  var stringify_Original: Stringifier = js.native
  def nodeToString(node: Node): String = js.native
  def parse(css: ParserInput): Root_ = js.native
  def parse(css: ParserInput, opts: PickProcessOptionsmapfrom): Root_ = js.native
  def stringify(node: Node, builder: Builder): Unit = js.native
  type Comment = InlineComment
  type Rule = ExtendRule
}

