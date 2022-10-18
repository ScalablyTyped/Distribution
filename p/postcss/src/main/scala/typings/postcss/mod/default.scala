package typings.postcss.mod

import org.scalablytyped.runtime.Shortcut
import typings.postcss.libAtRuleMod.AtRuleProps
import typings.postcss.libCommentMod.CommentProps
import typings.postcss.libCssSyntaxErrorMod.RangePosition
import typings.postcss.libDeclarationMod.DeclarationProps
import typings.postcss.libResultMod.ResultOptions
import typings.postcss.libRootMod.RootProps
import typings.postcss.libRuleMod.RuleProps
import typings.postcss.libWarningMod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default extends Shortcut {
  
  @JSImport("postcss", JSImport.Default)
  @js.native
  val ^ : Postcss = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.AtRule")
  @js.native
  open class AtRuleCls ()
    extends typings.postcss.libAtRuleMod.default {
    def this(defaults: AtRuleProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Comment")
  @js.native
  open class CommentCls ()
    extends typings.postcss.libCommentMod.default {
    def this(defaults: CommentProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Container")
  @js.native
  open class ContainerCls[Child /* <: typings.postcss.libNodeMod.default */] ()
    extends typings.postcss.libContainerMod.default[Child]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.CssSyntaxError")
  @js.native
  open class CssSyntaxErrorCls protected ()
    extends typings.postcss.libCssSyntaxErrorMod.default {
    /**
      * Instantiates a CSS syntax error. Can be instantiated for a single position
      * or for a range.
      * @param message        Error message.
      * @param lineOrStartPos If for a single position, the line number, or if for
      *                       a range, the inclusive start position of the error.
      * @param columnOrEndPos If for a single position, the column number, or if for
      *                       a range, the exclusive end position of the error.
      * @param source         Source code of the broken file.
      * @param file           Absolute path to the broken file.
      * @param plugin         PostCSS plugin name, if error came from plugin.
      */
    def this(
      message: String,
      lineOrStartPos: js.UndefOr[Double | RangePosition],
      columnOrEndPos: js.UndefOr[Double | RangePosition],
      source: js.UndefOr[String],
      file: js.UndefOr[String],
      plugin: js.UndefOr[String]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Declaration")
  @js.native
  open class DeclarationCls ()
    extends typings.postcss.libDeclarationMod.default {
    def this(defaults: DeclarationProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Input")
  @js.native
  open class InputCls protected ()
    extends typings.postcss.libInputMod.default {
    /**
      * @param css  Input CSS source.
      * @param opts Process options.
      */
    def this(css: String) = this()
    def this(css: String, opts: ProcessOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Node")
  @js.native
  /**
    * @param defaults Value for node properties.
    */
  open class NodeCls ()
    extends typings.postcss.libNodeMod.default {
    def this(defaults: js.Object) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Result")
  @js.native
  open class ResultCls protected ()
    extends typings.postcss.libResultMod.default {
    def this(processor: typings.postcss.libProcessorMod.default, root: Document, opts: ResultOptions) = this()
    /**
      * @param processor Processor used for this transformation.
      * @param root      Root node after all transformations.
      * @param opts      Options from the `Processor#process` or `Root#toResult`.
      */
    def this(processor: typings.postcss.libProcessorMod.default, root: Root_, opts: ResultOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Root")
  @js.native
  open class RootCls ()
    extends typings.postcss.libRootMod.default {
    def this(defaults: RootProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Rule")
  @js.native
  open class RuleCls ()
    extends typings.postcss.libRuleMod.default {
    def this(defaults: RuleProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("postcss", "default.Warning")
  @js.native
  open class WarningCls protected ()
    extends typings.postcss.libWarningMod.default {
    /**
      * @param text Warning message.
      * @param opts Warning options.
      */
    def this(text: String) = this()
    def this(text: String, opts: WarningOptions) = this()
  }
  
  type _To = Postcss
  
  /* This means you don't have to write `^`, but can instead just say `default.foo` */
  override def _to: Postcss = ^
}
