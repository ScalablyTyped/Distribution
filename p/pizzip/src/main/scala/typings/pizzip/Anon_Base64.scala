package typings.pizzip

import typings.pizzip.pizzipMod.Compression
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  /**
    * @deprecated
    */
  var base64: Boolean
  /**
    * @deprecated
    */
  var binary: Boolean
  var compression: Compression
  /**
    * @deprecated use File.date
    */
  var date: Date
  /**
    * @deprecated use File.dir
    */
  var dir: Boolean
}

object Anon_Base64 {
  @scala.inline
  def apply(base64: Boolean, binary: Boolean, compression: Compression, date: Date, dir: Boolean): Anon_Base64 = {
    val __obj = js.Dynamic.literal(base64 = base64, binary = binary, compression = compression, date = date, dir = dir)
  
    __obj.asInstanceOf[Anon_Base64]
  }
}

