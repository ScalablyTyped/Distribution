package typings.parseley

import typings.parseley.libAstMod.CompoundSelector
import typings.parseley.libAstMod.ListSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserMod {
  
  @JSImport("parseley/lib/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): ListSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ListSelector]
  
  inline def parse1(str: String): CompoundSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("parse1")(str.asInstanceOf[js.Any]).asInstanceOf[CompoundSelector]
}
