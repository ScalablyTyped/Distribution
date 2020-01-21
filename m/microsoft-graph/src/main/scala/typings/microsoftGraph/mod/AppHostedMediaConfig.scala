package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppHostedMediaConfig extends MediaConfig {
  var blob: js.UndefOr[String] = js.undefined
}

object AppHostedMediaConfig {
  @scala.inline
  def apply(blob: String = null): AppHostedMediaConfig = {
    val __obj = js.Dynamic.literal()
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppHostedMediaConfig]
  }
}

