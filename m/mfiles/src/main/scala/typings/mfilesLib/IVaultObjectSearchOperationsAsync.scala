package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectSearchOperationsAsync extends js.Object {
  def FindFile(RelativePath: java.lang.String, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def FindFile(
    RelativePath: java.lang.String,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, scala.Unit]
  ): scala.Unit = js.native
  def FindFile(
    RelativePath: java.lang.String,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def FindFile(
    RelativePath: java.lang.String,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def FindObjectVersionAndProperties(RelativePath: java.lang.String, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: java.lang.String,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: java.lang.String,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: java.lang.String,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags
  ): scala.Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, scala.Unit]
  ): scala.Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: java.lang.String,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags
  ): scala.Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: java.lang.String,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, scala.Unit]
  ): scala.Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: java.lang.String,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: java.lang.String,
    Facets: IExpressions,
    FacetValuesMaxCount: scala.Double,
    Flags: mfilesLib.MFilesNs.MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: mfilesLib.MFilesNs.MFSearchFlags): scala.Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectsInPath(RelativePath: java.lang.String, SortResults: scala.Boolean, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetObjectsInPath(
    RelativePath: java.lang.String,
    SortResults: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectsInPath(
    RelativePath: java.lang.String,
    SortResults: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectsInPath(
    RelativePath: java.lang.String,
    SortResults: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetSearchHits(Input: java.lang.String, SearchCondition: ISearchCondition): scala.Unit = js.native
  def GetSearchHits(
    Input: java.lang.String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit]
  ): scala.Unit = js.native
  def GetSearchHits(
    Input: java.lang.String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetSearchHits(
    Input: java.lang.String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsObjectPathInMFiles(RelativePath: java.lang.String): scala.Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: scala.Boolean): scala.Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean
  ): scala.Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    MaxResultCount: scala.Double,
    SearchTimeoutInSeconds: scala.Double
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    MaxResultCount: scala.Double,
    SearchTimeoutInSeconds: scala.Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    MaxResultCount: scala.Double,
    SearchTimeoutInSeconds: scala.Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    MaxResultCount: scala.Double,
    SearchTimeoutInSeconds: scala.Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: scala.Boolean): scala.Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditions(ExportedSearchString: java.lang.String, SortResults: scala.Boolean): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: java.lang.String,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: java.lang.String,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: java.lang.String,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(SearchString: java.lang.String, SortResults: scala.Boolean): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByString(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags
  ): scala.Unit = js.native
  def SearchForObjectsByString(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit]
  ): scala.Unit = js.native
  def SearchForObjectsByString(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SearchForObjectsByString(
    SearchString: java.lang.String,
    SortResults: scala.Boolean,
    FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

