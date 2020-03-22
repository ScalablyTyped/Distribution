package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropsP[P /* <: StringDictionary[js.Any] */] extends js.Object {
  var props: P
}

object AnonPropsP {
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](props: P): AnonPropsP[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPropsP[P]]
  }
}

