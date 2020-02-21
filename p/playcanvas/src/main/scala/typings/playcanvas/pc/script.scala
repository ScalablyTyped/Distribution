package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.CreateScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.script
  * @namespace
  * @description The pc.script namespace holds the createLoadingScreen function that
  * is used to override the default PlayCanvas loading screen.
  */
@JSGlobal("pc.script")
@js.native
object script extends js.Object {
  /**
    * @function
    * @name pc.script.createLoadingScreen
    * @description Handles the creation of the loading screen of the application. A script can subscribe to
    * the events of a {@link pc.Application} to show a loading screen, progress bar etc. In order for this to work
    * you need to set the project's loading screen script to the script that calls this method.
    * @param  {pc.callbacks.CreateScreen} callback - A function which can set up and tear down a customised loading screen.
    * @example
    * pc.script.createLoadingScreen(function (app) {
    *     var showSplashScreen = function () {};
    *     var hideSplashScreen = function () {};
    *     var showProgress = function (progress) {};
    *     app.on("preload:start", showSplashScreen);
    *     app.on("preload:progress", showProgress);
    *     app.on("start", hideSplashScreen);
    * });
    */
  def createLoadingScreen(callback: CreateScreen): Unit = js.native
}

