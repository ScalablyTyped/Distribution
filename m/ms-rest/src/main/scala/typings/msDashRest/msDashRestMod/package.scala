package typings.msDashRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msDashRestMod {
  import typings.std.Error

  type ServiceCallback[TResult] = js.Function4[
    /* err */ Error | ServiceError, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[WebResource], 
    /* response */ js.UndefOr[typings.node.httpMod.IncomingMessage], 
    Unit
  ]
}
