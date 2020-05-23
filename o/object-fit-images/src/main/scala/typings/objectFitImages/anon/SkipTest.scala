package typings.objectFitImages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipTest extends js.Object {
  var skipTest: js.UndefOr[Boolean] = js.undefined
  var watchMQ: js.UndefOr[Boolean] = js.undefined
}

object SkipTest {
  @scala.inline
  def apply(skipTest: js.UndefOr[Boolean] = js.undefined, watchMQ: js.UndefOr[Boolean] = js.undefined): SkipTest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watchMQ)) __obj.updateDynamic("watchMQ")(watchMQ.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipTest]
  }
}

