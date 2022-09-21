package typings.postcssLess

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.mod.AtRule_
import typings.postcss.mod.Builder
import typings.postcss.mod.Comment_
import typings.postcss.mod.Node
import typings.postcss.mod.Parser
import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import typings.postcss.mod.Stringifier
import typings.postcss.nodeMod.AnyNode
import typings.postcss.rootMod.default
import typings.postcssLess.postcssLessBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined postcss.postcss.Syntax & {  parse :postcss.postcss.Parser<postcss.postcss.Root>,   stringify :postcss.postcss.Stringifier, nodeToString (node : postcss.postcss.Node): string} */
object mod {
  
  @JSImport("postcss-less", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodeToString(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Function to generate AST by string.
    */
  @JSImport("postcss-less", "parse")
  @js.native
  def parse: js.UndefOr[Parser[Root_ | default | typings.postcss.documentMod.default]] = js.native
  inline def parse(css: String): Root_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[Root_]
  inline def parse(css: String, opts: PickProcessOptionsmapfrom): Root_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Root_]
  inline def parse(css: ToString): Root_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[Root_]
  inline def parse(css: ToString, opts: PickProcessOptionsmapfrom): Root_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Root_]
  inline def parse_=(x: js.UndefOr[Parser[Root_ | default | typings.postcss.documentMod.default]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  
  /**
    * Class to generate string by AST.
    */
  @JSImport("postcss-less", "stringify")
  @js.native
  def stringify: js.UndefOr[Stringifier] = js.native
  inline def stringify(node: AnyNode, builder: Builder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def stringify_=(x: js.UndefOr[Stringifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcssLess.mod.ImportAtRule
    - typings.postcssLess.mod.VariableAtRule
    - typings.postcssLess.mod.MixinAtRule
    - typings.postcssLess.mod.FunctionAtRule
  */
  trait AtRule extends StObject
  
  type Comment = InlineComment
  
  type Declaration = ExtendDeclaration
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/LessParser.js#L187
  @js.native
  trait ExtendDeclaration
    extends typings.postcss.mod.Declaration {
    
    var extend: `true` = js.native
  }
  
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
  
  type Rule = ExtendRule
  
  // @see https://github.com/shellscape/postcss-less/blob/v3.1.4/lib/nodes/variable.js
  @js.native
  trait VariableAtRule
    extends AtRule_
       with AtRule {
    
    var value: String = js.native
    
    var variable: `true` = js.native
  }
}
