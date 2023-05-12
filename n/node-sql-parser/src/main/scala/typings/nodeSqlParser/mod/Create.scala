package typings.nodeSqlParser.mod

import typings.nodeSqlParser.anon.Algorithm
import typings.nodeSqlParser.anon.Db
import typings.nodeSqlParser.anon.Keyword
import typings.nodeSqlParser.anon.Lock
import typings.nodeSqlParser.anon.Parentheses
import typings.nodeSqlParser.nodeSqlParserStrings.`if not exists`
import typings.nodeSqlParser.nodeSqlParserStrings.create
import typings.nodeSqlParser.nodeSqlParserStrings.database
import typings.nodeSqlParser.nodeSqlParserStrings.fulltext
import typings.nodeSqlParser.nodeSqlParserStrings.ignore
import typings.nodeSqlParser.nodeSqlParserStrings.index
import typings.nodeSqlParser.nodeSqlParserStrings.on
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import typings.nodeSqlParser.nodeSqlParserStrings.spatial
import typings.nodeSqlParser.nodeSqlParserStrings.table
import typings.nodeSqlParser.nodeSqlParserStrings.temporary
import typings.nodeSqlParser.nodeSqlParserStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create
  extends StObject
     with AST {
  
  var algorithm_option: js.UndefOr[Algorithm | Null] = js.undefined
  
  var as: js.UndefOr[String | Null] = js.undefined
  
  var create_definitions: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var database: js.UndefOr[String] = js.undefined
  
  var if_not_exists: js.UndefOr[(`if not exists`) | Null] = js.undefined
  
  var ignore_replace: js.UndefOr[ignore | replace | Null] = js.undefined
  
  var index: js.UndefOr[String | Null] = js.undefined
  
  var index_columns: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var index_options: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var index_type: js.UndefOr[unique | fulltext | spatial | Null] = js.undefined
  
  var index_using: js.UndefOr[Keyword | Null] = js.undefined
  
  var keyword: table | index | database
  
  var like: js.UndefOr[Parentheses | Null] = js.undefined
  
  var lock_option: js.UndefOr[Lock | Null] = js.undefined
  
  var on_kw: js.UndefOr[on | Null] = js.undefined
  
  var query_expr: js.UndefOr[Any | Null] = js.undefined
  
  var table: js.UndefOr[js.Array[Db]] = js.undefined
  
  var table_options: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var temporary: js.UndefOr[typings.nodeSqlParser.nodeSqlParserStrings.temporary | Null] = js.undefined
  
  var `type`: create
}
object Create {
  
  inline def apply(keyword: table | index | database): Create = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm_option(value: Algorithm): Self = StObject.set(x, "algorithm_option", value.asInstanceOf[js.Any])
    
    inline def setAlgorithm_optionNull: Self = StObject.set(x, "algorithm_option", null)
    
    inline def setAlgorithm_optionUndefined: Self = StObject.set(x, "algorithm_option", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsNull: Self = StObject.set(x, "as", null)
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setCreate_definitions(value: js.Array[Any]): Self = StObject.set(x, "create_definitions", value.asInstanceOf[js.Any])
    
    inline def setCreate_definitionsNull: Self = StObject.set(x, "create_definitions", null)
    
    inline def setCreate_definitionsUndefined: Self = StObject.set(x, "create_definitions", js.undefined)
    
    inline def setCreate_definitionsVarargs(value: Any*): Self = StObject.set(x, "create_definitions", js.Array(value*))
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setIf_not_exists(value: `if not exists`): Self = StObject.set(x, "if_not_exists", value.asInstanceOf[js.Any])
    
    inline def setIf_not_existsNull: Self = StObject.set(x, "if_not_exists", null)
    
    inline def setIf_not_existsUndefined: Self = StObject.set(x, "if_not_exists", js.undefined)
    
    inline def setIgnore_replace(value: ignore | replace): Self = StObject.set(x, "ignore_replace", value.asInstanceOf[js.Any])
    
    inline def setIgnore_replaceNull: Self = StObject.set(x, "ignore_replace", null)
    
    inline def setIgnore_replaceUndefined: Self = StObject.set(x, "ignore_replace", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_columns(value: js.Array[Any]): Self = StObject.set(x, "index_columns", value.asInstanceOf[js.Any])
    
    inline def setIndex_columnsNull: Self = StObject.set(x, "index_columns", null)
    
    inline def setIndex_columnsUndefined: Self = StObject.set(x, "index_columns", js.undefined)
    
    inline def setIndex_columnsVarargs(value: Any*): Self = StObject.set(x, "index_columns", js.Array(value*))
    
    inline def setIndex_options(value: js.Array[Any]): Self = StObject.set(x, "index_options", value.asInstanceOf[js.Any])
    
    inline def setIndex_optionsNull: Self = StObject.set(x, "index_options", null)
    
    inline def setIndex_optionsUndefined: Self = StObject.set(x, "index_options", js.undefined)
    
    inline def setIndex_optionsVarargs(value: Any*): Self = StObject.set(x, "index_options", js.Array(value*))
    
    inline def setIndex_type(value: unique | fulltext | spatial): Self = StObject.set(x, "index_type", value.asInstanceOf[js.Any])
    
    inline def setIndex_typeNull: Self = StObject.set(x, "index_type", null)
    
    inline def setIndex_typeUndefined: Self = StObject.set(x, "index_type", js.undefined)
    
    inline def setIndex_using(value: Keyword): Self = StObject.set(x, "index_using", value.asInstanceOf[js.Any])
    
    inline def setIndex_usingNull: Self = StObject.set(x, "index_using", null)
    
    inline def setIndex_usingUndefined: Self = StObject.set(x, "index_using", js.undefined)
    
    inline def setKeyword(value: table | index | database): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setLike(value: Parentheses): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    inline def setLikeNull: Self = StObject.set(x, "like", null)
    
    inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
    
    inline def setLock_option(value: Lock): Self = StObject.set(x, "lock_option", value.asInstanceOf[js.Any])
    
    inline def setLock_optionNull: Self = StObject.set(x, "lock_option", null)
    
    inline def setLock_optionUndefined: Self = StObject.set(x, "lock_option", js.undefined)
    
    inline def setOn_kw(value: on): Self = StObject.set(x, "on_kw", value.asInstanceOf[js.Any])
    
    inline def setOn_kwNull: Self = StObject.set(x, "on_kw", null)
    
    inline def setOn_kwUndefined: Self = StObject.set(x, "on_kw", js.undefined)
    
    inline def setQuery_expr(value: Any): Self = StObject.set(x, "query_expr", value.asInstanceOf[js.Any])
    
    inline def setQuery_exprNull: Self = StObject.set(x, "query_expr", null)
    
    inline def setQuery_exprUndefined: Self = StObject.set(x, "query_expr", js.undefined)
    
    inline def setTable(value: js.Array[Db]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTableVarargs(value: Db*): Self = StObject.set(x, "table", js.Array(value*))
    
    inline def setTable_options(value: js.Array[Any]): Self = StObject.set(x, "table_options", value.asInstanceOf[js.Any])
    
    inline def setTable_optionsNull: Self = StObject.set(x, "table_options", null)
    
    inline def setTable_optionsUndefined: Self = StObject.set(x, "table_options", js.undefined)
    
    inline def setTable_optionsVarargs(value: Any*): Self = StObject.set(x, "table_options", js.Array(value*))
    
    inline def setTemporary(value: temporary): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
    
    inline def setTemporaryNull: Self = StObject.set(x, "temporary", null)
    
    inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    
    inline def setType(value: create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
