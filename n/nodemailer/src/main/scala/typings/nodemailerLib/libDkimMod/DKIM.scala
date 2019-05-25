package typings
package nodemailerLib.libDkimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DKIM extends js.Object {
  var keys: js.Array[SingleKeyOptions] = js.native
  var options: Options = js.native
  def sign(input: java.lang.String): nodeLib.streamMod.PassThrough = js.native
  def sign(input: java.lang.String, extraOptions: Options): nodeLib.streamMod.PassThrough = js.native
  def sign(input: nodeLib.Buffer): nodeLib.streamMod.PassThrough = js.native
  def sign(input: nodeLib.Buffer, extraOptions: Options): nodeLib.streamMod.PassThrough = js.native
  def sign(input: nodeLib.streamMod.Readable): nodeLib.streamMod.PassThrough = js.native
  def sign(input: nodeLib.streamMod.Readable, extraOptions: Options): nodeLib.streamMod.PassThrough = js.native
}

