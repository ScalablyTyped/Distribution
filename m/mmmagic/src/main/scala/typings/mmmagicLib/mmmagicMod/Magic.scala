package typings
package mmmagicLib.mmmagicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mmmagic", "Magic")
@js.native
class Magic () extends js.Object {
  def this(magicPath: java.lang.String) = this()
  def this(mask: bitmask) = this()
  def this(magicPath: java.lang.String, mask: bitmask) = this()
  def detect(
    data: nodeLib.Buffer,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def detectFile(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

