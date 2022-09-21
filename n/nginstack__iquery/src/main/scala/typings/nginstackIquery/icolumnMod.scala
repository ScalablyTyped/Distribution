package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icolumnMod {
  
  inline def apply(column: ColumnConfig, tableName: String): Unit = (^.asInstanceOf[js.Dynamic].apply(column.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IColumn", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IColumn {
    def this(column: ColumnConfig, tableName: String) = this()
    
    /* private */ /* CompleteClass */
    var _aggregate: Any = js.native
    
    /* private */ /* CompleteClass */
    var _alias: Any = js.native
    
    /* private */ /* CompleteClass */
    var _arrayColumnToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var _cast: Any = js.native
    
    /* private */ /* CompleteClass */
    var _castValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var _field: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getAggregate: Any = js.native
    
    /* private */ /* CompleteClass */
    var _literal: Any = js.native
    
    /* private */ /* CompleteClass */
    var _naturalColumnToSql: Any = js.native
    
    /* private */ /* CompleteClass */
    var _show: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tableName: Any = js.native
    
    /* private */ /* CompleteClass */
    var _useDistinct: Any = js.native
    
    /* private */ /* CompleteClass */
    var _validate: Any = js.native
    
    /* private */ /* CompleteClass */
    var _weight: Any = js.native
    
    /* CompleteClass */
    var aggregate: String = js.native
    
    /* CompleteClass */
    var alias: String = js.native
    
    /* private */ /* CompleteClass */
    var checkColumnCollection_ : Any = js.native
    
    /* CompleteClass */
    var coalesceValue: String | Double = js.native
    
    /* CompleteClass */
    var field: String | typings.nginstackIquery.iclauseselectMod.^ = js.native
    
    /* CompleteClass */
    var fieldName: String = js.native
    
    /* private */ /* CompleteClass */
    var getDistinct: Any = js.native
    
    /* CompleteClass */
    var isAggregate: Boolean = js.native
    
    /* CompleteClass */
    var isLiteral: Boolean = js.native
    
    /* CompleteClass */
    var isOperator: Boolean = js.native
    
    /* CompleteClass */
    var isSubQuery: Boolean = js.native
    
    /* CompleteClass */
    var literal: String = js.native
    
    /* private */ /* CompleteClass */
    var namePattern_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var sanitizeName_ : Any = js.native
    
    /* CompleteClass */
    var show: Boolean = js.native
    
    /* CompleteClass */
    override def toSql(noAlias: Boolean): String = js.native
    
    /* CompleteClass */
    var useCoalesce: Boolean = js.native
    
    /* CompleteClass */
    var weight: String = js.native
  }
  @JSImport("@nginstack/iquery/lib/IColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ColumnConfig extends StObject {
    
    var alias: String
    
    var cast: String
    
    var castValue: String | Double
    
    var coalesceValue: String | Double
    
    var distinct: Boolean
    
    var field: String | typings.nginstackIquery.iclauseselectMod.^
    
    var isSubQuery: Boolean
    
    var literal: String
    
    var show: Boolean
    
    var useCoalesce: Boolean
    
    var weight: String
  }
  object ColumnConfig {
    
    inline def apply(
      alias: String,
      cast: String,
      castValue: String | Double,
      coalesceValue: String | Double,
      distinct: Boolean,
      field: String | typings.nginstackIquery.iclauseselectMod.^,
      isSubQuery: Boolean,
      literal: String,
      show: Boolean,
      useCoalesce: Boolean,
      weight: String
    ): ColumnConfig = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], castValue = castValue.asInstanceOf[js.Any], coalesceValue = coalesceValue.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], isSubQuery = isSubQuery.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], useCoalesce = useCoalesce.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConfig]
    }
    
    extension [Self <: ColumnConfig](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setCast(value: String): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      inline def setCastValue(value: String | Double): Self = StObject.set(x, "castValue", value.asInstanceOf[js.Any])
      
      inline def setCoalesceValue(value: String | Double): Self = StObject.set(x, "coalesceValue", value.asInstanceOf[js.Any])
      
      inline def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
      
      inline def setField(value: String | typings.nginstackIquery.iclauseselectMod.^): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setIsSubQuery(value: Boolean): Self = StObject.set(x, "isSubQuery", value.asInstanceOf[js.Any])
      
      inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setUseCoalesce(value: Boolean): Self = StObject.set(x, "useCoalesce", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColumn extends StObject {
    
    /* private */ var _aggregate: Any
    
    /* private */ var _alias: Any
    
    /* private */ var _arrayColumnToSql: Any
    
    /* private */ var _cast: Any
    
    /* private */ var _castValue: Any
    
    /* private */ var _field: Any
    
    /* private */ var _getAggregate: Any
    
    /* private */ var _literal: Any
    
    /* private */ var _naturalColumnToSql: Any
    
    /* private */ var _show: Any
    
    /* private */ var _tableName: Any
    
    /* private */ var _useDistinct: Any
    
    /* private */ var _validate: Any
    
    /* private */ var _weight: Any
    
    var aggregate: String
    
    var alias: String
    
    /* private */ var checkColumnCollection_ : Any
    
    var coalesceValue: String | Double
    
    var field: String | typings.nginstackIquery.iclauseselectMod.^
    
    var fieldName: String
    
    /* private */ var getDistinct: Any
    
    var isAggregate: Boolean
    
    var isLiteral: Boolean
    
    var isOperator: Boolean
    
    var isSubQuery: Boolean
    
    var literal: String
    
    /* private */ var namePattern_ : Any
    
    /* private */ var sanitizeName_ : Any
    
    var show: Boolean
    
    def toSql(noAlias: Boolean): String
    
    var useCoalesce: Boolean
    
    var weight: String
  }
  object IColumn {
    
    inline def apply(
      _aggregate: Any,
      _alias: Any,
      _arrayColumnToSql: Any,
      _cast: Any,
      _castValue: Any,
      _field: Any,
      _getAggregate: Any,
      _literal: Any,
      _naturalColumnToSql: Any,
      _show: Any,
      _tableName: Any,
      _useDistinct: Any,
      _validate: Any,
      _weight: Any,
      aggregate: String,
      alias: String,
      checkColumnCollection_ : Any,
      coalesceValue: String | Double,
      field: String | typings.nginstackIquery.iclauseselectMod.^,
      fieldName: String,
      getDistinct: Any,
      isAggregate: Boolean,
      isLiteral: Boolean,
      isOperator: Boolean,
      isSubQuery: Boolean,
      literal: String,
      namePattern_ : Any,
      sanitizeName_ : Any,
      show: Boolean,
      toSql: Boolean => String,
      useCoalesce: Boolean,
      weight: String
    ): IColumn = {
      val __obj = js.Dynamic.literal(_aggregate = _aggregate.asInstanceOf[js.Any], _alias = _alias.asInstanceOf[js.Any], _arrayColumnToSql = _arrayColumnToSql.asInstanceOf[js.Any], _cast = _cast.asInstanceOf[js.Any], _castValue = _castValue.asInstanceOf[js.Any], _field = _field.asInstanceOf[js.Any], _getAggregate = _getAggregate.asInstanceOf[js.Any], _literal = _literal.asInstanceOf[js.Any], _naturalColumnToSql = _naturalColumnToSql.asInstanceOf[js.Any], _show = _show.asInstanceOf[js.Any], _tableName = _tableName.asInstanceOf[js.Any], _useDistinct = _useDistinct.asInstanceOf[js.Any], _validate = _validate.asInstanceOf[js.Any], _weight = _weight.asInstanceOf[js.Any], aggregate = aggregate.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], checkColumnCollection_ = checkColumnCollection_.asInstanceOf[js.Any], coalesceValue = coalesceValue.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], getDistinct = getDistinct.asInstanceOf[js.Any], isAggregate = isAggregate.asInstanceOf[js.Any], isLiteral = isLiteral.asInstanceOf[js.Any], isOperator = isOperator.asInstanceOf[js.Any], isSubQuery = isSubQuery.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], namePattern_ = namePattern_.asInstanceOf[js.Any], sanitizeName_ = sanitizeName_.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], toSql = js.Any.fromFunction1(toSql), useCoalesce = useCoalesce.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColumn]
    }
    
    extension [Self <: IColumn](x: Self) {
      
      inline def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setCheckColumnCollection_(value: Any): Self = StObject.set(x, "checkColumnCollection_", value.asInstanceOf[js.Any])
      
      inline def setCoalesceValue(value: String | Double): Self = StObject.set(x, "coalesceValue", value.asInstanceOf[js.Any])
      
      inline def setField(value: String | typings.nginstackIquery.iclauseselectMod.^): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setGetDistinct(value: Any): Self = StObject.set(x, "getDistinct", value.asInstanceOf[js.Any])
      
      inline def setIsAggregate(value: Boolean): Self = StObject.set(x, "isAggregate", value.asInstanceOf[js.Any])
      
      inline def setIsLiteral(value: Boolean): Self = StObject.set(x, "isLiteral", value.asInstanceOf[js.Any])
      
      inline def setIsOperator(value: Boolean): Self = StObject.set(x, "isOperator", value.asInstanceOf[js.Any])
      
      inline def setIsSubQuery(value: Boolean): Self = StObject.set(x, "isSubQuery", value.asInstanceOf[js.Any])
      
      inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setNamePattern_(value: Any): Self = StObject.set(x, "namePattern_", value.asInstanceOf[js.Any])
      
      inline def setSanitizeName_(value: Any): Self = StObject.set(x, "sanitizeName_", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setToSql(value: Boolean => String): Self = StObject.set(x, "toSql", js.Any.fromFunction1(value))
      
      inline def setUseCoalesce(value: Boolean): Self = StObject.set(x, "useCoalesce", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def set_aggregate(value: Any): Self = StObject.set(x, "_aggregate", value.asInstanceOf[js.Any])
      
      inline def set_alias(value: Any): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
      
      inline def set_arrayColumnToSql(value: Any): Self = StObject.set(x, "_arrayColumnToSql", value.asInstanceOf[js.Any])
      
      inline def set_cast(value: Any): Self = StObject.set(x, "_cast", value.asInstanceOf[js.Any])
      
      inline def set_castValue(value: Any): Self = StObject.set(x, "_castValue", value.asInstanceOf[js.Any])
      
      inline def set_field(value: Any): Self = StObject.set(x, "_field", value.asInstanceOf[js.Any])
      
      inline def set_getAggregate(value: Any): Self = StObject.set(x, "_getAggregate", value.asInstanceOf[js.Any])
      
      inline def set_literal(value: Any): Self = StObject.set(x, "_literal", value.asInstanceOf[js.Any])
      
      inline def set_naturalColumnToSql(value: Any): Self = StObject.set(x, "_naturalColumnToSql", value.asInstanceOf[js.Any])
      
      inline def set_show(value: Any): Self = StObject.set(x, "_show", value.asInstanceOf[js.Any])
      
      inline def set_tableName(value: Any): Self = StObject.set(x, "_tableName", value.asInstanceOf[js.Any])
      
      inline def set_useDistinct(value: Any): Self = StObject.set(x, "_useDistinct", value.asInstanceOf[js.Any])
      
      inline def set_validate(value: Any): Self = StObject.set(x, "_validate", value.asInstanceOf[js.Any])
      
      inline def set_weight(value: Any): Self = StObject.set(x, "_weight", value.asInstanceOf[js.Any])
    }
  }
}
