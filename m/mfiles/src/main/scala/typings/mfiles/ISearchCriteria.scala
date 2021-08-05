package typings.mfiles

import typings.mfiles.MFiles.MFFacetFilterStatusFlags
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFPredefinedSearchFilterType
import typings.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchCriteria extends StObject {
  
  var AdditionalConditions: ISearchConditionExs
  
  def Clone(): ISearchCriteria
  
  var ExpandUI: Boolean
  
  var FacetFilterAsJSON: String
  
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags
  
  var FirstCondition: ISearchConditionEx
  
  var FullTextSearchFlags: MFFullTextSearchFlags
  
  var FullTextSearchString: String
  
  def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions
  
  var ObjectTypeCondition: ISearchConditionEx
  
  var PredefinedSearchFilter: MFPredefinedSearchFilterType
  
  var PreviousBaseConditions: ISearchConditions
  
  var SearchFlags: MFSearchFlags
  
  var SearchRefinement: ISearchConditions
  
  var SearchWithinThisFolder: Boolean
  
  var SecondCondition: ISearchConditionEx
}
object ISearchCriteria {
  
  inline def apply(
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
  
  extension [Self <: ISearchCriteria](x: Self) {
    
    inline def setAdditionalConditions(value: ISearchConditionExs): Self = StObject.set(x, "AdditionalConditions", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ISearchCriteria): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setExpandUI(value: Boolean): Self = StObject.set(x, "ExpandUI", value.asInstanceOf[js.Any])
    
    inline def setFacetFilterAsJSON(value: String): Self = StObject.set(x, "FacetFilterAsJSON", value.asInstanceOf[js.Any])
    
    inline def setFacetFilterStatusFlags(value: MFFacetFilterStatusFlags): Self = StObject.set(x, "FacetFilterStatusFlags", value.asInstanceOf[js.Any])
    
    inline def setFirstCondition(value: ISearchConditionEx): Self = StObject.set(x, "FirstCondition", value.asInstanceOf[js.Any])
    
    inline def setFullTextSearchFlags(value: MFFullTextSearchFlags): Self = StObject.set(x, "FullTextSearchFlags", value.asInstanceOf[js.Any])
    
    inline def setFullTextSearchString(value: String): Self = StObject.set(x, "FullTextSearchString", value.asInstanceOf[js.Any])
    
    inline def setGetAsSearchConditions(value: (Boolean, Boolean, Boolean) => ISearchConditions): Self = StObject.set(x, "GetAsSearchConditions", js.Any.fromFunction3(value))
    
    inline def setObjectTypeCondition(value: ISearchConditionEx): Self = StObject.set(x, "ObjectTypeCondition", value.asInstanceOf[js.Any])
    
    inline def setPredefinedSearchFilter(value: MFPredefinedSearchFilterType): Self = StObject.set(x, "PredefinedSearchFilter", value.asInstanceOf[js.Any])
    
    inline def setPreviousBaseConditions(value: ISearchConditions): Self = StObject.set(x, "PreviousBaseConditions", value.asInstanceOf[js.Any])
    
    inline def setSearchFlags(value: MFSearchFlags): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
    
    inline def setSearchRefinement(value: ISearchConditions): Self = StObject.set(x, "SearchRefinement", value.asInstanceOf[js.Any])
    
    inline def setSearchWithinThisFolder(value: Boolean): Self = StObject.set(x, "SearchWithinThisFolder", value.asInstanceOf[js.Any])
    
    inline def setSecondCondition(value: ISearchConditionEx): Self = StObject.set(x, "SecondCondition", value.asInstanceOf[js.Any])
  }
}
