package typings.openui5.sap.ui

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.getVersionInfo")
@js.native
object getVersionInfo extends js.Object {
  // Loads the version info file (resources/sap-ui-version.json):void;
  def apply(): Unit = js.native
  /**
    * Loads the version info file (resources/sap-ui-version.json) and returnsit or if a library name is
    * specified then the version info of the individuallibrary will be returned.In case of the version
    * info file is not available an error will occur whencalling this function.
    * @param mOptions name of the library (e.g. "sap.ui.core") or a object map (see below)
    * @returns the full version info, the library specific one,                                  
    * undefined (if library is not listed or there was an error and "failOnError" is set to "false")      
    *                             or a Promise which resolves with one of them
    */
  def apply(mOptions: String): js.Any | JQueryPromise[_] = js.native
  def apply(mOptions: js.Any): js.Any | JQueryPromise[_] = js.native
}

