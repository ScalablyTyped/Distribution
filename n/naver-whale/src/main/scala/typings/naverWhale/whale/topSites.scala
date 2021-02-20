package typings.naverWhale.whale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topSites {
  
  @js.native
  trait MostVisitedURL extends StObject {
    
    /**
      * 방문기록에서 판단한 여부입니다.
      * api로 추가한 경우에는 false입니다.
      */
    var from_history: Boolean = js.native
    
    /** 페이지 제목 */
    var title: String = js.native
    
    /** 많이 방문한 url. */
    var url: String = js.native
  }
  object MostVisitedURL {
    
    @scala.inline
    def apply(from_history: Boolean, title: String, url: String): MostVisitedURL = {
      val __obj = js.Dynamic.literal(from_history = from_history.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MostVisitedURL]
    }
    
    @scala.inline
    implicit class MostVisitedURLMutableBuilder[Self <: MostVisitedURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom_history(value: Boolean): Self = StObject.set(x, "from_history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MostVisitedURL2 extends StObject {
    
    /** 페이지 제목 */
    var title: String = js.native
    
    /** 많이 방문한 url. */
    var url: String = js.native
  }
  object MostVisitedURL2 {
    
    @scala.inline
    def apply(title: String, url: String): MostVisitedURL2 = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MostVisitedURL2]
    }
    
    @scala.inline
    implicit class MostVisitedURL2MutableBuilder[Self <: MostVisitedURL2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
