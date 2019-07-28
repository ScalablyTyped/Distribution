package typings.atNodelibFsDotScandir.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dirent extends js.Object {
  var name: String
  def isBlockDevice(): Boolean
  def isCharacterDevice(): Boolean
  def isDirectory(): Boolean
  def isFIFO(): Boolean
  def isFile(): Boolean
  def isSocket(): Boolean
  def isSymbolicLink(): Boolean
}

object Dirent {
  @scala.inline
  def apply(
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    name: String
  ): Dirent = {
    val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), name = name)
  
    __obj.asInstanceOf[Dirent]
  }
}

