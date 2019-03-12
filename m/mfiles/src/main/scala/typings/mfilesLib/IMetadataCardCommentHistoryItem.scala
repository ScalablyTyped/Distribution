package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardCommentHistoryItem extends js.Object {
  def GetCommentAuthor(): java.lang.String
  def GetCommentText(): java.lang.String
  def GetCommentTimestamp(): js.Any
  def GetCommentVersion(): scala.Double
}

object IMetadataCardCommentHistoryItem {
  @scala.inline
  def apply(
    GetCommentAuthor: () => java.lang.String,
    GetCommentText: () => java.lang.String,
    GetCommentTimestamp: () => js.Any,
    GetCommentVersion: () => scala.Double
  ): IMetadataCardCommentHistoryItem = {
    val __obj = js.Dynamic.literal(GetCommentAuthor = js.Any.fromFunction0(GetCommentAuthor), GetCommentText = js.Any.fromFunction0(GetCommentText), GetCommentTimestamp = js.Any.fromFunction0(GetCommentTimestamp), GetCommentVersion = js.Any.fromFunction0(GetCommentVersion))
  
    __obj.asInstanceOf[IMetadataCardCommentHistoryItem]
  }
}

