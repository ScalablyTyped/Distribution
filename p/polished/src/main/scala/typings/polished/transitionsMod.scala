package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionsMod {
  
  @JSImport("polished/lib/shorthands/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(properties: (String | js.Array[String])*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
}
