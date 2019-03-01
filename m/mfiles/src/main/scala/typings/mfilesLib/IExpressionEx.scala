package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpressionEx extends js.Object {
  var Conditions: ISearchConditions
  var Expression: IExpression
  var FolderListingAlgorithm: mfilesLib.MFilesNs.MFFolderListingAlgorithm
  var NULLFolderName: java.lang.String
  var ShowContentsAsJITFolders: scala.Boolean
  var ShowEmptyFolders: scala.Boolean
  var ShowMatchingObjectsOnThisLevel: scala.Boolean
  var ShowNULLFolder: scala.Boolean
  var ShowNULLFolderContentsOnThisLevel: scala.Boolean
  def Clone(): IExpressionEx
}

object IExpressionEx {
  @scala.inline
  def apply(
    Clone: js.Function0[IExpressionEx],
    Conditions: ISearchConditions,
    Expression: IExpression,
    FolderListingAlgorithm: mfilesLib.MFilesNs.MFFolderListingAlgorithm,
    NULLFolderName: java.lang.String,
    ShowContentsAsJITFolders: scala.Boolean,
    ShowEmptyFolders: scala.Boolean,
    ShowMatchingObjectsOnThisLevel: scala.Boolean,
    ShowNULLFolder: scala.Boolean,
    ShowNULLFolderContentsOnThisLevel: scala.Boolean
  ): IExpressionEx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Conditions")(Conditions)
    __obj.updateDynamic("Expression")(Expression)
    __obj.updateDynamic("FolderListingAlgorithm")(FolderListingAlgorithm)
    __obj.updateDynamic("NULLFolderName")(NULLFolderName)
    __obj.updateDynamic("ShowContentsAsJITFolders")(ShowContentsAsJITFolders)
    __obj.updateDynamic("ShowEmptyFolders")(ShowEmptyFolders)
    __obj.updateDynamic("ShowMatchingObjectsOnThisLevel")(ShowMatchingObjectsOnThisLevel)
    __obj.updateDynamic("ShowNULLFolder")(ShowNULLFolder)
    __obj.updateDynamic("ShowNULLFolderContentsOnThisLevel")(ShowNULLFolderContentsOnThisLevel)
    __obj.asInstanceOf[IExpressionEx]
  }
}

