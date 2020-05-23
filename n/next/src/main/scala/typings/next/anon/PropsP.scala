package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsP[P /* <: StringDictionary[js.Any] */] extends js.Object {
  var props: P
}

object PropsP {
  @scala.inline
  def apply[P](props: P): PropsP[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsP[P]]
  }
}

