package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsActivityItemActivityItemDotclassNamesMod.IActivityItemClassNames
import typings.officeUiFabricReact.libComponentsActivityItemActivityItemDottypesMod.IActivityItemProps
import typings.officeUiFabricReact.libComponentsActivityItemActivityItemDottypesMod.IActivityItemStyles
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsActivityItemMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ActivityItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ActivityItem", "ActivityItem")
  @js.native
  open class ActivityItem protected ()
    extends typings.officeUiFabricReact.libComponentsActivityItemActivityItemMod.ActivityItem {
    def this(props: IActivityItemProps) = this()
  }
  
  inline def getActivityItemClassNames(
    styles: IActivityItemStyles,
    className: String,
    activityPersonas: js.Array[IPersonaProps],
    isCompact: Boolean
  ): IActivityItemClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivityItemClassNames")(styles.asInstanceOf[js.Any], className.asInstanceOf[js.Any], activityPersonas.asInstanceOf[js.Any], isCompact.asInstanceOf[js.Any])).asInstanceOf[IActivityItemClassNames]
  
  inline def getActivityItemStyles(
    theme: js.UndefOr[ITheme],
    customStyles: js.UndefOr[IActivityItemStyles],
    animateBeaconSignal: js.UndefOr[Boolean],
    beaconColorOne: js.UndefOr[String],
    beaconColorTwo: js.UndefOr[String],
    isCompact: js.UndefOr[Boolean]
  ): IActivityItemStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivityItemStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], animateBeaconSignal.asInstanceOf[js.Any], beaconColorOne.asInstanceOf[js.Any], beaconColorTwo.asInstanceOf[js.Any], isCompact.asInstanceOf[js.Any])).asInstanceOf[IActivityItemStyles]
}
