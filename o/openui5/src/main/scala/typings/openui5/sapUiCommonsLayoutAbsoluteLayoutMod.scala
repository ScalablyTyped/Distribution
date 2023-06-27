package typings.openui5

import typings.openui5.anon.Left
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.Scrolling
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutAbsoluteLayoutMod {
  
  @JSImport("sap/ui/commons/layout/AbsoluteLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/AbsoluteLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AbsoluteLayout {
    def this(/**
      * initial settings for the new control
      */
    mSettings: AbsoluteLayoutSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: AbsoluteLayoutSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: AbsoluteLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/AbsoluteLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.AbsoluteLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, AbsoluteLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AbsoluteLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.AbsoluteLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AbsoluteLayout
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds the given control and a corresponding position container into the aggregation named 'positions'.
      * Returns 'this' to allow method chaining.
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * JSON-like object which defines the position of the child control in the layout. The object is expected
      * to have one or more from the attribute set top, bottom, left, right; each with a value of type sap.ui.core.CSSSize.
      */
    oPos: Left
    ): this.type = js.native
    
    /**
      * Adds element to the layout.
      *
      * @returns `this` Control reference for chaining.
      */
    def addPosition(
      /**
      * Element which must be positioned in the layout.
      */
    oPosition: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all aggregated position containers and their child controls. Returns 'this' to allow method
      * chaining.
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all elements from the layout.
      *
      * @returns `this` Control reference for chaining.
      */
    def destroyPositions(): this.type = js.native
    
    /**
      * Returns an array of the controls contained in the aggregated position containers (might be empty).
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The overall height of the control. When not set, 100% is automatically set.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * 'Auto', 'Scroll', 'Hidden', and 'None' are the available values for setting the vertical scrolling mode.
      *
      * Default value is `Hidden`.
      *
      * @returns Value of property `horizontalScrolling`
      */
    def getHorizontalScrolling(): Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getPositions positions}.
      *
      * Positioned child controls within the layout
      */
    def getPositions(): js.Array[typings.openui5.sapUiCommonsLayoutPositionContainerMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getVerticalScrolling verticalScrolling}.
      *
      * 'Auto', 'Scroll', 'Hidden', and 'None' are the available values for setting the vertical scrolling mode.
      *
      * Default value is `Hidden`.
      *
      * @returns Value of property `verticalScrolling`
      */
    def getVerticalScrolling(): Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The overall width of the control. When not set, 100% is automatically set.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided sap.ui.core.Control in the aggregated position containers, and returns the index
      * of the container in the positions aggregation if found, or '-1' otherwise.
      */
    def indexOfContent(
      /**
      * The content of which the index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.layout.PositionContainer` in the aggregation {@link #getPositions positions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPosition(
      /**
      * The position whose index is looked for
      */
    oPosition: typings.openui5.sapUiCommonsLayoutPositionContainerMod.default
    ): int = js.native
    
    /**
      * Inserts the given control and a corresponding position container into the aggregation named 'positions'.
      * Returns 'this' to allow method chaining.
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The '0'-based index where the content shall be inserted at. For a negative value of iIndex, the content
      * is inserted at position '0'; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position.
      */
    iIndex: int
    ): this.type = js.native
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The '0'-based index where the content shall be inserted at. For a negative value of iIndex, the content
      * is inserted at position '0'; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position.
      */
    iIndex: int,
      /**
      * JSON-like object which defines the position of the child control in the layout. The object is expected
      * to have one or more from the attribute set top, bottom, left, right; each with a value of type sap.ui.core.CSSSize.
      */
    oPos: Left
    ): this.type = js.native
    
    /**
      * Inserts element to the layout on a specific index.
      *
      * @returns `this` Control reference for chaining.
      */
    def insertPosition(
      /**
      * Element which must be positioned in the layout.
      */
    oPosition: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Index of the element which is to be positioned.
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all aggregated position containers. Returns an array of the controls contained in the removed
      * position containers (might be empty).
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all elements from the layout.
      *
      * @returns Removed elements.
      */
    def removeAllPositions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes the given control and its corresponding position container from the aggregation named 'positions'.
      */
    def removeContent(
      /**
      * The content control to remove, its ID, or the index of the corresponding position container in the 'positions'
      * aggregation.
      */
    vContent: String
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    def removeContent(
      /**
      * The content control to remove, its ID, or the index of the corresponding position container in the 'positions'
      * aggregation.
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Removes element from the layout.
      *
      * @returns Removed element.
      */
    def removePosition(
      /**
      * Element which must be removed from the positions element within the layout.
      */
    vPosition: Any
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Sets the `height` property.
      *
      * @returns `this` Control reference for chaining.
      */
    def setHeight(/**
      * The passed height of the control.
      */
    sHeight: String): this.type = js.native
    
    def setHorizontalScrolling(
      /**
      * Object that contains settings for Horizontal scrolling.
      */
    oHorizontalScrolling: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String
    ): this.type = js.native
    /**
      * Sets the `horizontalScrolling` property.
      *
      * @returns `this` Control reference for chaining.
      */
    def setHorizontalScrolling(
      /**
      * Object that contains settings for Horizontal scrolling.
      */
    oHorizontalScrolling: Scrolling
    ): this.type = js.native
    
    /**
      * Allows to set or change the position information of the given child control
      */
    def setPositionOfChild(
      /**
      * The child control for which to change the position information; if empty or not aggregated, nothing is
      * changed
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Boolean = js.native
    def setPositionOfChild(
      /**
      * The child control for which to change the position information; if empty or not aggregated, nothing is
      * changed
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * JSON-like object which defines the position of the child control in the layout. The object is expected
      * to have one or more from the attribute set top, bottom, left, right; each with a value of type sap.ui.core.CSSSize.
      */
    oPos: Left
    ): Boolean = js.native
    
    def setVerticalScrolling(
      /**
      * Object that contains settings for Vertical scrolling.
      */
    oVerticalScrolling: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String
    ): this.type = js.native
    /**
      * Sets the `verticalScrolling` property.
      *
      * @returns `this` Control reference for chaining.
      */
    def setVerticalScrolling(/**
      * Object that contains settings for Vertical scrolling.
      */
    oVerticalScrolling: Scrolling): this.type = js.native
    
    /**
      * Sets the `width` property.
      *
      * @returns `this` Control reference for chaining.
      */
    def setWidth(/**
      * The passed width of the control.
      */
    sWidth: String): this.type = js.native
  }
  
  trait AbsoluteLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The overall height of the control. When not set, 100% is automatically set.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * 'Auto', 'Scroll', 'Hidden', and 'None' are the available values for setting the vertical scrolling mode.
      */
    var horizontalScrolling: js.UndefOr[
        Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Positioned child controls within the layout
      */
    var positions: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsLayoutPositionContainerMod.default] | typings.openui5.sapUiCommonsLayoutPositionContainerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * 'Auto', 'Scroll', 'Hidden', and 'None' are the available values for setting the vertical scrolling mode.
      */
    var verticalScrolling: js.UndefOr[
        Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The overall width of the control. When not set, 100% is automatically set.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object AbsoluteLayoutSettings {
    
    inline def apply(): AbsoluteLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbsoluteLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbsoluteLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontalScrolling(
        value: Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "horizontalScrolling", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollingUndefined: Self = StObject.set(x, "horizontalScrolling", js.undefined)
      
      inline def setPositions(
        value: js.Array[typings.openui5.sapUiCommonsLayoutPositionContainerMod.default] | typings.openui5.sapUiCommonsLayoutPositionContainerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setPositionsVarargs(value: typings.openui5.sapUiCommonsLayoutPositionContainerMod.default*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setVerticalScrolling(
        value: Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "verticalScrolling", value.asInstanceOf[js.Any])
      
      inline def setVerticalScrollingUndefined: Self = StObject.set(x, "verticalScrolling", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
