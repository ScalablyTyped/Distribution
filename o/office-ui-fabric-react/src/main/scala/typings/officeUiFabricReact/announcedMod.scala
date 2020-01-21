package typings.officeUiFabricReact

import typings.officeUiFabricReact.announcedTypesMod.IAnnouncedProps
import typings.react.mod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Announced", JSImport.Namespace)
@js.native
object announcedMod extends js.Object {
  @js.native
  class AnnouncedBase ()
    extends typings.officeUiFabricReact.announcedBaseMod.AnnouncedBase
  
  val Announced: StatelessComponent[IAnnouncedProps] = js.native
  /* static members */
  @js.native
  object AnnouncedBase extends js.Object {
    var defaultProps: Partial[IAnnouncedProps] = js.native
  }
  
}

