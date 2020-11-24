package typings.pagerJackrabbit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AckCallback = js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]
  
  type Message = typings.amqplib.propertiesMod.Message
}
