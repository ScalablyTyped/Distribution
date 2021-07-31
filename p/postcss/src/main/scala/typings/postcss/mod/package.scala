package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @param plugins Can also be included with the Processor#use method.
  * @returns A processor that will apply plugins as CSS processors.
  */
@scala.inline
def apply(): typings.postcss.mod.Processor = typings.postcss.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.postcss.mod.Processor]
@scala.inline
def apply(plugins: typings.postcss.mod.AcceptedPlugin*): typings.postcss.mod.Processor = typings.postcss.mod.^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.Processor]
@scala.inline
def apply(plugins: js.Array[typings.postcss.mod.AcceptedPlugin]): typings.postcss.mod.Processor = typings.postcss.mod.^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.Processor]

/**
  * Creates a new AtRule node.
  * @param defaults Properties for the new AtRule node.
  * @returns The new node.
  */
@scala.inline
def atRule(): typings.postcss.mod.AtRule_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("atRule")().asInstanceOf[typings.postcss.mod.AtRule_]
@scala.inline
def atRule(defaults: typings.postcss.mod.AtRuleNewProps): typings.postcss.mod.AtRule_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("atRule")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.AtRule_]

/**
  * Creates a new Comment node.
  * @param defaults Properties for the new Comment node.
  * @returns The new node.
  */
@scala.inline
def comment(): typings.postcss.mod.Comment_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("comment")().asInstanceOf[typings.postcss.mod.Comment_]
@scala.inline
def comment(defaults: typings.postcss.mod.CommentNewProps): typings.postcss.mod.Comment_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("comment")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.Comment_]

/**
  * Creates a new Declaration node.
  * @param defaults Properties for the new Declaration node.
  * @returns The new node.
  */
@scala.inline
def decl(): typings.postcss.mod.Declaration = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decl")().asInstanceOf[typings.postcss.mod.Declaration]
@scala.inline
def decl(defaults: typings.postcss.mod.DeclarationNewProps): typings.postcss.mod.Declaration = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decl")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.Declaration]

/**
  * Parses source CSS.
  * @param css The CSS to parse.
  * @param options
  * @returns {} A new Root node, which contains the source CSS nodes.
  */
@scala.inline
def parse: typings.postcss.mod.Parser = typings.postcss.mod.^.asInstanceOf[js.Dynamic].selectDynamic("parse").asInstanceOf[typings.postcss.mod.Parser]

/**
  * Creates a PostCSS plugin with a standard API.
  * @param name Plugin name. Same as in name property in package.json. It will
  * be saved in plugin.postcssPlugin property.
  * @param initializer Will receive plugin options and should return functions
  * to modify nodes in input CSS.
  */
@scala.inline
def plugin[T](name: java.lang.String, initializer: typings.postcss.mod.PluginInitializer[T]): typings.postcss.mod.Plugin_[T] = (typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(name.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[typings.postcss.mod.Plugin_[T]]

/**
  * Creates a new Root node.
  * @param defaults Properties for the new Root node.
  * @returns The new node.
  */
@scala.inline
def root(): typings.postcss.mod.Root_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[typings.postcss.mod.Root_]
@scala.inline
def root(defaults: js.Object): typings.postcss.mod.Root_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("root")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.Root_]

/**
  * Creates a new Rule node.
  * @param defaults Properties for the new Rule node.
  * @returns The new node.
  */
@scala.inline
def rule(): typings.postcss.mod.Rule_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rule")().asInstanceOf[typings.postcss.mod.Rule_]
@scala.inline
def rule(defaults: typings.postcss.mod.RuleNewProps): typings.postcss.mod.Rule_ = typings.postcss.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rule")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.mod.Rule_]

/**
  * Default function to convert a node tree into a CSS string.
  */
@scala.inline
def stringify: typings.postcss.mod.Stringifier = typings.postcss.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stringify").asInstanceOf[typings.postcss.mod.Stringifier]

/* Rewritten from type alias, can be one of: 
  - typings.postcss.mod.Plugin_[js.Any]
  - typings.postcss.mod.Transformer
  - typings.postcss.anon.Postcss
  - typings.postcss.mod.Processor
*/
type AcceptedPlugin = typings.postcss.mod._AcceptedPlugin | typings.postcss.mod.Plugin_[js.Any]

type Builder = js.Function3[
/* part */ java.lang.String, 
/* node */ js.UndefOr[typings.postcss.mod.Node], 
/* type */ js.UndefOr[typings.postcss.postcssStrings.start | typings.postcss.postcssStrings.end], 
scala.Unit]

type JsonComment = typings.postcss.mod.JsonNode

type JsonRoot = typings.postcss.mod.JsonContainer

type Parser = js.Function2[
/* css */ typings.postcss.mod.ParserInput, 
/* opts */ js.UndefOr[typings.postcss.anon.PickProcessOptionsmapfrom], 
typings.postcss.mod.Root_]

type ParserInput = java.lang.String | typings.postcss.anon.ToString

type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], typings.postcss.mod.Transformer]

type RootNewProps = typings.postcss.mod.ContainerNewProps

type Stringifier = js.Function2[
/* node */ typings.postcss.mod.Node, 
/* builder */ typings.postcss.mod.Builder, 
scala.Unit]

type TransformCallback = js.Function2[
/* root */ typings.postcss.mod.Root_, 
/* result */ typings.postcss.mod.Result, 
js.Promise[js.Any] | js.Any]
