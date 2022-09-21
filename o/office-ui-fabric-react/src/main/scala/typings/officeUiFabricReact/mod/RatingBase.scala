package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.ratingTypesMod.IRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "RatingBase")
@js.native
open class RatingBase protected ()
  extends typings.officeUiFabricReact.libRatingMod.RatingBase {
  def this(props: IRatingProps) = this()
}
/* static members */
object RatingBase {
  
  @JSImport("office-ui-fabric-react", "RatingBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "RatingBase.defaultProps")
  @js.native
  def defaultProps: IRatingProps = js.native
  inline def defaultProps_=(x: IRatingProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
