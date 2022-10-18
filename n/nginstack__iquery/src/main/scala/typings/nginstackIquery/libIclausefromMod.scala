package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIclausefromMod {
  
  inline def apply(iQuery: typings.nginstackIquery.libIqueryMod.^, classKey: Double, alias: String): Unit = (^.asInstanceOf[js.Dynamic].apply(iQuery.asInstanceOf[js.Any], classKey.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseFrom", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IClauseFrom {
    def this(iQuery: typings.nginstackIquery.libIqueryMod.^, classKey: Double, alias: String) = this()
  }
  @JSImport("@nginstack/iquery/lib/IClauseFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSequenceAlias(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequenceAlias")().asInstanceOf[Double]
  
  inline def resetSequenceAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSequenceAlias")().asInstanceOf[Unit]
  
  @js.native
  trait IClauseFrom extends StObject {
    
    /* private */ var _alias: Any = js.native
    
    /* private */ var _classDefManager: Any = js.native
    
    /* private */ var _classKey: Any = js.native
    
    /* private */ var _createPermissionJoins: Any = js.native
    
    /* private */ var _fieldsCache: Any = js.native
    
    /* private */ var _getFieldFromXClass: Any = js.native
    
    /* private */ var _instanceClass: Any = js.native
    
    /* private */ var _joinManager: Any = js.native
    
    /* private */ var _permissionJoins: Any = js.native
    
    var classFieldName: String = js.native
    
    var classKey: Double = js.native
    
    var extraFilter: js.Array[Any] = js.native
    
    def fieldCanBeNull(fieldName: String): Boolean = js.native
    
    /* private */ var getFieldClassKey: Any = js.native
    
    /* private */ var getFieldStringIfTrue: Any = js.native
    
    /* private */ var getFieldType: Any = js.native
    
    def getFromSql(): String = js.native
    
    def getWhereSql(): String = js.native
    def getWhereSql(join: Boolean): String = js.native
    
    var iQuery: typings.nginstackIquery.libIqueryMod.^ = js.native
    
    /* private */ var isFieldClass: Any = js.native
    
    /* private */ var isFieldRequired: Any = js.native
    
    var joinManager: typings.nginstackIquery.libIjoinmanagerMod.^ = js.native
    
    var keyFieldName: String = js.native
    
    var permissionFields: js.Array[Any] = js.native
    
    var tableName: String = js.native
    
    var xClassTableName: String = js.native
  }
}
