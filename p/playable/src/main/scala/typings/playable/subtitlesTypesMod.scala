package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtitlesTypesMod {
  
  trait ISubtitleConfig extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var src: String
  }
  object ISubtitleConfig {
    
    @scala.inline
    def apply(src: String): ISubtitleConfig = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubtitleConfig]
    }
    
    @scala.inline
    implicit class ISubtitleConfigMutableBuilder[Self <: ISubtitleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISubtitles extends StObject {
    
    def destroy(): Unit = js.native
    
    def hideSubtitles(): Unit = js.native
    
    def removeSubtitles(): Unit = js.native
    
    def setActiveSubtitle(index: Double): Unit = js.native
    
    def setSubtitles(subtitles: String): Unit = js.native
    def setSubtitles(subtitles: js.Array[ISubtitleConfig]): Unit = js.native
    def setSubtitles(subtitles: ISubtitleConfig): Unit = js.native
    
    def showSubtitles(): Unit = js.native
  }
  
  trait ISubtitlesAPI extends StObject {
    
    var hideSubtitles: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeSubtitles: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setActiveSubtitle: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var setSubtitles: js.UndefOr[
        js.Function1[/* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig], Unit]
      ] = js.undefined
    
    var showSubtitles: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISubtitlesAPI {
    
    @scala.inline
    def apply(): ISubtitlesAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubtitlesAPI]
    }
    
    @scala.inline
    implicit class ISubtitlesAPIMutableBuilder[Self <: ISubtitlesAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideSubtitles(value: () => Unit): Self = StObject.set(x, "hideSubtitles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideSubtitlesUndefined: Self = StObject.set(x, "hideSubtitles", js.undefined)
      
      @scala.inline
      def setRemoveSubtitles(value: () => Unit): Self = StObject.set(x, "removeSubtitles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveSubtitlesUndefined: Self = StObject.set(x, "removeSubtitles", js.undefined)
      
      @scala.inline
      def setSetActiveSubtitle(value: /* index */ Double => Unit): Self = StObject.set(x, "setActiveSubtitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveSubtitleUndefined: Self = StObject.set(x, "setActiveSubtitle", js.undefined)
      
      @scala.inline
      def setSetSubtitles(value: /* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig] => Unit): Self = StObject.set(x, "setSubtitles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSubtitlesUndefined: Self = StObject.set(x, "setSubtitles", js.undefined)
      
      @scala.inline
      def setShowSubtitles(value: () => Unit): Self = StObject.set(x, "showSubtitles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowSubtitlesUndefined: Self = StObject.set(x, "showSubtitles", js.undefined)
    }
  }
  
  trait ISubtitlesViewStyles extends StObject {
    
    var container: String
    
    var controlsShown: String
    
    var hidden: String
    
    var subtitle: String
    
    var subtitlesContainer: String
  }
  object ISubtitlesViewStyles {
    
    @scala.inline
    def apply(
      container: String,
      controlsShown: String,
      hidden: String,
      subtitle: String,
      subtitlesContainer: String
    ): ISubtitlesViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], controlsShown = controlsShown.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitlesContainer = subtitlesContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubtitlesViewStyles]
    }
    
    @scala.inline
    implicit class ISubtitlesViewStylesMutableBuilder[Self <: ISubtitlesViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsShown(value: String): Self = StObject.set(x, "controlsShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitlesContainer(value: String): Self = StObject.set(x, "subtitlesContainer", value.asInstanceOf[js.Any])
    }
  }
}
