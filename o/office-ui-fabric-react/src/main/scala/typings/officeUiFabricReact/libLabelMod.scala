package typings.officeUiFabricReact

import typings.officeUiFabricReact.labelTypesMod.ILabelProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLabelMod {
  
  @JSImport("office-ui-fabric-react/lib/Label", "Label")
  @js.native
  val Label: FunctionComponent[ILabelProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Label", "LabelBase")
  @js.native
  class LabelBase protected ()
    extends typings.officeUiFabricReact.labelMod.LabelBase {
    def this(props: ILabelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ILabelProps, context: js.Any) = this()
  }
}
