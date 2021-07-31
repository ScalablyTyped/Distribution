package typings.playcanvas.global.pc

import typings.playcanvas.pc.callbacks.CreateScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pc.script namespace holds the createLoadingScreen function that
  * is used to override the default PlayCanvas loading screen.
  */
object script {
  
  @JSGlobal("pc.script")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Handles the creation of the loading screen of the application. A script can subscribe to
    * the events of a {@link pc.Application} to show a loading screen, progress bar etc. In order for this to work
    * you need to set the project's loading screen script to the script that calls this method.
    * @example
    * pc.script.createLoadingScreen(function (app) {
    *     var showSplashScreen = function () {};
    *     var hideSplashScreen = function () {};
    *     var showProgress = function (progress) {};
    *     app.on("preload:start", showSplashScreen);
    *     app.on("preload:progress", showProgress);
    *     app.on("start", hideSplashScreen);
    * });
    * @param callback - A function which can set up and tear down a customised loading screen.
    */
  @scala.inline
  def createLoadingScreen(callback: CreateScreen): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoadingScreen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
