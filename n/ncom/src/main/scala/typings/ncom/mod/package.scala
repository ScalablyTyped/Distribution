package typings.ncom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConnectionListener = js.Function1[/* socket */ typings.ncom.mod.ComSocket, scala.Unit]
  
  type FilterFunction = js.Function1[/* data */ js.Any, java.lang.String]
}
