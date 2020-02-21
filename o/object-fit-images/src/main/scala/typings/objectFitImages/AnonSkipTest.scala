package typings.objectFitImages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkipTest extends js.Object {
  var skipTest: js.UndefOr[Boolean] = js.undefined
  var watchMQ: js.UndefOr[Boolean] = js.undefined
}

object AnonSkipTest {
  @scala.inline
  def apply(skipTest: js.UndefOr[Boolean] = js.undefined, watchMQ: js.UndefOr[Boolean] = js.undefined): AnonSkipTest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.asInstanceOf[js.Any])
    if (!js.isUndefined(watchMQ)) __obj.updateDynamic("watchMQ")(watchMQ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkipTest]
  }
}

