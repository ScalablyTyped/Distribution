package typings.openui5

import typings.openui5.anon.ControlType
import typings.openui5.anon.Editable
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestOpaPluginMod {
  
  @JSImport("sap/ui/test/OpaPlugin", JSImport.Default)
  @js.native
  open class default () extends OpaPlugin
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/OpaPlugin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.OpaPlugin with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, OpaPlugin]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, OpaPlugin],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.OpaPlugin.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait OpaPlugin
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Gets all the controls or elements of a certain type that are currently instantiated. If the type is omitted,
      * all controls and elements are returned.
      *
      * @returns an array of the found controls (can be empty)
      */
    def getAllControls(): js.Array[Any] = js.native
    def getAllControls(/**
      * the control type, e.g: sap.m.CheckBox
      */
    fnConstructorType: js.Function): js.Array[Any] = js.native
    def getAllControls(
      /**
      * the control type, e.g: sap.m.CheckBox
      */
    fnConstructorType: js.Function,
      /**
      * optional control type name, e.g: "sap.m.CheckBox"
      */
    sControlType: String
    ): js.Array[Any] = js.native
    def getAllControls(
      /**
      * the control type, e.g: sap.m.CheckBox
      */
    fnConstructorType: Unit,
      /**
      * optional control type name, e.g: "sap.m.CheckBox"
      */
    sControlType: String
    ): js.Array[Any] = js.native
    
    /**
      * Find a control by its global ID.
      *
      * @returns all matching controls
      * 	 - if a oOptions.id is a string, will return the single matching control or null if no controls match
      *
      * 	 - otherwise, will return an array of matching controls, or an empty array, if no controls match
      */
    def getControlByGlobalId(/**
      * a map of match conditions. Must contain an id property
      */
    oOptions: ControlType): typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default] | Null = js.native
    
    /**
      * Gets the constructor function of a certain controlType
      *
      * @returns When the type is loaded, the contstructor is returned, if it is a lazy stub or not yet loaded,
      * null will be returned and there will be a log entry.
      */
    def getControlConstructor(/**
      * the name of the type eg: "sap.m.Button"
      */
    sControlType: String): Null | js.Function = js.native
    
    /**
      * Gets a control inside the view (same as calling oView.byId) Returns all matching controls inside a view
      * (also nested views and their children).
      *  The view can be specified by viewName, viewNamespace, viewId, and any combination of three. eg : { id
      * : "foo" } will search globally for a control with the ID foo
      *  eg : { id : "foo" , viewName : "bar" } will search for a control with the ID foo inside the view with
      * the name bar
      *  eg : { viewName : "bar" } will return all the controls inside the view with the name bar
      *  eg : { viewName : "bar", controlType : sap.m.Button } will return all the Buttons inside a view with
      * the name bar
      *  eg : { viewName : "bar", viewNamespace : "baz." } will return all the Controls in the view with the
      * name baz.bar
      *  eg : { viewId : "viewBar" } will return all the controls inside the view with the ID viewBar
      *
      *
      * @returns If oOptions.id is a string, will return the control with such an ID or null.
      *  If the view is not found or no control matches the given criteria, will return an empty array
      *  Otherwise, will return an array of matching controls
      */
    def getControlInView(
      /**
      * can contain a viewName, viewNamespace, viewId, fragmentId, id and controlType properties. oOptions.id
      * can be string, array or regular expression
      */
    oOptions: js.Object
    ): typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default] | Null = js.native
    
    /**
      * Find a control matching the provided options
      *
      * @returns
      * 	 - if a oOptions.id is a string, will return the single matching control or null if no controls match
      *
      * 	 - otherwise, will return an array of matching controls, or an empty array, if no controls match
      */
    def getMatchingControls(): typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default] | Null = js.native
    def getMatchingControls(/**
      * a map of options used to describe the control you are looking for.
      */
    oOptions: Editable): typings.openui5.sapUiCoreElementMod.default | js.Array[typings.openui5.sapUiCoreElementMod.default] | Null = js.native
    
    /**
      * Returns the view with a specific name. The result should be a unique view. If there are multiple visible
      * views with that name, none will be returned.
      *
      * @returns Unique view or `undefined`
      */
    def getView(/**
      * Name of the view
      */
    sViewName: String): js.UndefOr[typings.openui5.sapUiCoreMvcViewMod.default] = js.native
  }
}
