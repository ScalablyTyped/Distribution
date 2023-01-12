package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base.IColorRectangleState> */
trait ReadonlyIColorRectangleSt extends StObject {
  
  val color: IColor
}
object ReadonlyIColorRectangleSt {
  
  inline def apply(color: IColor): ReadonlyIColorRectangleSt = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorRectangleSt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyIColorRectangleSt] (val x: Self) extends AnyVal {
    
    inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
