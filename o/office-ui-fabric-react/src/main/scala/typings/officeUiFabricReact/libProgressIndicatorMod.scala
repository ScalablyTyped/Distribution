package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Description
import typings.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressIndicatorMod {
  
  @JSImport("office-ui-fabric-react/lib/ProgressIndicator", "ProgressIndicator")
  @js.native
  val ProgressIndicator: FunctionComponent[IProgressIndicatorProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ProgressIndicator", "ProgressIndicatorBase")
  @js.native
  class ProgressIndicatorBase protected ()
    extends typings.officeUiFabricReact.progressIndicatorMod.ProgressIndicatorBase {
    def this(props: IProgressIndicatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IProgressIndicatorProps, context: js.Any) = this()
  }
  /* static members */
  object ProgressIndicatorBase {
    
    @JSImport("office-ui-fabric-react/lib/ProgressIndicator", "ProgressIndicatorBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/ProgressIndicator", "ProgressIndicatorBase.defaultProps")
    @js.native
    def defaultProps: Description = js.native
    @scala.inline
    def defaultProps_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
