package typings.mongodb.anon

import typings.mongodb.mongodbInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inline extends StObject {
  
  var `inline`: `1`
}
object Inline {
  
  inline def apply(): Inline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inline")(1)
    __obj.asInstanceOf[Inline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inline] (val x: Self) extends AnyVal {
    
    inline def setInline(value: `1`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
  }
}
