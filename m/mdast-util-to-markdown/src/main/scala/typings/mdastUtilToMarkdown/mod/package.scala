package typings.mdastUtilToMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handle = js.Function4[
    /* node */ typings.unist.mod.Node, 
    /* parent */ js.UndefOr[typings.unist.mod.Parent | scala.Null], 
    /* context */ typings.mdastUtilToMarkdown.mod.Context, 
    /* safeOptions */ typings.mdastUtilToMarkdown.mod.SafeOptions, 
    java.lang.String
  ]
  
  type Handlers = org.scalablytyped.runtime.StringDictionary[typings.mdastUtilToMarkdown.mod.Handler]
  
  type Join = js.Function4[
    /* left */ typings.unist.mod.Node, 
    /* right */ typings.unist.mod.Node, 
    /* parent */ typings.unist.mod.Parent, 
    /* context */ typings.mdastUtilToMarkdown.mod.Context, 
    scala.Boolean | scala.Null | scala.Unit
  ]
}
