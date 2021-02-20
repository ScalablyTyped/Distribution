package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardCommentHistoryItem extends StObject {
  
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
  implicit class IMetadataCardCommentHistoryItemMutableBuilder[Self <: IMetadataCardCommentHistoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCommentAuthor(value: () => String): Self = StObject.set(x, "GetCommentAuthor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCommentText(value: () => String): Self = StObject.set(x, "GetCommentText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCommentTimestamp(value: () => js.Any): Self = StObject.set(x, "GetCommentTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCommentVersion(value: () => Double): Self = StObject.set(x, "GetCommentVersion", js.Any.fromFunction0(value))
  }
}
