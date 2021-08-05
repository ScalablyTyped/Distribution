package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Previews extends StObject {
  
  /**
    * `json` by default. Can be `raw`, `text`, `html`, `full`, `diff`, `patch`, `sha`, `base64`. Depending on endpoint
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Custom media type names of {@link https://developer.github.com/v3/media/|API Previews} without the `-preview` suffix.
    * Example for single preview: `['squirrel-girl']`.
    * Example for multiple previews: `['squirrel-girl', 'mister-fantastic']`.
    */
  var previews: js.UndefOr[js.Array[String]] = js.undefined
}
object Previews {
  
  inline def apply(): Previews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Previews]
  }
  
  extension [Self <: Previews](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPreviews(value: js.Array[String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
    
    inline def setPreviewsUndefined: Self = StObject.set(x, "previews", js.undefined)
    
    inline def setPreviewsVarargs(value: String*): Self = StObject.set(x, "previews", js.Array(value :_*))
  }
}
