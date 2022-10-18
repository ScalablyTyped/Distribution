package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcControllerExtensionMod {
  
  @JSImport("sap/ui/core/mvc/ControllerExtension", JSImport.Default)
  @js.native
  open class default () extends ControllerExtension
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/mvc/ControllerExtension", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.mvc.ControllerExtension with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ControllerExtension]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ControllerExtension],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.mvc.ControllerExtension.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Override the ControllerExtension class with the given custom extension definition.
      *
      * Only public methods that are not final could be overridden. The lifecycle methods `onInit`, `onExit`,
      * `onBeforeRendering` and `onAfterRendering` are added before or after the lifecycle functions of the original
      * extension.
      *
      * Example for `oExtension`:
      * ```javascript
      *
      * {
      *     onInit: function() {
      *         ...
      *     },
      *     ...
      * }
      * ```
      *
      *
      * **Note:** This static method is automatically propagated to subclasses of `ControllerExtension`.
      *
      * @returns A controller extension class
      */
    inline def `override`(/**
      * The custom extension definition
      */
    oExtension: js.Object): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(oExtension.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  }
  
  @js.native
  trait ControllerExtension
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Returns an Element of the connected view with the given local ID.
      *
      * Views automatically prepend their own ID as a prefix to created Elements to make the IDs unique even
      * in the case of multiple view instances. For a controller extension, the namespace of the control ID gets
      * also prefixed with the namespace of the extension. This method helps to find an element by its local
      * ID only.
      *
      * If no view is connected or if the view doesn't contain an element with the given local ID, `undefined`
      * is returned.
      *
      * @returns Element by its (view local) ID
      */
    def byId(/**
      * View-local ID
      */
    sId: String): typings.openui5.sapUiCoreElementMod.default = js.native
    
    /**
      * Returns the View from the corresponding controller.
      *
      * @returns oView The corresponding view instance
      */
    def getView(): typings.openui5.sapUiCoreMvcViewMod.default = js.native
  }
}
