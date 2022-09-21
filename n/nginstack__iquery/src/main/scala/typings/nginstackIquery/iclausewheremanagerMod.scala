package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iclausewheremanagerMod {
  
  inline def apply(owner: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(owner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseWhereManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IClauseWhereManager {
    def this(owner: Any) = this()
  }
  @JSImport("@nginstack/iquery/lib/IClauseWhereManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait IClauseWhereManager extends StObject {
    
    /* private */ var fetch: Any = js.native
    
    /* private */ var getWhereGroup: Any = js.native
    
    def getWhereSql(): String = js.native
    
    def makeClauseWhere(iQuery: Any, literalClause: Any): Any = js.native
    def makeClauseWhere(iQuery: Any, literalClause: Any, join: Boolean): Any = js.native
    
    /* private */ var owner_ : Any = js.native
    
    /* private */ var whereGroup_ : Any = js.native
  }
}
