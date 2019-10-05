package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpressionEx extends js.Object {
  var Conditions: ISearchConditions
  var Expression: IExpression
  var FolderListingAlgorithm: MFFolderListingAlgorithm
  var NULLFolderName: String
  var ShowContentsAsJITFolders: Boolean
  var ShowEmptyFolders: Boolean
  var ShowMatchingObjectsOnThisLevel: Boolean
  var ShowNULLFolder: Boolean
  var ShowNULLFolderContentsOnThisLevel: Boolean
  def Clone(): IExpressionEx
}

object IExpressionEx {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions, Expression = Expression, FolderListingAlgorithm = FolderListingAlgorithm, NULLFolderName = NULLFolderName, ShowContentsAsJITFolders = ShowContentsAsJITFolders, ShowEmptyFolders = ShowEmptyFolders, ShowMatchingObjectsOnThisLevel = ShowMatchingObjectsOnThisLevel, ShowNULLFolder = ShowNULLFolder, ShowNULLFolderContentsOnThisLevel = ShowNULLFolderContentsOnThisLevel)
  
    __obj.asInstanceOf[IExpressionEx]
  }
}

