package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.atRuleMod.AtRuleProps
import typings.postcss.commentMod.CommentProps
import typings.postcss.declarationMod.DeclarationProps
import typings.postcss.mod.^
import typings.postcss.nodeMod.AnyNode
import typings.postcss.postcssStrings.end
import typings.postcss.postcssStrings.start
import typings.postcss.rootMod.RootProps
import typings.postcss.ruleMod.RuleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def atRule: js.Function1[/* defaults */ js.UndefOr[AtRuleProps], typings.postcss.atRuleMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("atRule").asInstanceOf[js.Function1[/* defaults */ js.UndefOr[AtRuleProps], typings.postcss.atRuleMod.default]]

inline def comment: js.Function1[/* defaults */ js.UndefOr[CommentProps], typings.postcss.commentMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("comment").asInstanceOf[js.Function1[/* defaults */ js.UndefOr[CommentProps], typings.postcss.commentMod.default]]

inline def decl: js.Function1[
/* defaults */ js.UndefOr[DeclarationProps], 
typings.postcss.declarationMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("decl").asInstanceOf[js.Function1[
/* defaults */ js.UndefOr[DeclarationProps], 
typings.postcss.declarationMod.default]]

inline def fromJSON: JSONHydrator = ^.asInstanceOf[js.Dynamic].selectDynamic("fromJSON").asInstanceOf[JSONHydrator]

inline def list: typings.postcss.listMod.List = ^.asInstanceOf[js.Dynamic].selectDynamic("list").asInstanceOf[typings.postcss.listMod.List]

inline def parse: Parser[typings.postcss.rootMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("parse").asInstanceOf[Parser[typings.postcss.rootMod.default]]

inline def root: js.Function1[/* defaults */ js.UndefOr[RootProps], typings.postcss.rootMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("root").asInstanceOf[js.Function1[/* defaults */ js.UndefOr[RootProps], typings.postcss.rootMod.default]]

inline def rule: js.Function1[/* defaults */ js.UndefOr[RuleProps], typings.postcss.ruleMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("rule").asInstanceOf[js.Function1[/* defaults */ js.UndefOr[RuleProps], typings.postcss.ruleMod.default]]

inline def stringify: Stringifier = ^.asInstanceOf[js.Dynamic].selectDynamic("stringify").asInstanceOf[Stringifier]

/* Rewritten from type alias, can be one of: 
  - typings.postcss.mod.Plugin
  - typings.postcss.mod.PluginCreator[scala.Any]
  - typings.postcss.mod.OldPlugin[scala.Any]
  - typings.postcss.mod.TransformCallback
  - typings.postcss.anon.Postcss
  - typings.postcss.processorMod.default
*/
type AcceptedPlugin = _AcceptedPlugin | PluginCreator[Any] | OldPlugin[Any] | TransformCallback

type AtRuleProcessor = js.Function2[
/* atRule */ typings.postcss.atRuleMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type Builder = js.Function3[
/* part */ String, 
/* node */ js.UndefOr[AnyNode], 
/* type */ js.UndefOr[start | end], 
Unit]

type CommentProcessor = js.Function2[
/* comment */ typings.postcss.commentMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type DeclarationProcessor = js.Function2[
/* decl */ typings.postcss.declarationMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type DocumentProcessor = js.Function2[
/* document */ typings.postcss.documentMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type Parser[RootNode] = js.Function2[
/* css */ String | ToString, 
/* opts */ js.UndefOr[PickProcessOptionsmapfrom], 
RootNode]

type RootProcessor = js.Function2[
/* root */ typings.postcss.rootMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type RuleProcessor = js.Function2[
/* rule */ typings.postcss.ruleMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type Stringifier = js.Function2[/* node */ AnyNode, /* builder */ Builder, Unit]

type TransformCallback = js.Function2[
/* root */ typings.postcss.rootMod.default, 
/* result */ typings.postcss.resultMod.default, 
js.Promise[Unit] | Unit]
