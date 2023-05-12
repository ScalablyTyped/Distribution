package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.ISpinnerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSpinnerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "Spinner")
  @js.native
  val Spinner: FunctionComponent[ISpinnerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerBase")
  @js.native
  open class SpinnerBase protected ()
    extends typings.officeUiFabricReact.libComponentsSpinnerSpinnerDotbaseMod.SpinnerBase {
    def this(props: ISpinnerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ISpinnerProps, context: Any) = this()
  }
  /* static members */
  object SpinnerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerBase.defaultProps")
    @js.native
    def defaultProps: ISpinnerProps = js.native
    inline def defaultProps_=(x: ISpinnerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerSize")
  @js.native
  object SpinnerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize & Double
      ] = js.native
    
    /* 3 */ val large: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.large & Double = js.native
    
    /* 2 */ val medium: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.medium & Double = js.native
    
    /* 1 */ val small: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.small & Double = js.native
    
    /* 0 */ val xSmall: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.xSmall & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner", "SpinnerType")
  @js.native
  object SpinnerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerType & Double
      ] = js.native
    
    /* 1 */ val large: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerType.large & Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerType.normal & Double = js.native
  }
}
