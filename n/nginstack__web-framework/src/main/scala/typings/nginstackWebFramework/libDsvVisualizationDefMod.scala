package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.UseRawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvVisualizationDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VisualizationDef {
    
    /* CompleteClass */
    var canExport: Boolean = js.native
    
    /* CompleteClass */
    var extraExportFormats: js.Array[UseRawData] = js.native
    
    /* CompleteClass */
    var filters: js.Array[VisualizationFilterDef] = js.native
    
    /* CompleteClass */
    var footer: typings.nginstackWebFramework.libDsvVisualizationFooterDefMod.^ = js.native
    
    /* CompleteClass */
    var header: typings.nginstackWebFramework.libDsvVisualizationHeaderDefMod.^ = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var includes: js.Array[Double | String] = js.native
    
    /* CompleteClass */
    var messageWhenEmpty: String = js.native
    
    /* CompleteClass */
    var onCreate: (js.Function1[/* arg0 */ Visualization, Any]) | Null = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Visualization = typings.nginstackWebFramework.libDsvVisualizationMod.^
  
  trait VisualizationDef extends StObject {
    
    var canExport: Boolean
    
    var extraExportFormats: js.Array[UseRawData]
    
    var filters: js.Array[VisualizationFilterDef]
    
    var footer: typings.nginstackWebFramework.libDsvVisualizationFooterDefMod.^
    
    var header: typings.nginstackWebFramework.libDsvVisualizationHeaderDefMod.^
    
    var help: String
    
    var includes: js.Array[Double | String]
    
    var messageWhenEmpty: String
    
    var onCreate: (js.Function1[/* arg0 */ Visualization, Any]) | Null
    
    var title: String
    
    var `type`: String
  }
  object VisualizationDef {
    
    inline def apply(
      canExport: Boolean,
      extraExportFormats: js.Array[UseRawData],
      filters: js.Array[VisualizationFilterDef],
      footer: typings.nginstackWebFramework.libDsvVisualizationFooterDefMod.^,
      header: typings.nginstackWebFramework.libDsvVisualizationHeaderDefMod.^,
      help: String,
      includes: js.Array[Double | String],
      messageWhenEmpty: String,
      title: String,
      `type`: String
    ): VisualizationDef = {
      val __obj = js.Dynamic.literal(canExport = canExport.asInstanceOf[js.Any], extraExportFormats = extraExportFormats.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], messageWhenEmpty = messageWhenEmpty.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], onCreate = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisualizationDef]
    }
    
    extension [Self <: VisualizationDef](x: Self) {
      
      inline def setCanExport(value: Boolean): Self = StObject.set(x, "canExport", value.asInstanceOf[js.Any])
      
      inline def setExtraExportFormats(value: js.Array[UseRawData]): Self = StObject.set(x, "extraExportFormats", value.asInstanceOf[js.Any])
      
      inline def setExtraExportFormatsVarargs(value: UseRawData*): Self = StObject.set(x, "extraExportFormats", js.Array(value*))
      
      inline def setFilters(value: js.Array[VisualizationFilterDef]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: VisualizationFilterDef*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFooter(value: typings.nginstackWebFramework.libDsvVisualizationFooterDefMod.^): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: typings.nginstackWebFramework.libDsvVisualizationHeaderDefMod.^): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setIncludes(value: js.Array[Double | String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesVarargs(value: (Double | String)*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setMessageWhenEmpty(value: String): Self = StObject.set(x, "messageWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setOnCreate(value: /* arg0 */ Visualization => Any): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateNull: Self = StObject.set(x, "onCreate", null)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type VisualizationFilterDef = typings.nginstackWebFramework.libDsvVisualizationFilterDefMod.^
}
