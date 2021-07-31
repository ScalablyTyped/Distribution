package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// TODO: Conditional types in TS 1.8 will really clean this up.
@scala.inline
def apply(): typings.postcssSelectorParser.mod.Processor[scala.Nothing, typings.postcssSelectorParser.mod.Selectors] = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.postcssSelectorParser.mod.Processor[scala.Nothing, typings.postcssSelectorParser.mod.Selectors]]
@scala.inline
def apply(
  processor: typings.postcssSelectorParser.mod.AsyncProcessor[scala.Unit] | typings.postcssSelectorParser.mod.SyncProcessor[scala.Unit]
): typings.postcssSelectorParser.mod.Processor[scala.Nothing, scala.Nothing] = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].apply(processor.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Processor[scala.Nothing, scala.Nothing]]

@scala.inline
def ATTRIBUTE: typings.postcssSelectorParser.postcssSelectorParserStrings.attribute = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ATTRIBUTE").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.attribute]

@scala.inline
def CLASS: typings.postcssSelectorParser.postcssSelectorParserStrings.`class` = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CLASS").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.`class`]

@scala.inline
def COMBINATOR: typings.postcssSelectorParser.postcssSelectorParserStrings.combinator = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("COMBINATOR").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.combinator]

@scala.inline
def COMMENT: typings.postcssSelectorParser.postcssSelectorParserStrings.comment = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("COMMENT").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.comment]

@scala.inline
def ID_ : typings.postcssSelectorParser.postcssSelectorParserStrings.id = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ID").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.id]

@scala.inline
def NESTING: typings.postcssSelectorParser.postcssSelectorParserStrings.nesting = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NESTING").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.nesting]

@scala.inline
def PSEUDO: typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PSEUDO").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo]

@scala.inline
def ROOT: typings.postcssSelectorParser.postcssSelectorParserStrings.root = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ROOT").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.root]

@scala.inline
def SELECTOR: typings.postcssSelectorParser.postcssSelectorParserStrings.selector = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SELECTOR").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.selector]

@scala.inline
def STRING: typings.postcssSelectorParser.postcssSelectorParserStrings.string = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("STRING").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.string]

@scala.inline
def TAG: typings.postcssSelectorParser.postcssSelectorParserStrings.tag = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TAG").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.tag]

@scala.inline
def UNIVERSAL: typings.postcssSelectorParser.postcssSelectorParserStrings.universal = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].selectDynamic("UNIVERSAL").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.universal]

@scala.inline
def attribute(opts: typings.postcssSelectorParser.mod.AttributeOptions): typings.postcssSelectorParser.mod.Attribute_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Attribute_]

@scala.inline
def className(opts: typings.postcssSelectorParser.mod.NamespaceOptions[java.lang.String]): typings.postcssSelectorParser.mod.ClassName_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("className")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.ClassName_]

@scala.inline
def combinator(opts: typings.postcssSelectorParser.mod.NodeOptions[java.lang.String]): typings.postcssSelectorParser.mod.Combinator_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combinator")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Combinator_]

@scala.inline
def comment(opts: typings.postcssSelectorParser.mod.NodeOptions[java.lang.String]): typings.postcssSelectorParser.mod.Comment_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("comment")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Comment_]

@scala.inline
def id(opts: js.Any): js.Any = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("id")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def isAttribute(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Attribute */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Attribute */ scala.Boolean]

@scala.inline
def isClassName(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.ClassName */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isClassName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.ClassName */ scala.Boolean]

@scala.inline
def isCombinator(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Combinator */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCombinator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Combinator */ scala.Boolean]

@scala.inline
def isComment(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Comment */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Comment */ scala.Boolean]

@scala.inline
def isContainer(node: js.Any): scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isContainer")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isIdentifier(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Identifier */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Identifier */ scala.Boolean]

@scala.inline
def isNamespace(node: js.Any): scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNamespace")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isNesting(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Nesting */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNesting")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Nesting */ scala.Boolean]

@scala.inline
def isNode(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Node */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Node */ scala.Boolean]

/**
  * Checks wether the node is the Psuedo subtype of node.
  */
@scala.inline
def isPseudo(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPseudo")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean]

/**
  * Checks wether the node is, specifically, a pseudo class instead of
  * pseudo element.
  */
@scala.inline
def isPseudoClass(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPseudoClass")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean]

/**
  * Checks wether the node is, specifically, a pseudo element instead of
  * pseudo class.
  */
@scala.inline
def isPseudoElement(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPseudoElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ scala.Boolean]

@scala.inline
def isRoot(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Root */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Root */ scala.Boolean]

@scala.inline
def isSelector(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Selector */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSelector")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Selector */ scala.Boolean]

@scala.inline
def isString(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.String */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isString")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.String */ scala.Boolean]

@scala.inline
def isTag(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Tag */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Tag */ scala.Boolean]

@scala.inline
def isUniversal(node: js.Any): /* is postcss-selector-parser.postcss-selector-parser.Universal */ scala.Boolean = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isUniversal")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Universal */ scala.Boolean]

@scala.inline
def nesting(opts: js.Any): js.Any = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nesting")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def pseudo(opts: typings.postcssSelectorParser.mod.ContainerOptions): typings.postcssSelectorParser.mod.Pseudo_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudo")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Pseudo_]

@scala.inline
def root(opts: typings.postcssSelectorParser.mod.ContainerOptions): typings.postcssSelectorParser.mod.Root_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("root")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Root_]

@scala.inline
def selector(opts: typings.postcssSelectorParser.mod.ContainerOptions): typings.postcssSelectorParser.mod.Selector_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("selector")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Selector_]

@scala.inline
def string(opts: typings.postcssSelectorParser.mod.NodeOptions[java.lang.String]): typings.postcssSelectorParser.mod.String_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("string")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.String_]

@scala.inline
def tag(opts: typings.postcssSelectorParser.mod.NamespaceOptions[java.lang.String]): typings.postcssSelectorParser.mod.Tag_ = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tag")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.postcssSelectorParser.mod.Tag_]

@scala.inline
def universal(): js.Any = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("universal")().asInstanceOf[js.Any]
@scala.inline
def universal(opts: typings.postcssSelectorParser.mod.NamespaceOptions[java.lang.String]): js.Any = typings.postcssSelectorParser.mod.^.asInstanceOf[js.Dynamic].applyDynamic("universal")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]

type AsyncProcessor[Transform] = typings.postcssSelectorParser.mod.ProcessorFn[js.Thenable[Transform]]

// A type that's T but not U.
type Diff[T, U] = T

type ProcessorFn[ReturnType] = js.Function1[/* root */ typings.postcssSelectorParser.mod.Root_, ReturnType]

/* Rewritten from type alias, can be one of: 
  - typings.postcssSelectorParser.postcssSelectorParserStrings.Quotationmark
  - typings.postcssSelectorParser.postcssSelectorParserStrings.Apostrophe
  - scala.Null
*/
type QuoteMark = typings.postcssSelectorParser.mod._QuoteMark | scala.Null

type Selector_ = typings.postcssSelectorParser.mod._Selector[
/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias postcss-selector-parser.postcss-selector-parser.Selector */ js.Object]

/** Accepts a string  */
type Selectors = java.lang.String | typings.postcssSelectorParser.mod.PostCSSRuleNode

type SyncProcessor[Transform] = typings.postcssSelectorParser.mod.ProcessorFn[Transform]
