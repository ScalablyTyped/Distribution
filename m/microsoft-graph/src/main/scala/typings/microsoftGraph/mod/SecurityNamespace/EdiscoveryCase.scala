package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryCase
  extends StObject
     with Case {
  
  // The user who closed the case.
  var closedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  /**
    * The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var closedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Returns a list of case ediscoveryCustodian objects for this case.
  var custodians: js.UndefOr[NullableOption[js.Array[EdiscoveryCustodian]]] = js.undefined
  
  // The external case number for customer reference.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
  var noncustodialDataSources: js.UndefOr[NullableOption[js.Array[EdiscoveryNoncustodialDataSource]]] = js.undefined
  
  // Returns a list of case caseOperation objects for this case.
  var operations: js.UndefOr[NullableOption[js.Array[CaseOperation]]] = js.undefined
  
  // Returns a list of eDiscoveryReviewSet objects in the case.
  var reviewSets: js.UndefOr[NullableOption[js.Array[EdiscoveryReviewSet]]] = js.undefined
  
  // Returns a list of eDiscoverySearch objects associated with this case.
  var searches: js.UndefOr[NullableOption[js.Array[EdiscoverySearch]]] = js.undefined
  
  // Returns a list of eDIscoverySettings objects in the case.
  var settings: js.UndefOr[NullableOption[EdiscoveryCaseSettings]] = js.undefined
  
  // Returns a list of ediscoveryReviewTag objects associated to this case.
  var tags: js.UndefOr[NullableOption[js.Array[EdiscoveryReviewTag]]] = js.undefined
}
object EdiscoveryCase {
  
  inline def apply(): EdiscoveryCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdiscoveryCase] (val x: Self) extends AnyVal {
    
    inline def setClosedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "closedBy", value.asInstanceOf[js.Any])
    
    inline def setClosedByNull: Self = StObject.set(x, "closedBy", null)
    
    inline def setClosedByUndefined: Self = StObject.set(x, "closedBy", js.undefined)
    
    inline def setClosedDateTime(value: NullableOption[String]): Self = StObject.set(x, "closedDateTime", value.asInstanceOf[js.Any])
    
    inline def setClosedDateTimeNull: Self = StObject.set(x, "closedDateTime", null)
    
    inline def setClosedDateTimeUndefined: Self = StObject.set(x, "closedDateTime", js.undefined)
    
    inline def setCustodians(value: NullableOption[js.Array[EdiscoveryCustodian]]): Self = StObject.set(x, "custodians", value.asInstanceOf[js.Any])
    
    inline def setCustodiansNull: Self = StObject.set(x, "custodians", null)
    
    inline def setCustodiansUndefined: Self = StObject.set(x, "custodians", js.undefined)
    
    inline def setCustodiansVarargs(value: EdiscoveryCustodian*): Self = StObject.set(x, "custodians", js.Array(value*))
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setNoncustodialDataSources(value: NullableOption[js.Array[EdiscoveryNoncustodialDataSource]]): Self = StObject.set(x, "noncustodialDataSources", value.asInstanceOf[js.Any])
    
    inline def setNoncustodialDataSourcesNull: Self = StObject.set(x, "noncustodialDataSources", null)
    
    inline def setNoncustodialDataSourcesUndefined: Self = StObject.set(x, "noncustodialDataSources", js.undefined)
    
    inline def setNoncustodialDataSourcesVarargs(value: EdiscoveryNoncustodialDataSource*): Self = StObject.set(x, "noncustodialDataSources", js.Array(value*))
    
    inline def setOperations(value: NullableOption[js.Array[CaseOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: CaseOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setReviewSets(value: NullableOption[js.Array[EdiscoveryReviewSet]]): Self = StObject.set(x, "reviewSets", value.asInstanceOf[js.Any])
    
    inline def setReviewSetsNull: Self = StObject.set(x, "reviewSets", null)
    
    inline def setReviewSetsUndefined: Self = StObject.set(x, "reviewSets", js.undefined)
    
    inline def setReviewSetsVarargs(value: EdiscoveryReviewSet*): Self = StObject.set(x, "reviewSets", js.Array(value*))
    
    inline def setSearches(value: NullableOption[js.Array[EdiscoverySearch]]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    inline def setSearchesNull: Self = StObject.set(x, "searches", null)
    
    inline def setSearchesUndefined: Self = StObject.set(x, "searches", js.undefined)
    
    inline def setSearchesVarargs(value: EdiscoverySearch*): Self = StObject.set(x, "searches", js.Array(value*))
    
    inline def setSettings(value: NullableOption[EdiscoveryCaseSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setTags(value: NullableOption[js.Array[EdiscoveryReviewTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: EdiscoveryReviewTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
