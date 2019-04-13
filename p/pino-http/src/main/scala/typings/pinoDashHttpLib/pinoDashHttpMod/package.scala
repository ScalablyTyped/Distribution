package typings
package pinoDashHttpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoDashHttpMod {
  type GenReqId = js.Function1[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    scala.Double | java.lang.String | js.Object
  ]
  type HttpLogger = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    scala.Unit
  ]
}
