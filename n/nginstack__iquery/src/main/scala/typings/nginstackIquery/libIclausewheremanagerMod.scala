package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIclausewheremanagerMod {
  
  inline def apply(owner: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(owner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseWhereManager", JSImport.Namespace)
  @js.native
  /* private */ open class ^ ()
    extends StObject
       with IClauseWhereManager
  @JSImport("@nginstack/iquery/lib/IClauseWhereManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IClauseWhere = typings.nginstackIquery.libIclausewhereMod.^
  
  @js.native
  trait IClauseWhereManager extends StObject {
    
    /* private */ var fetch: Any = js.native
    
    /* private */ var getWhereGroup: Any = js.native
    
    def getWhereSql(): String = js.native
    
    def makeClauseWhere(iQuery: IQuery, literalClause: Any): IClauseWhere = js.native
    def makeClauseWhere(iQuery: IQuery, literalClause: Any, join: Boolean): IClauseWhere = js.native
    
    /* private */ var owner_ : Any = js.native
    
    /* private */ var whereGroup_ : Any = js.native
  }
  
  type IQuery = typings.nginstackIquery.libIqueryMod.^
}
