package typings.photoswipe

import org.scalablytyped.runtime.Instantiable2
import typings.photoswipe.mod.Item
import typings.photoswipe.mod.Options
import typings.photoswipe.mod.UI
import typings.photoswipe.mod.UIFramework
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PhotoSwipe {
    
    /**
      * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
      */
    @JSGlobal("PhotoSwipe")
    @js.native
    class ^[T /* <: Options */] protected ()
      extends typings.photoswipe.mod.^[T] {
      /**
        * Constructs a PhotoSwipe.
        *
        * Note: By default Typescript will not correctly typecheck the options parameter. Make sure to
        * explicitly annotate the type of options being passed into the constructor like so:
        *
        * new PhotoSwipe<PhotoSwipeUI_Default.Options>( element, PhotoSwipeUI_Default, items, options );
        *
        * It accepts 4 arguments:
        *
        * (1) PhotoSwipe element (it must be added to DOM).
        * (2) PhotoSwipe UI class. If you included default photoswipe-ui-default.js, class will be PhotoSwipeUI_Default. Can be "false".
        * (3) Array with objects (slides).
        * (4) Options.
        */
      def this(
        pswpElement: HTMLElement,
        uiConstructor: Instantiable2[/* pswp */ typings.photoswipe.mod.PhotoSwipe[T], /* framework */ UIFramework, UI[T]],
        items: js.Array[Item],
        options: T
      ) = this()
      def this(pswpElement: HTMLElement, uiConstructor: Boolean, items: js.Array[Item], options: T) = this()
    }
  }
}
