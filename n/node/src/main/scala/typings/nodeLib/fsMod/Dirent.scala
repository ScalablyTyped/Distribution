package typings
package nodeLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "Dirent")
@js.native
class Dirent () extends js.Object {
  var name: java.lang.String = js.native
  def isBlockDevice(): scala.Boolean = js.native
  def isCharacterDevice(): scala.Boolean = js.native
  def isDirectory(): scala.Boolean = js.native
  def isFIFO(): scala.Boolean = js.native
  def isFile(): scala.Boolean = js.native
  def isSocket(): scala.Boolean = js.native
  def isSymbolicLink(): scala.Boolean = js.native
}

