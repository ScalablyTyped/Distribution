package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet extends StObject {
  
  /** The banded (alternating colors) ranges on this sheet. */
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.undefined
  
  /** The filter on this sheet, if any. */
  var basicFilter: js.UndefOr[BasicFilter] = js.undefined
  
  /** The specifications of every chart on this sheet. */
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.undefined
  
  /** All column groups on this sheet, ordered by increasing range start index, then by group depth. */
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
  
  /** The conditional format rules in this sheet. */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.undefined
  
  /**
    * Data in the grid, if this is a grid sheet. The number of GridData objects returned is dependent on the number of ranges requested on this sheet. For example, if this is representing
    * `Sheet1`, and the spreadsheet was requested with ranges `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the first GridData will have a startRow/startColumn of `0`, while the second one
    * will have `startRow 14` (zero-based row 15), and `startColumn 3` (zero-based column D). For a DATA_SOURCE sheet, you can not request a specific range, the GridData contains all the
    * values.
    */
  var data: js.UndefOr[js.Array[GridData]] = js.undefined
  
  /** The developer metadata associated with a sheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  
  /** The filter views in this sheet. */
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.undefined
  
  /** The ranges that are merged together. */
  var merges: js.UndefOr[js.Array[GridRange]] = js.undefined
  
  /** The properties of the sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
  
  /** The protected ranges in this sheet. */
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.undefined
  
  /** All row groups on this sheet, ordered by increasing range start index, then by group depth. */
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
  
  /** The slicers on this sheet. */
  var slicers: js.UndefOr[js.Array[Slicer]] = js.undefined
}
object Sheet {
  
  inline def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  
  extension [Self <: Sheet](x: Self) {
    
    inline def setBandedRanges(value: js.Array[BandedRange]): Self = StObject.set(x, "bandedRanges", value.asInstanceOf[js.Any])
    
    inline def setBandedRangesUndefined: Self = StObject.set(x, "bandedRanges", js.undefined)
    
    inline def setBandedRangesVarargs(value: BandedRange*): Self = StObject.set(x, "bandedRanges", js.Array(value :_*))
    
    inline def setBasicFilter(value: BasicFilter): Self = StObject.set(x, "basicFilter", value.asInstanceOf[js.Any])
    
    inline def setBasicFilterUndefined: Self = StObject.set(x, "basicFilter", js.undefined)
    
    inline def setCharts(value: js.Array[EmbeddedChart]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    inline def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    inline def setChartsVarargs(value: EmbeddedChart*): Self = StObject.set(x, "charts", js.Array(value :_*))
    
    inline def setColumnGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
    
    inline def setColumnGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "columnGroups", js.Array(value :_*))
    
    inline def setConditionalFormats(value: js.Array[ConditionalFormatRule]): Self = StObject.set(x, "conditionalFormats", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormatsUndefined: Self = StObject.set(x, "conditionalFormats", js.undefined)
    
    inline def setConditionalFormatsVarargs(value: ConditionalFormatRule*): Self = StObject.set(x, "conditionalFormats", js.Array(value :_*))
    
    inline def setData(value: js.Array[GridData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: GridData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    inline def setFilterViews(value: js.Array[FilterView]): Self = StObject.set(x, "filterViews", value.asInstanceOf[js.Any])
    
    inline def setFilterViewsUndefined: Self = StObject.set(x, "filterViews", js.undefined)
    
    inline def setFilterViewsVarargs(value: FilterView*): Self = StObject.set(x, "filterViews", js.Array(value :_*))
    
    inline def setMerges(value: js.Array[GridRange]): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
    
    inline def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
    
    inline def setMergesVarargs(value: GridRange*): Self = StObject.set(x, "merges", js.Array(value :_*))
    
    inline def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProtectedRanges(value: js.Array[ProtectedRange]): Self = StObject.set(x, "protectedRanges", value.asInstanceOf[js.Any])
    
    inline def setProtectedRangesUndefined: Self = StObject.set(x, "protectedRanges", js.undefined)
    
    inline def setProtectedRangesVarargs(value: ProtectedRange*): Self = StObject.set(x, "protectedRanges", js.Array(value :_*))
    
    inline def setRowGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "rowGroups", value.asInstanceOf[js.Any])
    
    inline def setRowGroupsUndefined: Self = StObject.set(x, "rowGroups", js.undefined)
    
    inline def setRowGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "rowGroups", js.Array(value :_*))
    
    inline def setSlicers(value: js.Array[Slicer]): Self = StObject.set(x, "slicers", value.asInstanceOf[js.Any])
    
    inline def setSlicersUndefined: Self = StObject.set(x, "slicers", js.undefined)
    
    inline def setSlicersVarargs(value: Slicer*): Self = StObject.set(x, "slicers", js.Array(value :_*))
  }
}
