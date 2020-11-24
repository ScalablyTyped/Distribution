package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Fragment
import typings.openui5.sap.ui.core.mvc.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.htmlfragment")
@js.native
object htmlfragment extends js.Object {
  
  /**
    * Instantiates an HTML-based Fragment.To instantiate a Fragment, call this method as:  
    * sap.ui.htmlfragment([sId], sFragmentName, [oController]);The Fragment instance ID is optional
    * (generated if not given) and will be used as prefix for the ID of allcontained controls. The
    * sFragmentName must correspond to an HTML Fragment which can be loadedvia the module system
    * (fragmentName + ".fragment.html") and which defines the Fragment.If oController is given, the
    * methods referenced in the Fragment will be called on this controller.Note that Fragments may require
    * a Controller to be given and certain methods to be available.Advanced usage:To instantiate a
    * Fragment and optionally directly give the HTML definition instead of loading it from a file,call
    * this method as:    sap.ui.htmlfragment(oFragmentConfig, [oController]);The oFragmentConfig object
    * can have a either a "fragmentName" or a "fragmentContent" property.fragmentContent is optional and
    * can hold the Fragment definition as XML string; if notgiven, fragmentName must be given and the
    * Fragment content definition is loaded by the module system.Again, if oController is given, the
    * methods referenced in the Fragment will be called on this controller.
    * @param sId id of the newly created Fragment
    * @param vFragment name of the Fragment (or Fragment configuration as described above, in this case no
    * sId may be given. Instead give the id inside the config object, if desired.)
    * @param oController a Controller to be used for event handlers in the Fragment
    * @returns the root Control(s) of the created Fragment instance
    */
  def apply(sId: String, vFragment: String): Control | js.Array[Control] = js.native
  def apply(sId: String, vFragment: String, oController: Controller): Control | js.Array[Control] = js.native
  def apply(sId: String, vFragment: js.Any): Control | js.Array[Control] = js.native
  def apply(sId: String, vFragment: js.Any, oController: js.Any): Unit = js.native
  def apply(sId: String, vFragment: js.Any, oController: Controller): Control | js.Array[Control] = js.native
  //  Instantiates an HTML-based Fragment.
  def apply(vFragment: js.Any): Fragment = js.native
  def apply(vFragment: js.Any, oController: js.Any): Fragment = js.native
}
