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

