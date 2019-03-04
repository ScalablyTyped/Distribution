package typings
package memoryDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsBlockDevice extends js.Object {
  def isBlockDevice(): scala.Boolean
  def isCharacterDevice(): scala.Boolean
  def isDirectory(): scala.Boolean
  def isFIFO(): scala.Boolean
  def isFile(): scala.Boolean
  def isSocket(): scala.Boolean
  def isSymbolicLink(): scala.Boolean
}

object Anon_IsBlockDevice {
  @scala.inline
  def apply(
    isBlockDevice: js.Function0[scala.Boolean],
    isCharacterDevice: js.Function0[scala.Boolean],
    isDirectory: js.Function0[scala.Boolean],
    isFIFO: js.Function0[scala.Boolean],
    isFile: js.Function0[scala.Boolean],
    isSocket: js.Function0[scala.Boolean],
    isSymbolicLink: js.Function0[scala.Boolean]
  ): Anon_IsBlockDevice = {
    val __obj = js.Dynamic.literal(isBlockDevice = isBlockDevice, isCharacterDevice = isCharacterDevice, isDirectory = isDirectory, isFIFO = isFIFO, isFile = isFile, isSocket = isSocket, isSymbolicLink = isSymbolicLink)
  
    __obj.asInstanceOf[Anon_IsBlockDevice]
  }
}

