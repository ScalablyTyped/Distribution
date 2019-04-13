package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultObjectSearchOperations")
@js.native
class VaultObjectSearchOperations ()
  extends mfilesLib.IVaultObjectSearchOperations {
  /* CompleteClass */
  override def FindFile(RelativePath: java.lang.String, UpdateFromServer: scala.Boolean): mfilesLib.IObjectFileAndVersion = js.native
  /* CompleteClass */
  override def FindObjectVersionAndProperties(RelativePath: java.lang.String, UpdateFromServer: scala.Boolean): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def GetFacetValues(
    SearchConditions: mfilesLib.ISearchConditions,
    Facets: mfilesLib.IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: MFFacetSearchFlags
  ): mfilesLib.IStringData = js.native
  /* CompleteClass */
  override def GetFacetValuesByPath(
    RelativePath: java.lang.String,
    Facets: mfilesLib.IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: MFFacetSearchFlags
  ): mfilesLib.IStringData = js.native
  /* CompleteClass */
  override def GetObjectCountInSearch(SearchConditions: mfilesLib.ISearchConditions, SearchFlags: MFSearchFlags): scala.Double = js.native
  /* CompleteClass */
  override def GetObjectsInPath(RelativePath: java.lang.String, SortResults: scala.Boolean, UpdateFromServer: scala.Boolean): mfilesLib.IObjectSearchResults = js.native
  /* CompleteClass */
  override def GetSearchHits(Input: java.lang.String, SearchCondition: mfilesLib.ISearchCondition): mfilesLib.IStrings = js.native
  /* CompleteClass */
  override def IsObjectPathInMFiles(RelativePath: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def SearchForObjectsByCondition(SearchCondition: mfilesLib.ISearchCondition, SortResults: scala.Boolean): mfilesLib.IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByConditions(
    SearchConditions: mfilesLib.ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: scala.Boolean
  ): mfilesLib.IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByConditionsEx(
    SearchConditions: mfilesLib.ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: scala.Boolean,
    MaxResultCount: scala.Double,
    SearchTimeoutInSeconds: scala.Double
  ): mfilesLib.IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByConditionsXML(SearchConditions: mfilesLib.ISearchConditions, SortResults: scala.Boolean): mfilesLib.IXMLSearchResult = js.native
  /* CompleteClass */
  override def SearchForObjectsByExportedSearchConditions(ExportedSearchString: java.lang.String, SortResults: scala.Boolean): mfilesLib.IObjectSearchResults = js.native
  /* CompleteClass */
  override def SearchForObjectsByExportedSearchConditionsXML(SearchString: java.lang.String, SortResults: scala.Boolean): mfilesLib.IXMLSearchResult = js.native
  /* CompleteClass */
  override def SearchForObjectsByString(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags
  ): mfilesLib.IObjectSearchResults = js.native
}

@JSGlobal("MFiles.VaultObjectSearchOperations")
@js.native
object VaultObjectSearchOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultObjectSearchOperations]

