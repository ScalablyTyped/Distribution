package typings.officeUiFabricReact.activityItemClassNamesMod

import typings.officeUiFabricReact.activityItemTypesMod.IActivityItemStyles
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ActivityItem/ActivityItem.classNames", "getClassNames")
@js.native
object getClassNames extends js.Object {
  def apply(
    styles: IActivityItemStyles,
    className: String,
    activityPersonas: js.Array[IPersonaProps],
    isCompact: Boolean
  ): IActivityItemClassNames = js.native
}

