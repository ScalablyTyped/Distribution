package typings.ow

import typings.ow.owStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidIdentifierMod {
  
  @JSImport("ow/dist/source/utils/is-valid-identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[Boolean | _empty] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[Boolean | _empty]]
  inline def default(string: String): js.UndefOr[Boolean | _empty] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean | _empty]]
}
