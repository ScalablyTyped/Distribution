package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign
import typings.openui5.sapUiCommonsLibraryMod.layout.HAlign
import typings.openui5.sapUiCommonsLibraryMod.layout.Padding
import typings.openui5.sapUiCommonsLibraryMod.layout.Separation
import typings.openui5.sapUiCommonsLibraryMod.layout.VAlign
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutMatrixLayoutCellMod {
  
  @JSImport("sap/ui/commons/layout/MatrixLayoutCell", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/MatrixLayoutCell.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MatrixLayoutCell {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MatrixLayoutCellSettings) = this()
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
    mSettings: MatrixLayoutCellSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MatrixLayoutCellSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/MatrixLayoutCell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.MatrixLayoutCell with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, MatrixLayoutCell]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MatrixLayoutCell],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.MatrixLayoutCell.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MatrixLayoutCell
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * The string given as "sStyleClass" will be added to the "class" attribute of this element's root HTML
      * element.
      *
      * This method is intended to be used to mark controls as being of a special type for which special styling
      * can be provided using CSS selectors that reference this style class name.
      *
      *
      * ```javascript
      *
      * Example:
      * myButton.addStyleClass("myRedTextButton"); // add a CSS class to one button instance
      *
      * ...and in CSS:
      * .myRedTextButton {
      * color: red;
      * }
      * ```
      *
      *
      * This will add the CSS class "myRedTextButton" to the Button HTML and the CSS code above will then make
      * the text in this particular button red.
      *
      * Only characters allowed inside HTML attributes are allowed. Quotes are not allowed and this method will
      * ignore any strings containing quotes. Strings containing spaces are interpreted as ONE custom style class
      * (even though CSS selectors interpret them as different classes) and can only removed later by calling
      * removeStyleClass() with exactly the same (space-containing) string as parameter. Multiple calls with
      * the same sStyleClass will have no different effect than calling once. If sStyleClass is null, the call
      * is ignored.
      *
      * Returns `this` to allow method chaining
      */
    def addStyleClass(/**
      * the CSS class name to be added
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the matrix layout cell's background design.
      *
      * Default value is `'Transparent'`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getColSpan colSpan}.
      *
      * Determines how many columns of the underlying grid structure are occupied by this matrix layout cell.
      *
      * Default value is `1`.
      *
      * @returns Value of property `colSpan`
      */
    def getColSpan(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The matrix layout cell's content (arbitrary controls).
      *
      * If the matrix row has a defined height and the matrix has layoutFixed = true, the controls inside of
      * a cell should all use the same unit for its height property.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHAlign hAlign}.
      *
      * Determines the horizontal alignment of the matrix layout cell's content with the cell's borders.
      *
      * Default value is `'Begin'`.
      *
      * @returns Value of property `hAlign`
      */
    def getHAlign(): HAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.HAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getPadding padding}.
      *
      * Determines the padding of the matrix layout cell's content within the cell's borders. The default value
      * is appropriate for all cells in a form-like layout. Consider to remove the padding on the outer layout
      * in case of nesting.
      *
      * Default value is `'End'`.
      *
      * @returns Value of property `padding`
      */
    def getPadding(): Padding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Padding * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getRowSpan rowSpan}.
      *
      * Determines how many rows of the underlying grid structure are occupied by this matrix layout cell. In
      * case a row-height is used, all rows affected by the RowSpan must have the same unit.
      *
      * Default value is `1`.
      *
      * @returns Value of property `rowSpan`
      */
    def getRowSpan(): int = js.native
    
    /**
      * Gets current value of property {@link #getSeparation separation}.
      *
      * Determines how a matrix layout cell is separated from its predecessor, via a vertical gutter of variable
      * width, with or without a vertical line.
      *
      * Default value is `'None'`.
      *
      * @returns Value of property `separation`
      */
    def getSeparation(): Separation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Separation * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVAlign vAlign}.
      *
      * Determines the vertical alignment of the matrix layout cell's content with the cell's borders.
      *
      * Default value is `'Middle'`.
      *
      * @returns Value of property `vAlign`
      */
    def getVAlign(): VAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.VAlign * / any */ String) = js.native
    
    /**
      * Returns true if the given style class string is valid and if this Element has this style class set via
      * a previous call to addStyleClass().
      */
    def hasStyleClass(/**
      * the style to check for
      */
    sStyleClass: String): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes the given string from the list of custom style classes that have been set previously. Regular
      * style classes like "sapUiBtn" cannot be removed.
      *
      * Returns `this` to allow method chaining
      */
    def removeStyleClass(/**
      * the style to be removed
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the matrix layout cell's background design.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'Transparent'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColSpan colSpan}.
      *
      * Determines how many columns of the underlying grid structure are occupied by this matrix layout cell.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColSpan(): this.type = js.native
    def setColSpan(/**
      * New value for property `colSpan`
      */
    iColSpan: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHAlign hAlign}.
      *
      * Determines the horizontal alignment of the matrix layout cell's content with the cell's borders.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'Begin'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHAlign(): this.type = js.native
    def setHAlign(
      /**
      * New value for property `hAlign`
      */
    sHAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.HAlign * / any */ String
    ): this.type = js.native
    def setHAlign(/**
      * New value for property `hAlign`
      */
    sHAlign: HAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPadding padding}.
      *
      * Determines the padding of the matrix layout cell's content within the cell's borders. The default value
      * is appropriate for all cells in a form-like layout. Consider to remove the padding on the outer layout
      * in case of nesting.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'End'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPadding(): this.type = js.native
    def setPadding(
      /**
      * New value for property `padding`
      */
    sPadding: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Padding * / any */ String
    ): this.type = js.native
    def setPadding(/**
      * New value for property `padding`
      */
    sPadding: Padding): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRowSpan rowSpan}.
      *
      * Determines how many rows of the underlying grid structure are occupied by this matrix layout cell. In
      * case a row-height is used, all rows affected by the RowSpan must have the same unit.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRowSpan(): this.type = js.native
    def setRowSpan(/**
      * New value for property `rowSpan`
      */
    iRowSpan: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSeparation separation}.
      *
      * Determines how a matrix layout cell is separated from its predecessor, via a vertical gutter of variable
      * width, with or without a vertical line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'None'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSeparation(): this.type = js.native
    def setSeparation(
      /**
      * New value for property `separation`
      */
    sSeparation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Separation * / any */ String
    ): this.type = js.native
    def setSeparation(/**
      * New value for property `separation`
      */
    sSeparation: Separation): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVAlign vAlign}.
      *
      * Determines the vertical alignment of the matrix layout cell's content with the cell's borders.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'Middle'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVAlign(): this.type = js.native
    def setVAlign(
      /**
      * New value for property `vAlign`
      */
    sVAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.VAlign * / any */ String
    ): this.type = js.native
    def setVAlign(/**
      * New value for property `vAlign`
      */
    sVAlign: VAlign): this.type = js.native
  }
  
  trait MatrixLayoutCellSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Determines the matrix layout cell's background design.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines how many columns of the underlying grid structure are occupied by this matrix layout cell.
      */
    var colSpan: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The matrix layout cell's content (arbitrary controls).
      *
      * If the matrix row has a defined height and the matrix has layoutFixed = true, the controls inside of
      * a cell should all use the same unit for its height property.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the horizontal alignment of the matrix layout cell's content with the cell's borders.
      */
    var hAlign: js.UndefOr[
        HAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.HAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the padding of the matrix layout cell's content within the cell's borders. The default value
      * is appropriate for all cells in a form-like layout. Consider to remove the padding on the outer layout
      * in case of nesting.
      */
    var padding: js.UndefOr[
        Padding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Padding * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines how many rows of the underlying grid structure are occupied by this matrix layout cell. In
      * case a row-height is used, all rows affected by the RowSpan must have the same unit.
      */
    var rowSpan: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines how a matrix layout cell is separated from its predecessor, via a vertical gutter of variable
      * width, with or without a vertical line.
      */
    var separation: js.UndefOr[
        Separation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Separation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the vertical alignment of the matrix layout cell's content with the cell's borders.
      */
    var vAlign: js.UndefOr[
        VAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.VAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object MatrixLayoutCellSettings {
    
    inline def apply(): MatrixLayoutCellSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatrixLayoutCellSettings]
    }
    
    extension [Self <: MatrixLayoutCellSettings](x: Self) {
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setColSpan(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setHAlign(
        value: HAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.HAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setPadding(
        value: Padding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Padding * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRowSpan(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setSeparation(
        value: Separation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.Separation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
      
      inline def setSeparationUndefined: Self = StObject.set(x, "separation", js.undefined)
      
      inline def setVAlign(
        value: VAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof layout.VAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
}
