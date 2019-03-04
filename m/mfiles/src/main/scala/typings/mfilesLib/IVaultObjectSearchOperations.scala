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
    FindFile: js.Function2[java.lang.String, scala.Boolean, IObjectFileAndVersion],
    FindObjectVersionAndProperties: js.Function2[java.lang.String, scala.Boolean, IObjectVersionAndProperties],
    GetFacetValues: js.Function4[
      ISearchConditions, 
      IExpressions, 
      scala.Double, 
      mfilesLib.MFilesNs.MFFacetSearchFlags, 
      IStringData
    ],
    GetFacetValuesByPath: js.Function4[
      java.lang.String, 
      IExpressions, 
      scala.Double, 
      mfilesLib.MFilesNs.MFFacetSearchFlags, 
      IStringData
    ],
    GetObjectCountInSearch: js.Function2[ISearchConditions, mfilesLib.MFilesNs.MFSearchFlags, scala.Double],
    GetObjectsInPath: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, IObjectSearchResults],
    GetSearchHits: js.Function2[java.lang.String, ISearchCondition, IStrings],
    IsObjectPathInMFiles: js.Function1[java.lang.String, scala.Boolean],
    SearchForObjectsByCondition: js.Function2[ISearchCondition, scala.Boolean, IObjectSearchResults],
    SearchForObjectsByConditions: js.Function3[
      ISearchConditions, 
      mfilesLib.MFilesNs.MFSearchFlags, 
      scala.Boolean, 
      IObjectSearchResults
    ],
    SearchForObjectsByConditionsEx: js.Function5[
      ISearchConditions, 
      mfilesLib.MFilesNs.MFSearchFlags, 
      scala.Boolean, 
      scala.Double, 
      scala.Double, 
      IObjectSearchResults
    ],
    SearchForObjectsByConditionsXML: js.Function2[ISearchConditions, scala.Boolean, IXMLSearchResult],
    SearchForObjectsByExportedSearchConditions: js.Function2[java.lang.String, scala.Boolean, IObjectSearchResults],
    SearchForObjectsByExportedSearchConditionsXML: js.Function2[java.lang.String, scala.Boolean, IXMLSearchResult],
    SearchForObjectsByString: js.Function3[
      java.lang.String, 
      scala.Boolean, 
      mfilesLib.MFilesNs.MFFullTextSearchFlags, 
      IObjectSearchResults
    ]
  ): IVaultObjectSearchOperations = {
    val __obj = js.Dynamic.literal(FindFile = FindFile, FindObjectVersionAndProperties = FindObjectVersionAndProperties, GetFacetValues = GetFacetValues, GetFacetValuesByPath = GetFacetValuesByPath, GetObjectCountInSearch = GetObjectCountInSearch, GetObjectsInPath = GetObjectsInPath, GetSearchHits = GetSearchHits, IsObjectPathInMFiles = IsObjectPathInMFiles, SearchForObjectsByCondition = SearchForObjectsByCondition, SearchForObjectsByConditions = SearchForObjectsByConditions, SearchForObjectsByConditionsEx = SearchForObjectsByConditionsEx, SearchForObjectsByConditionsXML = SearchForObjectsByConditionsXML, SearchForObjectsByExportedSearchConditions = SearchForObjectsByExportedSearchConditions, SearchForObjectsByExportedSearchConditionsXML = SearchForObjectsByExportedSearchConditionsXML, SearchForObjectsByString = SearchForObjectsByString)
  
    __obj.asInstanceOf[IVaultObjectSearchOperations]
  }
}

