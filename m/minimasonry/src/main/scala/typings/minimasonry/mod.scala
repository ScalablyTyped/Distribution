package typings.minimasonry

import typings.minimasonry.minimasonryStrings.ltr
import typings.minimasonry.minimasonryStrings.rtl
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimasonry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MiniMasonry {
    def this(options: MiniMasonryOptions) = this()
    
    /**
      * Remove the resize listener and set back container as it was before initialization.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If list has changed, trigger a re-layout of the masonry.
      */
    /* CompleteClass */
    override def layout(): Unit = js.native
  }
  
  trait MiniMasonry extends StObject {
    
    /**
      * Remove the resize listener and set back container as it was before initialization.
      */
    def destroy(): Unit
    
    /**
      * If list has changed, trigger a re-layout of the masonry.
      */
    def layout(): Unit
  }
  object MiniMasonry {
    
    inline def apply(destroy: () => Unit, layout: () => Unit): MiniMasonry = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), layout = js.Any.fromFunction0(layout))
      __obj.asInstanceOf[MiniMasonry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiniMasonry] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setLayout(value: () => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction0(value))
    }
  }
  
  trait MiniMasonryOptions extends StObject {
    
    /**
      * Target width of elements.
      * @default 255
      */
    var baseWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Container's selector or element.
      */
    var container: String | HTMLElement
    
    /**
      * Sorting direction, "ltr" or "rtl".
      * @default "ltr"
      */
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    /**
      * Width / height of gutter between elements. Use gutterX / gutterY to set different values.
      * @default 10
      */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of gutter between elements. Need gutterY to work, fallback to `gutter`.
      */
    var gutterX: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of gutter between elements. Need gutterX to work, fallback to `gutter`.
      */
    var gutterY: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether or not MiniMasonry places elements on the shortest column or keeps exact order of the list.
      * @default true
      */
    var minify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set left gutter on first columns and right gutter on last.
      * @default true
      */
    var surroundingGutter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gutter applied when only 1 column can be displayed.
      * @default 5
      */
    var ultimateGutter: js.UndefOr[Double] = js.undefined
    
    /**
      * False will start to sort from center, true will start from left or right according to direction parameter.
      * @default false
      */
    var wedge: js.UndefOr[Boolean] = js.undefined
  }
  object MiniMasonryOptions {
    
    inline def apply(container: String | HTMLElement): MiniMasonryOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiniMasonryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiniMasonryOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseWidth(value: Double): Self = StObject.set(x, "baseWidth", value.asInstanceOf[js.Any])
      
      inline def setBaseWidthUndefined: Self = StObject.set(x, "baseWidth", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setGutterX(value: Double): Self = StObject.set(x, "gutterX", value.asInstanceOf[js.Any])
      
      inline def setGutterXUndefined: Self = StObject.set(x, "gutterX", js.undefined)
      
      inline def setGutterY(value: Double): Self = StObject.set(x, "gutterY", value.asInstanceOf[js.Any])
      
      inline def setGutterYUndefined: Self = StObject.set(x, "gutterY", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setSurroundingGutter(value: Boolean): Self = StObject.set(x, "surroundingGutter", value.asInstanceOf[js.Any])
      
      inline def setSurroundingGutterUndefined: Self = StObject.set(x, "surroundingGutter", js.undefined)
      
      inline def setUltimateGutter(value: Double): Self = StObject.set(x, "ultimateGutter", value.asInstanceOf[js.Any])
      
      inline def setUltimateGutterUndefined: Self = StObject.set(x, "ultimateGutter", js.undefined)
      
      inline def setWedge(value: Boolean): Self = StObject.set(x, "wedge", value.asInstanceOf[js.Any])
      
      inline def setWedgeUndefined: Self = StObject.set(x, "wedge", js.undefined)
    }
  }
  
  // browser global variable `MiniMasonry`
  object global {
    
    trait Window extends StObject {
      
      var MiniMasonry: typings.minimasonry.mod.MiniMasonry
    }
    object Window {
      
      inline def apply(MiniMasonry: MiniMasonry): Window = {
        val __obj = js.Dynamic.literal(MiniMasonry = MiniMasonry.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setMiniMasonry(value: MiniMasonry): Self = StObject.set(x, "MiniMasonry", value.asInstanceOf[js.Any])
      }
    }
  }
}
