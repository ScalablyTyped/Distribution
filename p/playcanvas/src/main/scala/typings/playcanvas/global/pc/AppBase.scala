package typings.playcanvas.global.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Application represents and manages your PlayCanvas application. If you are developing using
  * the PlayCanvas Editor, the Application is created for you. You can access your Application
  * instance in your scripts. Below is a skeleton script which shows how you can access the
  * application 'app' property inside the initialize and update functions:
  *
  * ```javascript
  * // Editor example: accessing the pc.Application from a script
  * var MyScript = pc.createScript('myScript');
  *
  * MyScript.prototype.initialize = function() {
  *     // Every script instance has a property 'this.app' accessible in the initialize...
  *     var app = this.app;
  * };
  *
  * MyScript.prototype.update = function(dt) {
  *     // ...and update functions.
  *     var app = this.app;
  * };
  * ```
  *
  * If you are using the Engine without the Editor, you have to create the application instance
  * manually.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.AppBase")
@js.native
open class AppBase protected ()
  extends typings.playcanvas.mod.AppBase {
  /**
    * Create a new AppBase instance.
    *
    * @param {Element} canvas - The canvas element.
    * @example
    * // Engine-only example: create the application manually
    * var options = new AppOptions();
    * var app = new pc.AppBase(canvas);
    * app.init(options);
    *
    * // Start the application's main loop
    * app.start();
    *
    * @hideconstructor
    */
  def this(canvas: Element) = this()
}
object AppBase {
  
  @JSGlobal("pc.AppBase")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @private
    * @static
    * @name app
    * @type {AppBase|undefined}
    * @description Gets the current application, if any.
    */
  /* static member */
  @JSGlobal("pc.AppBase._applications")
  @js.native
  def applications: Any = js.native
  
  inline def applications_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_applications")(x.asInstanceOf[js.Any])
  
  /**
    * Get the current application. In the case where there are multiple running applications, the
    * function can get an application based on a supplied canvas id. This function is particularly
    * useful when the current Application is not readily available. For example, in the JavaScript
    * console of the browser's developer tools.
    *
    * @param {string} [id] - If defined, the returned application should use the canvas which has
    * this id. Otherwise current application will be returned.
    * @returns {AppBase|undefined} The running application, if any.
    * @example
    * var app = pc.AppBase.getApplication();
    */
  /* static member */
  inline def getApplication(): js.UndefOr[typings.playcanvas.mod.AppBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplication")().asInstanceOf[js.UndefOr[typings.playcanvas.mod.AppBase]]
  inline def getApplication(id: String): js.UndefOr[typings.playcanvas.mod.AppBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplication")(id.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.playcanvas.mod.AppBase]]
}
