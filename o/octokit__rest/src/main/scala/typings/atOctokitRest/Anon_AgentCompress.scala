package typings.atOctokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentCompress extends js.Object {
  var agent: js.UndefOr[String | Null] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_AgentCompress {
  @scala.inline
  def apply(
    agent: String = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    follow: Int | Double = null,
    size: Int | Double = null,
    timeout: Int | Double = null
  ): Anon_AgentCompress = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AgentCompress]
  }
}

