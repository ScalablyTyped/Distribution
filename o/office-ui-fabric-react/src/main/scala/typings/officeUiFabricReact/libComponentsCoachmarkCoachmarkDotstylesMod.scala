package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkStyleProps
import typings.officeUiFabricReact.libComponentsCoachmarkCoachmarkDottypesMod.ICoachmarkStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCoachmarkCoachmarkDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.styles", "COACHMARK_HEIGHT")
  @js.native
  val COACHMARK_HEIGHT: /* 32 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.styles", "COACHMARK_WIDTH")
  @js.native
  val COACHMARK_WIDTH: /* 32 */ Double = js.native
  
  inline def getStyles(props: ICoachmarkStyleProps): ICoachmarkStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICoachmarkStyles]
  
  inline def rotateOne(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateOne")().asInstanceOf[String]
  
  inline def scaleOne(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleOne")().asInstanceOf[String]
  
  inline def translateOne(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("translateOne")().asInstanceOf[String]
}
