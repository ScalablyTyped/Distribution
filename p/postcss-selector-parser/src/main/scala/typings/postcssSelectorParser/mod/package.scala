package typings.postcssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias postcss-selector-parser.postcss-selector-parser.Selector */ js.Object
  ]
  
  /** Accepts a string  */
  type Selectors = java.lang.String | typings.postcssSelectorParser.mod.PostCSSRuleNode
  
  type SyncProcessor[Transform] = typings.postcssSelectorParser.mod.ProcessorFn[Transform]
}
