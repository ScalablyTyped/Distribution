package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDotbaseMod.IDetailsRowState
import typings.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DetailsRowBase")
@js.native
open class DetailsRowBase protected ()
  extends typings.officeUiFabricReact.libDetailsListMod.DetailsRowBase {
  def this(props: IDetailsRowBaseProps) = this()
}
/* static members */
object DetailsRowBase {
  
  @JSImport("office-ui-fabric-react", "DetailsRowBase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsRowState]
}
