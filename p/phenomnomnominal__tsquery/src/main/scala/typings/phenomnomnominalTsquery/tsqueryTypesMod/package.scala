package typings.phenomnomnominalTsquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tsqueryTypesMod {
  type TSQueryAttributeOperator = js.Function3[
    /* obj */ js.Any, 
    /* value */ js.Any, 
    /* type */ typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryAttributeOperatorType, 
    scala.Boolean
  ]
  type TSQueryAttributeOperators = org.scalablytyped.runtime.StringDictionary[typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryAttributeOperator]
  type TSQueryMatcher = js.Function4[
    /* node */ typings.typescript.mod.Node, 
    /* selector */ typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode, 
    /* ancestry */ js.Array[typings.typescript.mod.Node], 
    /* options */ typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions, 
    scala.Boolean
  ]
  type TSQueryMatchers = org.scalablytyped.runtime.StringDictionary[typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryMatcher]
  type TSQueryNodeTransformer = js.Function1[
    /* node */ typings.typescript.mod.Node, 
    js.UndefOr[typings.typescript.mod.Node | scala.Null]
  ]
  type TSQueryStringTransformer = js.Function1[/* node */ typings.typescript.mod.Node, js.UndefOr[java.lang.String | scala.Null]]
}
