package typings.micromarkUtilClassifyCharacter

import typings.micromarkUtilClassifyCharacter.micromarkUtilClassifyCharacterInts.`1`
import typings.micromarkUtilClassifyCharacter.micromarkUtilClassifyCharacterInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-classify-character", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classifyCharacter(code: Code): js.UndefOr[`1` | `2`] = ^.asInstanceOf[js.Dynamic].applyDynamic("classifyCharacter")(code.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`1` | `2`]]
  
  type Code = typings.micromarkUtilTypes.mod.Code
}
