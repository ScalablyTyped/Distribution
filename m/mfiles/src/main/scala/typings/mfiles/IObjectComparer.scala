package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectComparer extends StObject {
  
  def Compare(ObjectVersionDataLeft: IObjectVersion, ObjectVersionDataRight: IObjectVersion): Double
}
object IObjectComparer {
  
  @scala.inline
  def apply(Compare: (IObjectVersion, IObjectVersion) => Double): IObjectComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
    __obj.asInstanceOf[IObjectComparer]
  }
  
  @scala.inline
  implicit class IObjectComparerMutableBuilder[Self <: IObjectComparer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: (IObjectVersion, IObjectVersion) => Double): Self = StObject.set(x, "Compare", js.Any.fromFunction2(value))
  }
}
