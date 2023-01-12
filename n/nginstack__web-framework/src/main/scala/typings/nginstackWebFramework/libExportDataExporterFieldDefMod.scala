package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExportDataExporterFieldDefMod {
  
  inline def apply(name: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/export/DataExporterFieldDef", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataExporterFieldDef {
    def this(name: Any) = this()
    
    /* CompleteClass */
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null = js.native
    
    /* CompleteClass */
    var isGroup: Boolean = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* CompleteClass */
    var lookupType: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var onCalculate: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    /* CompleteClass */
    var onLookupDisplay: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/export/DataExporterFieldDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newFromField(field: Field): DataExporterFieldDef = ^.asInstanceOf[js.Dynamic].applyDynamic("newFromField")(field.asInstanceOf[js.Any]).asInstanceOf[DataExporterFieldDef]
  
  type AngleFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_AngleFormat */ Any
  
  trait DataExporterFieldDef extends StObject {
    
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null
    
    var isGroup: Boolean
    
    var label: String
    
    var lookupType: Double
    
    var name: String
    
    var onCalculate: typings.nginstackEngine.libEventLegacyEventMod.^
    
    var onLookupDisplay: typings.nginstackEngine.libEventLegacyEventMod.^
    
    var `type`: String
  }
  object DataExporterFieldDef {
    
    inline def apply(
      isGroup: Boolean,
      label: String,
      lookupType: Double,
      name: String,
      onCalculate: typings.nginstackEngine.libEventLegacyEventMod.^,
      onLookupDisplay: typings.nginstackEngine.libEventLegacyEventMod.^,
      `type`: String
    ): DataExporterFieldDef = {
      val __obj = js.Dynamic.literal(isGroup = isGroup.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lookupType = lookupType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onCalculate = onCalculate.asInstanceOf[js.Any], onLookupDisplay = onLookupDisplay.asInstanceOf[js.Any], displayFormat = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataExporterFieldDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataExporterFieldDef] (val x: Self) extends AnyVal {
      
      inline def setDisplayFormat(value: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatNull: Self = StObject.set(x, "displayFormat", null)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLookupType(value: Double): Self = StObject.set(x, "lookupType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnCalculate(value: typings.nginstackEngine.libEventLegacyEventMod.^): Self = StObject.set(x, "onCalculate", value.asInstanceOf[js.Any])
      
      inline def setOnLookupDisplay(value: typings.nginstackEngine.libEventLegacyEventMod.^): Self = StObject.set(x, "onLookupDisplay", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type DateFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_DateFormat */ Any
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
  
  type LatitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LatitudeFormat */ Any
  
  type LongitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LongitudeFormat */ Any
}
