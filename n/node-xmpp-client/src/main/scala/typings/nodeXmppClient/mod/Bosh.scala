package typings.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bosh extends js.Object {
  var prebind: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ js.Any, Unit]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Bosh {
  @scala.inline
  def apply(prebind: (/* error */ js.Any, /* data */ js.Any) => Unit = null, url: String = null): Bosh = {
    val __obj = js.Dynamic.literal()
    if (prebind != null) __obj.updateDynamic("prebind")(js.Any.fromFunction2(prebind))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bosh]
  }
}

