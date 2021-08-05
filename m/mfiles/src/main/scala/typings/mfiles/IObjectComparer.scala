package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectComparer extends StObject {
  
  def Compare(ObjectVersionDataLeft: IObjectVersion, ObjectVersionDataRight: IObjectVersion): Double
}
object IObjectComparer {
  
  inline def apply(Compare: (IObjectVersion, IObjectVersion) => Double): IObjectComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
    __obj.asInstanceOf[IObjectComparer]
  }
  
  extension [Self <: IObjectComparer](x: Self) {
    
    inline def setCompare(value: (IObjectVersion, IObjectVersion) => Double): Self = StObject.set(x, "Compare", js.Any.fromFunction2(value))
  }
}
