package typings.open.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Allow the opened app to exit with nonzero exit code when the `wait` option is `true`.
  		
  		We do not recommend setting this option. The convention for success is exit code zero.
  		@default false
  		*/
  val allowNonzeroExitCode: js.UndefOr[Boolean] = js.native
  
  /**
  		Specify the app to open the `target` with, or an array with the app and app arguments.
  		The app name is platform dependent. Don't hard code it in reusable modules. For example, Chrome is `google chrome` on macOS, `google-chrome` on Linux and `chrome` on Windows.
  		You may also pass in the app's full path. For example on WSL, this can be `/mnt/c/Program Files (x86)/Google/Chrome/Application/chrome.exe` for the Windows installation of Chrome.
  		*/
  val app: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
  		__macOS only__
  		Do not bring the app to the foreground.
  		@default false
  		*/
  val background: js.UndefOr[Boolean] = js.native
  
  /**
  		__deprecated__
  		This option will be removed in the next major release.
  		*/
  val url: js.UndefOr[Boolean] = js.native
  
  /**
  		Wait for the opened app to exit before fulfilling the promise. If `false` it's fulfilled immediately when opening the app.
  		Note that it waits for the app to exit, not just for the window to close.
  		On Windows, you have to explicitly specify an app for it to be able to wait.
  		@default false
  		*/
  @JSName("wait")
  val wait_FOptions: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowNonzeroExitCode(value: Boolean): Self = this.set("allowNonzeroExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNonzeroExitCode: Self = this.set("allowNonzeroExitCode", js.undefined)
    
    @scala.inline
    def setAppVarargs(value: String*): Self = this.set("app", js.Array(value :_*))
    
    @scala.inline
    def setApp(value: String | js.Array[String]): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setUrl(value: Boolean): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
