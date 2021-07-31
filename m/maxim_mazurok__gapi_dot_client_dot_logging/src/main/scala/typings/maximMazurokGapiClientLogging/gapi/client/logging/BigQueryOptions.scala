package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryOptions extends StObject {
  
  /**
    * Optional. Whether to use BigQuery's partition tables (https://cloud.google.com/bigquery/docs/partitioned-tables). By default, Logging creates dated tables based on the log entries'
    * timestamps, e.g. syslog_20170523. With partitioned tables the date suffix is no longer present and special query syntax
    * (https://cloud.google.com/bigquery/docs/querying-partitioned-tables) has to be used instead. In both cases, tables are sharded based on UTC timezone.
    */
  var usePartitionedTables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. True if new timestamp column based partitioning is in use, false if legacy ingestion-time partitioning is in use. All new sinks will have this field set true and will
    * use timestamp column based partitioning. If use_partitioned_tables is false, this value has no meaning and will be false. Legacy sinks using partitioned tables will have this field
    * set to false.
    */
  var usesTimestampColumnPartitioning: js.UndefOr[Boolean] = js.undefined
}
object BigQueryOptions {
  
  @scala.inline
  def apply(): BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryOptions]
  }
  
  @scala.inline
  implicit class BigQueryOptionsMutableBuilder[Self <: BigQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsePartitionedTables(value: Boolean): Self = StObject.set(x, "usePartitionedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePartitionedTablesUndefined: Self = StObject.set(x, "usePartitionedTables", js.undefined)
    
    @scala.inline
    def setUsesTimestampColumnPartitioning(value: Boolean): Self = StObject.set(x, "usesTimestampColumnPartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesTimestampColumnPartitioningUndefined: Self = StObject.set(x, "usesTimestampColumnPartitioning", js.undefined)
  }
}
