package typings.playable

import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateClassNamesMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/utils/generateClassNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(rules: ICSSRules): IStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rules.asInstanceOf[js.Any]).asInstanceOf[IStyles]
}
