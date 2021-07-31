package typings.officeJsPreview

import typings.officeJsPreview.Excel.CellBorderCollection
import typings.officeJsPreview.Excel.CellPropertiesBorderLoadOptions
import typings.officeJsPreview.Excel.CellPropertiesFill
import typings.officeJsPreview.Excel.CellPropertiesFillLoadOptions
import typings.officeJsPreview.Excel.CellPropertiesFont
import typings.officeJsPreview.Excel.CellPropertiesFontLoadOptions
import typings.officeJsPreview.Excel.CellPropertiesProtection
import typings.officeJsPreview.Excel.HorizontalAlignment
import typings.officeJsPreview.Excel.ReadingOrder
import typings.officeJsPreview.Excel.VerticalAlignment
import typings.officeJsPreview.Office.HostType
import typings.officeJsPreview.Office.PlatformType
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.CenterAcrossSelection
import typings.officeJsPreview.officeJsPreviewStrings.Context
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.Fill
import typings.officeJsPreview.officeJsPreviewStrings.General
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.RightToLeft
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined office-js-preview.Office.AsyncContextOptions & {  isInline :boolean} */
  trait AsyncContextOptionsisInli extends StObject {
    
    /**
      * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
      * that is passed to a callback.
      */
    var asyncContext: js.UndefOr[js.Any] = js.undefined
    
    var isInline: Boolean
  }
  object AsyncContextOptionsisInli {
    
    @scala.inline
    def apply(isInline: Boolean): AsyncContextOptionsisInli = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncContextOptionsisInli]
    }
    
    @scala.inline
    implicit class AsyncContextOptionsisInliMutableBuilder[Self <: AsyncContextOptionsisInli] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined office-js-preview.Office.AsyncContextOptions & {  isRest :boolean | undefined} */
  trait AsyncContextOptionsisRest extends StObject {
    
    /**
      * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object
      * that is passed to a callback.
      */
    var asyncContext: js.UndefOr[js.Any] = js.undefined
    
    var isRest: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncContextOptionsisRest {
    
    @scala.inline
    def apply(): AsyncContextOptionsisRest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncContextOptionsisRest]
    }
    
    @scala.inline
    implicit class AsyncContextOptionsisRestMutableBuilder[Self <: AsyncContextOptionsisRest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
      
      @scala.inline
      def setIsRest(value: Boolean): Self = StObject.set(x, "isRest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRestUndefined: Self = StObject.set(x, "isRest", js.undefined)
    }
  }
  
  /* Inlined office-js-preview.Excel.CellPropertiesFormatLoadOptions & {  rowHeight :boolean | undefined} */
  trait CellPropertiesFormatLoadO extends StObject {
    
    /**
      *
      * Specifies whether to load on the `autoIndent` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var autoIndent: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `borders` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var borders: js.UndefOr[CellPropertiesBorderLoadOptions] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `fill` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var fill: js.UndefOr[CellPropertiesFillLoadOptions] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `font` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var font: js.UndefOr[CellPropertiesFontLoadOptions] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `horizontalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `indentLevel` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var indentLevel: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `protection` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var protection: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `readingOrder` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var readingOrder: js.UndefOr[Boolean] = js.undefined
    
    var rowHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `shrinkToFit` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var shrinkToFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `textOrientation` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var textOrientation: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `useStandardHeight` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `useStandardWidth` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `verticalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var verticalAlignment: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `wrapText` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var wrapText: js.UndefOr[Boolean] = js.undefined
  }
  object CellPropertiesFormatLoadO {
    
    @scala.inline
    def apply(): CellPropertiesFormatLoadO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellPropertiesFormatLoadO]
    }
    
    @scala.inline
    implicit class CellPropertiesFormatLoadOMutableBuilder[Self <: CellPropertiesFormatLoadO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
      
      @scala.inline
      def setBorders(value: CellPropertiesBorderLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
      
      @scala.inline
      def setFill(value: CellPropertiesFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: CellPropertiesFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setIndentLevel(value: Boolean): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
      
      @scala.inline
      def setProtection(value: Boolean): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
      
      @scala.inline
      def setReadingOrder(value: Boolean): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Boolean): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
      
      @scala.inline
      def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      @scala.inline
      def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
      
      @scala.inline
      def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  /* Inlined office-js-preview.Excel.CellPropertiesFormatLoadOptions & {  columnWidth :boolean | undefined} */
  trait CellPropertiesFormatLoadOAutoIndent extends StObject {
    
    /**
      *
      * Specifies whether to load on the `autoIndent` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var autoIndent: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `borders` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var borders: js.UndefOr[CellPropertiesBorderLoadOptions] = js.undefined
    
    var columnWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `fill` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var fill: js.UndefOr[CellPropertiesFillLoadOptions] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `font` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var font: js.UndefOr[CellPropertiesFontLoadOptions] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `horizontalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `indentLevel` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var indentLevel: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `protection` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var protection: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `readingOrder` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var readingOrder: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `shrinkToFit` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var shrinkToFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `textOrientation` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var textOrientation: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `useStandardHeight` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `useStandardWidth` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `verticalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var verticalAlignment: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Specifies whether to load on the `wrapText` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var wrapText: js.UndefOr[Boolean] = js.undefined
  }
  object CellPropertiesFormatLoadOAutoIndent {
    
    @scala.inline
    def apply(): CellPropertiesFormatLoadOAutoIndent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellPropertiesFormatLoadOAutoIndent]
    }
    
    @scala.inline
    implicit class CellPropertiesFormatLoadOAutoIndentMutableBuilder[Self <: CellPropertiesFormatLoadOAutoIndent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
      
      @scala.inline
      def setBorders(value: CellPropertiesBorderLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: Boolean): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setFill(value: CellPropertiesFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: CellPropertiesFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setIndentLevel(value: Boolean): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
      
      @scala.inline
      def setProtection(value: Boolean): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
      
      @scala.inline
      def setReadingOrder(value: Boolean): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
      
      @scala.inline
      def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
      
      @scala.inline
      def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      @scala.inline
      def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
      
      @scala.inline
      def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  /* Inlined office-js-preview.Excel.CellPropertiesFormat & {  columnWidth :number | undefined} */
  trait CellPropertiesFormatcolum extends StObject {
    
    /**
      *
      * Represents the `autoIndent` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var autoIndent: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `borders` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var borders: js.UndefOr[CellBorderCollection] = js.undefined
    
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Represents the `fill` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var fill: js.UndefOr[CellPropertiesFill] = js.undefined
    
    /**
      *
      * Represents the `font` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var font: js.UndefOr[CellPropertiesFont] = js.undefined
    
    /**
      *
      * Represents the `horizontalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var horizontalAlignment: js.UndefOr[
        HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
      ] = js.undefined
    
    /**
      *
      * Represents the `indentLevel` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var indentLevel: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Represents the `protection` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var protection: js.UndefOr[CellPropertiesProtection] = js.undefined
    
    /**
      *
      * Represents the `readingOrder` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.undefined
    
    /**
      *
      * Represents the `shrinkToFit` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var shrinkToFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `textOrientation` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var textOrientation: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Represents the `useStandardHeight` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `useStandardWidth` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `verticalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.undefined
    
    /**
      *
      * Represents the `wrapText` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var wrapText: js.UndefOr[Boolean] = js.undefined
  }
  object CellPropertiesFormatcolum {
    
    @scala.inline
    def apply(): CellPropertiesFormatcolum = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellPropertiesFormatcolum]
    }
    
    @scala.inline
    implicit class CellPropertiesFormatcolumMutableBuilder[Self <: CellPropertiesFormatcolum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
      
      @scala.inline
      def setBorders(value: CellBorderCollection): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setFill(value: CellPropertiesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: CellPropertiesFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(
        value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
      ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
      
      @scala.inline
      def setProtection(value: CellPropertiesProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
      
      @scala.inline
      def setReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
      
      @scala.inline
      def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
      
      @scala.inline
      def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      @scala.inline
      def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
      
      @scala.inline
      def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  /* Inlined office-js-preview.Excel.CellPropertiesFormat & {  rowHeight :number | undefined} */
  trait CellPropertiesFormatrowHe extends StObject {
    
    /**
      *
      * Represents the `autoIndent` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var autoIndent: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `borders` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var borders: js.UndefOr[CellBorderCollection] = js.undefined
    
    /**
      *
      * Represents the `fill` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var fill: js.UndefOr[CellPropertiesFill] = js.undefined
    
    /**
      *
      * Represents the `font` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var font: js.UndefOr[CellPropertiesFont] = js.undefined
    
    /**
      *
      * Represents the `horizontalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var horizontalAlignment: js.UndefOr[
        HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
      ] = js.undefined
    
    /**
      *
      * Represents the `indentLevel` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var indentLevel: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Represents the `protection` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var protection: js.UndefOr[CellPropertiesProtection] = js.undefined
    
    /**
      *
      * Represents the `readingOrder` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.undefined
    
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Represents the `shrinkToFit` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var shrinkToFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `textOrientation` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var textOrientation: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * Represents the `useStandardHeight` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `useStandardWidth` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var useStandardWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * Represents the `verticalAlignment` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.undefined
    
    /**
      *
      * Represents the `wrapText` property.
      *
      * [Api set: ExcelApi 1.9]
      */
    var wrapText: js.UndefOr[Boolean] = js.undefined
  }
  object CellPropertiesFormatrowHe {
    
    @scala.inline
    def apply(): CellPropertiesFormatrowHe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellPropertiesFormatrowHe]
    }
    
    @scala.inline
    implicit class CellPropertiesFormatrowHeMutableBuilder[Self <: CellPropertiesFormatrowHe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
      
      @scala.inline
      def setBorders(value: CellBorderCollection): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
      
      @scala.inline
      def setFill(value: CellPropertiesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: CellPropertiesFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(
        value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
      ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
      
      @scala.inline
      def setProtection(value: CellPropertiesProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
      
      @scala.inline
      def setReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
      
      @scala.inline
      def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      @scala.inline
      def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
      
      @scala.inline
      def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  trait Cells extends StObject {
    
    var cells: js.Any
    
    var format: js.Any
  }
  object Cells {
    
    @scala.inline
    def apply(cells: js.Any, format: js.Any): Cells = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cells]
    }
    
    @scala.inline
    implicit class CellsMutableBuilder[Self <: Cells] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCells(value: js.Any): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Double
  }
  object Error {
    
    @scala.inline
    def apply(error: Double): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expand extends StObject {
    
    var expand: js.UndefOr[String] = js.undefined
    
    var select: js.UndefOr[String] = js.undefined
  }
  object Expand {
    
    @scala.inline
    def apply(): Expand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expand]
    }
    
    @scala.inline
    implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
  
  trait Host extends StObject {
    
    var host: HostType
    
    var platform: PlatformType
  }
  object Host {
    
    @scala.inline
    def apply(host: HostType, platform: PlatformType): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: HostType): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: PlatformType): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnorePunct extends StObject {
    
    var ignorePunct: js.UndefOr[Boolean] = js.undefined
    
    var ignoreSpace: js.UndefOr[Boolean] = js.undefined
    
    var matchCase: js.UndefOr[Boolean] = js.undefined
    
    var matchPrefix: js.UndefOr[Boolean] = js.undefined
    
    var matchSuffix: js.UndefOr[Boolean] = js.undefined
    
    var matchWholeWord: js.UndefOr[Boolean] = js.undefined
    
    var matchWildcards: js.UndefOr[Boolean] = js.undefined
  }
  object IgnorePunct {
    
    @scala.inline
    def apply(): IgnorePunct = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnorePunct]
    }
    
    @scala.inline
    implicit class IgnorePunctMutableBuilder[Self <: IgnorePunct] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnorePunct(value: Boolean): Self = StObject.set(x, "ignorePunct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePunctUndefined: Self = StObject.set(x, "ignorePunct", js.undefined)
      
      @scala.inline
      def setIgnoreSpace(value: Boolean): Self = StObject.set(x, "ignoreSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSpaceUndefined: Self = StObject.set(x, "ignoreSpace", js.undefined)
      
      @scala.inline
      def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
      
      @scala.inline
      def setMatchPrefix(value: Boolean): Self = StObject.set(x, "matchPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchPrefixUndefined: Self = StObject.set(x, "matchPrefix", js.undefined)
      
      @scala.inline
      def setMatchSuffix(value: Boolean): Self = StObject.set(x, "matchSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchSuffixUndefined: Self = StObject.set(x, "matchSuffix", js.undefined)
      
      @scala.inline
      def setMatchWholeWord(value: Boolean): Self = StObject.set(x, "matchWholeWord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchWholeWordUndefined: Self = StObject.set(x, "matchWholeWord", js.undefined)
      
      @scala.inline
      def setMatchWildcards(value: Boolean): Self = StObject.set(x, "matchWildcards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchWildcardsUndefined: Self = StObject.set(x, "matchWildcards", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var message: String | Boolean
  }
  object Message {
    
    @scala.inline
    def apply(message: String | Boolean): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String | Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
