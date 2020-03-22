package typings.next.nextMod

import typings.next.nextServerMod.NextConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<next.next/dist/next-server/server/next-server.ServerConstructor, 'staticMarkup'> & {  dev ? :boolean} */
trait NextServerConstructor extends js.Object {
  var conf: js.UndefOr[NextConfig] = js.undefined
  var customServer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to launch Next.js in dev mode - @default false
    */
  var dev: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object NextServerConstructor {
  @scala.inline
  def apply(
    conf: NextConfig = null,
    customServer: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined
  ): NextServerConstructor = {
    val __obj = js.Dynamic.literal()
    if (conf != null) __obj.updateDynamic("conf")(conf.asInstanceOf[js.Any])
    if (!js.isUndefined(customServer)) __obj.updateDynamic("customServer")(customServer.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextServerConstructor]
  }
}

