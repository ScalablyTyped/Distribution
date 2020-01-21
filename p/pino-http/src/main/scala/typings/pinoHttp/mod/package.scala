package typings.pinoHttp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenReqId = js.Function1[/* req */ typings.node.httpMod.IncomingMessage, typings.pinoHttp.mod.ReqId]
  type HttpLogger = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  type ReqId = scala.Double | java.lang.String | js.Object
}
