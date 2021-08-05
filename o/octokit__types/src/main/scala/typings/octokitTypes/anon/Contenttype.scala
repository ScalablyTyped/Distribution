package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`textSlashplainSemicolon charsetEqualssignutf-8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contenttype extends StObject {
  
  var `content-type`: `textSlashplainSemicolon charsetEqualssignutf-8`
}
object Contenttype {
  
  inline def apply(): Contenttype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-type")("text/plain; charset=utf-8")
    __obj.asInstanceOf[Contenttype]
  }
  
  extension [Self <: Contenttype](x: Self) {
    
    inline def `setContent-type`(value: `textSlashplainSemicolon charsetEqualssignutf-8`): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
  }
}
