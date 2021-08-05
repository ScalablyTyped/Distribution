package typings.officeUiFabricReact.indexBundleMod

import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "Stylesheet")
@js.native
class Stylesheet ()
  extends typings.officeUiFabricReact.mod.Stylesheet {
  def this(config: IStyleSheetConfig) = this()
}
/* static members */
object Stylesheet {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Stylesheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the singleton instance.
    */
  inline def getInstance(): typings.uifabricMergeStyles.stylesheetMod.Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.uifabricMergeStyles.stylesheetMod.Stylesheet]
}
