package typings.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import typings.officeUiFabricReact.modalTypesMod.IModalProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/Modal", JSImport.Default)
  @js.native
  val default: FunctionComponent[IModalProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Modal", "Modal")
  @js.native
  val Modal: FunctionComponent[IModalProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Modal", "ModalBase")
  @js.native
  open class ModalBase protected ()
    extends typings.officeUiFabricReact.modalMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  /* static members */
  object ModalBase {
    
    @JSImport("office-ui-fabric-react/lib/Modal", "ModalBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Modal", "ModalBase.defaultProps")
    @js.native
    def defaultProps: IModalProps = js.native
    inline def defaultProps_=(x: IModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type _To = FunctionComponent[IModalProps]
  
  /* This means you don't have to write `default`, but can instead just say `libModalMod.foo` */
  override def _to: FunctionComponent[IModalProps] = default
}
