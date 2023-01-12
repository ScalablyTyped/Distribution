package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsTextFieldMod.TextFieldSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.Wrapping
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsTextAreaMod {
  
  @JSImport("sap/ui/commons/TextArea", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TextArea.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TextArea {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TextAreaSettings) = this()
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
    mSettings: TextAreaSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TextAreaSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/TextArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.TextArea with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.TextField.extend}.
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
    oClassInfo: ClassInfo[T, TextArea]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TextArea],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.TextArea.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TextArea
    extends typings.openui5.sapUiCommonsTextFieldMod.default {
    
    /**
      * Gets current value of property {@link #getCols cols}.
      *
      * Number of Columns. Cols means number of characters per row. This proprty is only used if Width is not
      * used.
      *
      * @returns Value of property `cols`
      */
    def getCols(): int = js.native
    
    /**
      * Gets current value of property {@link #getCursorPos cursorPos}.
      *
      * Position of cursor, e.g., to let the user re-start typing at the same position as before the server roundtrip
      *
      * @returns Value of property `cursorPos`
      */
    def getCursorPos(): int = js.native
    
    /**
      * Gets current value of property {@link #getExplanation explanation}.
      *
      * text which appears, in case quick-help is switched on
      *
      * @returns Value of property `explanation`
      */
    def getExplanation(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Height of text field. When it is set (CSS-size such as % or px), this is the exact size.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @deprecated (since 1.5.2) - Please use association AriaLabelledBy instead.
      *
      * Gets current value of property {@link #getLabeledBy labeledBy}.
      *
      * ID of label control
      *
      * @returns Value of property `labeledBy`
      */
    def getLabeledBy(): String = js.native
    
    /**
      * Gets current value of property {@link #getRows rows}.
      *
      * Number of Rows. This proprty is only used if Height is not used.
      *
      * @returns Value of property `rows`
      */
    def getRows(): int = js.native
    
    /**
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Text wrapping. Possible values are: Soft, Hard, Off.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Wrapping | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getCols cols}.
      *
      * Number of Columns. Cols means number of characters per row. This proprty is only used if Width is not
      * used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCols(): this.type = js.native
    def setCols(/**
      * New value for property `cols`
      */
    iCols: int): this.type = js.native
    
    /**
      * Property setter for the cursor position
      *
      * @returns `this` to allow method chaining
      */
    def setCursorPos(/**
      * cursor position
      */
    iCursorPos: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExplanation explanation}.
      *
      * text which appears, in case quick-help is switched on
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExplanation(): this.type = js.native
    def setExplanation(/**
      * New value for property `explanation`
      */
    sExplanation: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Height of text field. When it is set (CSS-size such as % or px), this is the exact size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @deprecated (since 1.5.2) - Please use association AriaLabelledBy instead.
      *
      * Sets a new value for property {@link #getLabeledBy labeledBy}.
      *
      * ID of label control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabeledBy(): this.type = js.native
    def setLabeledBy(/**
      * New value for property `labeledBy`
      */
    sLabeledBy: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRows rows}.
      *
      * Number of Rows. This proprty is only used if Height is not used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRows(): this.type = js.native
    def setRows(/**
      * New value for property `rows`
      */
    iRows: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Text wrapping. Possible values are: Soft, Hard, Off.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(
      /**
      * New value for property `wrapping`
      */
    sWrapping: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String
    ): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    sWrapping: Wrapping): this.type = js.native
  }
  
  trait TextAreaSettings
    extends StObject
       with TextFieldSettings {
    
    /**
      * Number of Columns. Cols means number of characters per row. This proprty is only used if Width is not
      * used.
      */
    var cols: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Position of cursor, e.g., to let the user re-start typing at the same position as before the server roundtrip
      */
    var cursorPos: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * text which appears, in case quick-help is switched on
      */
    var explanation: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Height of text field. When it is set (CSS-size such as % or px), this is the exact size.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.5.2) - Please use association AriaLabelledBy instead.
      *
      * ID of label control
      */
    var labeledBy: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Number of Rows. This proprty is only used if Height is not used.
      */
    var rows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Text wrapping. Possible values are: Soft, Hard, Off.
      */
    var wrapping: js.UndefOr[
        Wrapping | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TextAreaSettings {
    
    inline def apply(): TextAreaSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaSettings] (val x: Self) extends AnyVal {
      
      inline def setCols(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setCursorPos(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cursorPos", value.asInstanceOf[js.Any])
      
      inline def setCursorPosUndefined: Self = StObject.set(x, "cursorPos", js.undefined)
      
      inline def setExplanation(value: String | PropertyBindingInfo): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabeledBy(value: String | PropertyBindingInfo): Self = StObject.set(x, "labeledBy", value.asInstanceOf[js.Any])
      
      inline def setLabeledByUndefined: Self = StObject.set(x, "labeledBy", js.undefined)
      
      inline def setRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setWrapping(
        value: Wrapping | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Wrapping * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
