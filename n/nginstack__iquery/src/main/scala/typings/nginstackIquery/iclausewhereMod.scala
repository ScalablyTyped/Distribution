package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iclausewhereMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseWhere", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IClauseWhere {
    
    /* private */ /* CompleteClass */
    var _defaultOperatorToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var _existsOrNotExistsToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getSqlFieldName: Any = js.native
    
    /* private */ /* CompleteClass */
    var _likeToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var _requiredClauseToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var _subSelectClauseToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var canSplit_ : Any = js.native
    
    /* CompleteClass */
    var caseMode: String = js.native
    
    /* CompleteClass */
    var disableGetChildren: Boolean = js.native
    
    /* CompleteClass */
    var existsOrNotExists: String = js.native
    
    /* CompleteClass */
    var fieldName: String = js.native
    
    /* CompleteClass */
    var fieldStringIfTrue: Any = js.native
    
    /* CompleteClass */
    var fieldType: String = js.native
    
    /* private */ /* CompleteClass */
    var formatValue: Any = js.native
    
    /* CompleteClass */
    override def getIsGenerable(): Boolean = js.native
    
    /* CompleteClass */
    override def getValueIsNull(): Boolean = js.native
    
    /* CompleteClass */
    var hasClassField: Boolean = js.native
    
    /* CompleteClass */
    var iQuery: typings.nginstackIquery.iqueryMod.^ = js.native
    
    /* CompleteClass */
    var isInJoinClause: Any = js.native
    
    /* CompleteClass */
    var isSubSelect: Boolean = js.native
    
    /* CompleteClass */
    var likeMode: String = js.native
    
    /* CompleteClass */
    var operator: String = js.native
    
    /* CompleteClass */
    var ownerJoin: Any = js.native
    
    /* CompleteClass */
    var required: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var splitValueList_ : Any = js.native
    
    /* CompleteClass */
    override def toSql(): String = js.native
    
    /* CompleteClass */
    var value: String | js.Date | Double = js.native
    
    /* CompleteClass */
    var valueIsColumnName: Boolean = js.native
  }
  @JSImport("@nginstack/iquery/lib/IClauseWhere", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IClauseJoin = typings.nginstackIquery.iclausejoinMod.^
  
  trait IClauseWhere extends StObject {
    
    /* private */ var _defaultOperatorToSql: Any
    
    /* private */ var _existsOrNotExistsToSql: Any
    
    /* private */ var _getSqlFieldName: Any
    
    /* private */ var _likeToSql: Any
    
    /* private */ var _requiredClauseToSql: Any
    
    /* private */ var _subSelectClauseToSql: Any
    
    /* private */ var canSplit_ : Any
    
    var caseMode: String
    
    var disableGetChildren: Boolean
    
    var existsOrNotExists: String
    
    var fieldName: String
    
    var fieldStringIfTrue: Any
    
    var fieldType: String
    
    /* private */ var formatValue: Any
    
    def getIsGenerable(): Boolean
    
    def getValueIsNull(): Boolean
    
    var hasClassField: Boolean
    
    var iQuery: typings.nginstackIquery.iqueryMod.^
    
    var isInJoinClause: Any
    
    var isSubSelect: Boolean
    
    var likeMode: String
    
    var operator: String
    
    var ownerJoin: Any
    
    var required: Boolean
    
    /* private */ var splitValueList_ : Any
    
    def toSql(): String
    
    var value: String | js.Date | Double
    
    var valueIsColumnName: Boolean
  }
  object IClauseWhere {
    
    inline def apply(
      _defaultOperatorToSql: Any,
      _existsOrNotExistsToSql: Any,
      _getSqlFieldName: Any,
      _likeToSql: Any,
      _requiredClauseToSql: Any,
      _subSelectClauseToSql: Any,
      canSplit_ : Any,
      caseMode: String,
      disableGetChildren: Boolean,
      existsOrNotExists: String,
      fieldName: String,
      fieldStringIfTrue: Any,
      fieldType: String,
      formatValue: Any,
      getIsGenerable: () => Boolean,
      getValueIsNull: () => Boolean,
      hasClassField: Boolean,
      iQuery: typings.nginstackIquery.iqueryMod.^,
      isInJoinClause: Any,
      isSubSelect: Boolean,
      likeMode: String,
      operator: String,
      ownerJoin: Any,
      required: Boolean,
      splitValueList_ : Any,
      toSql: () => String,
      value: String | js.Date | Double,
      valueIsColumnName: Boolean
    ): IClauseWhere = {
      val __obj = js.Dynamic.literal(_defaultOperatorToSql = _defaultOperatorToSql.asInstanceOf[js.Any], _existsOrNotExistsToSql = _existsOrNotExistsToSql.asInstanceOf[js.Any], _getSqlFieldName = _getSqlFieldName.asInstanceOf[js.Any], _likeToSql = _likeToSql.asInstanceOf[js.Any], _requiredClauseToSql = _requiredClauseToSql.asInstanceOf[js.Any], _subSelectClauseToSql = _subSelectClauseToSql.asInstanceOf[js.Any], canSplit_ = canSplit_.asInstanceOf[js.Any], caseMode = caseMode.asInstanceOf[js.Any], disableGetChildren = disableGetChildren.asInstanceOf[js.Any], existsOrNotExists = existsOrNotExists.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldStringIfTrue = fieldStringIfTrue.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], formatValue = formatValue.asInstanceOf[js.Any], getIsGenerable = js.Any.fromFunction0(getIsGenerable), getValueIsNull = js.Any.fromFunction0(getValueIsNull), hasClassField = hasClassField.asInstanceOf[js.Any], iQuery = iQuery.asInstanceOf[js.Any], isInJoinClause = isInJoinClause.asInstanceOf[js.Any], isSubSelect = isSubSelect.asInstanceOf[js.Any], likeMode = likeMode.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], ownerJoin = ownerJoin.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], splitValueList_ = splitValueList_.asInstanceOf[js.Any], toSql = js.Any.fromFunction0(toSql), value = value.asInstanceOf[js.Any], valueIsColumnName = valueIsColumnName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IClauseWhere]
    }
    
    extension [Self <: IClauseWhere](x: Self) {
      
      inline def setCanSplit_(value: Any): Self = StObject.set(x, "canSplit_", value.asInstanceOf[js.Any])
      
      inline def setCaseMode(value: String): Self = StObject.set(x, "caseMode", value.asInstanceOf[js.Any])
      
      inline def setDisableGetChildren(value: Boolean): Self = StObject.set(x, "disableGetChildren", value.asInstanceOf[js.Any])
      
      inline def setExistsOrNotExists(value: String): Self = StObject.set(x, "existsOrNotExists", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldStringIfTrue(value: Any): Self = StObject.set(x, "fieldStringIfTrue", value.asInstanceOf[js.Any])
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
      
      inline def setFormatValue(value: Any): Self = StObject.set(x, "formatValue", value.asInstanceOf[js.Any])
      
      inline def setGetIsGenerable(value: () => Boolean): Self = StObject.set(x, "getIsGenerable", js.Any.fromFunction0(value))
      
      inline def setGetValueIsNull(value: () => Boolean): Self = StObject.set(x, "getValueIsNull", js.Any.fromFunction0(value))
      
      inline def setHasClassField(value: Boolean): Self = StObject.set(x, "hasClassField", value.asInstanceOf[js.Any])
      
      inline def setIQuery(value: typings.nginstackIquery.iqueryMod.^): Self = StObject.set(x, "iQuery", value.asInstanceOf[js.Any])
      
      inline def setIsInJoinClause(value: Any): Self = StObject.set(x, "isInJoinClause", value.asInstanceOf[js.Any])
      
      inline def setIsSubSelect(value: Boolean): Self = StObject.set(x, "isSubSelect", value.asInstanceOf[js.Any])
      
      inline def setLikeMode(value: String): Self = StObject.set(x, "likeMode", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOwnerJoin(value: Any): Self = StObject.set(x, "ownerJoin", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSplitValueList_(value: Any): Self = StObject.set(x, "splitValueList_", value.asInstanceOf[js.Any])
      
      inline def setToSql(value: () => String): Self = StObject.set(x, "toSql", js.Any.fromFunction0(value))
      
      inline def setValue(value: String | js.Date | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueIsColumnName(value: Boolean): Self = StObject.set(x, "valueIsColumnName", value.asInstanceOf[js.Any])
      
      inline def set_defaultOperatorToSql(value: Any): Self = StObject.set(x, "_defaultOperatorToSql", value.asInstanceOf[js.Any])
      
      inline def set_existsOrNotExistsToSql(value: Any): Self = StObject.set(x, "_existsOrNotExistsToSql", value.asInstanceOf[js.Any])
      
      inline def set_getSqlFieldName(value: Any): Self = StObject.set(x, "_getSqlFieldName", value.asInstanceOf[js.Any])
      
      inline def set_likeToSql(value: Any): Self = StObject.set(x, "_likeToSql", value.asInstanceOf[js.Any])
      
      inline def set_requiredClauseToSql(value: Any): Self = StObject.set(x, "_requiredClauseToSql", value.asInstanceOf[js.Any])
      
      inline def set_subSelectClauseToSql(value: Any): Self = StObject.set(x, "_subSelectClauseToSql", value.asInstanceOf[js.Any])
    }
  }
}
