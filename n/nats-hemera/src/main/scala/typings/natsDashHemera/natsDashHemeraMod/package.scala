package typings.natsDashHemera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object natsDashHemeraMod {
  import typings.std.Error

  type ActHandler = js.ThisFunction2[
    /* this */ Hemera[ClientRequest, ClientResponse], 
    /* error */ Error, 
    /* response */ ClientResult, 
    Unit
  ]
  type ClientResult = js.Any
  type NoContext = Null
  type NodeCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* success */ js.UndefOr[js.Any], Unit]
  type Plugin = js.Function
  type Request = Null
  type Response = Null
}
