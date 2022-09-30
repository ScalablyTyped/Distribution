package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.mod.^
import typings.postcssSelectorParser.postcssSelectorParserStrings.Quotationmark
import typings.postcssSelectorParser.postcssSelectorParserStrings.`class`
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// TODO: Conditional types in TS 1.8 will really clean this up.
inline def apply(): Processor[scala.Nothing, Selectors] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Processor[scala.Nothing, Selectors]]
inline def apply(processor: AsyncProcessor[Unit] | SyncProcessor[Unit]): Processor[scala.Nothing, scala.Nothing] = ^.asInstanceOf[js.Dynamic].apply(processor.asInstanceOf[js.Any]).asInstanceOf[Processor[scala.Nothing, scala.Nothing]]

inline def ATTRIBUTE__ : typings.postcssSelectorParser.postcssSelectorParserStrings.attribute = ^.asInstanceOf[js.Dynamic].selectDynamic("ATTRIBUTE").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.attribute]

inline def CLASS: `class` = ^.asInstanceOf[js.Dynamic].selectDynamic("CLASS").asInstanceOf[`class`]

inline def COMBINATOR__ : typings.postcssSelectorParser.postcssSelectorParserStrings.combinator = ^.asInstanceOf[js.Dynamic].selectDynamic("COMBINATOR").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.combinator]

inline def COMMENT__ : typings.postcssSelectorParser.postcssSelectorParserStrings.comment = ^.asInstanceOf[js.Dynamic].selectDynamic("COMMENT").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.comment]

inline def ID_ : typings.postcssSelectorParser.postcssSelectorParserStrings.id = ^.asInstanceOf[js.Dynamic].selectDynamic("ID").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.id]

inline def NESTING__ : typings.postcssSelectorParser.postcssSelectorParserStrings.nesting = ^.asInstanceOf[js.Dynamic].selectDynamic("NESTING").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.nesting]

inline def PSEUDO__ : typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo = ^.asInstanceOf[js.Dynamic].selectDynamic("PSEUDO").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo]

inline def ROOT__ : typings.postcssSelectorParser.postcssSelectorParserStrings.root = ^.asInstanceOf[js.Dynamic].selectDynamic("ROOT").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.root]

inline def SELECTOR__ : typings.postcssSelectorParser.postcssSelectorParserStrings.selector = ^.asInstanceOf[js.Dynamic].selectDynamic("SELECTOR").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.selector]

inline def STRING__ : typings.postcssSelectorParser.postcssSelectorParserStrings.string = ^.asInstanceOf[js.Dynamic].selectDynamic("STRING").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.string]

inline def TAG__ : typings.postcssSelectorParser.postcssSelectorParserStrings.tag = ^.asInstanceOf[js.Dynamic].selectDynamic("TAG").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.tag]

inline def UNIVERSAL__ : typings.postcssSelectorParser.postcssSelectorParserStrings.universal = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIVERSAL").asInstanceOf[typings.postcssSelectorParser.postcssSelectorParserStrings.universal]

inline def attribute(opts: AttributeOptions): Attribute_ = ^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(opts.asInstanceOf[js.Any]).asInstanceOf[Attribute_]

inline def className(opts: NamespaceOptions[String]): ClassName_ = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(opts.asInstanceOf[js.Any]).asInstanceOf[ClassName_]

inline def combinator(opts: NodeOptions[String]): Combinator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("combinator")(opts.asInstanceOf[js.Any]).asInstanceOf[Combinator_]

inline def comment(opts: NodeOptions[String]): Comment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("comment")(opts.asInstanceOf[js.Any]).asInstanceOf[Comment_]

inline def id(opts: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def isAttribute(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Attribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Attribute */ Boolean]

inline def isClassName(node: Any): /* is postcss-selector-parser.postcss-selector-parser.ClassName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.ClassName */ Boolean]

inline def isCombinator(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Combinator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCombinator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Combinator */ Boolean]

inline def isComment(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Comment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Comment */ Boolean]

inline def isContainer(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContainer")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isIdentifier(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Identifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Identifier */ Boolean]

inline def isNamespace(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespace")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNesting(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Nesting */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNesting")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Nesting */ Boolean]

inline def isNode(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Node */ Boolean]

/**
  * Checks wether the node is the Psuedo subtype of node.
  */
inline def isPseudo(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPseudo")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ Boolean]

/**
  * Checks wether the node is, specifically, a pseudo class instead of
  * pseudo element.
  */
inline def isPseudoClass(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPseudoClass")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ Boolean]

/**
  * Checks wether the node is, specifically, a pseudo element instead of
  * pseudo class.
  */
inline def isPseudoElement(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Pseudo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPseudoElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Pseudo */ Boolean]

inline def isRoot(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Root */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Root */ Boolean]

inline def isSelector(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Selector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelector")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Selector */ Boolean]

inline def isString(node: Any): /* is postcss-selector-parser.postcss-selector-parser.String */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.String */ Boolean]

inline def isTag(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Tag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Tag */ Boolean]

inline def isUniversal(node: Any): /* is postcss-selector-parser.postcss-selector-parser.Universal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUniversal")(node.asInstanceOf[js.Any]).asInstanceOf[/* is postcss-selector-parser.postcss-selector-parser.Universal */ Boolean]

inline def nesting(opts: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("nesting")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def pseudo(opts: ContainerOptions): Pseudo_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudo")(opts.asInstanceOf[js.Any]).asInstanceOf[Pseudo_]

inline def root(opts: ContainerOptions): Root_ = ^.asInstanceOf[js.Dynamic].applyDynamic("root")(opts.asInstanceOf[js.Any]).asInstanceOf[Root_]

inline def selector(opts: ContainerOptions): Selector_ = ^.asInstanceOf[js.Dynamic].applyDynamic("selector")(opts.asInstanceOf[js.Any]).asInstanceOf[Selector_]

inline def string(opts: NodeOptions[String]): String_ = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(opts.asInstanceOf[js.Any]).asInstanceOf[String_]

inline def tag(opts: NamespaceOptions[String]): Tag_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(opts.asInstanceOf[js.Any]).asInstanceOf[Tag_]

inline def universal(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("universal")().asInstanceOf[Any]
inline def universal(opts: NamespaceOptions[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("universal")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]

type AsyncProcessor[Transform] = ProcessorFn[PromiseLike[Transform]]

// A type that's T but not U.
type Diff[T, U] = T

type ProcessorFn[ReturnType] = js.Function1[/* root */ Root_, ReturnType]

type QuoteMark = Quotationmark | String | Null

/** Accepts a string  */
type Selectors = String | PostCSSRuleNode

type SyncProcessor[Transform] = ProcessorFn[Transform]
