package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchCriteria extends js.Object {
  var AdditionalConditions: ISearchConditionExs
  var ExpandUI: scala.Boolean
  var FacetFilterAsJSON: java.lang.String
  var FacetFilterStatusFlags: mfilesLib.MFilesNs.MFFacetFilterStatusFlags
  var FirstCondition: ISearchConditionEx
  var FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags
  var FullTextSearchString: java.lang.String
  var ObjectTypeCondition: ISearchConditionEx
  var PredefinedSearchFilter: mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  var PreviousBaseConditions: ISearchConditions
  var SearchFlags: mfilesLib.MFilesNs.MFSearchFlags
  var SearchRefinement: ISearchConditions
  var SearchWithinThisFolder: scala.Boolean
  var SecondCondition: ISearchConditionEx
  def Clone(): ISearchCriteria
  def GetAsSearchConditions(
    ForceGettingExpandedConds: scala.Boolean,
    IncludeSearchRefinementConditions: scala.Boolean,
    IncludePreviousBaseConditions: scala.Boolean
  ): ISearchConditions
}

object ISearchCriteria {
  @scala.inline
  def apply(
    AdditionalConditions: ISearchConditionExs,
    Clone: js.Function0[ISearchCriteria],
    ExpandUI: scala.Boolean,
    FacetFilterAsJSON: java.lang.String,
    FacetFilterStatusFlags: mfilesLib.MFilesNs.MFFacetFilterStatusFlags,
    FirstCondition: ISearchConditionEx,
    FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags,
    FullTextSearchString: java.lang.String,
    GetAsSearchConditions: js.Function3[scala.Boolean, scala.Boolean, scala.Boolean, ISearchConditions],
    ObjectTypeCondition: ISearchConditionEx,
    PredefinedSearchFilter: mfilesLib.MFilesNs.MFPredefinedSearchFilterType,
    PreviousBaseConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SearchRefinement: ISearchConditions,
    SearchWithinThisFolder: scala.Boolean,
    SecondCondition: ISearchConditionEx
  ): ISearchCriteria = {
    val __obj = js.Dynamic.literal(AdditionalConditions = AdditionalConditions, Clone = Clone, ExpandUI = ExpandUI, FacetFilterAsJSON = FacetFilterAsJSON, FacetFilterStatusFlags = FacetFilterStatusFlags, FirstCondition = FirstCondition, FullTextSearchFlags = FullTextSearchFlags, FullTextSearchString = FullTextSearchString, GetAsSearchConditions = GetAsSearchConditions, ObjectTypeCondition = ObjectTypeCondition, PredefinedSearchFilter = PredefinedSearchFilter, PreviousBaseConditions = PreviousBaseConditions, SearchFlags = SearchFlags, SearchRefinement = SearchRefinement, SearchWithinThisFolder = SearchWithinThisFolder, SecondCondition = SecondCondition)
  
    __obj.asInstanceOf[ISearchCriteria]
  }
}

