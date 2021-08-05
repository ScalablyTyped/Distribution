package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExpressionEx extends StObject {
  
  def Clone(): IExpressionEx
  
  var Conditions: ISearchConditions
  
  var Expression: IExpression
  
  var FolderListingAlgorithm: MFFolderListingAlgorithm
  
  var NULLFolderName: String
  
  var ShowContentsAsJITFolders: Boolean
  
  var ShowEmptyFolders: Boolean
  
  var ShowMatchingObjectsOnThisLevel: Boolean
  
  var ShowNULLFolder: Boolean
  
  var ShowNULLFolderContentsOnThisLevel: Boolean
}
object IExpressionEx {
  
  inline def apply(
    Clone: () => IExpressionEx,
    Conditions: ISearchConditions,
    Expression: IExpression,
    FolderListingAlgorithm: MFFolderListingAlgorithm,
    NULLFolderName: String,
    ShowContentsAsJITFolders: Boolean,
    ShowEmptyFolders: Boolean,
    ShowMatchingObjectsOnThisLevel: Boolean,
    ShowNULLFolder: Boolean,
    ShowNULLFolderContentsOnThisLevel: Boolean
  ): IExpressionEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], FolderListingAlgorithm = FolderListingAlgorithm.asInstanceOf[js.Any], NULLFolderName = NULLFolderName.asInstanceOf[js.Any], ShowContentsAsJITFolders = ShowContentsAsJITFolders.asInstanceOf[js.Any], ShowEmptyFolders = ShowEmptyFolders.asInstanceOf[js.Any], ShowMatchingObjectsOnThisLevel = ShowMatchingObjectsOnThisLevel.asInstanceOf[js.Any], ShowNULLFolder = ShowNULLFolder.asInstanceOf[js.Any], ShowNULLFolderContentsOnThisLevel = ShowNULLFolderContentsOnThisLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressionEx]
  }
  
  extension [Self <: IExpressionEx](x: Self) {
    
    inline def setClone(value: () => IExpressionEx): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setConditions(value: ISearchConditions): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: IExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setFolderListingAlgorithm(value: MFFolderListingAlgorithm): Self = StObject.set(x, "FolderListingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setNULLFolderName(value: String): Self = StObject.set(x, "NULLFolderName", value.asInstanceOf[js.Any])
    
    inline def setShowContentsAsJITFolders(value: Boolean): Self = StObject.set(x, "ShowContentsAsJITFolders", value.asInstanceOf[js.Any])
    
    inline def setShowEmptyFolders(value: Boolean): Self = StObject.set(x, "ShowEmptyFolders", value.asInstanceOf[js.Any])
    
    inline def setShowMatchingObjectsOnThisLevel(value: Boolean): Self = StObject.set(x, "ShowMatchingObjectsOnThisLevel", value.asInstanceOf[js.Any])
    
    inline def setShowNULLFolder(value: Boolean): Self = StObject.set(x, "ShowNULLFolder", value.asInstanceOf[js.Any])
    
    inline def setShowNULLFolderContentsOnThisLevel(value: Boolean): Self = StObject.set(x, "ShowNULLFolderContentsOnThisLevel", value.asInstanceOf[js.Any])
  }
}
