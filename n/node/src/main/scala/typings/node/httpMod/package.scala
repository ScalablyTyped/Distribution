package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object httpMod {
  
  // outgoing headers allows numbers (as they are converted internally to strings)
  type OutgoingHttpHeader = scala.Double | java.lang.String | js.Array[java.lang.String]
  
  type OutgoingHttpHeaders = typings.node.NodeJS.Dict[typings.node.httpMod.OutgoingHttpHeader]
  
  type RequestListener = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  
  // although RequestOptions are passed as ClientRequestArgs to ClientRequest directly,
  // create interface RequestOptions would make the naming more clear to developers
  type RequestOptions = typings.node.httpMod.ClientRequestArgs
}
