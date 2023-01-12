package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PkFactory extends StObject {
  
  def createPk(): Any
}
object PkFactory {
  
  inline def apply(createPk: () => Any): PkFactory = {
    val __obj = js.Dynamic.literal(createPk = js.Any.fromFunction0(createPk))
    __obj.asInstanceOf[PkFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PkFactory] (val x: Self) extends AnyVal {
    
    inline def setCreatePk(value: () => Any): Self = StObject.set(x, "createPk", js.Any.fromFunction0(value))
  }
}
