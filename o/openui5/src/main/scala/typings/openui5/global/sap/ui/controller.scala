package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.core.mvc.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.controller")
@js.native
object controller extends js.Object {
  
  /**
    * Defines a controller class or creates an instance of an already defined controller class.When a name
    * and a controller implementation object is given, a new controller classof the given name is created.
    * The members of the implementation object will be copiedinto each new instance of that controller
    * class (shallow copy).<b>Note</b>: as the members are shallow copied, controller instances will share
    * all object values.This might or might not be what applications expect.If only a name is given, a new
    * instance of the named controller class is returned.
    * @param sName The controller name
    * @param oControllerImpl An object literal defining the methods and properties of the controller
    * @returns void or the new controller instance, depending on the use case
    */
  def apply(sName: String): Unit | Controller = js.native
  def apply(sName: String, oControllerImpl: js.Any): Unit | Controller = js.native
}
