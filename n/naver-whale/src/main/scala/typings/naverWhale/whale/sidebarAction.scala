package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tabs.Tab
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarAction {
  
  trait BadgeBackgroundColorDetails extends StObject {
    
    /** 색상값 배열([255, 0, 0, 255]) 혹은 HEX 색상 표현 문자열(#FF0000). */
    var color: String | ColorArray
  }
  object BadgeBackgroundColorDetails {
    
    @scala.inline
    def apply(color: String | ColorArray): BadgeBackgroundColorDetails = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeBackgroundColorDetails]
    }
    
    @scala.inline
    implicit class BadgeBackgroundColorDetailsMutableBuilder[Self <: BadgeBackgroundColorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String | ColorArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  type BrowserClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
  
  trait SidebarBadgeDetail extends StObject {
    
    /** 설정할 badge 문자열 */
    var text: String
  }
  object SidebarBadgeDetail {
    
    @scala.inline
    def apply(text: String): SidebarBadgeDetail = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarBadgeDetail]
    }
    
    @scala.inline
    implicit class SidebarBadgeDetailMutableBuilder[Self <: SidebarBadgeDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SidebarDockDetail extends StObject {
    
    /** 부모 윈도우의 ID. 지정하지 않으면 마지막 사용된 윈도우에 도킹합니다. */
    var targetWindowId: js.UndefOr[Double] = js.undefined
  }
  object SidebarDockDetail {
    
    @scala.inline
    def apply(): SidebarDockDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarDockDetail]
    }
    
    @scala.inline
    implicit class SidebarDockDetailMutableBuilder[Self <: SidebarDockDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargetWindowId(value: Double): Self = StObject.set(x, "targetWindowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetWindowIdUndefined: Self = StObject.set(x, "targetWindowId", js.undefined)
    }
  }
  
  trait SidebarIconDetail extends StObject {
    
    /**
      * 아이콘 이미지 데이터입니다. @see https://developer.chrome.com/extensions/pageAction#type-ImageDataType
      * */
    var icon: ImageData
  }
  object SidebarIconDetail {
    
    @scala.inline
    def apply(icon: ImageData): SidebarIconDetail = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarIconDetail]
    }
    
    @scala.inline
    implicit class SidebarIconDetailMutableBuilder[Self <: SidebarIconDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ImageData): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  trait SidebarPageDetail extends StObject {
    
    /** html 파일의 리소스 경로. 빈 문자열(‘’)로 설정하면 사이드바에 빈화면이 보입니다. */
    var page: String
  }
  object SidebarPageDetail {
    
    @scala.inline
    def apply(page: String): SidebarPageDetail = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarPageDetail]
    }
    
    @scala.inline
    implicit class SidebarPageDetailMutableBuilder[Self <: SidebarPageDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait SidebarShowDetail extends StObject {
    
    /**
      * Optional. url 인자와 현재 URL이 같을 때에도 페이지를 새로고침 할 것인지 여부.
      * @default false
      */
    var reload: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. 사이드바 영역에 표시할 페이지 URL. 지정하지 않으면 매니페스트에 정의한 default_page. */
    var url: js.UndefOr[String] = js.undefined
  }
  object SidebarShowDetail {
    
    @scala.inline
    def apply(): SidebarShowDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarShowDetail]
    }
    
    @scala.inline
    implicit class SidebarShowDetailMutableBuilder[Self <: SidebarShowDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SidebarTitleDetail extends StObject {
    
    var title: String
  }
  object SidebarTitleDetail {
    
    @scala.inline
    def apply(title: String): SidebarTitleDetail = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarTitleDetail]
    }
    
    @scala.inline
    implicit class SidebarTitleDetailMutableBuilder[Self <: SidebarTitleDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
