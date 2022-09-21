package typings.micromarkUtilClassifyCharacter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-classify-character", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classifyCharacter(code: Code): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("classifyCharacter")(code.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  type Code = typings.micromarkUtilTypes.mod.Code
}
