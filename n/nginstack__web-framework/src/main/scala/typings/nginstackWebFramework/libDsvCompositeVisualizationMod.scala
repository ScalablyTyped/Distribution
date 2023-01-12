package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Formats
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvCompositeVisualizationMod {
  
  inline def apply(definition: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/CompositeVisualization", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CompositeVisualization {
    def this(definition: Any) = this()
    
    /* private */ /* CompleteClass */
    var addSlot_ : Any = js.native
    
    /* CompleteClass */
    var adjustItemHeadersAndFooters: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var autoCreateFilters_ : Any = js.native
    
    /* CompleteClass */
    var canExport: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var createFiltersFromItems_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var cssExtractor_ : Any = js.native
    
    /* CompleteClass */
    var filters: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^ = js.native
    
    /* CompleteClass */
    override def getExportableData(): js.Array[Formats] = js.native
    
    /* private */ /* CompleteClass */
    var handleItemHeadersAndFooters_ : Any = js.native
    
    /* CompleteClass */
    override def hasData(): Boolean = js.native
    
    /* protected */ /* CompleteClass */
    override def initFilters_(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var items_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var layout_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var path_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var populateSlots_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var prepareFilterValues_ : Any = js.native
    
    /* CompleteClass */
    override def queryData(filterValues: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    override def render(outputObj: Any): Unit = js.native
    
    /* CompleteClass */
    override def setPath(value: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var validateLayout_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/CompositeVisualization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompositeVisualization extends StObject {
    
    /* private */ var addSlot_ : Any
    
    var adjustItemHeadersAndFooters: Boolean
    
    /* private */ var autoCreateFilters_ : Any
    
    var canExport: Boolean
    
    /* private */ var createFiltersFromItems_ : Any
    
    /* private */ var cssExtractor_ : Any
    
    var filters: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^
    
    def getExportableData(): js.Array[Formats]
    
    /* private */ var handleItemHeadersAndFooters_ : Any
    
    def hasData(): Boolean
    
    /* protected */ def initFilters_(): Unit
    
    /* private */ var items_ : Any
    
    /* private */ var layout_ : Any
    
    /* private */ var path_ : Any
    
    /* private */ var populateSlots_ : Any
    
    /* private */ var prepareFilterValues_ : Any
    
    def queryData(filterValues: Record[String, Any]): Unit
    
    def render(outputObj: Any): Unit
    
    def setPath(value: Any): Unit
    
    /* private */ var validateLayout_ : Any
  }
  object CompositeVisualization {
    
    inline def apply(
      addSlot_ : Any,
      adjustItemHeadersAndFooters: Boolean,
      autoCreateFilters_ : Any,
      canExport: Boolean,
      createFiltersFromItems_ : Any,
      cssExtractor_ : Any,
      filters: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^,
      getExportableData: () => js.Array[Formats],
      handleItemHeadersAndFooters_ : Any,
      hasData: () => Boolean,
      initFilters_ : () => Unit,
      items_ : Any,
      layout_ : Any,
      path_ : Any,
      populateSlots_ : Any,
      prepareFilterValues_ : Any,
      queryData: Record[String, Any] => Unit,
      render: Any => Unit,
      setPath: Any => Unit,
      validateLayout_ : Any
    ): CompositeVisualization = {
      val __obj = js.Dynamic.literal(addSlot_ = addSlot_.asInstanceOf[js.Any], adjustItemHeadersAndFooters = adjustItemHeadersAndFooters.asInstanceOf[js.Any], autoCreateFilters_ = autoCreateFilters_.asInstanceOf[js.Any], canExport = canExport.asInstanceOf[js.Any], createFiltersFromItems_ = createFiltersFromItems_.asInstanceOf[js.Any], cssExtractor_ = cssExtractor_.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], getExportableData = js.Any.fromFunction0(getExportableData), handleItemHeadersAndFooters_ = handleItemHeadersAndFooters_.asInstanceOf[js.Any], hasData = js.Any.fromFunction0(hasData), initFilters_ = js.Any.fromFunction0(initFilters_), items_ = items_.asInstanceOf[js.Any], layout_ = layout_.asInstanceOf[js.Any], path_ = path_.asInstanceOf[js.Any], populateSlots_ = populateSlots_.asInstanceOf[js.Any], prepareFilterValues_ = prepareFilterValues_.asInstanceOf[js.Any], queryData = js.Any.fromFunction1(queryData), render = js.Any.fromFunction1(render), setPath = js.Any.fromFunction1(setPath), validateLayout_ = validateLayout_.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeVisualization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompositeVisualization] (val x: Self) extends AnyVal {
      
      inline def setAddSlot_(value: Any): Self = StObject.set(x, "addSlot_", value.asInstanceOf[js.Any])
      
      inline def setAdjustItemHeadersAndFooters(value: Boolean): Self = StObject.set(x, "adjustItemHeadersAndFooters", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateFilters_(value: Any): Self = StObject.set(x, "autoCreateFilters_", value.asInstanceOf[js.Any])
      
      inline def setCanExport(value: Boolean): Self = StObject.set(x, "canExport", value.asInstanceOf[js.Any])
      
      inline def setCreateFiltersFromItems_(value: Any): Self = StObject.set(x, "createFiltersFromItems_", value.asInstanceOf[js.Any])
      
      inline def setCssExtractor_(value: Any): Self = StObject.set(x, "cssExtractor_", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setGetExportableData(value: () => js.Array[Formats]): Self = StObject.set(x, "getExportableData", js.Any.fromFunction0(value))
      
      inline def setHandleItemHeadersAndFooters_(value: Any): Self = StObject.set(x, "handleItemHeadersAndFooters_", value.asInstanceOf[js.Any])
      
      inline def setHasData(value: () => Boolean): Self = StObject.set(x, "hasData", js.Any.fromFunction0(value))
      
      inline def setInitFilters_(value: () => Unit): Self = StObject.set(x, "initFilters_", js.Any.fromFunction0(value))
      
      inline def setItems_(value: Any): Self = StObject.set(x, "items_", value.asInstanceOf[js.Any])
      
      inline def setLayout_(value: Any): Self = StObject.set(x, "layout_", value.asInstanceOf[js.Any])
      
      inline def setPath_(value: Any): Self = StObject.set(x, "path_", value.asInstanceOf[js.Any])
      
      inline def setPopulateSlots_(value: Any): Self = StObject.set(x, "populateSlots_", value.asInstanceOf[js.Any])
      
      inline def setPrepareFilterValues_(value: Any): Self = StObject.set(x, "prepareFilterValues_", value.asInstanceOf[js.Any])
      
      inline def setQueryData(value: Record[String, Any] => Unit): Self = StObject.set(x, "queryData", js.Any.fromFunction1(value))
      
      inline def setRender(value: Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setSetPath(value: Any => Unit): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
      
      inline def setValidateLayout_(value: Any): Self = StObject.set(x, "validateLayout_", value.asInstanceOf[js.Any])
    }
  }
  
  type DataExporter = typings.nginstackWebFramework.libExportDataExporterMod.^
  
  type VisualizationDef = typings.nginstackWebFramework.libDsvVisualizationDefMod.^
}
