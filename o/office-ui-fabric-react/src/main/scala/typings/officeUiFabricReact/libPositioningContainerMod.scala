package typings.officeUiFabricReact

import typings.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPositioningContainerMod {
  
  @JSImport("office-ui-fabric-react/lib/PositioningContainer", "PositioningContainer")
  @js.native
  class PositioningContainer protected () extends StObject {
    def this(props: IPositioningContainerProps) = this()
  }
  /* static members */
  object PositioningContainer {
    
    @JSImport("office-ui-fabric-react/lib/PositioningContainer", "PositioningContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/PositioningContainer", "PositioningContainer.defaultProps")
    @js.native
    def defaultProps: IPositioningContainerProps = js.native
    @scala.inline
    def defaultProps_=(x: IPositioningContainerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
