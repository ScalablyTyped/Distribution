package typings.atPhenomnomnominalTsquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcTsqueryDashTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.typescript.typescriptMod.Node

  type TSQueryAttributeOperator = js.Function3[/* obj */ js.Any, /* value */ js.Any, /* type */ TSQueryAttributeOperatorType, Boolean]
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
  type TSQueryStringTransformer = js.Function1[/* node */ Node, js.UndefOr[String | Null]]
}
