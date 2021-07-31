package typings.officeUiFabricReact

import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyles
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunction
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Keytip/Keytip.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCalloutOffsetStyles(offset: Point): IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalloutOffsetStyles")(offset.asInstanceOf[js.Any]).asInstanceOf[IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles]]
  
  @scala.inline
  def getCalloutStyles(props: ICalloutContentStyleProps): ICalloutContentStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalloutStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICalloutContentStyles]
  
  @scala.inline
  def getStyles(props: IKeytipStyleProps): IKeytipStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IKeytipStyles]
}
