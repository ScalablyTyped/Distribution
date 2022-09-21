package typings.nivoGenerators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@nivo/generators/dist/types/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randColor")().asInstanceOf[String]
}
