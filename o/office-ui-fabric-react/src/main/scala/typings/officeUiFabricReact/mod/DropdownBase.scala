package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.Options
import typings.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DropdownBase")
@js.native
open class DropdownBase protected ()
  extends typings.officeUiFabricReact.libDropdownMod.DropdownBase {
  def this(props: IDropdownProps) = this()
}
/* static members */
object DropdownBase {
  
  @JSImport("office-ui-fabric-react", "DropdownBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "DropdownBase.defaultProps")
  @js.native
  def defaultProps: Options = js.native
  inline def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
