package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base.IColorRectangleState> */
@js.native
trait ReadonlyIColorRectangleSt extends StObject {
  
  val color: IColor = js.native
}
object ReadonlyIColorRectangleSt {
  
  @scala.inline
  def apply(color: IColor): ReadonlyIColorRectangleSt = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorRectangleSt]
  }
  
  @scala.inline
  implicit class ReadonlyIColorRectangleStMutableBuilder[Self <: ReadonlyIColorRectangleSt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
