package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressionEx extends js.Object {
  var Conditions: ISearchConditions = js.native
  var Expression: IExpression = js.native
  var FolderListingAlgorithm: MFFolderListingAlgorithm = js.native
  var NULLFolderName: String = js.native
  var ShowContentsAsJITFolders: Boolean = js.native
  var ShowEmptyFolders: Boolean = js.native
  var ShowMatchingObjectsOnThisLevel: Boolean = js.native
  var ShowNULLFolder: Boolean = js.native
  var ShowNULLFolderContentsOnThisLevel: Boolean = js.native
  def Clone(): IExpressionEx = js.native
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], FolderListingAlgorithm = FolderListingAlgorithm.asInstanceOf[js.Any], NULLFolderName = NULLFolderName.asInstanceOf[js.Any], ShowContentsAsJITFolders = ShowContentsAsJITFolders.asInstanceOf[js.Any], ShowEmptyFolders = ShowEmptyFolders.asInstanceOf[js.Any], ShowMatchingObjectsOnThisLevel = ShowMatchingObjectsOnThisLevel.asInstanceOf[js.Any], ShowNULLFolder = ShowNULLFolder.asInstanceOf[js.Any], ShowNULLFolderContentsOnThisLevel = ShowNULLFolderContentsOnThisLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressionEx]
  }
  @scala.inline
  implicit class IExpressionExOps[Self <: IExpressionEx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IExpressionEx): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setConditions(value: ISearchConditions): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: IExpression): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderListingAlgorithm(value: MFFolderListingAlgorithm): Self = this.set("FolderListingAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setNULLFolderName(value: String): Self = this.set("NULLFolderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowContentsAsJITFolders(value: Boolean): Self = this.set("ShowContentsAsJITFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowEmptyFolders(value: Boolean): Self = this.set("ShowEmptyFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowMatchingObjectsOnThisLevel(value: Boolean): Self = this.set("ShowMatchingObjectsOnThisLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNULLFolder(value: Boolean): Self = this.set("ShowNULLFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNULLFolderContentsOnThisLevel(value: Boolean): Self = this.set("ShowNULLFolderContentsOnThisLevel", value.asInstanceOf[js.Any])
  }
  
}

