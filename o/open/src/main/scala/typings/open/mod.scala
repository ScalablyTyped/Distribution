package typings.open

import typings.node.nodeColonchildProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("open", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: String): js.Promise[ChildProcess] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ChildProcess]]
  inline def default(target: String, options: Options): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  
  /* Inlined std.Record<open.open.AppName, string | std.Array<string>> */
  object apps {
    
    @JSImport("open", "apps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("open", "apps.browser")
    @js.native
    def browser: String | js.Array[String] = js.native
    
    @JSImport("open", "apps.browserPrivate")
    @js.native
    def browserPrivate: String | js.Array[String] = js.native
    inline def browserPrivate_=(x: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserPrivate")(x.asInstanceOf[js.Any])
    
    inline def browser_=(x: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browser")(x.asInstanceOf[js.Any])
    
    @JSImport("open", "apps.chrome")
    @js.native
    def chrome: String | js.Array[String] = js.native
    inline def chrome_=(x: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chrome")(x.asInstanceOf[js.Any])
    
    @JSImport("open", "apps.edge")
    @js.native
    def edge: String | js.Array[String] = js.native
    inline def edge_=(x: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    @JSImport("open", "apps.firefox")
    @js.native
    def firefox: String | js.Array[String] = js.native
    inline def firefox_=(x: String | js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firefox")(x.asInstanceOf[js.Any])
  }
  
  inline def openApp(name: String): js.Promise[ChildProcess] = ^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ChildProcess]]
  inline def openApp(name: String, options: OpenAppOptions): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  inline def openApp(name: js.Array[String]): js.Promise[ChildProcess] = ^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ChildProcess]]
  inline def openApp(name: js.Array[String], options: OpenAppOptions): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("openApp")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  
  trait App extends StObject {
    
    var arguments: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String | js.Array[String]
  }
  object App {
    
    inline def apply(name: String | js.Array[String]): App = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.open.openStrings.chrome
    - typings.open.openStrings.firefox
    - typings.open.openStrings.edge
    - typings.open.openStrings.browser
    - typings.open.openStrings.browserPrivate
  */
  trait AppName extends StObject
  object AppName {
    
    inline def browser: typings.open.openStrings.browser = "browser".asInstanceOf[typings.open.openStrings.browser]
    
    inline def browserPrivate: typings.open.openStrings.browserPrivate = "browserPrivate".asInstanceOf[typings.open.openStrings.browserPrivate]
    
    inline def chrome: typings.open.openStrings.chrome = "chrome".asInstanceOf[typings.open.openStrings.chrome]
    
    inline def edge: typings.open.openStrings.edge = "edge".asInstanceOf[typings.open.openStrings.edge]
    
    inline def firefox: typings.open.openStrings.firefox = "firefox".asInstanceOf[typings.open.openStrings.firefox]
  }
  
  /* Inlined { readonly arguments :std.Array<string> | undefined} & std.Omit<open.open.Options, 'app'> */
  trait OpenAppOptions extends StObject {
    
    var allowNonzeroExitCode: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Arguments passed to the app.
    	These arguments are app dependent. Check the app's documentation for what arguments it accepts.
    	*/
    val arguments: js.UndefOr[js.Array[String]] = js.undefined
    
    var background: js.UndefOr[Boolean] = js.undefined
    
    var newInstance: js.UndefOr[Boolean] = js.undefined
    
    @JSName("wait")
    var wait_FOpenAppOptions: js.UndefOr[Boolean] = js.undefined
  }
  object OpenAppOptions {
    
    inline def apply(): OpenAppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAppOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenAppOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowNonzeroExitCode(value: Boolean): Self = StObject.set(x, "allowNonzeroExitCode", value.asInstanceOf[js.Any])
      
      inline def setAllowNonzeroExitCodeUndefined: Self = StObject.set(x, "allowNonzeroExitCode", js.undefined)
      
      inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setNewInstance(value: Boolean): Self = StObject.set(x, "newInstance", value.asInstanceOf[js.Any])
      
      inline def setNewInstanceUndefined: Self = StObject.set(x, "newInstance", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	Allow the opened app to exit with nonzero exit code when the `wait` option is `true`.
    	We do not recommend setting this option. The convention for success is exit code zero.
    	@default false
    	*/
    val allowNonzeroExitCode: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Specify the `name` of the app to open the `target` with, and optionally, app `arguments`. `app` can be an array of apps to try to open and `name` can be an array of app names to try. If each app fails, the last error will be thrown.
    	The app name is platform dependent. Don't hard code it in reusable modules. For example, Chrome is `google chrome` on macOS, `google-chrome` on Linux and `chrome` on Windows. If possible, use `apps` which auto-detects the correct binary to use.
    	You may also pass in the app's full path. For example on WSL, this can be `/mnt/c/Program Files (x86)/Google/Chrome/Application/chrome.exe` for the Windows installation of Chrome.
    	The app `arguments` are app dependent. Check the app's documentation for what arguments it accepts.
    	*/
    val app: js.UndefOr[App | js.Array[App]] = js.undefined
    
    /**
    	__macOS only__
    	Do not bring the app to the foreground.
    	@default false
    	*/
    val background: js.UndefOr[Boolean] = js.undefined
    
    /**
    	__macOS only__
    	Open a new instance of the app even it's already running.
    	A new instance is always opened on other platforms.
    	@default false
    	*/
    val newInstance: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Wait for the opened app to exit before fulfilling the promise. If `false` it's fulfilled immediately when opening the app.
    	Note that it waits for the app to exit, not just for the window to close.
    	On Windows, you have to explicitly specify an app for it to be able to wait.
    	@default false
    	*/
    @JSName("wait")
    val wait_FOptions: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowNonzeroExitCode(value: Boolean): Self = StObject.set(x, "allowNonzeroExitCode", value.asInstanceOf[js.Any])
      
      inline def setAllowNonzeroExitCodeUndefined: Self = StObject.set(x, "allowNonzeroExitCode", js.undefined)
      
      inline def setApp(value: App | js.Array[App]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setAppVarargs(value: App*): Self = StObject.set(x, "app", js.Array(value*))
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setNewInstance(value: Boolean): Self = StObject.set(x, "newInstance", value.asInstanceOf[js.Any])
      
      inline def setNewInstanceUndefined: Self = StObject.set(x, "newInstance", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
