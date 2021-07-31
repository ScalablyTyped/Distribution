package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.activityItemTypesMod.IActivityItemStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityItemStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ActivityItem/ActivityItem.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(
    theme: js.UndefOr[ITheme],
    customStyles: js.UndefOr[IActivityItemStyles],
    animateBeaconSignal: js.UndefOr[Boolean],
    beaconColorOne: js.UndefOr[String],
    beaconColorTwo: js.UndefOr[String],
    isCompact: js.UndefOr[Boolean]
  ): IActivityItemStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], animateBeaconSignal.asInstanceOf[js.Any], beaconColorOne.asInstanceOf[js.Any], beaconColorTwo.asInstanceOf[js.Any], isCompact.asInstanceOf[js.Any])).asInstanceOf[IActivityItemStyles]
}
