package typings.officeUiFabricReact.mod

import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Stylesheet")
@js.native
class Stylesheet ()
  extends typings.officeUiFabricReact.stylingMod.Stylesheet {
  def this(config: IStyleSheetConfig) = this()
}
/* static members */
object Stylesheet {
  
  @JSImport("office-ui-fabric-react", "Stylesheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the singleton instance.
    */
  @scala.inline
  def getInstance(): typings.uifabricMergeStyles.stylesheetMod.Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.uifabricMergeStyles.stylesheetMod.Stylesheet]
}
