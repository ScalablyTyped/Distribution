package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Side extends StObject {
  
  /** @description Text of the review comment. */
  var body: String
  
  /** @example 28 */
  var line: js.UndefOr[Double] = js.undefined
  
  /** @description The relative path to the file that necessitates a review comment. */
  var path: String
  
  /** @description The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note below. */
  var position: js.UndefOr[Double] = js.undefined
  
  /** @example RIGHT */
  var side: js.UndefOr[String] = js.undefined
  
  /** @example 26 */
  var start_line: js.UndefOr[Double] = js.undefined
  
  /** @example LEFT */
  var start_side: js.UndefOr[String] = js.undefined
}
object Side {
  
  inline def apply(body: String, path: String): Side = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Side]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Side] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setStart_lineUndefined: Self = StObject.set(x, "start_line", js.undefined)
    
    inline def setStart_side(value: String): Self = StObject.set(x, "start_side", value.asInstanceOf[js.Any])
    
    inline def setStart_sideUndefined: Self = StObject.set(x, "start_side", js.undefined)
  }
}
