package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcInteractionsDragInteractionMod {
  type DragCallback = js.Function2[
    /* start */ plottableLib.buildSrcCoreInterfacesMod.Point, 
    /* end */ plottableLib.buildSrcCoreInterfacesMod.Point, 
    scala.Unit
  ]
  type MouseFilter = js.Function1[/* e */ stdLib.MouseEvent, scala.Boolean]
}
