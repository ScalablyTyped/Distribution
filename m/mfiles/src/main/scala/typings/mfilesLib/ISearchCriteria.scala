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

