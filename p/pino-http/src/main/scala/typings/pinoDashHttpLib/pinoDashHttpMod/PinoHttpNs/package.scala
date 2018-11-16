package typings
package pinoDashHttpLib.pinoDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PinoHttpNs {
  type HttpLogger = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    scala.Unit
  ]
}
