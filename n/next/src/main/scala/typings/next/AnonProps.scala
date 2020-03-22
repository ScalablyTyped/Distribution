package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps[P /* <: StringDictionary[js.Any] */] extends js.Object {
  var props: P
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}

object AnonProps {
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](props: P, revalidate: Double | Boolean = null): AnonProps[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps[P]]
  }
}

