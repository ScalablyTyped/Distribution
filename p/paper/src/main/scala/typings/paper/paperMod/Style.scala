package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Style is used for changing the visual styles of items
  * contained within a Paper.js project and is returned by
  * {@link Item#style} and {@link Project#currentStyle}.
  * 
  * All properties of Style are also reflected directly in {@link Item},
  * i.e.: {@link Item#fillColor}.
  * 
  * To set multiple style properties in one go, you can pass an object to
  * {@link Item#style}. This is a convenient way to define a style once and
  * apply it to a series of items:
  */
@JSImport("paper", "Style")
@js.native
class Style protected ()
  extends typings.paper.paper.Style {
  /** 
    * Style objects don't need to be created directly. Just pass an object to
    * {@link Item#style} or {@link Project#currentStyle}, it will be converted
    * to a Style object internally.
    */
  def this(style: js.Object) = this()
}

