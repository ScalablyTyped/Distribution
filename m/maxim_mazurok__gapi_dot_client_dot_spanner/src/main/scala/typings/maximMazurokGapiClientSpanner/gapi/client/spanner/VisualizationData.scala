package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualizationData extends StObject {
  
  /** The token signifying the end of a data_source. */
  var dataSourceEndToken: js.UndefOr[String] = js.undefined
  
  /** The token delimiting a datasource name from the rest of a key in a data_source. */
  var dataSourceSeparatorToken: js.UndefOr[String] = js.undefined
  
  /** The list of messages (info, alerts, ...) */
  var diagnosticMessages: js.UndefOr[js.Array[DiagnosticMessage]] = js.undefined
  
  /**
    * We discretize the entire keyspace into buckets. Assuming each bucket has an inclusive keyrange and covers keys from k(i) ... k(n). In this case k(n) would be an end key for a given
    * range. end_key_string is the collection of all such end keys
    */
  var endKeyStrings: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether this scan contains PII. */
  var hasPii: js.UndefOr[Boolean] = js.undefined
  
  /** Keys of key ranges that contribute significantly to a given metric Can be thought of as heavy hitters. */
  var indexedKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The token delimiting the key prefixes. */
  var keySeparator: js.UndefOr[String] = js.undefined
  
  /** The unit for the key: e.g. 'key' or 'chunk'. */
  var keyUnit: js.UndefOr[String] = js.undefined
  
  /** The list of data objects for each metric. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /** The list of extracted key prefix nodes used in the key prefix hierarchy. */
  var prefixNodes: js.UndefOr[js.Array[PrefixNode]] = js.undefined
}
object VisualizationData {
  
  inline def apply(): VisualizationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualizationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualizationData] (val x: Self) extends AnyVal {
    
    inline def setDataSourceEndToken(value: String): Self = StObject.set(x, "dataSourceEndToken", value.asInstanceOf[js.Any])
    
    inline def setDataSourceEndTokenUndefined: Self = StObject.set(x, "dataSourceEndToken", js.undefined)
    
    inline def setDataSourceSeparatorToken(value: String): Self = StObject.set(x, "dataSourceSeparatorToken", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSeparatorTokenUndefined: Self = StObject.set(x, "dataSourceSeparatorToken", js.undefined)
    
    inline def setDiagnosticMessages(value: js.Array[DiagnosticMessage]): Self = StObject.set(x, "diagnosticMessages", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticMessagesUndefined: Self = StObject.set(x, "diagnosticMessages", js.undefined)
    
    inline def setDiagnosticMessagesVarargs(value: DiagnosticMessage*): Self = StObject.set(x, "diagnosticMessages", js.Array(value*))
    
    inline def setEndKeyStrings(value: js.Array[String]): Self = StObject.set(x, "endKeyStrings", value.asInstanceOf[js.Any])
    
    inline def setEndKeyStringsUndefined: Self = StObject.set(x, "endKeyStrings", js.undefined)
    
    inline def setEndKeyStringsVarargs(value: String*): Self = StObject.set(x, "endKeyStrings", js.Array(value*))
    
    inline def setHasPii(value: Boolean): Self = StObject.set(x, "hasPii", value.asInstanceOf[js.Any])
    
    inline def setHasPiiUndefined: Self = StObject.set(x, "hasPii", js.undefined)
    
    inline def setIndexedKeys(value: js.Array[String]): Self = StObject.set(x, "indexedKeys", value.asInstanceOf[js.Any])
    
    inline def setIndexedKeysUndefined: Self = StObject.set(x, "indexedKeys", js.undefined)
    
    inline def setIndexedKeysVarargs(value: String*): Self = StObject.set(x, "indexedKeys", js.Array(value*))
    
    inline def setKeySeparator(value: String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
    
    inline def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    
    inline def setKeyUnit(value: String): Self = StObject.set(x, "keyUnit", value.asInstanceOf[js.Any])
    
    inline def setKeyUnitUndefined: Self = StObject.set(x, "keyUnit", js.undefined)
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPrefixNodes(value: js.Array[PrefixNode]): Self = StObject.set(x, "prefixNodes", value.asInstanceOf[js.Any])
    
    inline def setPrefixNodesUndefined: Self = StObject.set(x, "prefixNodes", js.undefined)
    
    inline def setPrefixNodesVarargs(value: PrefixNode*): Self = StObject.set(x, "prefixNodes", js.Array(value*))
  }
}
