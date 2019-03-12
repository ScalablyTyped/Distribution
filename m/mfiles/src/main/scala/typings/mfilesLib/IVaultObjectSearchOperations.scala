package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectSearchOperations extends js.Object {
  def FindFile(RelativePath: java.lang.String, UpdateFromServer: scala.Boolean): IObjectFileAndVersion
  def FindObjectVersionAndProperties(RelativePath: java.lang.String, UpdateFromServer: scala.Boolean): IObjectVersionAndProperties
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags
  ): IStringData
  def GetFacetValuesByPath(
    RelativePath: java.lang.String,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags
  ): IStringData
  def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: mfilesLib.MFilesNs.MFSearchFlags): scala.Double
  def GetObjectsInPath(RelativePath: java.lang.String, SortResults: scala.Boolean, UpdateFromServer: scala.Boolean): IObjectSearchResults
  def GetSearchHits(Input: java.lang.String, SearchCondition: ISearchCondition): IStrings
  def IsObjectPathInMFiles(RelativePath: java.lang.String): scala.Boolean
  def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: scala.Boolean): IObjectSearchResults
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean
  ): IObjectSearchResults
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    MaxResultCount: scala.Double,
    SearchTimeoutInSeconds: scala.Double
  ): IObjectSearchResults
  def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: scala.Boolean): IXMLSearchResult
  def SearchForObjectsByExportedSearchConditions(ExportedSearchString: java.lang.String, SortResults: scala.Boolean): IObjectSearchResults
  def SearchForObjectsByExportedSearchConditionsXML(SearchString: java.lang.String, SortResults: scala.Boolean): IXMLSearchResult
  def SearchForObjectsByString(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags
  ): IObjectSearchResults
}

object IVaultObjectSearchOperations {
  @scala.inline
  def apply(
    FindFile: (java.lang.String, scala.Boolean) => IObjectFileAndVersion,
    FindObjectVersionAndProperties: (java.lang.String, scala.Boolean) => IObjectVersionAndProperties,
    GetFacetValues: (ISearchConditions, IExpressions, scala.Double, mfilesLib.MFilesNs.MFFacetSearchFlags) => IStringData,
    GetFacetValuesByPath: (java.lang.String, IExpressions, scala.Double, mfilesLib.MFilesNs.MFFacetSearchFlags) => IStringData,
    GetObjectCountInSearch: (ISearchConditions, mfilesLib.MFilesNs.MFSearchFlags) => scala.Double,
    GetObjectsInPath: (java.lang.String, scala.Boolean, scala.Boolean) => IObjectSearchResults,
    GetSearchHits: (java.lang.String, ISearchCondition) => IStrings,
    IsObjectPathInMFiles: java.lang.String => scala.Boolean,
    SearchForObjectsByCondition: (ISearchCondition, scala.Boolean) => IObjectSearchResults,
    SearchForObjectsByConditions: (ISearchConditions, mfilesLib.MFilesNs.MFSearchFlags, scala.Boolean) => IObjectSearchResults,
    SearchForObjectsByConditionsEx: (ISearchConditions, mfilesLib.MFilesNs.MFSearchFlags, scala.Boolean, scala.Double, scala.Double) => IObjectSearchResults,
    SearchForObjectsByConditionsXML: (ISearchConditions, scala.Boolean) => IXMLSearchResult,
    SearchForObjectsByExportedSearchConditions: (java.lang.String, scala.Boolean) => IObjectSearchResults,
    SearchForObjectsByExportedSearchConditionsXML: (java.lang.String, scala.Boolean) => IXMLSearchResult,
    SearchForObjectsByString: (java.lang.String, scala.Boolean, mfilesLib.MFilesNs.MFFullTextSearchFlags) => IObjectSearchResults
  ): IVaultObjectSearchOperations = {
    val __obj = js.Dynamic.literal(FindFile = js.Any.fromFunction2(FindFile), FindObjectVersionAndProperties = js.Any.fromFunction2(FindObjectVersionAndProperties), GetFacetValues = js.Any.fromFunction4(GetFacetValues), GetFacetValuesByPath = js.Any.fromFunction4(GetFacetValuesByPath), GetObjectCountInSearch = js.Any.fromFunction2(GetObjectCountInSearch), GetObjectsInPath = js.Any.fromFunction3(GetObjectsInPath), GetSearchHits = js.Any.fromFunction2(GetSearchHits), IsObjectPathInMFiles = js.Any.fromFunction1(IsObjectPathInMFiles), SearchForObjectsByCondition = js.Any.fromFunction2(SearchForObjectsByCondition), SearchForObjectsByConditions = js.Any.fromFunction3(SearchForObjectsByConditions), SearchForObjectsByConditionsEx = js.Any.fromFunction5(SearchForObjectsByConditionsEx), SearchForObjectsByConditionsXML = js.Any.fromFunction2(SearchForObjectsByConditionsXML), SearchForObjectsByExportedSearchConditions = js.Any.fromFunction2(SearchForObjectsByExportedSearchConditions), SearchForObjectsByExportedSearchConditionsXML = js.Any.fromFunction2(SearchForObjectsByExportedSearchConditionsXML), SearchForObjectsByString = js.Any.fromFunction3(SearchForObjectsByString))
  
    __obj.asInstanceOf[IVaultObjectSearchOperations]
  }
}

