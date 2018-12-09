package typings
package nesLib.nesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nesNs {
  type ServerOnSubscribe = ServerOnSubscribeWithParams | ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ java.lang.String, js.Promise[js.Any]]
  type ServerOnUnSubscribe = ServerOnUnSubscribeWithParams | ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ java.lang.String, /* params */ js.Any, scala.Unit]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ java.lang.String, scala.Unit]
}
