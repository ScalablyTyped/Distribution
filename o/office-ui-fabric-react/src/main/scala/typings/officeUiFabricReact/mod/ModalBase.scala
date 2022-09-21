package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.modalTypesMod.IModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ModalBase")
@js.native
open class ModalBase protected ()
  extends typings.officeUiFabricReact.libModalMod.ModalBase {
  def this(props: IModalProps) = this()
}
/* static members */
object ModalBase {
  
  @JSImport("office-ui-fabric-react", "ModalBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ModalBase.defaultProps")
  @js.native
  def defaultProps: IModalProps = js.native
  inline def defaultProps_=(x: IModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
