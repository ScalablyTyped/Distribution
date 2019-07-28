package typings.menubar.MenubarNs

import typings.electron.ElectronNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronPositioner extends js.Object {
  def calculate(pos: Position): Point = js.native
  def calculate(pos: Position, bounds: TrayBounds): Point = js.native
  def move(pos: Position): Unit = js.native
}

