package typings.pngjs

import typings.node.Buffer
import typings.pngjs.pngjsMod.PNG
import typings.pngjs.pngjsMod.PackerOptions
import typings.pngjs.pngjsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Buffer extends js.Object {
  def read(buffer: Buffer): PNG = js.native
  def read(buffer: Buffer, options: ParserOptions): PNG = js.native
  def write(png: PNG): Buffer = js.native
  def write(png: PNG, options: PackerOptions): Buffer = js.native
}

