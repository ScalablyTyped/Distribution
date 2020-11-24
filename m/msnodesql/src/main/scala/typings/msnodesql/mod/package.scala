package typings.msnodesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type OpenCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error], 
    /* connection */ js.UndefOr[typings.msnodesql.mod.Connection], 
    scala.Unit
  ]
  
  type QueryCallback[T] = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* results */ js.UndefOr[js.Array[T]], 
    /* more */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type QueryRawCallback = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* results */ js.UndefOr[typings.msnodesql.mod.QueryRawResult], 
    /* more */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type StreamEvents = typings.node.eventsMod.EventEmitter
}
