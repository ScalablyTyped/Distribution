package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiLayoutLibraryMod.GridIndent
import typings.openui5.sapUiLayoutLibraryMod.GridSpan
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutGridDataMod {
  
  @JSImport("sap/ui/layout/GridData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `GridData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:43ae317cf39640a88bc8be979d2671df Grid}
    * 	{@link topic:32d4b9c2b981425dbc374d3e9d5d0c2e Grid Controls}
    */
  open class default () extends GridData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridDataSettings) = this()
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
    mSettings: GridDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/GridData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.GridData with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, GridData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.GridData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getIndent indent}.
      *
      * A string type that represents the indent values of the `Grid` for large, medium and small screens.
      *
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 11 that
      * the container has to take, for example, `L2 M4 S6`, `M11`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * @returns Value of property `indent`
      */
    def getIndent(): GridIndent = js.native
    
    /**
      * Gets current value of property {@link #getIndentL indentL}.
      *
      * Optional. Defines an indent value for large screens. This value overwrites the value for large screens
      * defined in the `indent` property.
      *
      * @returns Value of property `indentL`
      */
    def getIndentL(): int = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `indentL` property instead.
      *
      * Gets current value of property {@link #getIndentLarge indentLarge}.
      *
      * Deprecated. Defines an indent value for large screens. This value overwrites the value for large screens
      * defined in the `indent` property.
      *
      * @returns Value of property `indentLarge`
      */
    def getIndentLarge(): int = js.native
    
    /**
      * Gets current value of property {@link #getIndentM indentM}.
      *
      * Optional. Defines an indent value for medium size screens. This value overwrites the value for medium
      * screens defined in the `indent` property.
      *
      * @returns Value of property `indentM`
      */
    def getIndentM(): int = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `indentM` property instead.
      *
      * Gets current value of property {@link #getIndentMedium indentMedium}.
      *
      * Deprecated. Defines an indent value for medium screens. This value overwrites the value for medium screens
      * defined in the `indent` property.
      *
      * @returns Value of property `indentMedium`
      */
    def getIndentMedium(): int = js.native
    
    /**
      * Gets current value of property {@link #getIndentS indentS}.
      *
      * Optional. Defines an indent value for small screens. This value overwrites the value for small screens
      * defined in the `indent` property.
      *
      * @returns Value of property `indentS`
      */
    def getIndentS(): int = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use `indentS` property instead.
      *
      * Gets current value of property {@link #getIndentSmall indentSmall}.
      *
      * Deprecated. Defines an indent value for small screens. This value overwrites the value for small screens
      * defined in the `indent` property.
      *
      * @returns Value of property `indentSmall`
      */
    def getIndentSmall(): int = js.native
    
    /**
      * Gets current value of property {@link #getIndentXL indentXL}.
      *
      * Optional. Defines an indent value for extra large screens. This value overwrites the value for extra
      * large screens defined in the `indent` property.
      *
      * @returns Value of property `indentXL`
      */
    def getIndentXL(): int = js.native
    
    /**
      * Gets current value of property {@link #getLinebreak linebreak}.
      *
      * Optional. If set to `true`, the control causes a line break on all-size screens within the `Grid` and
      * becomes the first within the next line.
      *
      * Default value is `false`.
      *
      * @returns Value of property `linebreak`
      */
    def getLinebreak(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLinebreakL linebreakL}.
      *
      * Optional. If set to `true`, the control causes a line break on large screens within the `Grid` and becomes
      * the first within the next line.
      *
      * Default value is `false`.
      *
      * @returns Value of property `linebreakL`
      */
    def getLinebreakL(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLinebreakM linebreakM}.
      *
      * Optional. If set to `true`, the control causes a line break on medium screens within the `Grid` and becomes
      * the first within the next line.
      *
      * Default value is `false`.
      *
      * @returns Value of property `linebreakM`
      */
    def getLinebreakM(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLinebreakS linebreakS}.
      *
      * Optional. If set to `true`, the control causes a line break on small screens within the `Grid` and becomes
      * the first within the next line.
      *
      * Default value is `false`.
      *
      * @returns Value of property `linebreakS`
      */
    def getLinebreakS(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLinebreakXL linebreakXL}.
      *
      * Optional. If set to `true`, the control causes a line break on extra large screens within the `Grid`
      * and becomes the first within the next line.
      *
      * Default value is `false`.
      *
      * @returns Value of property `linebreakXL`
      */
    def getLinebreakXL(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMoveBackwards moveBackwards}.
      *
      * Optional. Moves a cell backwards with as many columns as specified.
      *
      * @returns Value of property `moveBackwards`
      */
    def getMoveBackwards(): GridIndent = js.native
    
    /**
      * Gets current value of property {@link #getMoveForward moveForward}.
      *
      * Optional. Moves a cell forwards with as many columns as specified.
      *
      * @returns Value of property `moveForward`
      */
    def getMoveForward(): GridIndent = js.native
    
    /**
      * Gets current value of property {@link #getSpan span}.
      *
      * A string type that represents the span values of the `Grid` for large, medium and small screens.
      *
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 12 that
      * the container has to take, for example: `L2 M4 S6`, `M12`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * @returns Value of property `span`
      */
    def getSpan(): GridSpan = js.native
    
    /**
      * Gets current value of property {@link #getSpanL spanL}.
      *
      * Optional. Defines a span value for large screens. This value overwrites the value for large screens defined
      * in the `span` property.
      *
      * @returns Value of property `spanL`
      */
    def getSpanL(): int = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanL` property instead.
      *
      * Gets current value of property {@link #getSpanLarge spanLarge}.
      *
      * Deprecated. Defines a span value for large screens. This value overwrites the value for large screens
      * defined in the `span` property.
      *
      * @returns Value of property `spanLarge`
      */
    def getSpanLarge(): int = js.native
    
    /**
      * Gets current value of property {@link #getSpanM spanM}.
      *
      * Optional. Defines a span value for medium size screens. This value overwrites the value for medium screens
      * defined in the `span` property.
      *
      * @returns Value of property `spanM`
      */
    def getSpanM(): int = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanM` property instead.
      *
      * Gets current value of property {@link #getSpanMedium spanMedium}.
      *
      * Deprecated. Defines a span value for medium screens. This value overwrites the value for medium screens
      * defined in the `span` property.
      *
      * @returns Value of property `spanMedium`
      */
    def getSpanMedium(): int = js.native
    
    /**
      * Gets current value of property {@link #getSpanS spanS}.
      *
      * Optional. Defines a span value for small screens. This value overwrites the value for small screens defined
      * in the `span` property.
      *
      * @returns Value of property `spanS`
      */
    def getSpanS(): int = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanS` property instead.
      *
      * Gets current value of property {@link #getSpanSmall spanSmall}.
      *
      * Deprecated. Defines a span value for small screens. This value overwrites the value for small screens
      * defined in the `span` property.
      *
      * @returns Value of property `spanSmall`
      */
    def getSpanSmall(): int = js.native
    
    /**
      * Gets current value of property {@link #getSpanXL spanXL}.
      *
      * Optional. Defines a span value for extra large screens. This value overwrites the value for extra large
      * screens defined in the `span` property.
      *
      * @returns Value of property `spanXL`
      */
    def getSpanXL(): int = js.native
    
    /**
      * Gets current value of property {@link #getVisibleL visibleL}.
      *
      * Defines if this control is visible on large screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleL`
      */
    def getVisibleL(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleM visibleM}.
      *
      * Defines if this control is visible on medium screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleM`
      */
    def getVisibleM(): Boolean = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleL` property instead.
      *
      * Gets current value of property {@link #getVisibleOnLarge visibleOnLarge}.
      *
      * Deprecated. Defines if this control is visible on large screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleOnLarge`
      */
    def getVisibleOnLarge(): Boolean = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleM` property instead.
      *
      * Gets current value of property {@link #getVisibleOnMedium visibleOnMedium}.
      *
      * Deprecated. Defines if this control is visible on medium screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleOnMedium`
      */
    def getVisibleOnMedium(): Boolean = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleS` property instead.
      *
      * Gets current value of property {@link #getVisibleOnSmall visibleOnSmall}.
      *
      * Deprecated. Defines if this control is visible on small screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleOnSmall`
      */
    def getVisibleOnSmall(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleS visibleS}.
      *
      * Defines if this control is visible on small screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleS`
      */
    def getVisibleS(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleXL visibleXL}.
      *
      * Defines if this control is visible on extra Large screens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleXL`
      */
    def getVisibleXL(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getIndent indent}.
      *
      * A string type that represents the indent values of the `Grid` for large, medium and small screens.
      *
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 11 that
      * the container has to take, for example, `L2 M4 S6`, `M11`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndent(): this.type = js.native
    def setIndent(/**
      * New value for property `indent`
      */
    sIndent: GridIndent): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndentL indentL}.
      *
      * Optional. Defines an indent value for large screens. This value overwrites the value for large screens
      * defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentL(): this.type = js.native
    def setIndentL(/**
      * New value for property `indentL`
      */
    iIndentL: int): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `indentL` property instead.
      *
      * Sets a new value for property {@link #getIndentLarge indentLarge}.
      *
      * Deprecated. Defines an indent value for large screens. This value overwrites the value for large screens
      * defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentLarge(): this.type = js.native
    def setIndentLarge(/**
      * New value for property `indentLarge`
      */
    iIndentLarge: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndentM indentM}.
      *
      * Optional. Defines an indent value for medium size screens. This value overwrites the value for medium
      * screens defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentM(): this.type = js.native
    def setIndentM(/**
      * New value for property `indentM`
      */
    iIndentM: int): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `indentM` property instead.
      *
      * Sets a new value for property {@link #getIndentMedium indentMedium}.
      *
      * Deprecated. Defines an indent value for medium screens. This value overwrites the value for medium screens
      * defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentMedium(): this.type = js.native
    def setIndentMedium(/**
      * New value for property `indentMedium`
      */
    iIndentMedium: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndentS indentS}.
      *
      * Optional. Defines an indent value for small screens. This value overwrites the value for small screens
      * defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentS(): this.type = js.native
    def setIndentS(/**
      * New value for property `indentS`
      */
    iIndentS: int): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use `indentS` property instead.
      *
      * Sets a new value for property {@link #getIndentSmall indentSmall}.
      *
      * Deprecated. Defines an indent value for small screens. This value overwrites the value for small screens
      * defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentSmall(): this.type = js.native
    def setIndentSmall(/**
      * New value for property `indentSmall`
      */
    iIndentSmall: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndentXL indentXL}.
      *
      * Optional. Defines an indent value for extra large screens. This value overwrites the value for extra
      * large screens defined in the `indent` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndentXL(): this.type = js.native
    def setIndentXL(/**
      * New value for property `indentXL`
      */
    iIndentXL: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreak linebreak}.
      *
      * Optional. If set to `true`, the control causes a line break on all-size screens within the `Grid` and
      * becomes the first within the next line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreak(): this.type = js.native
    def setLinebreak(/**
      * New value for property `linebreak`
      */
    bLinebreak: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreakL linebreakL}.
      *
      * Optional. If set to `true`, the control causes a line break on large screens within the `Grid` and becomes
      * the first within the next line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreakL(): this.type = js.native
    def setLinebreakL(/**
      * New value for property `linebreakL`
      */
    bLinebreakL: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreakM linebreakM}.
      *
      * Optional. If set to `true`, the control causes a line break on medium screens within the `Grid` and becomes
      * the first within the next line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreakM(): this.type = js.native
    def setLinebreakM(/**
      * New value for property `linebreakM`
      */
    bLinebreakM: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreakS linebreakS}.
      *
      * Optional. If set to `true`, the control causes a line break on small screens within the `Grid` and becomes
      * the first within the next line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreakS(): this.type = js.native
    def setLinebreakS(/**
      * New value for property `linebreakS`
      */
    bLinebreakS: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLinebreakXL linebreakXL}.
      *
      * Optional. If set to `true`, the control causes a line break on extra large screens within the `Grid`
      * and becomes the first within the next line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLinebreakXL(): this.type = js.native
    def setLinebreakXL(/**
      * New value for property `linebreakXL`
      */
    bLinebreakXL: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMoveBackwards moveBackwards}.
      *
      * Optional. Moves a cell backwards with as many columns as specified.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMoveBackwards(): this.type = js.native
    def setMoveBackwards(/**
      * New value for property `moveBackwards`
      */
    sMoveBackwards: GridIndent): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMoveForward moveForward}.
      *
      * Optional. Moves a cell forwards with as many columns as specified.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMoveForward(): this.type = js.native
    def setMoveForward(/**
      * New value for property `moveForward`
      */
    sMoveForward: GridIndent): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSpan span}.
      *
      * A string type that represents the span values of the `Grid` for large, medium and small screens.
      *
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 12 that
      * the container has to take, for example: `L2 M4 S6`, `M12`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpan(): this.type = js.native
    def setSpan(/**
      * New value for property `span`
      */
    sSpan: GridSpan): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSpanL spanL}.
      *
      * Optional. Defines a span value for large screens. This value overwrites the value for large screens defined
      * in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanL(): this.type = js.native
    def setSpanL(/**
      * New value for property `spanL`
      */
    iSpanL: int): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanL` property instead.
      *
      * Sets a new value for property {@link #getSpanLarge spanLarge}.
      *
      * Deprecated. Defines a span value for large screens. This value overwrites the value for large screens
      * defined in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanLarge(): this.type = js.native
    def setSpanLarge(/**
      * New value for property `spanLarge`
      */
    iSpanLarge: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSpanM spanM}.
      *
      * Optional. Defines a span value for medium size screens. This value overwrites the value for medium screens
      * defined in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanM(): this.type = js.native
    def setSpanM(/**
      * New value for property `spanM`
      */
    iSpanM: int): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanM` property instead.
      *
      * Sets a new value for property {@link #getSpanMedium spanMedium}.
      *
      * Deprecated. Defines a span value for medium screens. This value overwrites the value for medium screens
      * defined in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanMedium(): this.type = js.native
    def setSpanMedium(/**
      * New value for property `spanMedium`
      */
    iSpanMedium: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSpanS spanS}.
      *
      * Optional. Defines a span value for small screens. This value overwrites the value for small screens defined
      * in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanS(): this.type = js.native
    def setSpanS(/**
      * New value for property `spanS`
      */
    iSpanS: int): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanS` property instead.
      *
      * Sets a new value for property {@link #getSpanSmall spanSmall}.
      *
      * Deprecated. Defines a span value for small screens. This value overwrites the value for small screens
      * defined in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanSmall(): this.type = js.native
    def setSpanSmall(/**
      * New value for property `spanSmall`
      */
    iSpanSmall: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSpanXL spanXL}.
      *
      * Optional. Defines a span value for extra large screens. This value overwrites the value for extra large
      * screens defined in the `span` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSpanXL(): this.type = js.native
    def setSpanXL(/**
      * New value for property `spanXL`
      */
    iSpanXL: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleL visibleL}.
      *
      * Defines if this control is visible on large screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleL(): this.type = js.native
    def setVisibleL(/**
      * New value for property `visibleL`
      */
    bVisibleL: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleM visibleM}.
      *
      * Defines if this control is visible on medium screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleM(): this.type = js.native
    def setVisibleM(/**
      * New value for property `visibleM`
      */
    bVisibleM: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleL` property instead.
      *
      * Sets a new value for property {@link #getVisibleOnLarge visibleOnLarge}.
      *
      * Deprecated. Defines if this control is visible on large screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleOnLarge(): this.type = js.native
    def setVisibleOnLarge(/**
      * New value for property `visibleOnLarge`
      */
    bVisibleOnLarge: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleM` property instead.
      *
      * Sets a new value for property {@link #getVisibleOnMedium visibleOnMedium}.
      *
      * Deprecated. Defines if this control is visible on medium screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleOnMedium(): this.type = js.native
    def setVisibleOnMedium(/**
      * New value for property `visibleOnMedium`
      */
    bVisibleOnMedium: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleS` property instead.
      *
      * Sets a new value for property {@link #getVisibleOnSmall visibleOnSmall}.
      *
      * Deprecated. Defines if this control is visible on small screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleOnSmall(): this.type = js.native
    def setVisibleOnSmall(/**
      * New value for property `visibleOnSmall`
      */
    bVisibleOnSmall: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleS visibleS}.
      *
      * Defines if this control is visible on small screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleS(): this.type = js.native
    def setVisibleS(/**
      * New value for property `visibleS`
      */
    bVisibleS: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleXL visibleXL}.
      *
      * Defines if this control is visible on extra Large screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleXL(): this.type = js.native
    def setVisibleXL(/**
      * New value for property `visibleXL`
      */
    bVisibleXL: Boolean): this.type = js.native
  }
  
  trait GridDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * A string type that represents the indent values of the `Grid` for large, medium and small screens.
      *
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 11 that
      * the container has to take, for example, `L2 M4 S6`, `M11`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      */
    var indent: js.UndefOr[
        GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Defines an indent value for large screens. This value overwrites the value for large screens
      * defined in the `indent` property.
      */
    var indentL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `indentL` property instead.
      *
      * Deprecated. Defines an indent value for large screens. This value overwrites the value for large screens
      * defined in the `indent` property.
      */
    var indentLarge: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Defines an indent value for medium size screens. This value overwrites the value for medium
      * screens defined in the `indent` property.
      */
    var indentM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `indentM` property instead.
      *
      * Deprecated. Defines an indent value for medium screens. This value overwrites the value for medium screens
      * defined in the `indent` property.
      */
    var indentMedium: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Defines an indent value for small screens. This value overwrites the value for small screens
      * defined in the `indent` property.
      */
    var indentS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use `indentS` property instead.
      *
      * Deprecated. Defines an indent value for small screens. This value overwrites the value for small screens
      * defined in the `indent` property.
      */
    var indentSmall: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Defines an indent value for extra large screens. This value overwrites the value for extra
      * large screens defined in the `indent` property.
      */
    var indentXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. If set to `true`, the control causes a line break on all-size screens within the `Grid` and
      * becomes the first within the next line.
      */
    var linebreak: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. If set to `true`, the control causes a line break on large screens within the `Grid` and becomes
      * the first within the next line.
      */
    var linebreakL: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. If set to `true`, the control causes a line break on medium screens within the `Grid` and becomes
      * the first within the next line.
      */
    var linebreakM: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. If set to `true`, the control causes a line break on small screens within the `Grid` and becomes
      * the first within the next line.
      */
    var linebreakS: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. If set to `true`, the control causes a line break on extra large screens within the `Grid`
      * and becomes the first within the next line.
      */
    var linebreakXL: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Moves a cell backwards with as many columns as specified.
      */
    var moveBackwards: js.UndefOr[
        GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Moves a cell forwards with as many columns as specified.
      */
    var moveForward: js.UndefOr[
        GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A string type that represents the span values of the `Grid` for large, medium and small screens.
      *
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 12 that
      * the container has to take, for example: `L2 M4 S6`, `M12`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      */
    var span: js.UndefOr[
        GridSpan | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Defines a span value for large screens. This value overwrites the value for large screens defined
      * in the `span` property.
      */
    var spanL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanL` property instead.
      *
      * Deprecated. Defines a span value for large screens. This value overwrites the value for large screens
      * defined in the `span` property.
      */
    var spanLarge: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Defines a span value for medium size screens. This value overwrites the value for medium screens
      * defined in the `span` property.
      */
    var spanM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanM` property instead.
      *
      * Deprecated. Defines a span value for medium screens. This value overwrites the value for medium screens
      * defined in the `span` property.
      */
    var spanMedium: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Defines a span value for small screens. This value overwrites the value for small screens defined
      * in the `span` property.
      */
    var spanS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `spanS` property instead.
      *
      * Deprecated. Defines a span value for small screens. This value overwrites the value for small screens
      * defined in the `span` property.
      */
    var spanSmall: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Defines a span value for extra large screens. This value overwrites the value for extra large
      * screens defined in the `span` property.
      */
    var spanXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines if this control is visible on large screens.
      */
    var visibleL: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if this control is visible on medium screens.
      */
    var visibleM: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleL` property instead.
      *
      * Deprecated. Defines if this control is visible on large screens.
      */
    var visibleOnLarge: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleM` property instead.
      *
      * Deprecated. Defines if this control is visible on medium screens.
      */
    var visibleOnMedium: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.17.1) - Use the `visibleS` property instead.
      *
      * Deprecated. Defines if this control is visible on small screens.
      */
    var visibleOnSmall: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if this control is visible on small screens.
      */
    var visibleS: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if this control is visible on extra Large screens.
      */
    var visibleXL: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridDataSettings {
    
    inline def apply(): GridDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridDataSettings] (val x: Self) extends AnyVal {
      
      inline def setIndent(value: GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentL", value.asInstanceOf[js.Any])
      
      inline def setIndentLUndefined: Self = StObject.set(x, "indentL", js.undefined)
      
      inline def setIndentLarge(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentLarge", value.asInstanceOf[js.Any])
      
      inline def setIndentLargeUndefined: Self = StObject.set(x, "indentLarge", js.undefined)
      
      inline def setIndentM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentM", value.asInstanceOf[js.Any])
      
      inline def setIndentMUndefined: Self = StObject.set(x, "indentM", js.undefined)
      
      inline def setIndentMedium(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentMedium", value.asInstanceOf[js.Any])
      
      inline def setIndentMediumUndefined: Self = StObject.set(x, "indentMedium", js.undefined)
      
      inline def setIndentS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentS", value.asInstanceOf[js.Any])
      
      inline def setIndentSUndefined: Self = StObject.set(x, "indentS", js.undefined)
      
      inline def setIndentSmall(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentSmall", value.asInstanceOf[js.Any])
      
      inline def setIndentSmallUndefined: Self = StObject.set(x, "indentSmall", js.undefined)
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIndentXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indentXL", value.asInstanceOf[js.Any])
      
      inline def setIndentXLUndefined: Self = StObject.set(x, "indentXL", js.undefined)
      
      inline def setLinebreak(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
      
      inline def setLinebreakL(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreakL", value.asInstanceOf[js.Any])
      
      inline def setLinebreakLUndefined: Self = StObject.set(x, "linebreakL", js.undefined)
      
      inline def setLinebreakM(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreakM", value.asInstanceOf[js.Any])
      
      inline def setLinebreakMUndefined: Self = StObject.set(x, "linebreakM", js.undefined)
      
      inline def setLinebreakS(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreakS", value.asInstanceOf[js.Any])
      
      inline def setLinebreakSUndefined: Self = StObject.set(x, "linebreakS", js.undefined)
      
      inline def setLinebreakUndefined: Self = StObject.set(x, "linebreak", js.undefined)
      
      inline def setLinebreakXL(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "linebreakXL", value.asInstanceOf[js.Any])
      
      inline def setLinebreakXLUndefined: Self = StObject.set(x, "linebreakXL", js.undefined)
      
      inline def setMoveBackwards(value: GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "moveBackwards", value.asInstanceOf[js.Any])
      
      inline def setMoveBackwardsUndefined: Self = StObject.set(x, "moveBackwards", js.undefined)
      
      inline def setMoveForward(value: GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
      
      inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
      
      inline def setSpan(value: GridSpan | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanL", value.asInstanceOf[js.Any])
      
      inline def setSpanLUndefined: Self = StObject.set(x, "spanL", js.undefined)
      
      inline def setSpanLarge(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanLarge", value.asInstanceOf[js.Any])
      
      inline def setSpanLargeUndefined: Self = StObject.set(x, "spanLarge", js.undefined)
      
      inline def setSpanM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanM", value.asInstanceOf[js.Any])
      
      inline def setSpanMUndefined: Self = StObject.set(x, "spanM", js.undefined)
      
      inline def setSpanMedium(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanMedium", value.asInstanceOf[js.Any])
      
      inline def setSpanMediumUndefined: Self = StObject.set(x, "spanMedium", js.undefined)
      
      inline def setSpanS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanS", value.asInstanceOf[js.Any])
      
      inline def setSpanSUndefined: Self = StObject.set(x, "spanS", js.undefined)
      
      inline def setSpanSmall(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanSmall", value.asInstanceOf[js.Any])
      
      inline def setSpanSmallUndefined: Self = StObject.set(x, "spanSmall", js.undefined)
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpanXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "spanXL", value.asInstanceOf[js.Any])
      
      inline def setSpanXLUndefined: Self = StObject.set(x, "spanXL", js.undefined)
      
      inline def setVisibleL(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleL", value.asInstanceOf[js.Any])
      
      inline def setVisibleLUndefined: Self = StObject.set(x, "visibleL", js.undefined)
      
      inline def setVisibleM(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleM", value.asInstanceOf[js.Any])
      
      inline def setVisibleMUndefined: Self = StObject.set(x, "visibleM", js.undefined)
      
      inline def setVisibleOnLarge(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleOnLarge", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnLargeUndefined: Self = StObject.set(x, "visibleOnLarge", js.undefined)
      
      inline def setVisibleOnMedium(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleOnMedium", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnMediumUndefined: Self = StObject.set(x, "visibleOnMedium", js.undefined)
      
      inline def setVisibleOnSmall(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleOnSmall", value.asInstanceOf[js.Any])
      
      inline def setVisibleOnSmallUndefined: Self = StObject.set(x, "visibleOnSmall", js.undefined)
      
      inline def setVisibleS(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleS", value.asInstanceOf[js.Any])
      
      inline def setVisibleSUndefined: Self = StObject.set(x, "visibleS", js.undefined)
      
      inline def setVisibleXL(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleXL", value.asInstanceOf[js.Any])
      
      inline def setVisibleXLUndefined: Self = StObject.set(x, "visibleXL", js.undefined)
    }
  }
}
