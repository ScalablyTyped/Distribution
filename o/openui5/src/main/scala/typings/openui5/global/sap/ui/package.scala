package typings.openui5.global.sap.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Creates a new instance of a <code>Component</code> or returns the instanceof an existing
  * <code>Component</code>.If you want to look up an existing <code>Component</code> you can callthis
  * function with a Component ID as parameter:<pre>  var oComponent =
  * sap.ui.component(sComponentId);</pre>To create a new instance of a component you pass a component
  * configurationobject into this function:<pre>  var oComponent = sap.ui.component({    name:
  * "my.Component",    url: "my/component/location",    id: "myCompId1"  });</pre>
  * @since 1.15.0
  * @param vConfig ID of an existing Component or the configuration object to create the Component
  * @returns the Component instance or a Promise in case of asynchronous loading
  */
//  Creates a new instance of a Component or returns the instance of an existing Component.
@scala.inline
def component(vConfig: java.lang.String): typings.openui5.sap.ui.core.Component | typings.jquery.JQueryPromise[js.Any] = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("component")(vConfig.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.Component | typings.jquery.JQueryPromise[js.Any]]
@scala.inline
def component(vConfig: js.Any): typings.openui5.sap.ui.core.Component | typings.jquery.JQueryPromise[js.Any] = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("component")(vConfig.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.Component | typings.jquery.JQueryPromise[js.Any]]
@scala.inline
def component(vConfig: typings.openui5.sap.ui.ComponentConfig): typings.jquery.JQueryPromise[typings.openui5.sap.ui.core.Component] | typings.openui5.sap.ui.core.Component = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("component")(vConfig.asInstanceOf[js.Any]).asInstanceOf[typings.jquery.JQueryPromise[typings.openui5.sap.ui.core.Component] | typings.openui5.sap.ui.core.Component]

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
@scala.inline
def controller(sName: java.lang.String): scala.Unit | typings.openui5.sap.ui.core.mvc.Controller = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("controller")(sName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit | typings.openui5.sap.ui.core.mvc.Controller]
@scala.inline
def controller(sName: java.lang.String, oControllerImpl: js.Any): scala.Unit | typings.openui5.sap.ui.core.mvc.Controller = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("controller")(sName.asInstanceOf[js.Any], oControllerImpl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit | typings.openui5.sap.ui.core.mvc.Controller]

@scala.inline
def define(aDependencies: js.Any, vFactory: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("define")(aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def define(sModuleName: java.lang.String, aDependencies: js.Any, vFactory: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("define")(sModuleName.asInstanceOf[js.Any], aDependencies.asInstanceOf[js.Any], vFactory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
//  Defines a Javascript module with its name, its dependencies and a module value or factory.
@scala.inline
def define(vFactory: js.Any): scala.Unit = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("define")(vFactory.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

//  Creates 0.
@scala.inline
def extensionpoint(oContainer: js.Any, sExtName: java.lang.String): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(oContainer: js.Any, sExtName: java.lang.String, fnCreateDefaultContent: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(
  oContainer: js.Any,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: js.Any
): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(
  oContainer: js.Any,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: js.Any,
  sAggregationName: java.lang.String
): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(
  oContainer: js.Any,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: scala.Unit,
  sAggregationName: java.lang.String
): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(
  oContainer: js.Any,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: js.Any
): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(
  oContainer: js.Any,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: js.Any,
  sAggregationName: java.lang.String
): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(
  oContainer: js.Any,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: scala.Unit,
  sAggregationName: java.lang.String
): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def extensionpoint(oContainer: typings.openui5.sap.ui.core.Fragment, sExtName: java.lang.String): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: scala.Unit,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: typings.openui5.sap.ui.core.Control
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: typings.openui5.sap.ui.core.Control,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: scala.Unit,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: typings.openui5.sap.ui.core.Control
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.Fragment,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: typings.openui5.sap.ui.core.Control,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
/**
  * Creates 0..n UI5 controls from an ExtensionPoint.One control if the ExtensionPoint is e.g. filled
  * with a View, zero for ExtensionPoints without configured extension andn controls for multi-root
  * Fragments as extension.In JSViews, this function allows both JSON notation in aggregation content as
  * well as adding an extension point to an aggregation after the target controlhas already been
  * instantiated. In the latter case the optional parameters oTargetControls and oTargetAggregation need
  * to be specified.
  * @param oContainer The view or fragment containing the extension point
  * @param sExtName The extensionName used to identify the extension point in the customizing
  * @param fnCreateDefaultContent Optional callback function creating default content, returning an
  * Array of controls. It is executed            when there's no customizing, if not provided, no default content
  * will be rendered.
  * @param oTargetControl Optional - use this parameter to attach the extension point to a particular
  * aggregation
  * @param sAggregationName Optional - if provided along with oTargetControl, the extension point
  * content is added to this particular aggregation at oTargetControl,            if not given, but an
  * oTargetControl is still present, the function will attempt to add the extension point to the default
  * aggregation of oTargetControl.            If no oTargetControl is provided, sAggregationName will also be
  * ignored.
  * @returns an array with 0..n controls created from an ExtensionPoint
  */
@scala.inline
def extensionpoint(oContainer: typings.openui5.sap.ui.core.mvc.View, sExtName: java.lang.String): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: scala.Unit,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: typings.openui5.sap.ui.core.Control
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: js.Any,
  oTargetControl: typings.openui5.sap.ui.core.Control,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: scala.Unit,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: typings.openui5.sap.ui.core.Control
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def extensionpoint(
  oContainer: typings.openui5.sap.ui.core.mvc.View,
  sExtName: java.lang.String,
  fnCreateDefaultContent: scala.Unit,
  oTargetControl: typings.openui5.sap.ui.core.Control,
  sAggregationName: java.lang.String
): js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("extensionpoint")(oContainer.asInstanceOf[js.Any], sExtName.asInstanceOf[js.Any], fnCreateDefaultContent.asInstanceOf[js.Any], oTargetControl.asInstanceOf[js.Any], sAggregationName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.openui5.sap.ui.core.Control]]

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
@scala.inline
def fragment(sName: java.lang.String, sType: java.lang.String): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def fragment(sName: java.lang.String, sType: java.lang.String, oController: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def fragment(
  sName: java.lang.String,
  sType: java.lang.String,
  oController: typings.openui5.sap.ui.core.mvc.Controller
): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]

//  Instantiate a Fragment - this method loads the Fragment content, instantiates it, and returns this content.
@scala.inline
def fragment_Unit(sName: java.lang.String, sType: java.lang.String): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(sName.asInstanceOf[js.Any], sType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

//  Retrieve the SAPUI5 Core instance for the current window.
//  and returns it or if a library name is specified then the version info of the individual library will be returned.
@scala.inline
def getCore(): typings.openui5.sap.ui.core.Core = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("getCore")().asInstanceOf[typings.openui5.sap.ui.core.Core]

// Loads the version info file (resources/sap-ui-version.json):void;
@scala.inline
def getVersionInfo(): scala.Unit = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")().asInstanceOf[scala.Unit]
/**
  * Loads the version info file (resources/sap-ui-version.json) and returnsit or if a library name is
  * specified then the version info of the individuallibrary will be returned.In case of the version
  * info file is not available an error will occur whencalling this function.
  * @param mOptions name of the library (e.g. "sap.ui.core") or a object map (see below)
  * @returns the full version info, the library specific one,                                  
  * undefined (if library is not listed or there was an error and "failOnError" is set to "false")      
  *                             or a Promise which resolves with one of them
  */
@scala.inline
def getVersionInfo(mOptions: java.lang.String): js.Any | typings.jquery.JQueryPromise[js.Any] = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.Any | typings.jquery.JQueryPromise[js.Any]]
@scala.inline
def getVersionInfo(mOptions: js.Any): js.Any | typings.jquery.JQueryPromise[js.Any] = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.Any | typings.jquery.JQueryPromise[js.Any]]

@scala.inline
def getVersionInfo_Unit(sLibName: java.lang.String): scala.Unit = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("getVersionInfo")(sLibName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

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
@scala.inline
def htmlfragment(sId: java.lang.String, vFragment: java.lang.String): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def htmlfragment(
  sId: java.lang.String,
  vFragment: java.lang.String,
  oController: typings.openui5.sap.ui.core.mvc.Controller
): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def htmlfragment(sId: java.lang.String, vFragment: js.Any): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def htmlfragment(sId: java.lang.String, vFragment: js.Any, oController: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def htmlfragment(sId: java.lang.String, vFragment: js.Any, oController: typings.openui5.sap.ui.core.mvc.Controller): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
//  Instantiates an HTML-based Fragment.
@scala.inline
def htmlfragment(vFragment: js.Any): typings.openui5.sap.ui.core.Fragment = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.Fragment]
@scala.inline
def htmlfragment(vFragment: js.Any, oController: js.Any): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]

@scala.inline
def htmlfragment_Unit(sId: java.lang.String, vFragment: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Defines or creates an instance of a declarative HTML view.The behavior of this method depends on the
  * signature of the call and on the current context.<ul><li>View Definition <code>sap.ui.htmlview(sId,
  * vView)</code>: Defines a view of the given name with the givenimplementation. sId must be the views
  * name, vView must be an object and can containimplementations for any of the hooks provided by
  * HTMLView</li><li>View Instantiation <code>sap.ui.htmlview(sId?, vView)</code>: Creates an instance
  * of the view with the given name (and id)</li>.</ul>Any other call signature will lead to a runtime
  * error. If the id is omitted in the second variant, an id willbe created automatically.
  * @param sId id of the newly created view, only allowed for instance creation
  * @param vView name or implementation of the view.
  * @returns the created HTMLView instance in the creation case, otherwise undefined
  */
@scala.inline
def htmlview(sId: java.lang.String, vView: java.lang.String): typings.openui5.sap.ui.core.mvc.HTMLView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.HTMLView | js.Any]
@scala.inline
def htmlview(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.HTMLView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.HTMLView]
//  Defines or creates an instance of a declarative HTML view.
@scala.inline
def htmlview(vView: js.Any): typings.openui5.sap.ui.core.mvc.HTMLView = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(vView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.mvc.HTMLView]

@scala.inline
def htmlview_Union(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.HTMLView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("htmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.HTMLView | js.Any]

//  Defines OR instantiates an HTML-based Fragment.
@scala.inline
def jsfragment(sFragmentName: java.lang.String): typings.openui5.sap.ui.core.Fragment = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sFragmentName.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.Fragment]
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
@scala.inline
def jsfragment(sId: java.lang.String, sFragmentName: java.lang.String): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sId.asInstanceOf[js.Any], sFragmentName.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def jsfragment(sId: java.lang.String, sFragmentName: java.lang.String, oController: js.Any): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sId.asInstanceOf[js.Any], sFragmentName.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]
@scala.inline
def jsfragment(
  sId: java.lang.String,
  sFragmentName: java.lang.String,
  oController: typings.openui5.sap.ui.core.mvc.Controller
): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sId.asInstanceOf[js.Any], sFragmentName.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def jsfragment(sId: java.lang.String, sFragmentName: js.Any): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sId.asInstanceOf[js.Any], sFragmentName.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def jsfragment(
  sId: java.lang.String,
  sFragmentName: js.Any,
  oController: typings.openui5.sap.ui.core.mvc.Controller
): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sId.asInstanceOf[js.Any], sFragmentName.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]

@scala.inline
def jsfragment_Fragment(sFragmentName: java.lang.String, oController: js.Any): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sFragmentName.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]
@scala.inline
def jsfragment_Fragment(sId: java.lang.String, sFragmentName: java.lang.String): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsfragment")(sId.asInstanceOf[js.Any], sFragmentName.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]

/**
  * Creates a JSON view of the given name and id.The <code>viewName</code> must either correspond to a
  * JSON module that can be loadedvia the module system (viewName + suffix ".view.json") and which
  * defines the view or it mustbe a configuration object for a view.The configuration object can have a
  * viewName, viewContent and a controller property. The viewNamebehaves as described above, viewContent
  * can hold the view description as JSON string or as object literal.<strong>Note</strong>: when an
  * object literal is given, it might be modified during view construction.The controller property can
  * hold an controller instance. If a controller instance is given,it overrides the controller defined
  * in the view.Like with any other control, an id is optional and will be created when missing.
  * @param sId id of the newly created view
  * @param vView name of a view resource or view configuration as described above.
  * @returns the created JSONView instance
  */
@scala.inline
def jsonview(sId: java.lang.String, vView: java.lang.String): typings.openui5.sap.ui.core.mvc.JSONView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSONView]
@scala.inline
def jsonview(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.JSONView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSONView]
//  Creates a JSON view of the given name and id.
@scala.inline
def jsonview(vView: js.Any): typings.openui5.sap.ui.core.mvc.View = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(vView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]

@scala.inline
def jsonview_View(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.View = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsonview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]

/**
  * Defines or creates an instance of a JavaScript view.The behavior of this method depends on the
  * signature of the call and on the current context.<ul><li>View Definition <code>sap.ui.jsview(sId,
  * vView)</code>: Defines a view of the given name with the givenimplementation. sId must be the view's
  * name, vView must be an object and can containimplementations for any of the hooks provided by
  * JSView</li><li>View Instantiation <code>sap.ui.jsview(sId?, vView)</code>: Creates an instance of
  * the view with the given name (and id).If no view implementation has been defined for that view name,
  * a JavaScript module with the same name and with suffix "view.js" will be loadedand executed. The
  * module should contain a view definition (1st. variant above). </li></ul>Any other call signature
  * will lead to a runtime error. If the id is omitted in the second variant, an id willbe created
  * automatically.
  * @param sId id of the newly created view, only allowed for instance creation
  * @param vView name or implementation of the view.
  * @param bAsync defines how the view source is loaded and rendered later on (only relevant for
  * instantiation, ignored for everything else)
  * @returns the created JSView instance in the creation case, otherwise undefined
  */
@scala.inline
def jsview(sId: java.lang.String, vView: java.lang.String): typings.openui5.sap.ui.core.mvc.JSView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSView | js.Any]
@scala.inline
def jsview(sId: java.lang.String, vView: java.lang.String, bAsync: scala.Boolean): typings.openui5.sap.ui.core.mvc.JSView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSView | js.Any]
@scala.inline
def jsview(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.JSView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSView]
@scala.inline
def jsview(sId: java.lang.String, vView: js.Any, bAsync: scala.Boolean): typings.openui5.sap.ui.core.mvc.JSView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any], bAsync.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSView | js.Any]
//  Defines or creates an instance of a JavaScript view.
@scala.inline
def jsview(vView: js.Any): typings.openui5.sap.ui.core.mvc.JSView = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(vView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSView]

@scala.inline
def jsview_Union(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.JSView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("jsview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.JSView | js.Any]

//  Creates a lazy loading stub for a given class sClassName.
@scala.inline
def lazyRequire(sClassName: java.lang.String): scala.Unit = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def lazyRequire(sClassName: java.lang.String, sMethods: java.lang.String): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any], sMethods.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lazyRequire(sClassName: java.lang.String, sMethods: java.lang.String, sModuleName: java.lang.String): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any], sMethods.asInstanceOf[js.Any], sModuleName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def lazyRequire(sClassName: java.lang.String, sMethods: scala.Unit, sModuleName: java.lang.String): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("lazyRequire")(sClassName.asInstanceOf[js.Any], sMethods.asInstanceOf[js.Any], sModuleName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

//  Redirects access to resources that are part of the given namespace to a location relative to the assumed application root folder.
@scala.inline
def localResources(sNamespace: java.lang.String): js.Any = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("localResources")(sNamespace.asInstanceOf[js.Any]).asInstanceOf[js.Any]

/**
  * Redirects access to resources that are part of the given namespace to a locationrelative to the
  * assumed <b>application root folder</b>.Any UI5 managed resource (view, controller, control,
  * JavaScript module, CSS file, etc.)whose resource name starts with <code>sNamespace</code>, will be
  * loaded from anequally named subfolder of the <b>application root folder</b>.If the resource name
  * consists of multiple segments (separated by a dot), each segmentis assumed to represent an
  * individual folder. In other words: when a resource name isconverted to an URL, any dots ('.') are
  * converted to slashes ('/').<b>Limitation:</b> For the time being, the <b>application root folder</b>
  * is assumed to bethe same as the folder where the current page resides in.Usage sample:<pre>  // Let
  * UI5 know that resources, whose name starts with "com.mycompany.myapp"  // should be loaded from the
  * URL location "./com/mycompany/myapp"  sap.ui.localResources("com.mycompany.myapp");  // The
  * following call implicitly will use the mapping done by the previous line  // It will load a view
  * from ./com/mycompany/myapp/views/Main.view.xml  sap.ui.view({ view :
  * "com.mycompany.myapp.views.Main", type : sap.ui.core.mvc.ViewType.XML});</pre>When applications need
  * a more flexible mapping between resource names and their location,they can use {@link
  * jQuery.sap.registerModulePath}.It is intended to make this configuration obsolete in future
  * releases, but for the timebeing, applications must call this method when they want to store
  * resources relative tothe assumed application root folder.
  * @param sNamespace Namespace prefix for which to load resources relative to the application root
  * folder
  */
@scala.inline
def localResources_Unit(sNamespace: java.lang.String): scala.Unit = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("localResources")(sNamespace.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * Ensures that a given a namespace or hierarchy of nested namespaces exists in thecurrent
  * <code>window</code>.
  * @param sNamespace undefined
  * @returns the innermost namespace of the hierarchy
  */
@scala.inline
def namespace(sNamespace: java.lang.String): js.Any = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("namespace")(sNamespace.asInstanceOf[js.Any]).asInstanceOf[js.Any]

/**
  * Resolves one or more module dependencies.<b>Synchronous Retrieval of a Single Module Value</b>When
  * called with a single string, that string is assumed to be the name of an already loadedmodule and
  * the value of that module is returned. If the module has not been loaded yet,or if it is a Non-UI5
  * module (e.g. third party module), <code>undefined</code> is returned.This signature variant allows
  * synchronous access to module values without initiating module loading.Sample:<pre>  var JSONModel =
  * sap.ui.require("sap/ui/model/json/JSONModel");</pre>For modules that are known to be UI5 modules,
  * this signature variant can be used to check whetherthe module has been loaded.<b>Asynchronous
  * Loading of Multiple Modules</b>If an array of strings is given and (optionally) a callback function,
  * then the stringsare interpreted as module names and the corresponding modules (and their
  * transitivedependencies) are loaded. Then the callback function will be called asynchronously.The
  * module values of the specified modules will be provided as parameters to the callbackfunction in the
  * same order in which they appeared in the dependencies array.The return value for the asynchronous
  * use case is <code>undefined</code>.<pre>  sap.ui.require(['sap/ui/model/json/JSONModel',
  * 'sap/ui/core/UIComponent'], function(JSONModel,UIComponent) {    var MyComponent =
  * UIComponent.extend('MyComponent', {      ...    });    ...  });</pre>This method uses the same
  * variation of the {@link jQuery.sap.getResourcePath unified resource name}syntax that {@link
  * sap.ui.define} uses: module names are specified without the implicit extension '.js'.Relative module
  * names are not supported.
  * @param vDependencies dependency (dependencies) to resolve
  * @param fnCallback callback function to execute after resolving an array of dependencies
  * @returns a single module value or undefined
  */
@scala.inline
def require(vDependencies: java.lang.String): js.Any = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("require")(vDependencies.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def require(vDependencies: java.lang.String, fnCallback: js.Any): js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("require")(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
//  Resolves one or more module dependencies.
@scala.inline
def require(vDependencies: js.Any): scala.Unit = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("require")(vDependencies.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def require(vDependencies: js.Any, fnCallback: js.Any): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("require")(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def require(vDependencies: js.Array[java.lang.String]): js.Any = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("require")(vDependencies.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def require(vDependencies: js.Array[java.lang.String], fnCallback: js.Any): js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("require")(vDependencies.asInstanceOf[js.Any], fnCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]

/**
  * Returns the URL of a resource that belongs to the given library and has the given relative location
  * within the library.This is mainly meant for static resources like images that are inside the
  * library.It is NOT meant for access to JavaScript modules or anything for which a different URL has
  * been registered with jQuery.sap.registerModulePath(). Forthese cases use
  * jQuery.sap.getModulePath().It DOES work, however, when the given sResourcePath starts with "themes/"
  * (= when it is a theme-dependent resource). Even when for this theme a differentlocation outside the
  * normal library location is configured.
  * @param sLibraryName the name of a library, like "sap.ui.commons"
  * @param sResourcePath the relative path of a resource inside this library, like "img/mypic.png" or
  * "themes/my_theme/img/mypic.png"
  * @returns the URL of the requested resource
  */
@scala.inline
def resource(sLibraryName: java.lang.String, sResourcePath: java.lang.String): java.lang.String = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("resource")(sLibraryName.asInstanceOf[js.Any], sResourcePath.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

//  Returns the URL of a resource that belongs to the given library and has the given relative location within the library.
@scala.inline
def resource_Unit(sLibraryName: java.lang.String, sResourcePath: java.lang.String): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("resource")(sLibraryName.asInstanceOf[js.Any], sResourcePath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Displays the control tree with the given root inside the area of the givenDOM reference (or inside
  * the DOM node with the given ID) or in the given Control.Example:<pre>  &lt;div
  * id="SAPUI5UiArea">&lt;/div>  &lt;script type="text/javascript">    var oRoot = new
  * sap.ui.commons.Label();    oRoot.setText("Hello world!");    sap.ui.setRoot("SAPUI5UiArea", oRoot); 
  * &lt;/script></pre><p>This is a shortcut for <code>sap.ui.getCore().setRoot()</code>.Internally, if a
  * string is given that does not identify an UIArea or a controlthen implicitly a new
  * <code>UIArea</code> is created for the given DOM referenceand the given control is added.
  * @param oDomRef a DOM Element or Id String of the UIArea
  * @param oControl the Control that should be added to the <code>UIArea</code>.
  */
@scala.inline
def setRoot(oDomRef: java.lang.String, oControl: typings.openui5.sap.ui.base.Interface): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def setRoot(oDomRef: java.lang.String, oControl: typings.openui5.sap.ui.core.Control): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def setRoot(oDomRef: typings.openui5.sap.ui.core.Control, oControl: typings.openui5.sap.ui.base.Interface): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def setRoot(oDomRef: typings.openui5.sap.ui.core.Control, oControl: typings.openui5.sap.ui.core.Control): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def setRoot(oDomRef: typings.openui5.sap.ui.core.Element, oControl: typings.openui5.sap.ui.base.Interface): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def setRoot(oDomRef: typings.openui5.sap.ui.core.Element, oControl: typings.openui5.sap.ui.core.Control): scala.Unit = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("setRoot")(oDomRef.asInstanceOf[js.Any], oControl.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

//  Creates a Template for the given id, dom reference or a configuration object.
@scala.inline
def template(): js.Any = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("template")().asInstanceOf[js.Any]
/**
  * Creates a Template for the given id, dom reference or a configuration object.If no parameter is
  * defined this function makes a lookup of DOM elementswhich are specifying a type attribute. If the
  * value of this type attributematches an registered type then the content of this DOM element will
  * beused to create a new <code>Template</code> instance.If you want to lookup all kind of existing and
  * known templates and parse themdirectly you can simply call:<pre>  sap.ui.template();</pre>To parse a
  * concrete DOM element you can do so by using this function in thefollowing way:<pre> 
  * sap.ui.template("theTemplateId");</pre>Or you can pass the reference to a DOM element and use this
  * DOM element asa source for the template:<pre>  sap.ui.template(oDomRef);</pre>The last option to use
  * this function is to pass the information via aconfiguration object. This configuration object can be
  * used to pass acontext for the templating framework when compiling the template:<pre>  var
  * oTemplateById = sap.ui.template({    id: "theTemplateId",    context: { ... }  });  var
  * oTemplateByDomRef = sap.ui.template({    domref: oDomRef,    context: { ... }  });</pre>It can also
  * be used to load a template from another file:<pre>  var oTemplate = sap.ui.template({    id:
  * "myTemplate",    src: "myTemplate.tmpl"  });  var oTemplateWithContext = sap.ui.template({    id:
  * "myTemplate",    src: "myTemplate.tmpl",    context: { ... }  });</pre>The properties of the
  * configuration object are the following:<ul><li><code>id</code> - the ID of the Template / the ID  of
  * the DOM element containing the source of the Template</li><li><code>domref</code> - the DOM element
  * containing the source of the Template</li><li><code>type</code> - the type of the
  * Template</li><li><code>src</code> - the URL to lookup the template</li>
  * (<i>experimental!</i>)<li><code>control</code> - the fully qualified name of the control to
  * declare</li> (<i>experimental!</i>)</ul>
  * @param oTemplate the id or the DOM reference to the template to lookup or an configuration object
  * containing the src, type and eventually the id of the Template.
  * @returns the created Template instance        or in case of usage without parametes any array of
  * templates is returned
  */
@scala.inline
def template(oTemplate: java.lang.String): js.Any | js.Array[js.Any] = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("template")(oTemplate.asInstanceOf[js.Any]).asInstanceOf[js.Any | js.Array[js.Any]]
@scala.inline
def template(oTemplate: js.Any): js.Any = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("template")(oTemplate.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def template_Union(oTemplate: js.Any): js.Any | js.Array[js.Any] = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("template")(oTemplate.asInstanceOf[js.Any]).asInstanceOf[js.Any | js.Array[js.Any]]

/**
  * Defines or creates an instance of a template view.The behavior of this method depends on the
  * signature of the call and on the current context.<ul><li>View Definition
  * <code>sap.ui.templateview(sId, vView)</code>: Defines a view of the given name with the
  * givenimplementation. sId must be the views name, vView must be an object and can
  * containimplementations for any of the hooks provided by templateview</li><li>View Instantiation
  * <code>sap.ui.templateview(sId?, vView)</code>: Creates an instance of the view with the given name
  * (and id)</li>.</ul>Any other call signature will lead to a runtime error. If the id is omitted in
  * the second variant, an id willbe created automatically.
  * @param sId id of the newly created view, only allowed for instance creation
  * @param vView name or implementation of the view.
  * @returns the created TemplateView instance in the creation case, otherwise undefined
  */
@scala.inline
def templateview(sId: java.lang.String, vView: java.lang.String): typings.openui5.sap.ui.core.mvc.TemplateView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.TemplateView | js.Any]
@scala.inline
def templateview(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.TemplateView | js.Any = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.TemplateView | js.Any]
//  Defines or creates an instance of a template view.
@scala.inline
def templateview(vView: js.Any): typings.openui5.sap.ui.core.mvc.TemplateView = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(vView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.mvc.TemplateView]

@scala.inline
def templateview_TemplateView(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.TemplateView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("templateview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.TemplateView]

//  Creates a view of the given type, name and with the given id.
/**
  * Creates a view of the given type, name and with the given id.The <code>vView</code> configuration
  * object can have the following properties for the viewinstantiation:<ul><li>The ID
  * <code>vView.id</code> specifies an ID for the View instance. If no ID is given,an ID will be
  * generated.</li><li>The view name <code>vView.viewName</code> corresponds to an XML module that can
  * be loadedvia the module system (vView.viewName + suffix ".view.xml")</li><li>The controller instance
  * <code>vView.controller</code> must be a valid controller implementation.The given controller
  * instance overrides the controller defined in the view definition</li><li>The view type
  * <code>vView.type</code> specifies what kind of view will be instantiated. All validview types are
  * listed in the enumeration sap.ui.core.mvc.ViewType.</li><li>The view data
  * <code>vView.viewData</code> can hold user specific data. This data is availableduring the whole
  * lifecycle of the view and the controller</li><li>The view loading mode <code>vView.async</code> must
  * be a boolean and defines if the view source is loadedsynchronously or asynchronously. In async mode,
  * the view is rendered empty initially, and rerenderd with theloaded view
  * content.</li><li><code>vView.preprocessors</code></li> can hold a map from the specified
  * preprocessor type (e.g. "xml") to an array ofpreprocessor configurations; each configuration
  * consists of a <code>preprocessor</code> property (optional whenregistered as on-demand preprocessor)
  * and may contain further preprocessor-specific settings. The preprocessor canbe either a module name
  * as string implementation of {@link sap.ui.core.mvc.View.Preprocessor} or a function according
  * to{@link sap.ui.core.mvc.View.Preprocessor.process}. Do not set properties starting with underscore
  * like <code>_sProperty</code>property, these are reserved for internal purposes. When several
  * preprocessors are provided for one hook, it has to be madesure that they do not conflict when beeing
  * processed serially.<strong>Note</strong>: These preprocessors are only available to this instance.
  * For global oron-demand availability use {@link
  * sap.ui.core.mvc.XMLView.registerPreprocessor}.<strong>Note</strong>: Please note that preprocessors
  * in general are currently only availableto XMLViews.<strong>Note</strong>: Preprocessors only work in
  * async views and will be ignored when the view is instantiatedin sync mode by default, as this could
  * have unexpected side effects. You may override this behaviour by setting thebSyncSupport flag of the
  * preprocessor to true.
  * @param sId id of the newly created view, only allowed for instance creation
  * @param vView the view name or view configuration object
  * @returns the created View instance
  */
@scala.inline
def view(sId: java.lang.String): typings.openui5.sap.ui.core.mvc.View = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]
@scala.inline
def view(sId: java.lang.String, vView: java.lang.String): typings.openui5.sap.ui.core.mvc.View = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]
@scala.inline
def view(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.View = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("view")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]

/**
  * Instantiates an XML-based Fragment.To instantiate a Fragment, call this method as:  
  * sap.ui.xmlfragment([sId], sFragmentName, [oController]);The Fragment instance ID is optional
  * (generated if not given) and will be used as prefix for the ID of allcontained controls. The
  * sFragmentName must correspond to an XML Fragment which can be loadedvia the module system
  * (fragmentName + ".fragment.xml") and which defines the Fragment.If oController is given, the methods
  * referenced in the Fragment will be called on this controller.Note that Fragments may require a
  * Controller to be given and certain methods to be available.Advanced usage:To instantiate a Fragment
  * and optionally directly give the XML definition instead of loading it from a file,call this method
  * as:    sap.ui.xmlfragment(oFragmentConfig, [oController]);The oFragmentConfig object can have a
  * either a "fragmentName" or a "fragmentContent" property.fragmentContent is optional and can hold the
  * Fragment definition as XML string; if notgiven, fragmentName must be given and the Fragment content
  * definition is loaded by the module system.Again, if oController is given, the methods referenced in
  * the Fragment will be called on this controller.
  * @param sId id of the newly created Fragment
  * @param vFragment name of the Fragment (or Fragment configuration as described above, in this case no
  * sId may be given. Instead give the id inside the config object, if desired)
  * @param oController a Controller to be used for event handlers in the Fragment
  * @returns the root Control(s) of the created Fragment instance
  */
@scala.inline
def xmlfragment(sId: java.lang.String, vFragment: java.lang.String): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def xmlfragment(
  sId: java.lang.String,
  vFragment: java.lang.String,
  oController: typings.openui5.sap.ui.core.mvc.Controller
): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def xmlfragment(sId: java.lang.String, vFragment: js.Any): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
@scala.inline
def xmlfragment(sId: java.lang.String, vFragment: js.Any, oController: js.Any): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]
@scala.inline
def xmlfragment(sId: java.lang.String, vFragment: js.Any, oController: typings.openui5.sap.ui.core.mvc.Controller): typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control] = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Control | js.Array[typings.openui5.sap.ui.core.Control]]
//  Instantiates an XML-based Fragment.
@scala.inline
def xmlfragment(vFragment: js.Any): typings.openui5.sap.ui.core.Fragment = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.Fragment]
@scala.inline
def xmlfragment(vFragment: js.Any, oController: js.Any): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(vFragment.asInstanceOf[js.Any], oController.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]

@scala.inline
def xmlfragment_Fragment(sId: java.lang.String, vFragment: js.Any): typings.openui5.sap.ui.core.Fragment = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlfragment")(sId.asInstanceOf[js.Any], vFragment.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.Fragment]

/**
  * Instantiates an XMLView of the given name and with the given ID.The <code>viewName</code> must
  * either correspond to an XML module that can be loadedvia the module system (viewName + suffix
  * ".view.xml") and which defines the view, or it mustbe a configuration object for a view.The
  * configuration object can have a <code>viewName</code>, <code>viewContent</code> and a
  * <code>controller</code> property. The <code>viewName</code> behaves as described above.
  * <code>viewContent</code> is optionaland can hold a view description as XML string or as already
  * parsed XML Document. If not given, the view content definition is loaded by the module
  * system.<strong>Note</strong>: if a <code>Document</code> is given, it might be modified during view
  * construction.<strong>Note</strong>: if you enable caching, you need to take care of the invalidation
  * via keys. Automaticinvalidation takes only place if the UI5 version or the component descriptor
  * (manifest.json) change. This isstill an experimental feature and may experience slight changes of
  * the invalidation parameters or the cachekey format.The controller property can hold an controller
  * instance. If a controller instance is given,it overrides the controller defined in the view.Like
  * with any other control, ID is optional and one will be created automatically.
  * @param sId ID of the newly created view
  * @param vView Name of the view or a view configuration object as described above
  * @param  undefined
  * @returns the created XMLView instance
  */
@scala.inline
def xmlview(sId: java.lang.String, vView: java.lang.String, param: js.Any): typings.openui5.sap.ui.core.mvc.XMLView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.XMLView]
@scala.inline
def xmlview(sId: java.lang.String, vView: js.Any): typings.openui5.sap.ui.core.mvc.View = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]
@scala.inline
def xmlview(sId: java.lang.String, vView: js.Any, param: js.Any): typings.openui5.sap.ui.core.mvc.XMLView = (typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(sId.asInstanceOf[js.Any], vView.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sap.ui.core.mvc.XMLView]
//  Instantiates an XMLView of the given name and with the given id.
@scala.inline
def xmlview(vView: js.Any): typings.openui5.sap.ui.core.mvc.View = typings.openui5.global.sap.ui.^.asInstanceOf[js.Dynamic].applyDynamic("xmlview")(vView.asInstanceOf[js.Any]).asInstanceOf[typings.openui5.sap.ui.core.mvc.View]
