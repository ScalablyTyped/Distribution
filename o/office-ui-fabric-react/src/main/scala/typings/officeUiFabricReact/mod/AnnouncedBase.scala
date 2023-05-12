package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.libComponentsAnnouncedAnnouncedDottypesMod.IAnnouncedProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "AnnouncedBase")
@js.native
open class AnnouncedBase protected ()
  extends typings.officeUiFabricReact.libAnnouncedMod.AnnouncedBase {
  def this(props: IAnnouncedProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: IAnnouncedProps, context: Any) = this()
}
/* static members */
object AnnouncedBase {
  
  @JSImport("office-ui-fabric-react", "AnnouncedBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "AnnouncedBase.defaultProps")
  @js.native
  def defaultProps: Partial[IAnnouncedProps] = js.native
  inline def defaultProps_=(x: Partial[IAnnouncedProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
