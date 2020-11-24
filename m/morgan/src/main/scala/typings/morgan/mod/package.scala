package typings.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FormatFn[Request /* <: typings.node.httpMod.IncomingMessage */, Response /* <: typings.node.httpMod.ServerResponse */] = js.Function3[
    /* tokens */ typings.morgan.mod.TokenIndexer[Request, Response], 
    /* req */ Request, 
    /* res */ Response, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  
  type Handler[Request /* <: typings.node.httpMod.IncomingMessage */, Response /* <: typings.node.httpMod.ServerResponse */] = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* callback */ js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit], 
    scala.Unit
  ]
  
  type TokenCallbackFn[Request /* <: typings.node.httpMod.IncomingMessage */, Response /* <: typings.node.httpMod.ServerResponse */] = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    js.UndefOr[java.lang.String]
  ]
  
  type TokenIndexer[Request /* <: typings.node.httpMod.IncomingMessage */, Response /* <: typings.node.httpMod.ServerResponse */] = org.scalablytyped.runtime.StringDictionary[typings.morgan.mod.TokenCallbackFn[Request, Response]]
}
