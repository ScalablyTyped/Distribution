package typings.nginstackIquery

import typings.nginstackIquery.anon.CompleteColumnsNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIjoinmanagerMod {
  
  inline def apply(parent: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IJoinManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IJoinManager {
    def this(parent: Any) = this()
    
    /* private */ /* CompleteClass */
    var _iQuery: Any = js.native
    
    /* private */ /* CompleteClass */
    var _implicitJoinsFieldNames: Any = js.native
    
    /* private */ /* CompleteClass */
    var _joins: Any = js.native
    
    /* CompleteClass */
    override def createExplicitJoin(iQueryJoin: typings.nginstackIquery.libIqueryMod.^, `type`: Any): typings.nginstackIquery.libIclausejoinMod.^ = js.native
    
    /* CompleteClass */
    override def createImplicitJoin(fieldName: String, operator: Any, value: Any): js.Object = js.native
    
    /* CompleteClass */
    override def fieldCanBeNull(fieldName: String): Boolean = js.native
    
    /* CompleteClass */
    override def getColumnsNames(): CompleteColumnsNames = js.native
    
    /* CompleteClass */
    override def getJoinSql(): String = js.native
    
    /* CompleteClass */
    override def getWhereSql(): String = js.native
    
    /* CompleteClass */
    override def iQueryInJoinList(iQuery: typings.nginstackIquery.libIqueryMod.^): Boolean = js.native
  }
  @JSImport("@nginstack/iquery/lib/IJoinManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IJoinManager extends StObject {
    
    /* private */ var _iQuery: Any
    
    /* private */ var _implicitJoinsFieldNames: Any
    
    /* private */ var _joins: Any
    
    def createExplicitJoin(iQueryJoin: typings.nginstackIquery.libIqueryMod.^, `type`: Any): typings.nginstackIquery.libIclausejoinMod.^
    
    def createImplicitJoin(fieldName: String, operator: Any, value: Any): js.Object
    
    def fieldCanBeNull(fieldName: String): Boolean
    
    def getColumnsNames(): CompleteColumnsNames
    
    def getJoinSql(): String
    
    def getWhereSql(): String
    
    def iQueryInJoinList(iQuery: typings.nginstackIquery.libIqueryMod.^): Boolean
  }
  object IJoinManager {
    
    inline def apply(
      _iQuery: Any,
      _implicitJoinsFieldNames: Any,
      _joins: Any,
      createExplicitJoin: (typings.nginstackIquery.libIqueryMod.^, Any) => typings.nginstackIquery.libIclausejoinMod.^,
      createImplicitJoin: (String, Any, Any) => js.Object,
      fieldCanBeNull: String => Boolean,
      getColumnsNames: () => CompleteColumnsNames,
      getJoinSql: () => String,
      getWhereSql: () => String,
      iQueryInJoinList: typings.nginstackIquery.libIqueryMod.^ => Boolean
    ): IJoinManager = {
      val __obj = js.Dynamic.literal(_iQuery = _iQuery.asInstanceOf[js.Any], _implicitJoinsFieldNames = _implicitJoinsFieldNames.asInstanceOf[js.Any], _joins = _joins.asInstanceOf[js.Any], createExplicitJoin = js.Any.fromFunction2(createExplicitJoin), createImplicitJoin = js.Any.fromFunction3(createImplicitJoin), fieldCanBeNull = js.Any.fromFunction1(fieldCanBeNull), getColumnsNames = js.Any.fromFunction0(getColumnsNames), getJoinSql = js.Any.fromFunction0(getJoinSql), getWhereSql = js.Any.fromFunction0(getWhereSql), iQueryInJoinList = js.Any.fromFunction1(iQueryInJoinList))
      __obj.asInstanceOf[IJoinManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IJoinManager] (val x: Self) extends AnyVal {
      
      inline def setCreateExplicitJoin(
        value: (typings.nginstackIquery.libIqueryMod.^, Any) => typings.nginstackIquery.libIclausejoinMod.^
      ): Self = StObject.set(x, "createExplicitJoin", js.Any.fromFunction2(value))
      
      inline def setCreateImplicitJoin(value: (String, Any, Any) => js.Object): Self = StObject.set(x, "createImplicitJoin", js.Any.fromFunction3(value))
      
      inline def setFieldCanBeNull(value: String => Boolean): Self = StObject.set(x, "fieldCanBeNull", js.Any.fromFunction1(value))
      
      inline def setGetColumnsNames(value: () => CompleteColumnsNames): Self = StObject.set(x, "getColumnsNames", js.Any.fromFunction0(value))
      
      inline def setGetJoinSql(value: () => String): Self = StObject.set(x, "getJoinSql", js.Any.fromFunction0(value))
      
      inline def setGetWhereSql(value: () => String): Self = StObject.set(x, "getWhereSql", js.Any.fromFunction0(value))
      
      inline def setIQueryInJoinList(value: typings.nginstackIquery.libIqueryMod.^ => Boolean): Self = StObject.set(x, "iQueryInJoinList", js.Any.fromFunction1(value))
      
      inline def set_iQuery(value: Any): Self = StObject.set(x, "_iQuery", value.asInstanceOf[js.Any])
      
      inline def set_implicitJoinsFieldNames(value: Any): Self = StObject.set(x, "_implicitJoinsFieldNames", value.asInstanceOf[js.Any])
      
      inline def set_joins(value: Any): Self = StObject.set(x, "_joins", value.asInstanceOf[js.Any])
    }
  }
}
