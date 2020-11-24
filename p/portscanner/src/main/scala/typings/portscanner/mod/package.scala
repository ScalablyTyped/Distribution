package typings.portscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PortCallback = js.Function2[/* error */ typings.std.Error | scala.Null, /* port */ scala.Double, scala.Unit]
  
  type StatusCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* port */ typings.portscanner.mod.Status, 
    scala.Unit
  ]
}
