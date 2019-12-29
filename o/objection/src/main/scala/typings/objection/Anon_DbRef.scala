package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbRef extends js.Object {
  @JSName("#dbRef")
  var NumbersigndbRef: Double
}

object Anon_DbRef {
  @scala.inline
  def apply(NumbersigndbRef: Double): Anon_DbRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("#dbRef")(NumbersigndbRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DbRef]
  }
}

