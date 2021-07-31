package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.detailsRowBaseMod.IDetailsRowState
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "DetailsRowBase")
@js.native
class DetailsRowBase protected ()
  extends typings.officeUiFabricReact.mod.DetailsRowBase {
  def this(props: IDetailsRowBaseProps) = this()
}
/* static members */
object DetailsRowBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "DetailsRowBase")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsRowState]
}
