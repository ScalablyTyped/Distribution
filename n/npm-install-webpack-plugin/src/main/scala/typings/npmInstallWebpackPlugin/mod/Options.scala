package typings.npmInstallWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Use --save or --save-dev
    * @default false
    */
  var dev: js.UndefOr[Boolean | DevFunction] = js.undefined
  /**
    * npm command used inside company, yarn is not supported yet
    */
  var npm: js.UndefOr[String] = js.undefined
  /**
    * Install missing peerDependencies
    * @default true
    */
  var peerDependencies: js.UndefOr[Boolean] = js.undefined
  /**
    * Reduce amount of console logging
    * @default false
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dev: Boolean | DevFunction = null,
    npm: String = null,
    peerDependencies: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dev != null) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (npm != null) __obj.updateDynamic("npm")(npm.asInstanceOf[js.Any])
    if (!js.isUndefined(peerDependencies)) __obj.updateDynamic("peerDependencies")(peerDependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

