package typings.phenomnomnominalTsquery

import org.scalablytyped.runtime.StringDictionary
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Equalssign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.ExclamationmarkEqualssign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Greaterthansign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.GreaterthansignEqualssign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Lessthansign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.LessthansignEqualssign
import typings.std.RegExp
import typings.typescript.mod.Node
import typings.typescript.mod.ScriptKind
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsqueryTypesMod {
  
  @js.native
  trait TSQueryApi extends StObject {
    
    def apply[T /* <: Node */](ast: String, selector: String): js.Array[T] = js.native
    def apply[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = js.native
    def apply[T /* <: Node */](ast: Node, selector: String): js.Array[T] = js.native
    def apply[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = js.native
    
    def ast(source: String): SourceFile = js.native
    def ast(source: String, fileName: js.UndefOr[scala.Nothing], scriptKind: ScriptKind): SourceFile = js.native
    def ast(source: String, fileName: String): SourceFile = js.native
    def ast(source: String, fileName: String, scriptKind: ScriptKind): SourceFile = js.native
    
    def map(ast: SourceFile, selector: String, nodeTransformer: TSQueryNodeTransformer): SourceFile = js.native
    def map(
      ast: SourceFile,
      selector: String,
      nodeTransformer: TSQueryNodeTransformer,
      options: TSQueryOptions
    ): SourceFile = js.native
    
    def `match`[T /* <: Node */](ast: Node, selector: TSQuerySelectorNode): js.Array[T] = js.native
    def `match`[T /* <: Node */](ast: Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = js.native
    
    def parse(selector: String): TSQuerySelectorNode = js.native
    def parse(selector: String, options: TSQueryOptions): TSQuerySelectorNode = js.native
    
    def project(configFilePath: String): js.Array[SourceFile] = js.native
    
    def projectFiles(configFilePath: String): js.Array[String] = js.native
    
    def query[T /* <: Node */](ast: String, selector: String): js.Array[T] = js.native
    def query[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = js.native
    def query[T /* <: Node */](ast: Node, selector: String): js.Array[T] = js.native
    def query[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = js.native
    
    def replace(source: String, selector: String, stringTransformer: TSQueryStringTransformer): String = js.native
    def replace(
      source: String,
      selector: String,
      stringTransformer: TSQueryStringTransformer,
      options: TSQueryOptions
    ): String = js.native
    
    def syntaxKindName(node: SyntaxKind): String = js.native
  }
  
  type TSQueryAttributeOperator = js.Function3[/* obj */ js.Any, /* value */ js.Any, /* type */ TSQueryAttributeOperatorType, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.regexp
    - typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.literal
    - typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.`type`
  */
  trait TSQueryAttributeOperatorType extends StObject
  object TSQueryAttributeOperatorType {
    
    @scala.inline
    def literal: typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.literal = "literal".asInstanceOf[typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.literal]
    
    @scala.inline
    def regexp: typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.regexp = "regexp".asInstanceOf[typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.regexp]
    
    @scala.inline
    def `type`: typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.`type` = "type".asInstanceOf[typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.`type`]
  }
  
  type TSQueryAttributeOperators = StringDictionary[TSQueryAttributeOperator]
  
  type TSQueryMatcher = js.Function4[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    /* options */ TSQueryOptions, 
    Boolean
  ]
  
  type TSQueryMatchers = StringDictionary[TSQueryMatcher]
  
  type TSQueryNodeTransformer = js.Function1[/* node */ Node, js.UndefOr[Node | Null]]
  
  @js.native
  trait TSQueryOptions extends StObject {
    
    var visitAllChildren: js.UndefOr[Boolean] = js.native
  }
  object TSQueryOptions {
    
    @scala.inline
    def apply(): TSQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TSQueryOptions]
    }
    
    @scala.inline
    implicit class TSQueryOptionsMutableBuilder[Self <: TSQueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisitAllChildren(value: Boolean): Self = StObject.set(x, "visitAllChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitAllChildrenUndefined: Self = StObject.set(x, "visitAllChildren", js.undefined)
    }
  }
  
  @js.native
  trait TSQueryProperties extends StObject {
    
    var kindName: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var text: String = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object TSQueryProperties {
    
    @scala.inline
    def apply(kindName: String, text: String): TSQueryProperties = {
      val __obj = js.Dynamic.literal(kindName = kindName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSQueryProperties]
    }
    
    @scala.inline
    implicit class TSQueryPropertiesMutableBuilder[Self <: TSQueryProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKindName(value: String): Self = StObject.set(x, "kindName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TSQuerySelectorNode
    extends /* key */ StringDictionary[
          TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | RegExp | Boolean | Double | String
        ] {
    
    var index: TSQuerySelectorNode = js.native
    
    var left: TSQuerySelectorNode = js.native
    
    var name: String = js.native
    
    var operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign = js.native
    
    var right: TSQuerySelectorNode = js.native
    
    var selectors: js.Array[TSQuerySelectorNode] = js.native
    
    var subject: Boolean = js.native
    
    var `type`: TSQueryAttributeOperatorType = js.native
    
    var value: TSQuerySelectorNode | RegExp | Double | String = js.native
  }
  object TSQuerySelectorNode {
    
    @scala.inline
    def apply(
      index: TSQuerySelectorNode,
      left: TSQuerySelectorNode,
      name: String,
      operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign,
      right: TSQuerySelectorNode,
      selectors: js.Array[TSQuerySelectorNode],
      subject: Boolean,
      `type`: TSQueryAttributeOperatorType,
      value: TSQuerySelectorNode | RegExp | Double | String
    ): TSQuerySelectorNode = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSQuerySelectorNode]
    }
    
    @scala.inline
    implicit class TSQuerySelectorNodeMutableBuilder[Self <: TSQuerySelectorNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: TSQuerySelectorNode): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: TSQuerySelectorNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(
        value: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign
      ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: TSQuerySelectorNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectors(value: js.Array[TSQuerySelectorNode]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsVarargs(value: TSQuerySelectorNode*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      @scala.inline
      def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TSQueryAttributeOperatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TSQuerySelectorNode | RegExp | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TSQueryStringTransformer = js.Function1[/* node */ Node, js.UndefOr[String | Null]]
  
  @js.native
  trait TSQueryTraverseOptions extends StObject {
    
    def enter(node: Node): Unit = js.native
    def enter(node: Node, parent: Node): Unit = js.native
    
    def leave(node: Node): Unit = js.native
    def leave(node: Node, parent: Node): Unit = js.native
    
    var visitAllChildren: Boolean = js.native
  }
}
