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

