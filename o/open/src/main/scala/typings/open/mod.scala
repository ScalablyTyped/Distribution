package typings.open

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Open stuff like URLs, files, executables. Cross-platform.
  Uses the command `open` on OS X, `start` on Windows and `xdg-open` on other platforms.
  There is a caveat for [double-quotes on Windows](https://github.com/sindresorhus/open#double-quotes-on-windows) where all double-quotes are stripped from the `target`.
  @param target - The thing you want to open. Can be a URL, file, or executable. Opens in the default app for the file type. For example, URLs open in your default browser.
  @returns The [spawned child process](https://nodejs.org/api/child_process.html#child_process_class_childprocess). You would normally not need to use this for anything, but it can be useful if you'd like to attach custom event listeners or perform other operations directly on the spawned process.
  @example
  ```
  import open = require('open');
  // Opens the image in the default image viewer
  (async () => {
  	await open('unicorn.png', {wait: true});
  	console.log('The image viewer app closed');
  	// Opens the url in the default browser
  	await open('https://sindresorhus.com');
  	// Specify the app to open in
  	await open('https://sindresorhus.com', {app: 'firefox'});
  	// Specify app arguments
  	await open('https://sindresorhus.com', {app: ['google chrome', '--incognito']});
  })();
  ```
  */
  @JSImport("open", JSImport.Namespace)
  @js.native
  def apply(target: String): js.Promise[ChildProcess] = js.native
  @JSImport("open", JSImport.Namespace)
  @js.native
  def apply(target: String, options: Options): js.Promise[ChildProcess] = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNonzeroExitCode(value: Boolean): Self = StObject.set(x, "allowNonzeroExitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNonzeroExitCodeUndefined: Self = StObject.set(x, "allowNonzeroExitCode", js.undefined)
      
      @scala.inline
      def setApp(value: String | js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value :_*))
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
