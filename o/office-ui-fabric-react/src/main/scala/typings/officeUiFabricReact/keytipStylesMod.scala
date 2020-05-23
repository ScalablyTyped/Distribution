package typings.officeUiFabricReact

import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyles
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunction
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Keytip/Keytip.styles", JSImport.Namespace)
@js.native
object keytipStylesMod extends js.Object {
  def getCalloutOffsetStyles(offset: Point): IStyleFunction[ICalloutContentStyleProps, ICalloutContentStyles] = js.native
  def getCalloutStyles(props: ICalloutContentStyleProps): ICalloutContentStyles = js.native
  def getStyles(props: IKeytipStyleProps): IKeytipStyles = js.native
}

