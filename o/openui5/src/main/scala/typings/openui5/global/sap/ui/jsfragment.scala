package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Fragment
import typings.openui5.sap.ui.core.mvc.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.jsfragment")
@js.native
object jsfragment extends js.Object {
  
  //  Defines OR instantiates an HTML-based Fragment.
  def apply(sFragmentName: String): Fragment = js.native
  /**
    * Defines OR instantiates an HTML-based Fragment.To define a JS Fragment, call this method as:  
    * sap.ui.jsfragment(sName, oFragmentDefinition)Where:- "sName" is the name by which this fragment can
    * be found and instantiated. If defined in its own file,   in order to be found by the module loading
    * system, the file location and name must correspond to sName   (path + file name must be:
    * fragmentName + ".fragment.js").- "oFragmentDefinition" is an object at least holding the
    * "createContent(oController)" method which defines   the Fragment content. If given during
    * instantiation, the createContent method receives a Controller   instance (otherwise oController is
    * undefined) and the return value must be one sap.ui.core.Control   (which could have any number of
    * children).To instantiate a JS Fragment, call this method as:   sap.ui.jsfragment([sId],
    * sFragmentName, [oController]);The Fragment ID is optional (generated if not given) and the Fragment
    * implementation CAN use itto make contained controls unique (this depends on the implementation: some
    * JS Fragments may choosenot to support multiple instances within one application and not use the ID
    * prefixing).The sFragmentName must correspond to a JS Fragment which can be loadedvia the module
    * system (fragmentName + ".fragment.js") and which defines the Fragment.If oController is given, the
    * methods referenced in the Fragment will be called on this controller.Note that Fragments may require
    * a Controller to be given and certain methods to be available.
    * @param sId id of the newly created Fragment
    * @param sFragmentName name of the Fragment (or Fragment configuration as described above, in this
    * case no sId may be given. Instead give the id inside the config object, if desired)
    * @param oController a Controller to be used for event handlers in the Fragment
    * @returns the root Control(s) of the created Fragment instance
    */
  def apply(sId: String, sFragmentName: String): Control | js.Array[Control] = js.native
  def apply(sId: String, sFragmentName: String, oController: js.Any): Fragment = js.native
  def apply(sId: String, sFragmentName: String, oController: Controller): Control | js.Array[Control] = js.native
  def apply(sId: String, sFragmentName: js.Any): Control | js.Array[Control] = js.native
  def apply(sId: String, sFragmentName: js.Any, oController: Controller): Control | js.Array[Control] = js.native
}
