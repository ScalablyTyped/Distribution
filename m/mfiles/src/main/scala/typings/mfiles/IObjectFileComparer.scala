package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFileComparer extends StObject {
  
  def Compare(FileLeft: IObjectFile, FileRight: IObjectFile): Double
}
object IObjectFileComparer {
  
  inline def apply(Compare: (IObjectFile, IObjectFile) => Double): IObjectFileComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
    __obj.asInstanceOf[IObjectFileComparer]
  }
  
  extension [Self <: IObjectFileComparer](x: Self) {
    
    inline def setCompare(value: (IObjectFile, IObjectFile) => Double): Self = StObject.set(x, "Compare", js.Any.fromFunction2(value))
  }
}
