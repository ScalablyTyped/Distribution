package typings.pkgConf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[ConfigType /* <: Config */] extends js.Object {
  
  /**
  		Directory to start looking up for a `package.json` file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.native
  
  /**
  		Default config.
  		@default {}
  		*/
  var defaults: js.UndefOr[ConfigType] = js.native
  
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
  var skipOnFalse: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[ConfigType /* <: Config */](): Options[ConfigType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ConfigType]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ConfigType /* <: Config */] (val x: Self with Options[ConfigType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDefaults(value: ConfigType): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setSkipOnFalse(value: Boolean): Self = this.set("skipOnFalse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOnFalse: Self = this.set("skipOnFalse", js.undefined)
  }
}
