package typings
package msnodesqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msnodesqlMod {
  type ErrorCallback = js.Function1[/* err */ nodeLib.Error, scala.Unit]
  type OpenCallback = js.Function2[
    /* err */ js.UndefOr[nodeLib.Error], 
    /* connection */ js.UndefOr[Connection], 
    scala.Unit
  ]
  type QueryCallback[T] = js.Function3[
    /* err */ js.UndefOr[nodeLib.Error], 
    /* results */ js.UndefOr[js.Array[T]], 
    /* more */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type QueryRawCallback = js.Function3[
    /* err */ js.UndefOr[nodeLib.Error], 
    /* results */ js.UndefOr[QueryRawResult], 
    /* more */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type StreamEvents = nodeLib.eventsMod.EventEmitter
}
