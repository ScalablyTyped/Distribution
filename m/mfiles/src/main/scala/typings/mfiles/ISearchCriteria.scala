package typings.mfiles

import typings.mfiles.MFiles.MFFacetFilterStatusFlags
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFPredefinedSearchFilterType
import typings.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchCriteria extends StObject {
  
  var AdditionalConditions: ISearchConditionExs = js.native
  
  def Clone(): ISearchCriteria = js.native
  
  var ExpandUI: Boolean = js.native
  
  var FacetFilterAsJSON: String = js.native
  
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags = js.native
  
  var FirstCondition: ISearchConditionEx = js.native
  
  var FullTextSearchFlags: MFFullTextSearchFlags = js.native
  
  var FullTextSearchString: String = js.native
  
  def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions = js.native
  
  var ObjectTypeCondition: ISearchConditionEx = js.native
  
  var PredefinedSearchFilter: MFPredefinedSearchFilterType = js.native
  
  var PreviousBaseConditions: ISearchConditions = js.native
  
  var SearchFlags: MFSearchFlags = js.native
  
  var SearchRefinement: ISearchConditions = js.native
  
  var SearchWithinThisFolder: Boolean = js.native
  
  var SecondCondition: ISearchConditionEx = js.native
}
object ISearchCriteria {
  
  @scala.inline
  def apply(
    AdditionalConditions: ISearchConditionExs,
    Clone: () => ISearchCriteria,
    ExpandUI: Boolean,
    FacetFilterAsJSON: String,
    FacetFilterStatusFlags: MFFacetFilterStatusFlags,
    FirstCondition: ISearchConditionEx,
    FullTextSearchFlags: MFFullTextSearchFlags,
    FullTextSearchString: String,
    GetAsSearchConditions: (Boolean, Boolean, Boolean) => ISearchConditions,
    ObjectTypeCondition: ISearchConditionEx,
    PredefinedSearchFilter: MFPredefinedSearchFilterType,
    PreviousBaseConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SearchRefinement: ISearchConditions,
    SearchWithinThisFolder: Boolean,
    SecondCondition: ISearchConditionEx
  ): ISearchCriteria = {
    val __obj = js.Dynamic.literal(AdditionalConditions = AdditionalConditions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ExpandUI = ExpandUI.asInstanceOf[js.Any], FacetFilterAsJSON = FacetFilterAsJSON.asInstanceOf[js.Any], FacetFilterStatusFlags = FacetFilterStatusFlags.asInstanceOf[js.Any], FirstCondition = FirstCondition.asInstanceOf[js.Any], FullTextSearchFlags = FullTextSearchFlags.asInstanceOf[js.Any], FullTextSearchString = FullTextSearchString.asInstanceOf[js.Any], GetAsSearchConditions = js.Any.fromFunction3(GetAsSearchConditions), ObjectTypeCondition = ObjectTypeCondition.asInstanceOf[js.Any], PredefinedSearchFilter = PredefinedSearchFilter.asInstanceOf[js.Any], PreviousBaseConditions = PreviousBaseConditions.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], SearchRefinement = SearchRefinement.asInstanceOf[js.Any], SearchWithinThisFolder = SearchWithinThisFolder.asInstanceOf[js.Any], SecondCondition = SecondCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCriteria]
  }
  
  @scala.inline
  implicit class ISearchCriteriaMutableBuilder[Self <: ISearchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalConditions(value: ISearchConditionExs): Self = StObject.set(x, "AdditionalConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ISearchCriteria): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandUI(value: Boolean): Self = StObject.set(x, "ExpandUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetFilterAsJSON(value: String): Self = StObject.set(x, "FacetFilterAsJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetFilterStatusFlags(value: MFFacetFilterStatusFlags): Self = StObject.set(x, "FacetFilterStatusFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCondition(value: ISearchConditionEx): Self = StObject.set(x, "FirstCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextSearchFlags(value: MFFullTextSearchFlags): Self = StObject.set(x, "FullTextSearchFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextSearchString(value: String): Self = StObject.set(x, "FullTextSearchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAsSearchConditions(value: (Boolean, Boolean, Boolean) => ISearchConditions): Self = StObject.set(x, "GetAsSearchConditions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setObjectTypeCondition(value: ISearchConditionEx): Self = StObject.set(x, "ObjectTypeCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedSearchFilter(value: MFPredefinedSearchFilterType): Self = StObject.set(x, "PredefinedSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousBaseConditions(value: ISearchConditions): Self = StObject.set(x, "PreviousBaseConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFlags(value: MFSearchFlags): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchRefinement(value: ISearchConditions): Self = StObject.set(x, "SearchRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchWithinThisFolder(value: Boolean): Self = StObject.set(x, "SearchWithinThisFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondCondition(value: ISearchConditionEx): Self = StObject.set(x, "SecondCondition", value.asInstanceOf[js.Any])
  }
}
