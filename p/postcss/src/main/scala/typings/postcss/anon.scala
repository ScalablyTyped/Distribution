package typings.postcss

import typings.postcss.atRuleMod.AtRuleRaws
import typings.postcss.commentMod.CommentRaws
import typings.postcss.declarationMod.DeclarationRaws
import typings.postcss.mod.SourceMapOptions
import typings.postcss.mod.TransformCallback
import typings.postcss.mod._AcceptedPlugin
import typings.postcss.nodeMod.ChildNode
import typings.postcss.nodeMod.ChildProps
import typings.postcss.nodeMod.Source
import typings.postcss.resultMod.default
import typings.postcss.ruleMod.RuleRaws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Col extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object Col {
    
    inline def apply(col: Double, line: Double): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    extension [Self <: Col](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ default, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ default, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait FnCallOnfinally extends StObject {
    
    def apply(): js.Promise[default] = js.native
    def apply(onfinally: js.Function0[Unit]): js.Promise[default] = js.native
  }
  
  @js.native
  trait FnCallOnrejected extends StObject {
    
    def apply[TResult](): js.Promise[default | TResult] = js.native
    def apply[TResult](onrejected: js.Function1[/* reason */ Any, TResult | js.Thenable[TResult]]): js.Promise[default | TResult] = js.native
  }
  
  /* Inlined std.Partial<postcss.postcss/lib/at-rule.AtRuleProps> */
  trait PartialAtRuleProps extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var nodes: js.UndefOr[js.Array[ChildNode | ChildProps]] = js.undefined
    
    var params: js.UndefOr[String | Double] = js.undefined
    
    var raws: js.UndefOr[AtRuleRaws] = js.undefined
    
    var source: js.UndefOr[Source] = js.undefined
  }
  object PartialAtRuleProps {
    
    inline def apply(): PartialAtRuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAtRuleProps]
    }
    
    extension [Self <: PartialAtRuleProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodes(value: js.Array[ChildNode | ChildProps]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: (ChildNode | ChildProps)*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setParams(value: String | Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRaws(value: AtRuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss.postcss/lib/comment.CommentProps> */
  trait PartialCommentProps extends StObject {
    
    var raws: js.UndefOr[CommentRaws] = js.undefined
    
    var source: js.UndefOr[Source] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PartialCommentProps {
    
    inline def apply(): PartialCommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCommentProps]
    }
    
    extension [Self <: PartialCommentProps](x: Self) {
      
      inline def setRaws(value: CommentRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss.postcss/lib/declaration.DeclarationProps> */
  trait PartialDeclarationProps extends StObject {
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var prop: js.UndefOr[String] = js.undefined
    
    var raws: js.UndefOr[DeclarationRaws] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object PartialDeclarationProps {
    
    inline def apply(): PartialDeclarationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeclarationProps]
    }
    
    extension [Self <: PartialDeclarationProps](x: Self) {
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setRaws(value: DeclarationRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss.postcss/lib/rule.RuleProps> */
  trait PartialRuleProps extends StObject {
    
    var nodes: js.UndefOr[js.Array[ChildNode | ChildProps]] = js.undefined
    
    var raws: js.UndefOr[RuleRaws] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var selectors: js.UndefOr[js.Array[String]] = js.undefined
    
    var source: js.UndefOr[Source] = js.undefined
  }
  object PartialRuleProps {
    
    inline def apply(): PartialRuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRuleProps]
    }
    
    extension [Self <: PartialRuleProps](x: Self) {
      
      inline def setNodes(value: js.Array[ChildNode | ChildProps]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: (ChildNode | ChildProps)*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setRaws(value: RuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /* Inlined std.Pick<postcss.postcss.ProcessOptions, 'map' | 'from'> */
  trait PickProcessOptionsmapfrom extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
  }
  object PickProcessOptionsmapfrom {
    
    inline def apply(): PickProcessOptionsmapfrom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickProcessOptionsmapfrom]
    }
    
    extension [Self <: PickProcessOptionsmapfrom](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  /* Inlined std.Pick<postcss.postcss/lib/warning.WarningOptions, 'word' | 'index'> */
  trait PickWarningOptionswordind extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var word: js.UndefOr[String] = js.undefined
  }
  object PickWarningOptionswordind {
    
    inline def apply(): PickWarningOptionswordind = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickWarningOptionswordind]
    }
    
    extension [Self <: PickWarningOptionswordind](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  /* Inlined std.Pick<postcss.postcss/lib/warning.WarningOptions, 'word' | 'index' | 'endIndex'> */
  trait PickWarningOptionswordindEndIndex extends StObject {
    
    var endIndex: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var word: js.UndefOr[String] = js.undefined
  }
  object PickWarningOptionswordindEndIndex {
    
    inline def apply(): PickWarningOptionswordindEndIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickWarningOptionswordindEndIndex]
    }
    
    extension [Self <: PickWarningOptionswordindEndIndex](x: Self) {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  trait Postcss
    extends StObject
       with _AcceptedPlugin {
    
    var postcss: TransformCallback | typings.postcss.processorMod.default
  }
  object Postcss {
    
    inline def apply(postcss: TransformCallback | typings.postcss.processorMod.default): Postcss = {
      val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
      __obj.asInstanceOf[Postcss]
    }
    
    extension [Self <: Postcss](x: Self) {
      
      inline def setPostcss(value: TransformCallback | typings.postcss.processorMod.default): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
      
      inline def setPostcssFunction2(
        value: (/* root */ typings.postcss.rootMod.default, /* result */ default) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "postcss", js.Any.fromFunction2(value))
    }
  }
  
  trait Raw extends StObject {
    
    var raw: String
    
    var value: String
  }
  object Raw {
    
    inline def apply(raw: String, value: String): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    extension [Self <: Raw](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToString extends StObject
}
