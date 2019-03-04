package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononOnCloseObject extends js.Object {
  def close(): scala.Unit
}

object PhononOnCloseObject {
  @scala.inline
  def apply(close: js.Function0[scala.Unit]): PhononOnCloseObject = {
    val __obj = js.Dynamic.literal(close = close)
  
    __obj.asInstanceOf[PhononOnCloseObject]
  }
}

