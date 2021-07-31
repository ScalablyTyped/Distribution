package typings.mfiles.global.MFiles

import typings.mfiles.ISearchConditionEx
import typings.mfiles.ISearchConditionExs
import typings.mfiles.ISearchConditions
import typings.mfiles.ISearchCriteria
import typings.mfiles.MFiles.MFFacetFilterStatusFlags
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFPredefinedSearchFilterType
import typings.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SearchCriteria")
@js.native
class SearchCriteria ()
  extends StObject
     with ISearchCriteria {
  
  /* CompleteClass */
  var AdditionalConditions: ISearchConditionExs = js.native
  
  /* CompleteClass */
  override def Clone(): ISearchCriteria = js.native
  
  /* CompleteClass */
  var ExpandUI: Boolean = js.native
  
  /* CompleteClass */
  var FacetFilterAsJSON: String = js.native
  
  /* CompleteClass */
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags = js.native
  
  /* CompleteClass */
  var FirstCondition: ISearchConditionEx = js.native
  
  /* CompleteClass */
  var FullTextSearchFlags: MFFullTextSearchFlags = js.native
  
  /* CompleteClass */
  var FullTextSearchString: String = js.native
  
  /* CompleteClass */
  override def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions = js.native
  
  /* CompleteClass */
  var ObjectTypeCondition: ISearchConditionEx = js.native
  
  /* CompleteClass */
  var PredefinedSearchFilter: MFPredefinedSearchFilterType = js.native
  
  /* CompleteClass */
  var PreviousBaseConditions: ISearchConditions = js.native
  
  /* CompleteClass */
  var SearchFlags: MFSearchFlags = js.native
  
  /* CompleteClass */
  var SearchRefinement: ISearchConditions = js.native
  
  /* CompleteClass */
  var SearchWithinThisFolder: Boolean = js.native
  
  /* CompleteClass */
  var SecondCondition: ISearchConditionEx = js.native
}
