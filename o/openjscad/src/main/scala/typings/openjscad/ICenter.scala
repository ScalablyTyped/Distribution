package typings.openjscad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICenter extends StObject {
  
  def center(cAxes: js.Array[String]): CxG = js.native
}
object ICenter {
  
  @scala.inline
  def apply(center: js.Array[String] => CxG): ICenter = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction1(center))
    __obj.asInstanceOf[ICenter]
  }
  
  @scala.inline
  implicit class ICenterMutableBuilder[Self <: ICenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: js.Array[String] => CxG): Self = StObject.set(x, "center", js.Any.fromFunction1(value))
  }
}
