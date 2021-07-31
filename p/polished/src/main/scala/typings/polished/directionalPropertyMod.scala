package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionalPropertyMod {
  
  @JSImport("polished/lib/helpers/directionalProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(property: String, values: (Null | Unit | String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(property.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
}
