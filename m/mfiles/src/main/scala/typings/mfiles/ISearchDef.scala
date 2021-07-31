package typings.mfiles

import typings.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchDef extends StObject {
  
  def Clone(): ISearchDef
  
  var Conditions: ISearchConditions
  
  def IsIndirectionUsed(): Boolean
  
  var Levels: IExpressionExs
  
  var LookInAllVersions: Boolean
  
  var ReturnLatestVisibleVersion: Boolean
  
  var SearchFlags: MFSearchFlags
}
object ISearchDef {
  
  @scala.inline
  def apply(
    Clone: () => ISearchDef,
    Conditions: ISearchConditions,
    IsIndirectionUsed: () => Boolean,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    ReturnLatestVisibleVersion: Boolean,
    SearchFlags: MFSearchFlags
  ): ISearchDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions.asInstanceOf[js.Any], IsIndirectionUsed = js.Any.fromFunction0(IsIndirectionUsed), Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchDef]
  }
  
  @scala.inline
  implicit class ISearchDefMutableBuilder[Self <: ISearchDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISearchDef): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditions(value: ISearchConditions): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIndirectionUsed(value: () => Boolean): Self = StObject.set(x, "IsIndirectionUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLevels(value: IExpressionExs): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookInAllVersions(value: Boolean): Self = StObject.set(x, "LookInAllVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnLatestVisibleVersion(value: Boolean): Self = StObject.set(x, "ReturnLatestVisibleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFlags(value: MFSearchFlags): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
  }
}
