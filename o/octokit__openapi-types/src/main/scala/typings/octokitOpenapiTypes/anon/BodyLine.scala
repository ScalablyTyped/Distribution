package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyLine extends StObject {
  
  /** @description The contents of the comment. */
  var body: String
  
  /** @description **Deprecated**. Use **position** parameter instead. Line number in the file to comment on. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** @description Relative path of the file to comment on. */
  var path: js.UndefOr[String] = js.undefined
  
  /** @description Line index in the diff to comment on. */
  var position: js.UndefOr[Double] = js.undefined
}
object BodyLine {
  
  inline def apply(body: String): BodyLine = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyLine]
  }
  
  extension [Self <: BodyLine](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
