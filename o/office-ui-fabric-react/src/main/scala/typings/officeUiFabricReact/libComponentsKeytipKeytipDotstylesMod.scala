package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutContentStyles
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyleProps
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyles
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunction
import typings.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsKeytipKeytipDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Keytip/Keytip.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCalloutOffsetStyles(offset: Point): IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalloutOffsetStyles")(offset.asInstanceOf[js.Any]).asInstanceOf[IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles]]
  
  inline def getCalloutStyles(props: ICalloutContentStyleProps): ICalloutContentStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalloutStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICalloutContentStyles]
  
  inline def getStyles(props: IKeytipStyleProps): IKeytipStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IKeytipStyles]
}
