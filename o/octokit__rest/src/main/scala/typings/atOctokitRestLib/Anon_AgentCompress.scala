package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentCompress extends js.Object {
  var agent: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var follow: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AgentCompress {
  @scala.inline
  def apply(
    agent: java.lang.String = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    follow: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
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

