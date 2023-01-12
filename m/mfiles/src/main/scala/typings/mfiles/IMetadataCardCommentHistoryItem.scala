package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardCommentHistoryItem extends StObject {
  
  def GetCommentAuthor(): String
  
  def GetCommentText(): String
  
  def GetCommentTimestamp(): Any
  
  def GetCommentVersion(): Double
}
object IMetadataCardCommentHistoryItem {
  
  inline def apply(
    GetCommentAuthor: () => String,
    GetCommentText: () => String,
    GetCommentTimestamp: () => Any,
    GetCommentVersion: () => Double
  ): IMetadataCardCommentHistoryItem = {
    val __obj = js.Dynamic.literal(GetCommentAuthor = js.Any.fromFunction0(GetCommentAuthor), GetCommentText = js.Any.fromFunction0(GetCommentText), GetCommentTimestamp = js.Any.fromFunction0(GetCommentTimestamp), GetCommentVersion = js.Any.fromFunction0(GetCommentVersion))
    __obj.asInstanceOf[IMetadataCardCommentHistoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardCommentHistoryItem] (val x: Self) extends AnyVal {
    
    inline def setGetCommentAuthor(value: () => String): Self = StObject.set(x, "GetCommentAuthor", js.Any.fromFunction0(value))
    
    inline def setGetCommentText(value: () => String): Self = StObject.set(x, "GetCommentText", js.Any.fromFunction0(value))
    
    inline def setGetCommentTimestamp(value: () => Any): Self = StObject.set(x, "GetCommentTimestamp", js.Any.fromFunction0(value))
    
    inline def setGetCommentVersion(value: () => Double): Self = StObject.set(x, "GetCommentVersion", js.Any.fromFunction0(value))
  }
}
