package typings.pkgConf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ConfigType /* <: Config */] extends js.Object {
  /**
  		Directory to start looking up for a `package.json` file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.undefined
  /**
  		Default config.
  		@default {}
  		*/
  var defaults: js.UndefOr[ConfigType] = js.undefined
  /**
  		Skip `package.json` files that have the namespaced config explicitly set to `false`.
  		Continues searching upwards until the next `package.json` file is reached. This can be useful when you need to support the ability for users to have nested `package.json` files, but only read from the root one, like in the case of [`electron-builder`](https://github.com/electron-userland/electron-builder/wiki/Options#AppMetadata) where you have one `package.json` file for the app and one top-level for development.
  		@default false
  		@example
  		```
  		{
  			"name": "some-package",
  			"version": "1.0.0",
  			"unicorn": false
  		}
  		```
  		*/
  var skipOnFalse: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[/* <: typings.pkgConf.mod.Config */ ConfigType](cwd: String = null, defaults: ConfigType = null, skipOnFalse: js.UndefOr[Boolean] = js.undefined): Options[ConfigType] = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOnFalse)) __obj.updateDynamic("skipOnFalse")(skipOnFalse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ConfigType]]
  }
}

