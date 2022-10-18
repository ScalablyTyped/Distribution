package typings.nginstackDatasource

import typings.nginstackDatasource.anon.DDD
import typings.nginstackDatasource.anon.DDDDDDDD
import typings.nginstackDatasource.anon.DDMM
import typings.nginstackDatasource.anon.EQUALITY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceFilterMod {
  
  inline def apply(name: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceFilter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSourceFilter {
    def this(name: String, `type`: String) = this()
  }
  @JSImport("@nginstack/datasource/lib/DataSourceFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeRangeSuffix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRangeSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shouldCreateAuxiliaryRangeFilters(filter: DataSourceFilter): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCreateAuxiliaryRangeFilters")(filter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldCreateAuxiliaryRangeFilters(filter: Field): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldCreateAuxiliaryRangeFilters")(filter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait DataSourceFilter extends StObject {
    
    var classKey: Double = js.native
    
    /* private */ var defaultValue_ : Any = js.native
    
    var displayFormat: DDMM | DDDDDDDD | DDD = js.native
    
    /* private */ var fieldName_ : Any = js.native
    
    def fromField(field: Field): Unit = js.native
    
    def getCanonicalName(): String = js.native
    
    def getDefaultValue(): Double | String | js.Date = js.native
    
    def getFieldName(): String = js.native
    
    /* private */ var getNameSegments: Any = js.native
    
    var group: String = js.native
    
    var help: String = js.native
    
    var label: String = js.native
    
    var lookupType: Double = js.native
    
    def newFilterToRange(rangeSuffix: String): DataSourceFilter = js.native
    
    def newFiltersToRange(): js.Array[DataSourceFilter] = js.native
    
    /* private */ var normalizeValue_ : Any = js.native
    
    /* private */ var notifyNameChange_ : Any = js.native
    
    var onAfterLoadDefaultValue: Event = js.native
    
    var operator: EQUALITY | String = js.native
    
    var options: js.Array[js.Array[Any]] = js.native
    
    /* private */ var parseExpression_ : Any = js.native
    
    /* private */ var prefix_ : Any = js.native
    
    /* private */ var propertiesToAssign_ : Any = js.native
    
    var rangeLimit: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Limit */ Any = js.native
    
    def setDefaultValue(value: String): Unit = js.native
    def setDefaultValue(value: js.Date): Unit = js.native
    def setDefaultValue(value: Double): Unit = js.native
    
    var size: Double = js.native
    
    var stringIfTrue: String = js.native
    
    var `type`: String = js.native
    
    var value: Any = js.native
  }
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
}
