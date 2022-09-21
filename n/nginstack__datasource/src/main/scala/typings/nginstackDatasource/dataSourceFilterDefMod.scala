package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceFilterDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceFilterDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceFilterDef {
    
    /* CompleteClass */
    var disableGetChildren: Boolean = js.native
    
    /* CompleteClass */
    var group: String | Null = js.native
    
    /* CompleteClass */
    var operator: String = js.native
    
    /* CompleteClass */
    var prefix: String | Null = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceFilterDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataSourceFilterDef extends StObject {
    
    var disableGetChildren: Boolean
    
    var group: String | Null
    
    var operator: String
    
    var prefix: String | Null
  }
  object DataSourceFilterDef {
    
    inline def apply(disableGetChildren: Boolean, operator: String): DataSourceFilterDef = {
      val __obj = js.Dynamic.literal(disableGetChildren = disableGetChildren.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], group = null, prefix = null)
      __obj.asInstanceOf[DataSourceFilterDef]
    }
    
    extension [Self <: DataSourceFilterDef](x: Self) {
      
      inline def setDisableGetChildren(value: Boolean): Self = StObject.set(x, "disableGetChildren", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupNull: Self = StObject.set(x, "group", null)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    }
  }
}
