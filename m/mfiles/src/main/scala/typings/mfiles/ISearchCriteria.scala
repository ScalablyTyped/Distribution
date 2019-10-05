package typings.mfiles

import typings.mfiles.MFiles.MFFacetFilterStatusFlags
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFPredefinedSearchFilterType
import typings.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchCriteria extends js.Object {
  var AdditionalConditions: ISearchConditionExs
  var ExpandUI: Boolean
  var FacetFilterAsJSON: String
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags
  var FirstCondition: ISearchConditionEx
  var FullTextSearchFlags: MFFullTextSearchFlags
  var FullTextSearchString: String
  var ObjectTypeCondition: ISearchConditionEx
  var PredefinedSearchFilter: MFPredefinedSearchFilterType
  var PreviousBaseConditions: ISearchConditions
  var SearchFlags: MFSearchFlags
  var SearchRefinement: ISearchConditions
  var SearchWithinThisFolder: Boolean
  var SecondCondition: ISearchConditionEx
  def Clone(): ISearchCriteria
  def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions
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
    val __obj = js.Dynamic.literal(AdditionalConditions = AdditionalConditions, Clone = js.Any.fromFunction0(Clone), ExpandUI = ExpandUI, FacetFilterAsJSON = FacetFilterAsJSON, FacetFilterStatusFlags = FacetFilterStatusFlags, FirstCondition = FirstCondition, FullTextSearchFlags = FullTextSearchFlags, FullTextSearchString = FullTextSearchString, GetAsSearchConditions = js.Any.fromFunction3(GetAsSearchConditions), ObjectTypeCondition = ObjectTypeCondition, PredefinedSearchFilter = PredefinedSearchFilter, PreviousBaseConditions = PreviousBaseConditions, SearchFlags = SearchFlags, SearchRefinement = SearchRefinement, SearchWithinThisFolder = SearchWithinThisFolder, SecondCondition = SecondCondition)
  
    __obj.asInstanceOf[ISearchCriteria]
  }
}

