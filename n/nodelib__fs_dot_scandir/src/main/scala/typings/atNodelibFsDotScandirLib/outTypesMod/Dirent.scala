package typings
package atNodelibFsDotScandirLib.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dirent extends js.Object {
  var name: java.lang.String
  def isBlockDevice(): scala.Boolean
  def isCharacterDevice(): scala.Boolean
  def isDirectory(): scala.Boolean
  def isFIFO(): scala.Boolean
  def isFile(): scala.Boolean
  def isSocket(): scala.Boolean
  def isSymbolicLink(): scala.Boolean
}

object Dirent {
  @scala.inline
  def apply(
    isBlockDevice: () => scala.Boolean,
    isCharacterDevice: () => scala.Boolean,
    isDirectory: () => scala.Boolean,
    isFIFO: () => scala.Boolean,
    isFile: () => scala.Boolean,
    isSocket: () => scala.Boolean,
    isSymbolicLink: () => scala.Boolean,
    name: java.lang.String
  ): Dirent = {
    val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), name = name)
  
    __obj.asInstanceOf[Dirent]
  }
}

