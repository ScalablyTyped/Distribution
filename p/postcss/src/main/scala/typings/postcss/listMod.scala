package typings.postcss

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod extends Shortcut {
  
  @JSImport("postcss/lib/list", JSImport.Default)
  @js.native
  val default: List = js.native
  
  trait List extends StObject {
    
    /**
      * Safely splits comma-separated values (such as those for `transition-*`
      * and `background` properties).
      *
      * ```js
      * Once (root, { list }) {
      *   list.comma('black, linear-gradient(white, black)')
      *   //=> ['black', 'linear-gradient(white, black)']
      * }
      * ```
      *
      * @param str Comma-separated values.
      * @return Split values.
      */
    def comma(str: String): js.Array[String]
    
    /**
      * Safely splits space-separated values (such as those for `background`,
      * `border-radius`, and other shorthand properties).
      *
      * ```js
      * Once (root, { list }) {
      *   list.space('1px calc(10% + 1px)') //=> ['1px', 'calc(10% + 1px)']
      * }
      * ```
      *
      * @param str Space-separated values.
      * @return Split values.
      */
    def space(str: String): js.Array[String]
    
    /**
      * Safely splits values.
      *
      * ```js
      * Once (root, { list }) {
      *   list.split('1px calc(10% + 1px)', [' ', '\n', '\t']) //=> ['1px', 'calc(10% + 1px)']
      * }
      * ```
      *
      * @param string separated values.
      * @param separators array of separators.
      * @param last boolean indicator.
      * @return Split values.
      */
    def split(string: String, separators: js.Array[String], last: Boolean): js.Array[String]
  }
  object List {
    
    inline def apply(
      comma: String => js.Array[String],
      space: String => js.Array[String],
      split: (String, js.Array[String], Boolean) => js.Array[String]
    ): List = {
      val __obj = js.Dynamic.literal(comma = js.Any.fromFunction1(comma), space = js.Any.fromFunction1(space), split = js.Any.fromFunction3(split))
      __obj.asInstanceOf[List]
    }
    
    extension [Self <: List](x: Self) {
      
      inline def setComma(value: String => js.Array[String]): Self = StObject.set(x, "comma", js.Any.fromFunction1(value))
      
      inline def setSpace(value: String => js.Array[String]): Self = StObject.set(x, "space", js.Any.fromFunction1(value))
      
      inline def setSplit(value: (String, js.Array[String], Boolean) => js.Array[String]): Self = StObject.set(x, "split", js.Any.fromFunction3(value))
    }
  }
  
  type _To = List
  
  /* This means you don't have to write `default`, but can instead just say `listMod.foo` */
  override def _to: List = default
}
