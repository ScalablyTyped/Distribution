package typings.nginstackDatasource

import typings.nginstackDatasource.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceFieldDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceFieldDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceFieldDef {
    
    /* CompleteClass */
    var classKey: Double | Null = js.native
    
    /* CompleteClass */
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null = js.native
    
    /* CompleteClass */
    var lookupType: Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Children = js.native
    
    /* CompleteClass */
    var `type`: Any = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceFieldDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AngleFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_AngleFormat */ Any
  
  trait DataSourceFieldDef extends StObject {
    
    var classKey: Double | Null
    
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null
    
    var lookupType: Any
    
    var name: String
    
    var options: Children
    
    var `type`: Any
  }
  object DataSourceFieldDef {
    
    inline def apply(lookupType: Any, name: String, options: Children, `type`: Any): DataSourceFieldDef = {
      val __obj = js.Dynamic.literal(lookupType = lookupType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], classKey = null, displayFormat = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceFieldDef]
    }
    
    extension [Self <: DataSourceFieldDef](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKeyNull: Self = StObject.set(x, "classKey", null)
      
      inline def setDisplayFormat(value: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatNull: Self = StObject.set(x, "displayFormat", null)
      
      inline def setLookupType(value: Any): Self = StObject.set(x, "lookupType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Children): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type DateFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_DateFormat */ Any
  
  type LatitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LatitudeFormat */ Any
  
  type LongitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LongitudeFormat */ Any
}
