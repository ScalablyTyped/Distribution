package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KAnonymityConfig extends StObject {
  
  /**
    * Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we
    * consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored,
    * but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some
    * might be ignored.
    */
  var entityId: js.UndefOr[GooglePrivacyDlpV2EntityId] = js.undefined
  
  /**
    * Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported;
    * however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
}
object GooglePrivacyDlpV2KAnonymityConfig {
  
  inline def apply(): GooglePrivacyDlpV2KAnonymityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KAnonymityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2KAnonymityConfig] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: GooglePrivacyDlpV2EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setQuasiIds(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "quasiIds", js.Array(value*))
  }
}
