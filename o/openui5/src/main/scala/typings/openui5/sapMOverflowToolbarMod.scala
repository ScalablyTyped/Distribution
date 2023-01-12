package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMToolbarMod.ToolbarSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMOverflowToolbarMod {
  
  @JSImport("sap/m/OverflowToolbar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `OverflowToolbar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/toolbar-overview/#overflow-generic Overflow
    * Toolbar}
    */
  open class default () extends OverflowToolbar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: OverflowToolbarSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: OverflowToolbarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: OverflowToolbarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/OverflowToolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.OverflowToolbar with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Toolbar.extend}.
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
    oClassInfo: ClassInfo[T, OverflowToolbar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, OverflowToolbar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.OverflowToolbar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait OverflowToolbar
    extends typings.openui5.sapMToolbarMod.default {
    
    /**
      * Moves each control in the suitable collection - Popover only, movable controls and toolbar only
      */
    def _moveControlInSuitableCollection(oControl: Unit, sPriority: Unit): Unit = js.native
    
    /**
      * Removes Control from collections
      */
    def _removeContentFromControlsCollections(oControl: Unit): Unit = js.native
    
    /**
      * @SINCE 1.40
      *
      * Closes the overflow area. Useful to manually close the overflow after having suppressed automatic closing
      * with "closeOverflowOnInteraction=false".
      */
    def closeOverflow(): Unit = js.native
    
    /**
      * @SINCE 1.67
      *
      * Gets current value of property {@link #getAsyncMode asyncMode}.
      *
      * Defines whether the `OverflowToolbar` works in async mode.
      *
      * **Note:** When this property is set to `true`, the `OverflowToolbar` makes its layout recalculations
      * asynchronously. This way it is not blocking the thread immediately after re-rendering or resizing. However,
      * it may lead to flickering, when there is a change in the width of the content of the `OverflowToolbar`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `asyncMode`
      */
    def getAsyncMode(): Boolean = js.native
    
    /**
      * @SINCE 1.67
      *
      * Sets the `asyncMode` property.
      *
      * @returns `this` pointer for chaining
      */
    def setAsyncMode(bValue: Boolean): this.type = js.native
  }
  
  trait OverflowToolbarSettings
    extends StObject
       with ToolbarSettings {
    
    /**
      * @SINCE 1.67
      *
      * Defines whether the `OverflowToolbar` works in async mode.
      *
      * **Note:** When this property is set to `true`, the `OverflowToolbar` makes its layout recalculations
      * asynchronously. This way it is not blocking the thread immediately after re-rendering or resizing. However,
      * it may lead to flickering, when there is a change in the width of the content of the `OverflowToolbar`.
      */
    var asyncMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object OverflowToolbarSettings {
    
    inline def apply(): OverflowToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowToolbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowToolbarSettings] (val x: Self) extends AnyVal {
      
      inline def setAsyncMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "asyncMode", value.asInstanceOf[js.Any])
      
      inline def setAsyncModeUndefined: Self = StObject.set(x, "asyncMode", js.undefined)
    }
  }
}
