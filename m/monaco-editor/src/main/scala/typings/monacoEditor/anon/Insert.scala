package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insert extends StObject {
  
  var insert: IRange
  
  var replace: IRange
}
object Insert {
  
  inline def apply(insert: IRange, replace: IRange): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
  
  extension [Self <: Insert](x: Self) {
    
    inline def setInsert(value: IRange): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: IRange): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
