package typings.polished

import typings.polished.styleMod.Styles
import typings.polished.triangleConfigurationMod.TriangleConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangleMod {
  
  @JSImport("polished/lib/mixins/triangle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasPointingDirectionHeightWidthForegroundColorBackgroundColor: TriangleConfiguration): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPointingDirectionHeightWidthForegroundColorBackgroundColor.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
