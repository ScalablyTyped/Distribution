package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextSeoProps extends js.Object {
  var config: Config
}

object NextSeoProps {
  @scala.inline
  def apply(config: Config): NextSeoProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextSeoProps]
  }
}

