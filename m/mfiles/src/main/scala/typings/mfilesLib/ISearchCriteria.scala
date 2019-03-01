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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdditionalConditions")(AdditionalConditions)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ExpandUI")(ExpandUI)
    __obj.updateDynamic("FacetFilterAsJSON")(FacetFilterAsJSON)
    __obj.updateDynamic("FacetFilterStatusFlags")(FacetFilterStatusFlags)
    __obj.updateDynamic("FirstCondition")(FirstCondition)
    __obj.updateDynamic("FullTextSearchFlags")(FullTextSearchFlags)
    __obj.updateDynamic("FullTextSearchString")(FullTextSearchString)
    __obj.updateDynamic("GetAsSearchConditions")(GetAsSearchConditions)
    __obj.updateDynamic("ObjectTypeCondition")(ObjectTypeCondition)
    __obj.updateDynamic("PredefinedSearchFilter")(PredefinedSearchFilter)
    __obj.updateDynamic("PreviousBaseConditions")(PreviousBaseConditions)
    __obj.updateDynamic("SearchFlags")(SearchFlags)
    __obj.updateDynamic("SearchRefinement")(SearchRefinement)
    __obj.updateDynamic("SearchWithinThisFolder")(SearchWithinThisFolder)
    __obj.updateDynamic("SecondCondition")(SecondCondition)
    __obj.asInstanceOf[ISearchCriteria]
  }
}

