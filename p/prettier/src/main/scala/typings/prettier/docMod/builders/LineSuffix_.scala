package typings.prettier.docMod.builders

import typings.prettier.prettierStrings.`line-suffix`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSuffix_
  extends StObject
     with DocCommand {
  
  var contents: Doc
  
  var `type`: `line-suffix`
}
object LineSuffix_ {
  
  inline def apply(contents: Doc): LineSuffix_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line-suffix")
    __obj.asInstanceOf[LineSuffix_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSuffix_] (val x: Self) extends AnyVal {
    
    inline def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: Any*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setType(value: `line-suffix`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
