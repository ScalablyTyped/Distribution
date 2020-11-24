package typings.nes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type Handler = js.Function2[
    /* message */ js.Any, 
    /* flags */ typings.nes.clientMod.ClientSubscribeFlags, 
    scala.Unit
  ]
}
