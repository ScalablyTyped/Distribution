package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merge extends StObject {
  
  var merge: String
}
object Merge {
  
  inline def apply(merge: String): Merge = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Merge] (val x: Self) extends AnyVal {
    
    inline def setMerge(value: String): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
  }
}
