package typings.officeUiFabricReact.announcedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Announced/Announced.types.IAnnouncedProps, 'className'> */
trait IAnnouncedStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object IAnnouncedStyleProps {
  @scala.inline
  def apply(className: String = null): IAnnouncedStyleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedStyleProps]
  }
}

