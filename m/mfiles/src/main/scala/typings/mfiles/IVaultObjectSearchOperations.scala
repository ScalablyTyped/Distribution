package typings.mfiles

import typings.mfiles.MFilesNs.MFFacetSearchFlags
import typings.mfiles.MFilesNs.MFFullTextSearchFlags
import typings.mfiles.MFilesNs.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectSearchOperations extends js.Object {
  def FindFile(RelativePath: String, UpdateFromServer: Boolean): IObjectFileAndVersion
  def FindObjectVersionAndProperties(RelativePath: String, UpdateFromServer: Boolean): IObjectVersionAndProperties
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags
  ): IStringData
  def GetFacetValuesByPath(RelativePath: String, Facets: IExpressions, FacetValuesMaxCount: Double, Flags: MFFacetSearchFlags): IStringData
  def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags): Double
  def GetObjectsInPath(RelativePath: String, SortResults: Boolean, UpdateFromServer: Boolean): IObjectSearchResults
  def GetSearchHits(Input: String, SearchCondition: ISearchCondition): IStrings
  def IsObjectPathInMFiles(RelativePath: String): Boolean
  def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: Boolean): IObjectSearchResults
  def SearchForObjectsByConditions(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags, SortResults: Boolean): IObjectSearchResults
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double
  ): IObjectSearchResults
  def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: Boolean): IXMLSearchResult
  def SearchForObjectsByExportedSearchConditions(ExportedSearchString: String, SortResults: Boolean): IObjectSearchResults
  def SearchForObjectsByExportedSearchConditionsXML(SearchString: String, SortResults: Boolean): IXMLSearchResult
  def SearchForObjectsByString(SearchString: String, SortResults: Boolean, FullTextSearchFlags: MFFullTextSearchFlags): IObjectSearchResults
}

object IVaultObjectSearchOperations {
  @scala.inline
  def apply(
    FindFile: (String, Boolean) => IObjectFileAndVersion,
    FindObjectVersionAndProperties: (String, Boolean) => IObjectVersionAndProperties,
    GetFacetValues: (ISearchConditions, IExpressions, Double, MFFacetSearchFlags) => IStringData,
    GetFacetValuesByPath: (String, IExpressions, Double, MFFacetSearchFlags) => IStringData,
    GetObjectCountInSearch: (ISearchConditions, MFSearchFlags) => Double,
    GetObjectsInPath: (String, Boolean, Boolean) => IObjectSearchResults,
    GetSearchHits: (String, ISearchCondition) => IStrings,
    IsObjectPathInMFiles: String => Boolean,
    SearchForObjectsByCondition: (ISearchCondition, Boolean) => IObjectSearchResults,
    SearchForObjectsByConditions: (ISearchConditions, MFSearchFlags, Boolean) => IObjectSearchResults,
    SearchForObjectsByConditionsEx: (ISearchConditions, MFSearchFlags, Boolean, Double, Double) => IObjectSearchResults,
    SearchForObjectsByConditionsXML: (ISearchConditions, Boolean) => IXMLSearchResult,
    SearchForObjectsByExportedSearchConditions: (String, Boolean) => IObjectSearchResults,
    SearchForObjectsByExportedSearchConditionsXML: (String, Boolean) => IXMLSearchResult,
    SearchForObjectsByString: (String, Boolean, MFFullTextSearchFlags) => IObjectSearchResults
  ): IVaultObjectSearchOperations = {
    val __obj = js.Dynamic.literal(FindFile = js.Any.fromFunction2(FindFile), FindObjectVersionAndProperties = js.Any.fromFunction2(FindObjectVersionAndProperties), GetFacetValues = js.Any.fromFunction4(GetFacetValues), GetFacetValuesByPath = js.Any.fromFunction4(GetFacetValuesByPath), GetObjectCountInSearch = js.Any.fromFunction2(GetObjectCountInSearch), GetObjectsInPath = js.Any.fromFunction3(GetObjectsInPath), GetSearchHits = js.Any.fromFunction2(GetSearchHits), IsObjectPathInMFiles = js.Any.fromFunction1(IsObjectPathInMFiles), SearchForObjectsByCondition = js.Any.fromFunction2(SearchForObjectsByCondition), SearchForObjectsByConditions = js.Any.fromFunction3(SearchForObjectsByConditions), SearchForObjectsByConditionsEx = js.Any.fromFunction5(SearchForObjectsByConditionsEx), SearchForObjectsByConditionsXML = js.Any.fromFunction2(SearchForObjectsByConditionsXML), SearchForObjectsByExportedSearchConditions = js.Any.fromFunction2(SearchForObjectsByExportedSearchConditions), SearchForObjectsByExportedSearchConditionsXML = js.Any.fromFunction2(SearchForObjectsByExportedSearchConditionsXML), SearchForObjectsByString = js.Any.fromFunction3(SearchForObjectsByString))
  
    __obj.asInstanceOf[IVaultObjectSearchOperations]
  }
}

