package typings
package pngjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Write extends js.Object {
  def read(buffer: nodeLib.Buffer): pngjsLib.pngjsMod.PNG = js.native
  def read(buffer: nodeLib.Buffer, options: pngjsLib.pngjsMod.ParserOptions): pngjsLib.pngjsMod.PNG = js.native
  def write(png: pngjsLib.pngjsMod.PNG): nodeLib.Buffer = js.native
  def write(png: pngjsLib.pngjsMod.PNG, options: pngjsLib.pngjsMod.PackerOptions): nodeLib.Buffer = js.native
}

