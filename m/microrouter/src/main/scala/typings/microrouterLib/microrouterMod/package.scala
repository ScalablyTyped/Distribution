package typings
package microrouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object microrouterMod {
  type AugmentedRequestHandler = js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, js.Any]
  type RouteHandler = js.Function2[
    /* path */ java.lang.String, 
    /* handler */ AugmentedRequestHandler, 
    microLib.microMod.RequestHandler
  ]
  type ServerRequest = nodeLib.httpMod.IncomingMessage with microrouterLib.Anon_Params
  type ServerResponse = js.Object
}
