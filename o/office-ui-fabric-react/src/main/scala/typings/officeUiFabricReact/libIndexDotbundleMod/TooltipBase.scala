package typings.officeUiFabricReact.libIndexDotbundleMod

import typings.officeUiFabricReact.anon.PartialITooltipProps
import typings.officeUiFabricReact.libComponentsTooltipTooltipDottypesMod.ITooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "TooltipBase")
@js.native
open class TooltipBase protected ()
  extends typings.officeUiFabricReact.mod.TooltipBase {
  def this(props: ITooltipProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: ITooltipProps, context: Any) = this()
}
/* static members */
object TooltipBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "TooltipBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "TooltipBase.defaultProps")
  @js.native
  def defaultProps: PartialITooltipProps = js.native
  inline def defaultProps_=(x: PartialITooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
