package typings.mfiles

import typings.mfiles.MFiles.MFFacetSearchFlags
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultObjectSearchOperations extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: IVaultObjectSearchOperations](x: Self) {
    
    inline def setFindFile(value: (String, Boolean) => IObjectFileAndVersion): Self = StObject.set(x, "FindFile", js.Any.fromFunction2(value))
    
    inline def setFindObjectVersionAndProperties(value: (String, Boolean) => IObjectVersionAndProperties): Self = StObject.set(x, "FindObjectVersionAndProperties", js.Any.fromFunction2(value))
    
    inline def setGetFacetValues(value: (ISearchConditions, IExpressions, Double, MFFacetSearchFlags) => IStringData): Self = StObject.set(x, "GetFacetValues", js.Any.fromFunction4(value))
    
    inline def setGetFacetValuesByPath(value: (String, IExpressions, Double, MFFacetSearchFlags) => IStringData): Self = StObject.set(x, "GetFacetValuesByPath", js.Any.fromFunction4(value))
    
    inline def setGetObjectCountInSearch(value: (ISearchConditions, MFSearchFlags) => Double): Self = StObject.set(x, "GetObjectCountInSearch", js.Any.fromFunction2(value))
    
    inline def setGetObjectsInPath(value: (String, Boolean, Boolean) => IObjectSearchResults): Self = StObject.set(x, "GetObjectsInPath", js.Any.fromFunction3(value))
    
    inline def setGetSearchHits(value: (String, ISearchCondition) => IStrings): Self = StObject.set(x, "GetSearchHits", js.Any.fromFunction2(value))
    
    inline def setIsObjectPathInMFiles(value: String => Boolean): Self = StObject.set(x, "IsObjectPathInMFiles", js.Any.fromFunction1(value))
    
    inline def setSearchForObjectsByCondition(value: (ISearchCondition, Boolean) => IObjectSearchResults): Self = StObject.set(x, "SearchForObjectsByCondition", js.Any.fromFunction2(value))
    
    inline def setSearchForObjectsByConditions(value: (ISearchConditions, MFSearchFlags, Boolean) => IObjectSearchResults): Self = StObject.set(x, "SearchForObjectsByConditions", js.Any.fromFunction3(value))
    
    inline def setSearchForObjectsByConditionsEx(value: (ISearchConditions, MFSearchFlags, Boolean, Double, Double) => IObjectSearchResults): Self = StObject.set(x, "SearchForObjectsByConditionsEx", js.Any.fromFunction5(value))
    
    inline def setSearchForObjectsByConditionsXML(value: (ISearchConditions, Boolean) => IXMLSearchResult): Self = StObject.set(x, "SearchForObjectsByConditionsXML", js.Any.fromFunction2(value))
    
    inline def setSearchForObjectsByExportedSearchConditions(value: (String, Boolean) => IObjectSearchResults): Self = StObject.set(x, "SearchForObjectsByExportedSearchConditions", js.Any.fromFunction2(value))
    
    inline def setSearchForObjectsByExportedSearchConditionsXML(value: (String, Boolean) => IXMLSearchResult): Self = StObject.set(x, "SearchForObjectsByExportedSearchConditionsXML", js.Any.fromFunction2(value))
    
    inline def setSearchForObjectsByString(value: (String, Boolean, MFFullTextSearchFlags) => IObjectSearchResults): Self = StObject.set(x, "SearchForObjectsByString", js.Any.fromFunction3(value))
  }
}
