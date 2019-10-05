package typings.openui5.sap.ui

import typings.openui5.sap.ui.core.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.getCore")
@js.native
object getCore extends js.Object {
  //  Retrieve the SAPUI5 Core instance for the current window.
  //  and returns it or if a library name is specified then the version info of the individual library will be returned.
  def apply(): Core = js.native
}

