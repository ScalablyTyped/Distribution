package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[P /* <: StringDictionary[js.Any] */] extends js.Object {
  var props: P
  var unstable_revalidate: js.UndefOr[Double | Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply[P](props: P, unstable_revalidate: Double | Boolean = null): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (unstable_revalidate != null) __obj.updateDynamic("unstable_revalidate")(unstable_revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
}

