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
  def apply(close: () => scala.Unit): PhononOnCloseObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[PhononOnCloseObject]
  }
}

