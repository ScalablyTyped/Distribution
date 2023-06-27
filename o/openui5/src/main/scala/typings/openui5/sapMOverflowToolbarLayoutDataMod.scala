package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.OverflowToolbarPriority
import typings.openui5.sapMToolbarLayoutDataMod.ToolbarLayoutDataSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMOverflowToolbarLayoutDataMod {
  
  @JSImport("sap/m/OverflowToolbarLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `OverflowToolbarLayoutData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends OverflowToolbarLayoutData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: OverflowToolbarLayoutDataSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: OverflowToolbarLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: OverflowToolbarLayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/OverflowToolbarLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.OverflowToolbarLayoutData with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ToolbarLayoutData.extend}.
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
    oClassInfo: ClassInfo[T, OverflowToolbarLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, OverflowToolbarLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.OverflowToolbarLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait OverflowToolbarLayoutData
    extends typings.openui5.sapMToolbarLayoutDataMod.default {
    
    /**
      * @since 1.40
      *
      * Gets current value of property {@link #getCloseOverflowOnInteraction closeOverflowOnInteraction}.
      *
      * Defines whether the overflow area is automatically closed when interacting with a control in it
      *
      * Default value is `true`.
      *
      * @returns Value of property `closeOverflowOnInteraction`
      */
    def getCloseOverflowOnInteraction(): Boolean = js.native
    
    /**
      * @since 1.32
      *
      * Gets current value of property {@link #getGroup group}.
      *
      * Defines OverflowToolbar items group number. Default value is 0, which means that the control does not
      * belong to any group. Elements that belong to a group overflow together. The overall priority of the group
      * is defined by the element with highest priority. Elements that belong to a group are not allowed to have
      * AlwaysOverflow or NeverOverflow priority.
      *
      * Default value is `0`.
      *
      * @returns Value of property `group`
      */
    def getGroup(): int = js.native
    
    /**
      * @deprecated (since 1.32)
      *
      * Gets current value of property {@link #getMoveToOverflow moveToOverflow}.
      *
      * The OverflowToolbar item can or cannot move to the overflow area
      *
      * Default value is `true`.
      *
      * @returns Value of property `moveToOverflow`
      */
    def getMoveToOverflow(): Boolean = js.native
    
    /**
      * @since 1.32
      *
      * Gets current value of property {@link #getPriority priority}.
      *
      * Defines OverflowToolbar items priority. Available priorities are NeverOverflow, High, Low, Disappear
      * and AlwaysOverflow.
      *
      * Default value is `High`.
      *
      * @returns Value of property `priority`
      */
    def getPriority(): OverflowToolbarPriority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OverflowToolbarPriority * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.32)
      *
      * Gets current value of property {@link #getStayInOverflow stayInOverflow}.
      *
      * The OverflowToolbar item can or cannot stay in the overflow area
      *
      * Default value is `false`.
      *
      * @returns Value of property `stayInOverflow`
      */
    def getStayInOverflow(): Boolean = js.native
    
    /**
      * @since 1.40
      *
      * Sets a new value for property {@link #getCloseOverflowOnInteraction closeOverflowOnInteraction}.
      *
      * Defines whether the overflow area is automatically closed when interacting with a control in it
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseOverflowOnInteraction(): this.type = js.native
    def setCloseOverflowOnInteraction(
      /**
      * New value for property `closeOverflowOnInteraction`
      */
    bCloseOverflowOnInteraction: Boolean
    ): this.type = js.native
    
    /**
      * @since 1.32
      *
      * Sets a new value for property {@link #getGroup group}.
      *
      * Defines OverflowToolbar items group number. Default value is 0, which means that the control does not
      * belong to any group. Elements that belong to a group overflow together. The overall priority of the group
      * is defined by the element with highest priority. Elements that belong to a group are not allowed to have
      * AlwaysOverflow or NeverOverflow priority.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroup(): this.type = js.native
    def setGroup(/**
      * New value for property `group`
      */
    iGroup: int): this.type = js.native
    
    /**
      * @deprecated (since 1.32)
      *
      * Sets a new value for property {@link #getMoveToOverflow moveToOverflow}.
      *
      * The OverflowToolbar item can or cannot move to the overflow area
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMoveToOverflow(): this.type = js.native
    def setMoveToOverflow(/**
      * New value for property `moveToOverflow`
      */
    bMoveToOverflow: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.32)
      *
      * Sets a new value for property {@link #getStayInOverflow stayInOverflow}.
      *
      * The OverflowToolbar item can or cannot stay in the overflow area
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStayInOverflow(): this.type = js.native
    def setStayInOverflow(/**
      * New value for property `stayInOverflow`
      */
    bStayInOverflow: Boolean): this.type = js.native
  }
  
  trait OverflowToolbarLayoutDataSettings
    extends StObject
       with ToolbarLayoutDataSettings {
    
    /**
      * @since 1.40
      *
      * Defines whether the overflow area is automatically closed when interacting with a control in it
      */
    var closeOverflowOnInteraction: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.32
      *
      * Defines OverflowToolbar items group number. Default value is 0, which means that the control does not
      * belong to any group. Elements that belong to a group overflow together. The overall priority of the group
      * is defined by the element with highest priority. Elements that belong to a group are not allowed to have
      * AlwaysOverflow or NeverOverflow priority.
      */
    var group: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.32)
      *
      * The OverflowToolbar item can or cannot move to the overflow area
      */
    var moveToOverflow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.32
      *
      * Defines OverflowToolbar items priority. Available priorities are NeverOverflow, High, Low, Disappear
      * and AlwaysOverflow.
      */
    var priority: js.UndefOr[
        OverflowToolbarPriority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OverflowToolbarPriority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @deprecated (since 1.32)
      *
      * The OverflowToolbar item can or cannot stay in the overflow area
      */
    var stayInOverflow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object OverflowToolbarLayoutDataSettings {
    
    inline def apply(): OverflowToolbarLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowToolbarLayoutDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowToolbarLayoutDataSettings] (val x: Self) extends AnyVal {
      
      inline def setCloseOverflowOnInteraction(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closeOverflowOnInteraction", value.asInstanceOf[js.Any])
      
      inline def setCloseOverflowOnInteractionUndefined: Self = StObject.set(x, "closeOverflowOnInteraction", js.undefined)
      
      inline def setGroup(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setMoveToOverflow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "moveToOverflow", value.asInstanceOf[js.Any])
      
      inline def setMoveToOverflowUndefined: Self = StObject.set(x, "moveToOverflow", js.undefined)
      
      inline def setPriority(
        value: OverflowToolbarPriority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OverflowToolbarPriority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setStayInOverflow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stayInOverflow", value.asInstanceOf[js.Any])
      
      inline def setStayInOverflowUndefined: Self = StObject.set(x, "stayInOverflow", js.undefined)
    }
  }
}
