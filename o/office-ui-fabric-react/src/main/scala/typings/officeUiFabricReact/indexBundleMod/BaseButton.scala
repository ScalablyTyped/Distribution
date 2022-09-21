package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.PartialIBaseButtonProps
import typings.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "BaseButton")
@js.native
open class BaseButton protected ()
  extends typings.officeUiFabricReact.mod.BaseButton {
  def this(props: IBaseButtonProps) = this()
}
/* static members */
object BaseButton {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BaseButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BaseButton.defaultProps")
  @js.native
  def defaultProps: PartialIBaseButtonProps = js.native
  inline def defaultProps_=(x: PartialIBaseButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
