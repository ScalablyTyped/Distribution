package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps[P /* <: StringDictionary[js.Any] */] extends js.Object {
  var props: P
  var unstable_revalidate: js.UndefOr[Double | Boolean] = js.undefined
}

object AnonProps {
  @scala.inline
  def apply[P /* <: StringDictionary[js.Any] */](props: P, unstable_revalidate: Double | Boolean = null): AnonProps[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (unstable_revalidate != null) __obj.updateDynamic("unstable_revalidate")(unstable_revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps[P]]
  }
}

