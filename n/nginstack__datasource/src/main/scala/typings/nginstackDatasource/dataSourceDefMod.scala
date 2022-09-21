package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceDef {
    
    /* private */ /* CompleteClass */
    var autoPurgeUnsolicitedColumns: Any = js.native
    
    /* CompleteClass */
    var availableColumns: js.Array[Any] = js.native
    
    /* CompleteClass */
    var availableFilters: js.Array[Any] = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var includes: js.Array[Double | String] = js.native
    
    /* CompleteClass */
    var onCreate: (js.Function1[/* arg0 */ Any, Any]) | Null = js.native
    
    /* CompleteClass */
    var onDefineColumns: (js.Function2[/* arg0 */ this.type, /* arg1 */ Any, Any]) | Null = js.native
    
    /* CompleteClass */
    var onDefineFilters: (js.Function2[/* arg0 */ this.type, /* arg1 */ Any, Any]) | Null = js.native
    
    /* CompleteClass */
    override def onGetQuery(arg0: Any, arg1: Any, arg2: Any): String = js.native
    
    /* CompleteClass */
    var onMountDataSet: (js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]) | Null = js.native
    
    /* CompleteClass */
    var public: Boolean = js.native
    
    /* CompleteClass */
    var securityMode: Any = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataSourceDef extends StObject {
    
    /* private */ var autoPurgeUnsolicitedColumns: Any
    
    var availableColumns: js.Array[Any]
    
    var availableFilters: js.Array[Any]
    
    var help: String
    
    var includes: js.Array[Double | String]
    
    var onCreate: (js.Function1[/* arg0 */ Any, Any]) | Null
    
    var onDefineColumns: (js.Function2[/* arg0 */ this.type, /* arg1 */ Any, Any]) | Null
    
    var onDefineFilters: (js.Function2[/* arg0 */ this.type, /* arg1 */ Any, Any]) | Null
    
    def onGetQuery(arg0: Any, arg1: Any, arg2: Any): String
    
    var onMountDataSet: (js.Function2[/* arg0 */ Any, /* arg1 */ Any, Any]) | Null
    
    var public: Boolean
    
    var securityMode: Any
  }
  object DataSourceDef {
    
    inline def apply(
      autoPurgeUnsolicitedColumns: Any,
      availableColumns: js.Array[Any],
      availableFilters: js.Array[Any],
      help: String,
      includes: js.Array[Double | String],
      onGetQuery: (Any, Any, Any) => String,
      public: Boolean,
      securityMode: Any
    ): DataSourceDef = {
      val __obj = js.Dynamic.literal(autoPurgeUnsolicitedColumns = autoPurgeUnsolicitedColumns.asInstanceOf[js.Any], availableColumns = availableColumns.asInstanceOf[js.Any], availableFilters = availableFilters.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], onGetQuery = js.Any.fromFunction3(onGetQuery), public = public.asInstanceOf[js.Any], securityMode = securityMode.asInstanceOf[js.Any], onCreate = null, onDefineColumns = null, onDefineFilters = null, onMountDataSet = null)
      __obj.asInstanceOf[DataSourceDef]
    }
    
    extension [Self <: DataSourceDef](x: Self) {
      
      inline def setAutoPurgeUnsolicitedColumns(value: Any): Self = StObject.set(x, "autoPurgeUnsolicitedColumns", value.asInstanceOf[js.Any])
      
      inline def setAvailableColumns(value: js.Array[Any]): Self = StObject.set(x, "availableColumns", value.asInstanceOf[js.Any])
      
      inline def setAvailableColumnsVarargs(value: Any*): Self = StObject.set(x, "availableColumns", js.Array(value*))
      
      inline def setAvailableFilters(value: js.Array[Any]): Self = StObject.set(x, "availableFilters", value.asInstanceOf[js.Any])
      
      inline def setAvailableFiltersVarargs(value: Any*): Self = StObject.set(x, "availableFilters", js.Array(value*))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setIncludes(value: js.Array[Double | String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesVarargs(value: (Double | String)*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setOnCreate(value: /* arg0 */ Any => Any): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateNull: Self = StObject.set(x, "onCreate", null)
      
      inline def setOnDefineColumns(value: (DataSourceDef, /* arg1 */ Any) => Any): Self = StObject.set(x, "onDefineColumns", js.Any.fromFunction2(value))
      
      inline def setOnDefineColumnsNull: Self = StObject.set(x, "onDefineColumns", null)
      
      inline def setOnDefineFilters(value: (DataSourceDef, /* arg1 */ Any) => Any): Self = StObject.set(x, "onDefineFilters", js.Any.fromFunction2(value))
      
      inline def setOnDefineFiltersNull: Self = StObject.set(x, "onDefineFilters", null)
      
      inline def setOnGetQuery(value: (Any, Any, Any) => String): Self = StObject.set(x, "onGetQuery", js.Any.fromFunction3(value))
      
      inline def setOnMountDataSet(value: (/* arg0 */ Any, /* arg1 */ Any) => Any): Self = StObject.set(x, "onMountDataSet", js.Any.fromFunction2(value))
      
      inline def setOnMountDataSetNull: Self = StObject.set(x, "onMountDataSet", null)
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setSecurityMode(value: Any): Self = StObject.set(x, "securityMode", value.asInstanceOf[js.Any])
    }
  }
}
