package typings.openui5.sap.ui

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.mvc.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.fragment")
@js.native
object fragment extends js.Object {
  /**
    * Instantiate a Fragment - this method loads the Fragment content, instantiates it, and returns this
    * content.The Fragment object itself is not an entity which has further significance beyond this
    * constructor.To instantiate an existing Fragment, call this method as:   sap.ui.fragment(sName,
    * sType, [oController]);The sName must correspond to an XML Fragment which can be loadedvia the module
    * system (fragmentName + suffix ".fragment.[typeextension]") and which defines the Fragment content.If
    * oController is given, the (event handler) methods referenced in the Fragment will be called on this
    * controller.Note that Fragments may require a Controller to be given and certain methods to be
    * available.The Fragment types "XML", "JS" and "HTML" are available by default; additional Fragment
    * types can be implementedand added using the sap.ui.core.Fragment.registerType() function.Advanced
    * usage:To instantiate a Fragment and give further configuration options, call this method as:   
    * sap.ui.fragment(oFragmentConfig, [oController]);The oFragmentConfig object can have the following
    * properties:- "fragmentName": the name of the Fragment, as above- "fragmentContent": the definition
    * of the Fragment content itself. When this property is given, any given name is ignored.        The
    * type of this property depends on the Fragment type, e.g. it could be a string for XML Fragments.-
    * "type": the type of the Fragment, as above (mandatory)- "id": the ID of the Fragment
    * (optional)Further properties may be supported by future or custom Fragment types. Any given
    * propertieswill be forwarded to the Fragment implementation.If you want to give a fixed ID for the
    * Fragment, please use the advanced version of this method call with theconfiguration object or use
    * the typed factories like sap.ui.xmlfragment(...) or sap.ui.jsfragment(...).Otherwise the Fragment ID
    * is generated. In any case, the Fragment ID will be used as prefix for the ID ofall contained
    * controls.
    * @param sName the Fragment name
    * @param sType the Fragment type, e.g. "XML", "JS", or "HTML"
    * @param oController the Controller which should be used by the controls in the Fragment. Note that
    * some Fragments may not need a Controller and other may need one - and even rely on certain methods
    * implemented in the Controller.
    * @returns the root Control(s) of the Fragment content
    */
  def apply(sName: String, sType: String): Control | js.Array[Control] = js.native
  def apply(sName: String, sType: String, oController: js.Any): Unit = js.native
  def apply(sName: String, sType: String, oController: Controller): Control | js.Array[Control] = js.native
}

