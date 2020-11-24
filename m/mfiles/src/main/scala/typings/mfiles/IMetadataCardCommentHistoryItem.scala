package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardCommentHistoryItem extends js.Object {
  
  def GetCommentAuthor(): String = js.native
  
  def GetCommentText(): String = js.native
  
  def GetCommentTimestamp(): js.Any = js.native
  
  def GetCommentVersion(): Double = js.native
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
  
  @scala.inline
  implicit class IMetadataCardCommentHistoryItemOps[Self <: IMetadataCardCommentHistoryItem] (val x: Self) extends AnyVal {
    
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
    def setGetCommentAuthor(value: () => String): Self = this.set("GetCommentAuthor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCommentText(value: () => String): Self = this.set("GetCommentText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCommentTimestamp(value: () => js.Any): Self = this.set("GetCommentTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCommentVersion(value: () => Double): Self = this.set("GetCommentVersion", js.Any.fromFunction0(value))
  }
}
