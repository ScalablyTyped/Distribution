package typings
package morganLib.morganMod.morganNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  /**
    * Output stream for writing log lines.
    */
  def write(str: java.lang.String): scala.Unit
}

object StreamOptions {
  @scala.inline
  def apply(write: js.Function1[java.lang.String, scala.Unit]): StreamOptions = {
    val __obj = js.Dynamic.literal(write = write)
  
    __obj.asInstanceOf[StreamOptions]
  }
}

