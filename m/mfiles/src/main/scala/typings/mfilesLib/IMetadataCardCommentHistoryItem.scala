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
    GetCommentAuthor: js.Function0[java.lang.String],
    GetCommentText: js.Function0[java.lang.String],
    GetCommentTimestamp: js.Function0[js.Any],
    GetCommentVersion: js.Function0[scala.Double]
  ): IMetadataCardCommentHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCommentAuthor")(GetCommentAuthor)
    __obj.updateDynamic("GetCommentText")(GetCommentText)
    __obj.updateDynamic("GetCommentTimestamp")(GetCommentTimestamp)
    __obj.updateDynamic("GetCommentVersion")(GetCommentVersion)
    __obj.asInstanceOf[IMetadataCardCommentHistoryItem]
  }
}

