package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps extends js.Object {
  var props: js.Any
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}

object AnonProps {
  @scala.inline
  def apply(props: js.Any, revalidate: Double | Boolean = null): AnonProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps]
  }
}

