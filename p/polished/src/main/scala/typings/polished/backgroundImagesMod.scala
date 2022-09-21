package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundImagesMod {
  
  @JSImport("polished/lib/shorthands/backgroundImages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(properties: String*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
}
