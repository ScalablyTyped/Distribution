package typings.postcssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncProcessor[Transform] = typings.postcssSelectorParser.mod.ProcessorFn[js.Thenable[Transform]]
  type ProcessorFn[ReturnType] = js.Function1[/* root */ typings.postcssSelectorParser.mod.Root_, ReturnType]
  /* Rewritten from type alias, can be one of: 
    - typings.postcssSelectorParser.postcssSelectorParserStrings.Quotationmark
    - typings.postcssSelectorParser.postcssSelectorParserStrings.Apostrophe
    - scala.Null
  */
  type QuoteMark = typings.postcssSelectorParser.mod._QuoteMark | scala.Null
  /** Accepts a string  */
  type Selectors = java.lang.String | typings.postcssSelectorParser.mod.PostCSSRuleNode
  type SyncProcessor[Transform] = typings.postcssSelectorParser.mod.ProcessorFn[Transform]
}
