package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.every
import typings.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.some
import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matches_every(modifier: every): js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matches")(modifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ]]
  
  inline def matches_some(modifier: some): js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("matches")(modifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ]]
}
