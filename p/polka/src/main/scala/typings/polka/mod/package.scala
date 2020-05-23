package typings.polka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A middleware function
    */
  type Middleware = js.Function3[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* next */ typings.polka.mod.Next, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  /**
    * Calls the next middleware function in the chain, or throws an error.
    */
  type Next = js.Function1[/* err */ js.UndefOr[java.lang.String | typings.std.Error], scala.Unit]
}
