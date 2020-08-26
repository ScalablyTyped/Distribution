package typings.mfiles

import typings.mfiles.MFiles.MFFacetFilterStatusFlags
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFPredefinedSearchFilterType
import typings.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchCriteria extends js.Object {
  var AdditionalConditions: ISearchConditionExs = js.native
  var ExpandUI: Boolean = js.native
  var FacetFilterAsJSON: String = js.native
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags = js.native
  var FirstCondition: ISearchConditionEx = js.native
  var FullTextSearchFlags: MFFullTextSearchFlags = js.native
  var FullTextSearchString: String = js.native
  var ObjectTypeCondition: ISearchConditionEx = js.native
  var PredefinedSearchFilter: MFPredefinedSearchFilterType = js.native
  var PreviousBaseConditions: ISearchConditions = js.native
  var SearchFlags: MFSearchFlags = js.native
  var SearchRefinement: ISearchConditions = js.native
  var SearchWithinThisFolder: Boolean = js.native
  var SecondCondition: ISearchConditionEx = js.native
  def Clone(): ISearchCriteria = js.native
  def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions = js.native
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
  implicit class ISearchCriteriaOps[Self <: ISearchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalConditions(value: ISearchConditionExs): Self = this.set("AdditionalConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => ISearchCriteria): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setExpandUI(value: Boolean): Self = this.set("ExpandUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacetFilterAsJSON(value: String): Self = this.set("FacetFilterAsJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacetFilterStatusFlags(value: MFFacetFilterStatusFlags): Self = this.set("FacetFilterStatusFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstCondition(value: ISearchConditionEx): Self = this.set("FirstCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTextSearchFlags(value: MFFullTextSearchFlags): Self = this.set("FullTextSearchFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTextSearchString(value: String): Self = this.set("FullTextSearchString", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAsSearchConditions(value: (Boolean, Boolean, Boolean) => ISearchConditions): Self = this.set("GetAsSearchConditions", js.Any.fromFunction3(value))
    @scala.inline
    def setObjectTypeCondition(value: ISearchConditionEx): Self = this.set("ObjectTypeCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredefinedSearchFilter(value: MFPredefinedSearchFilterType): Self = this.set("PredefinedSearchFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousBaseConditions(value: ISearchConditions): Self = this.set("PreviousBaseConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFlags(value: MFSearchFlags): Self = this.set("SearchFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchRefinement(value: ISearchConditions): Self = this.set("SearchRefinement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchWithinThisFolder(value: Boolean): Self = this.set("SearchWithinThisFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondCondition(value: ISearchConditionEx): Self = this.set("SecondCondition", value.asInstanceOf[js.Any])
  }
  
}

