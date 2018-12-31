package typings
package photoswipeLib.photoswipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
  */
@JSImport("photoswipe", JSImport.Namespace)
@js.native
class namespaced[T /* <: photoswipeLib.photoswipeMod.PhotoSwipeNs.Options */] protected () extends PhotoSwipe[T] {
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
  def this(pswpElement: stdLib.HTMLElement, uiConstructor: org.scalablytyped.runtime.Instantiable2[
      /* pswp */ PhotoSwipe[T], 
      /* framework */ photoswipeLib.photoswipeMod.PhotoSwipeNs.UIFramework, 
      photoswipeLib.photoswipeMod.PhotoSwipeNs.UI[T]
    ], items: js.Array[photoswipeLib.photoswipeMod.PhotoSwipeNs.Item], options: T) = this()
  def this(pswpElement: stdLib.HTMLElement, uiConstructor: scala.Boolean, items: js.Array[photoswipeLib.photoswipeMod.PhotoSwipeNs.Item], options: T) = this()
}

