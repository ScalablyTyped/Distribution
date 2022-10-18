package typings.officeUiFabricReact.mod

import typings.uifabricMergeStyles.libStylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Stylesheet")
@js.native
open class Stylesheet ()
  extends typings.officeUiFabricReact.libStylingMod.Stylesheet {
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
  inline def getInstance(): typings.uifabricMergeStyles.libStylesheetMod.Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.uifabricMergeStyles.libStylesheetMod.Stylesheet]
}
