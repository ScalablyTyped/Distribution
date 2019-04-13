package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchCriteria")
@js.native
class SearchCriteria ()
  extends mfilesLib.ISearchCriteria {
  /* CompleteClass */
  override var AdditionalConditions: mfilesLib.ISearchConditionExs = js.native
  /* CompleteClass */
  override var ExpandUI: scala.Boolean = js.native
  /* CompleteClass */
  override var FacetFilterAsJSON: java.lang.String = js.native
  /* CompleteClass */
  override var FacetFilterStatusFlags: MFFacetFilterStatusFlags = js.native
  /* CompleteClass */
  override var FirstCondition: mfilesLib.ISearchConditionEx = js.native
  /* CompleteClass */
  override var FullTextSearchFlags: MFFullTextSearchFlags = js.native
  /* CompleteClass */
  override var FullTextSearchString: java.lang.String = js.native
  /* CompleteClass */
  override var ObjectTypeCondition: mfilesLib.ISearchConditionEx = js.native
  /* CompleteClass */
  override var PredefinedSearchFilter: MFPredefinedSearchFilterType = js.native
  /* CompleteClass */
  override var PreviousBaseConditions: mfilesLib.ISearchConditions = js.native
  /* CompleteClass */
  override var SearchFlags: MFSearchFlags = js.native
  /* CompleteClass */
  override var SearchRefinement: mfilesLib.ISearchConditions = js.native
  /* CompleteClass */
  override var SearchWithinThisFolder: scala.Boolean = js.native
  /* CompleteClass */
  override var SecondCondition: mfilesLib.ISearchConditionEx = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISearchCriteria = js.native
  /* CompleteClass */
  override def GetAsSearchConditions(
    ForceGettingExpandedConds: scala.Boolean,
    IncludeSearchRefinementConditions: scala.Boolean,
    IncludePreviousBaseConditions: scala.Boolean
  ): mfilesLib.ISearchConditions = js.native
}

@JSGlobal("MFiles.SearchCriteria")
@js.native
object SearchCriteria
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ISearchCriteria]

