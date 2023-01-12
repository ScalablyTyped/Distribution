package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.DisplayFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvReportVisualizationColumnMod {
  
  inline def apply(name: String): Unit = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumn", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ReportVisualizationColumn {
    def this(name: String) = this()
    
    /* CompleteClass */
    var aggregate: String | Null = js.native
    
    /* CompleteClass */
    var alias: String = js.native
    
    /* CompleteClass */
    override def assignFrom(obj: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    var canonicalName: String = js.native
    
    /* CompleteClass */
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null = js.native
    
    /* CompleteClass */
    var fieldName: String | Null = js.native
    
    /* private */ /* CompleteClass */
    var formatCanonicalName_ : Any = js.native
    
    /* CompleteClass */
    var groupType: Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var pathDepth: Double = js.native
    
    /* CompleteClass */
    var pathHeight: Double = js.native
    
    /* private */ /* CompleteClass */
    var propertiesToAssignDirectly_ : Any = js.native
    
    /* CompleteClass */
    var slColumnAssignMap: DisplayFormat = js.native
    
    /* CompleteClass */
    var totalAggregate: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var weight: String | Null = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasPathDimension(col: ReportVisualizationColumn): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPathDimension")(col.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type AngleFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_AngleFormat */ Any
  
  type DateFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_DateFormat */ Any
  
  type LatitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LatitudeFormat */ Any
  
  type LongitudeFormat = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_LongitudeFormat */ Any
  
  trait ReportVisualizationColumn extends StObject {
    
    var aggregate: String | Null
    
    var alias: String
    
    def assignFrom(obj: Record[String, Any]): Unit
    
    var canonicalName: String
    
    var displayFormat: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double | Null
    
    var fieldName: String | Null
    
    /* private */ var formatCanonicalName_ : Any
    
    var groupType: Any
    
    var name: String
    
    var pathDepth: Double
    
    var pathHeight: Double
    
    /* private */ var propertiesToAssignDirectly_ : Any
    
    var slColumnAssignMap: DisplayFormat
    
    var totalAggregate: Any
    
    var `type`: String
    
    var weight: String | Null
  }
  object ReportVisualizationColumn {
    
    inline def apply(
      alias: String,
      assignFrom: Record[String, Any] => Unit,
      canonicalName: String,
      formatCanonicalName_ : Any,
      groupType: Any,
      name: String,
      pathDepth: Double,
      pathHeight: Double,
      propertiesToAssignDirectly_ : Any,
      slColumnAssignMap: DisplayFormat,
      totalAggregate: Any,
      `type`: String
    ): ReportVisualizationColumn = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], assignFrom = js.Any.fromFunction1(assignFrom), canonicalName = canonicalName.asInstanceOf[js.Any], formatCanonicalName_ = formatCanonicalName_.asInstanceOf[js.Any], groupType = groupType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathDepth = pathDepth.asInstanceOf[js.Any], pathHeight = pathHeight.asInstanceOf[js.Any], propertiesToAssignDirectly_ = propertiesToAssignDirectly_.asInstanceOf[js.Any], slColumnAssignMap = slColumnAssignMap.asInstanceOf[js.Any], totalAggregate = totalAggregate.asInstanceOf[js.Any], aggregate = null, displayFormat = null, fieldName = null, weight = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportVisualizationColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportVisualizationColumn] (val x: Self) extends AnyVal {
      
      inline def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      inline def setAggregateNull: Self = StObject.set(x, "aggregate", null)
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAssignFrom(value: Record[String, Any] => Unit): Self = StObject.set(x, "assignFrom", js.Any.fromFunction1(value))
      
      inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormat(value: DateFormat | LatitudeFormat | LongitudeFormat | AngleFormat | String | Double): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatNull: Self = StObject.set(x, "displayFormat", null)
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
      
      inline def setFormatCanonicalName_(value: Any): Self = StObject.set(x, "formatCanonicalName_", value.asInstanceOf[js.Any])
      
      inline def setGroupType(value: Any): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPathDepth(value: Double): Self = StObject.set(x, "pathDepth", value.asInstanceOf[js.Any])
      
      inline def setPathHeight(value: Double): Self = StObject.set(x, "pathHeight", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToAssignDirectly_(value: Any): Self = StObject.set(x, "propertiesToAssignDirectly_", value.asInstanceOf[js.Any])
      
      inline def setSlColumnAssignMap(value: DisplayFormat): Self = StObject.set(x, "slColumnAssignMap", value.asInstanceOf[js.Any])
      
      inline def setTotalAggregate(value: Any): Self = StObject.set(x, "totalAggregate", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightNull: Self = StObject.set(x, "weight", null)
    }
  }
}
