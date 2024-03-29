package typings.oracledb.mod

import typings.oracledb.anon.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to control statement execution.
  */
trait ExecuteOptions extends StObject {
  
  /**
    * If true, the transaction in the current connection is automatically committed at the end of statement execution.
    *
    * @default false
    */
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overrides oracledb.dbObjectAsPojo.
    *
    * Specify whether Oracle Database named objects or collections that are queried should be returned to the application
    * as “plain old JavaScript objects” or kept as database-backed objects. This option also applies to output BIND_OUT bind variables.
    *
    * Note that LOBs in objects will be represented as Lob instances and will not be String or Buffer, regardless of any fetchAsString,
    * fetchAsBuffer, or fetchInfo setting.
    *
    * Setting dbObjectAsPojo to true can avoid overhead if object attributes are repeatedly accessed. It also allows applications to
    * close connections before any attributes are accessed unless LOBs are involved. Regardless of the value, the interface to access objects is the same.
    *
    * @default false
    * @since 5.1
    */
  var dbObjectAsPojo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
    *
    * With this value, the result.metaData result.resultSet.metaData objects only include column names.
    *
    * If extendedMetaData is true then metaData will contain additional attributes.
    *
    * @default false
    */
  var extendedMetaData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property sets the size of an internal buffer used for fetching query rows from Oracle Database.
    * Changing it may affect query performance but does not affect how many rows are returned to the application.
    *
    * The property is used during the default direct fetches, during ResultSet getRow() calls, and for queryStream(). It is not used for getRows().
    *
    * Increasing this value reduces the number of round-trips to the database but increases memory usage for each data fetch.
    * For queries that return a large number of rows, higher values of fetchArraySize may give better performance.
    * For queries that only return a few rows, reduce the value of fetchArraySize to minimize the amount of memory management during data fetches.
    * JavaScript memory fragmentation may occur in some cases.
    *
    * For direct fetches (those using execute() option resultSet: false), the internal buffer size will be based on the lesser of maxRows and fetchArraySize.
    *
    * @default 100
    */
  var fetchArraySize: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines how query column data should be represented in JavaScript. It can be used in conjunction with,
    * or instead of, the global settings fetchAsString and fetchAsBuffer.
    *
    * Example:
    *
    *      fetchInfo: {
    *          "HIRE_DATE":    { type: oracledb.STRING },  // return the date as a string
    *          "HIRE_DETAILS": { type: oracledb.DEFAULT }  // override fetchAsString or fetchAsBuffer
    *      }
    */
  var fetchInfo: js.UndefOr[Record[String, Type]] = js.undefined
  
  /**
    * The maximum number of rows that are fetched by a query with connection.execute() when not using a ResultSet.
    * Rows beyond this limit are not fetched from the database. A value of 0 means there is no limit.
    *
    * To improve database efficiency, SQL queries should use a row limiting clause like OFFSET / FETCH or equivalent.
    * The maxRows property can be used to stop badly coded queries from returning unexpectedly large numbers of rows.
    *
    * When the number of query rows is relatively big, or can not be predicted, it is recommended to use
    * a ResultSet or queryStream(). This allows applications to process rows in smaller chunks or individually,
    * preventing the Node.js memory limit being exceeded or query results being unexpectedly truncated by a
    * maxRows limit.
    *
    * @default 0 (unlimited)
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  
  /**
    * The format of query rows fetched when using connection.execute() or connection.queryStream().
    * It affects both ResultSet and non-ResultSet queries. It can be used for top level queries and REF CURSOR output.
    *
    * This can be either of the Oracledb constants oracledb.ARRAY or oracledb.OBJECT.
    *
    * If specified as oracledb.ARRAY, each row is fetched as an array of column values.
    *
    * If specified as oracledb.OBJECT, each row is fetched as a JavaScript object.
    * The object has a property for each column name, with the property value set to the respective column value.
    * The property name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    *
    * @default ARRAY
    */
  var outFormat: js.UndefOr[Double] = js.undefined
  
  /**
    * This is a query tuning option to set the number of additional rows the underlying Oracle Client library fetches during
    * the internal initial statement execution phase of a query. The prefetch size does not affect when, or how many,
    * rows are returned by node-oracledb to the application.
    *
    * The prefetchRows attribute can be used in conjunction with oracledb.fetchArraySize to tune query performance, memory use,
    * and to reduce the number of round-trip calls needed to return query results.
    *
    * The prefetchRows value is ignored in some cases, such as when the query involves a LOB.
    *
    * This attribute is not used in node-oracledb version 2, 3 or 4. In those versions use only oracledb.fetchArraySize instead.
    *
    * @default 2
    * @see https://oracle.github.io/node-oracledb/doc/api.html#rowfetching
    * @since 5.0
    */
  var prefetchRows: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines whether query results should be returned as a ResultSet object or directly.
    *
    * @default false
    */
  var resultSet: js.UndefOr[Boolean] = js.undefined
}
object ExecuteOptions {
  
  inline def apply(): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    inline def setDbObjectAsPojo(value: Boolean): Self = StObject.set(x, "dbObjectAsPojo", value.asInstanceOf[js.Any])
    
    inline def setDbObjectAsPojoUndefined: Self = StObject.set(x, "dbObjectAsPojo", js.undefined)
    
    inline def setExtendedMetaData(value: Boolean): Self = StObject.set(x, "extendedMetaData", value.asInstanceOf[js.Any])
    
    inline def setExtendedMetaDataUndefined: Self = StObject.set(x, "extendedMetaData", js.undefined)
    
    inline def setFetchArraySize(value: Double): Self = StObject.set(x, "fetchArraySize", value.asInstanceOf[js.Any])
    
    inline def setFetchArraySizeUndefined: Self = StObject.set(x, "fetchArraySize", js.undefined)
    
    inline def setFetchInfo(value: Record[String, Type]): Self = StObject.set(x, "fetchInfo", value.asInstanceOf[js.Any])
    
    inline def setFetchInfoUndefined: Self = StObject.set(x, "fetchInfo", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setOutFormat(value: Double): Self = StObject.set(x, "outFormat", value.asInstanceOf[js.Any])
    
    inline def setOutFormatUndefined: Self = StObject.set(x, "outFormat", js.undefined)
    
    inline def setPrefetchRows(value: Double): Self = StObject.set(x, "prefetchRows", value.asInstanceOf[js.Any])
    
    inline def setPrefetchRowsUndefined: Self = StObject.set(x, "prefetchRows", js.undefined)
    
    inline def setResultSet(value: Boolean): Self = StObject.set(x, "resultSet", value.asInstanceOf[js.Any])
    
    inline def setResultSetUndefined: Self = StObject.set(x, "resultSet", js.undefined)
  }
}
