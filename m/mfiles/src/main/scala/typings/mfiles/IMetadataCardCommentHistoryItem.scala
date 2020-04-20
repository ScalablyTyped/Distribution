package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardCommentHistoryItem extends js.Object {
  def GetCommentAuthor(): String
  def GetCommentText(): String
  def GetCommentTimestamp(): js.Any
  def GetCommentVersion(): Double
}

object IMetadataCardCommentHistoryItem {
  @scala.inline
  def apply(
    GetCommentAuthor: () => String,
    GetCommentText: () => String,
    GetCommentTimestamp: () => js.Any,
    GetCommentVersion: () => Double
  ): IMetadataCardCommentHistoryItem = {
    val __obj = js.Dynamic.literal(GetCommentAuthor = js.Any.fromFunction0(GetCommentAuthor), GetCommentText = js.Any.fromFunction0(GetCommentText), GetCommentTimestamp = js.Any.fromFunction0(GetCommentTimestamp), GetCommentVersion = js.Any.fromFunction0(GetCommentVersion))
    __obj.asInstanceOf[IMetadataCardCommentHistoryItem]
  }
}

