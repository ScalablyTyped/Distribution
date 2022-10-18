package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uniques extends StObject {
  
  /** @example 3542 */
  var count: Double
  
  /** @example /github/hubot */
  var path: String
  
  /** @example github/hubot: A customizable life embetterment robot. */
  var title: String
  
  /** @example 2225 */
  var uniques: Double
}
object Uniques {
  
  inline def apply(count: Double, path: String, title: String, uniques: Double): Uniques = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uniques]
  }
  
  extension [Self <: Uniques](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}
