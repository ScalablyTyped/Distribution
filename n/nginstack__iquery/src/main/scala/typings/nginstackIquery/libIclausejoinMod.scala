package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIclausejoinMod {
  
  inline def apply(iQuery: IQuery, iQueryJoin: IQuery, `type`: String, isRightTableAsSubquery: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(iQuery.asInstanceOf[js.Any], iQueryJoin.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], isRightTableAsSubquery.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseJoin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IClauseJoin {
    def this(iQuery: IQuery, iQueryJoin: IQuery, `type`: String, isRightTableAsSubquery: Any) = this()
    
    /* private */ /* CompleteClass */
    var _addClause: Any = js.native
    
    /* private */ /* CompleteClass */
    var _clausesOn: Any = js.native
    
    /* private */ /* CompleteClass */
    var _iQuery: Any = js.native
    
    /* private */ /* CompleteClass */
    var _iQueryJoin: Any = js.native
    
    /* private */ /* CompleteClass */
    var _type: Any = js.native
    
    /* CompleteClass */
    override def getClauseOn(index: Double): IClauseWhere = js.native
    
    /* CompleteClass */
    override def getClausesOnCount(): Double = js.native
    
    /* CompleteClass */
    override def getColumnsNames(): js.Object = js.native
    
    /* CompleteClass */
    override def getJoinSql(): String = js.native
    
    /* CompleteClass */
    override def getWhereSql(): String = js.native
    
    /* CompleteClass */
    var iQuery: IQuery = js.native
    
    /* CompleteClass */
    var iQueryJoin: IQuery = js.native
    
    /* CompleteClass */
    var isRightTableAsSubquery: Boolean = js.native
    
    /* CompleteClass */
    override def on(clause: Any): IClauseJoin = js.native
    
    /* private */ /* CompleteClass */
    var rightTableAsSubQuery_ : Any = js.native
  }
  @JSImport("@nginstack/iquery/lib/IClauseJoin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IClauseJoin extends StObject {
    
    /* private */ var _addClause: Any
    
    /* private */ var _clausesOn: Any
    
    /* private */ var _iQuery: Any
    
    /* private */ var _iQueryJoin: Any
    
    /* private */ var _type: Any
    
    def getClauseOn(index: Double): IClauseWhere
    
    def getClausesOnCount(): Double
    
    def getColumnsNames(): js.Object
    
    def getJoinSql(): String
    
    def getWhereSql(): String
    
    var iQuery: IQuery
    
    var iQueryJoin: IQuery
    
    var isRightTableAsSubquery: Boolean
    
    def on(clause: Any): IClauseJoin
    
    /* private */ var rightTableAsSubQuery_ : Any
  }
  object IClauseJoin {
    
    inline def apply(
      _addClause: Any,
      _clausesOn: Any,
      _iQuery: Any,
      _iQueryJoin: Any,
      _type: Any,
      getClauseOn: Double => IClauseWhere,
      getClausesOnCount: () => Double,
      getColumnsNames: () => js.Object,
      getJoinSql: () => String,
      getWhereSql: () => String,
      iQuery: IQuery,
      iQueryJoin: IQuery,
      isRightTableAsSubquery: Boolean,
      on: Any => IClauseJoin,
      rightTableAsSubQuery_ : Any
    ): IClauseJoin = {
      val __obj = js.Dynamic.literal(_addClause = _addClause.asInstanceOf[js.Any], _clausesOn = _clausesOn.asInstanceOf[js.Any], _iQuery = _iQuery.asInstanceOf[js.Any], _iQueryJoin = _iQueryJoin.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], getClauseOn = js.Any.fromFunction1(getClauseOn), getClausesOnCount = js.Any.fromFunction0(getClausesOnCount), getColumnsNames = js.Any.fromFunction0(getColumnsNames), getJoinSql = js.Any.fromFunction0(getJoinSql), getWhereSql = js.Any.fromFunction0(getWhereSql), iQuery = iQuery.asInstanceOf[js.Any], iQueryJoin = iQueryJoin.asInstanceOf[js.Any], isRightTableAsSubquery = isRightTableAsSubquery.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), rightTableAsSubQuery_ = rightTableAsSubQuery_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IClauseJoin]
    }
    
    extension [Self <: IClauseJoin](x: Self) {
      
      inline def setGetClauseOn(value: Double => IClauseWhere): Self = StObject.set(x, "getClauseOn", js.Any.fromFunction1(value))
      
      inline def setGetClausesOnCount(value: () => Double): Self = StObject.set(x, "getClausesOnCount", js.Any.fromFunction0(value))
      
      inline def setGetColumnsNames(value: () => js.Object): Self = StObject.set(x, "getColumnsNames", js.Any.fromFunction0(value))
      
      inline def setGetJoinSql(value: () => String): Self = StObject.set(x, "getJoinSql", js.Any.fromFunction0(value))
      
      inline def setGetWhereSql(value: () => String): Self = StObject.set(x, "getWhereSql", js.Any.fromFunction0(value))
      
      inline def setIQuery(value: IQuery): Self = StObject.set(x, "iQuery", value.asInstanceOf[js.Any])
      
      inline def setIQueryJoin(value: IQuery): Self = StObject.set(x, "iQueryJoin", value.asInstanceOf[js.Any])
      
      inline def setIsRightTableAsSubquery(value: Boolean): Self = StObject.set(x, "isRightTableAsSubquery", value.asInstanceOf[js.Any])
      
      inline def setOn(value: Any => IClauseJoin): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      inline def setRightTableAsSubQuery_(value: Any): Self = StObject.set(x, "rightTableAsSubQuery_", value.asInstanceOf[js.Any])
      
      inline def set_addClause(value: Any): Self = StObject.set(x, "_addClause", value.asInstanceOf[js.Any])
      
      inline def set_clausesOn(value: Any): Self = StObject.set(x, "_clausesOn", value.asInstanceOf[js.Any])
      
      inline def set_iQuery(value: Any): Self = StObject.set(x, "_iQuery", value.asInstanceOf[js.Any])
      
      inline def set_iQueryJoin(value: Any): Self = StObject.set(x, "_iQueryJoin", value.asInstanceOf[js.Any])
      
      inline def set_type(value: Any): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    }
  }
  
  type IClauseWhere = typings.nginstackIquery.libIclausewhereMod.^
  
  type IQuery = typings.nginstackIquery.libIqueryMod.^
  
  trait RightTableAsSubQueryConfig extends StObject {
    
    var clauseSelect: typings.nginstackIquery.libIclauseselectMod.^
    
    var isEnabled: Boolean
    
    var subQueryAlias: String
  }
  object RightTableAsSubQueryConfig {
    
    inline def apply(
      clauseSelect: typings.nginstackIquery.libIclauseselectMod.^,
      isEnabled: Boolean,
      subQueryAlias: String
    ): RightTableAsSubQueryConfig = {
      val __obj = js.Dynamic.literal(clauseSelect = clauseSelect.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], subQueryAlias = subQueryAlias.asInstanceOf[js.Any])
      __obj.asInstanceOf[RightTableAsSubQueryConfig]
    }
    
    extension [Self <: RightTableAsSubQueryConfig](x: Self) {
      
      inline def setClauseSelect(value: typings.nginstackIquery.libIclauseselectMod.^): Self = StObject.set(x, "clauseSelect", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setSubQueryAlias(value: String): Self = StObject.set(x, "subQueryAlias", value.asInstanceOf[js.Any])
    }
  }
}
