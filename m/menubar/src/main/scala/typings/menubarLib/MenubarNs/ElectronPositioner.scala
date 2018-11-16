package typings
package menubarLib.MenubarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronPositioner extends js.Object {
  def calculate(pos: Position): electronLib.ElectronNs.Point = js.native
  def calculate(pos: Position, bounds: TrayBounds): electronLib.ElectronNs.Point = js.native
  def move(pos: Position): scala.Unit = js.native
}

