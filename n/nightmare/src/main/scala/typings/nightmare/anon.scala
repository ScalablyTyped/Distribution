package typings.nightmare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Downloads extends StObject {
    
    var downloads: js.UndefOr[String] = js.undefined
  }
  object Downloads {
    
    @scala.inline
    def apply(): Downloads = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Downloads]
    }
    
    @scala.inline
    implicit class DownloadsMutableBuilder[Self <: Downloads] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloads(value: String): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadsUndefined: Self = StObject.set(x, "downloads", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mode extends StObject {
    
    /**
      * Opens the devtools with specified dock state, can be right, bottom, undocked, detach.
      * https://github.com/electron/electron/blob/master/docs/api/web-contents.md#contentsopendevtoolsoptions
      */
    var mode: js.UndefOr[String] = js.undefined
  }
  object Mode {
    
    @scala.inline
    def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
