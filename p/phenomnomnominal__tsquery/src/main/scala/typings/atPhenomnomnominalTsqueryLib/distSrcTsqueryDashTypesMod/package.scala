package typings
package atPhenomnomnominalTsqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcTsqueryDashTypesMod {
  type TSQueryAttributeOperator = js.Function3[
    /* obj */ js.Any, 
    /* value */ js.Any, 
    /* type */ TSQueryAttributeOperatorType, 
    scala.Boolean
  ]
  type TSQueryAttributeOperators = org.scalablytyped.runtime.StringDictionary[TSQueryAttributeOperator]
  type TSQueryMatcher = js.Function4[
    /* node */ typescriptLib.typescriptMod.Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[typescriptLib.typescriptMod.Node], 
    /* options */ TSQueryOptions, 
    scala.Boolean
  ]
  type TSQueryMatchers = org.scalablytyped.runtime.StringDictionary[TSQueryMatcher]
  type TSQueryNodeTransformer = js.Function1[
    /* node */ typescriptLib.typescriptMod.Node, 
    js.UndefOr[typescriptLib.typescriptMod.Node | scala.Null]
  ]
  type TSQueryStringTransformer = js.Function1[
    /* node */ typescriptLib.typescriptMod.Node, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
}
