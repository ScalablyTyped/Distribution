package typings.normalizeForSearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Un-accents and un-umlauts characters in a string. Also preliminary converts the string to lower
    * case.
    *
    * @example
    * import normalizeForSearch = require('normalize-for-search');
    *
    * normalizeForSearch('Dät ist naïve und ÜBERCOOL, ё-маё!');
    * // => 'daet ist naive und uebercool, е-мае!'
    */
  inline def apply(searchString: String): String = ^.asInstanceOf[js.Dynamic].apply(searchString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("normalize-for-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
