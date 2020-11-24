package typings.pgProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parserMod {
  
  type MessageCallback = js.Function1[/* msg */ typings.pgProtocol.messagesMod.BackendMessage, scala.Unit]
}
