package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.datePickerTypesMod.IDatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DatePickerBase")
@js.native
open class DatePickerBase protected ()
  extends typings.officeUiFabricReact.libDatePickerMod.DatePickerBase {
  def this(props: IDatePickerProps) = this()
}
/* static members */
object DatePickerBase {
  
  @JSImport("office-ui-fabric-react", "DatePickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "DatePickerBase.defaultProps")
  @js.native
  def defaultProps: IDatePickerProps = js.native
  inline def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
