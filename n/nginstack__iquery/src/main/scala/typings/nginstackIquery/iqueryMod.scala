package typings.nginstackIquery

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iqueryMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IQuery", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IQuery
  @JSImport("@nginstack/iquery/lib/IQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/iquery/lib/IQuery", "defaultCheckPermission")
  @js.native
  def defaultCheckPermission: Boolean = js.native
  inline def defaultCheckPermission_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckPermission")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/iquery/lib/IQuery", "from")
  @js.native
  def from: Any = js.native
  inline def from_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
  
  type DBKey = typings.nginstackEngine.dbkeyMod.^
  
  type IClauseJoin = typings.nginstackIquery.iclausejoinMod.^
  
  @js.native
  trait IQuery extends StObject {
    
    /* private */ var _checkPermission: Any = js.native
    
    /* private */ var _iClauseFrom: Any = js.native
    
    /* private */ var _joinManager: Any = js.native
    
    /* private */ var _leftJoinIQuery: Any = js.native
    
    /* private */ var _permissionJoins: Any = js.native
    
    def checkPermission(): IQuery = js.native
    
    var clauseFrom: typings.nginstackIquery.iclausefromMod.^ = js.native
    
    def column(field: typings.nginstackIquery.iclauseselectMod.^, args: Any*): typings.nginstackIquery.iclauseselectMod.^ = js.native
    def column(field: Record[Any, Any], args: Any*): typings.nginstackIquery.iclauseselectMod.^ = js.native
    
    def from(classKey: Double, alias: Any): IQuery = js.native
    
    def getLeftJoinIQuery(): IClauseJoin = js.native
    
    def getWhereSql(): String = js.native
    def getWhereSql(join: Boolean): String = js.native
    
    /* private */ var iClauseWhereManager_ : Any = js.native
    
    def innerJoin(iQueryJoin: Any): IClauseJoin = js.native
    
    var joinManager: typings.nginstackIquery.ijoinmanagerMod.^ = js.native
    
    def leftOuterJoin(iQueryJoin: Any): IClauseJoin = js.native
    
    def toSql(): String = js.native
    
    def uncheckPermission(): IQuery = js.native
    
    /* private */ var userKey: Any = js.native
    
    var validatePermission: Double = js.native
    
    def where(where: Any): IQuery = js.native
    
    var whereClauseCount: Double = js.native
  }
}
