package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcInteractionsClickInteractionMod {
  type ClickCallback = js.Function2[
    /* point */ plottableLib.buildSrcCoreInterfacesMod.Point, 
    /* event */ stdLib.MouseEvent | stdLib.TouchEvent, 
    scala.Unit
  ]
}
