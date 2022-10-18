package typings.phenomnomnominalTsquery

import org.scalablytyped.runtime.StringDictionary
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Equalssign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.ExclamationmarkEqualssign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Greaterthansign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.GreaterthansignEqualssign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Lessthansign
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.LessthansignEqualssign
import typings.typescript.mod.Node
import typings.typescript.mod.ScriptKind
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.VisitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTsqueryTypesMod {
  
  @js.native
  trait TSQueryApi extends StObject {
    
    def apply[T /* <: Node */](ast: String, selector: String): js.Array[T] = js.native
    def apply[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = js.native
    def apply[T /* <: Node */](ast: Node, selector: String): js.Array[T] = js.native
    def apply[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = js.native
    
    def ast(source: String): SourceFile = js.native
    def ast(source: String, fileName: String): SourceFile = js.native
    def ast(source: String, fileName: String, scriptKind: ScriptKind): SourceFile = js.native
    def ast(source: String, fileName: Unit, scriptKind: ScriptKind): SourceFile = js.native
    
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
  
  type TSQueryAttributeOperator = js.Function3[/* obj */ Any, /* value */ Any, /* type */ TSQueryAttributeOperatorType, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.regexp
    - typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.literal
    - typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.`type`
  */
  trait TSQueryAttributeOperatorType extends StObject
  object TSQueryAttributeOperatorType {
    
    inline def literal: typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.literal = "literal".asInstanceOf[typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.literal]
    
    inline def regexp: typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.regexp = "regexp".asInstanceOf[typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.regexp]
    
    inline def `type`: typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.`type` = "type".asInstanceOf[typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.`type`]
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
  
  type TSQueryNodeTransformer = js.Function1[/* node */ Node, VisitResult[Node]]
  
  trait TSQueryOptions extends StObject {
    
    var visitAllChildren: js.UndefOr[Boolean] = js.undefined
  }
  object TSQueryOptions {
    
    inline def apply(): TSQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TSQueryOptions]
    }
    
    extension [Self <: TSQueryOptions](x: Self) {
      
      inline def setVisitAllChildren(value: Boolean): Self = StObject.set(x, "visitAllChildren", value.asInstanceOf[js.Any])
      
      inline def setVisitAllChildrenUndefined: Self = StObject.set(x, "visitAllChildren", js.undefined)
    }
  }
  
  trait TSQueryProperties extends StObject {
    
    var kindName: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var text: String
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object TSQueryProperties {
    
    inline def apply(kindName: String, text: String): TSQueryProperties = {
      val __obj = js.Dynamic.literal(kindName = kindName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSQueryProperties]
    }
    
    extension [Self <: TSQueryProperties](x: Self) {
      
      inline def setKindName(value: String): Self = StObject.set(x, "kindName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TSQuerySelectorNode
    extends StObject
       with /* key */ StringDictionary[
          TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | js.RegExp | Boolean | Double | String
        ] {
    
    var index: TSQuerySelectorNode
    
    var left: TSQuerySelectorNode
    
    var name: String
    
    var operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign
    
    var right: TSQuerySelectorNode
    
    var selectors: js.Array[TSQuerySelectorNode]
    
    var subject: Boolean
    
    var `type`: TSQueryAttributeOperatorType
    
    var value: TSQuerySelectorNode | js.RegExp | Double | String
  }
  object TSQuerySelectorNode {
    
    inline def apply(
      index: TSQuerySelectorNode,
      left: TSQuerySelectorNode,
      name: String,
      operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign,
      right: TSQuerySelectorNode,
      selectors: js.Array[TSQuerySelectorNode],
      subject: Boolean,
      `type`: TSQueryAttributeOperatorType,
      value: TSQuerySelectorNode | js.RegExp | Double | String
    ): TSQuerySelectorNode = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSQuerySelectorNode]
    }
    
    extension [Self <: TSQuerySelectorNode](x: Self) {
      
      inline def setIndex(value: TSQuerySelectorNode): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: TSQuerySelectorNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOperator(
        value: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign
      ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setRight(value: TSQuerySelectorNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setSelectors(value: js.Array[TSQuerySelectorNode]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsVarargs(value: TSQuerySelectorNode*): Self = StObject.set(x, "selectors", js.Array(value*))
      
      inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setType(value: TSQueryAttributeOperatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TSQuerySelectorNode | js.RegExp | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
