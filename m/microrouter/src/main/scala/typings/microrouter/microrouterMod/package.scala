package typings.microrouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object microrouterMod {
  import typings.micro.microMod.RequestHandler
  import typings.microrouter.Anon_Key
  import typings.node.httpMod.IncomingMessage

  type AugmentedRequestHandler = js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, js.Any]
  type RouteHandler = js.Function2[/* path */ String, /* handler */ AugmentedRequestHandler, RequestHandler]
  type ServerRequest = IncomingMessage with Anon_Key
  type ServerResponse = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias microrouter.microrouter.ServerResponse */ js.Object
}
