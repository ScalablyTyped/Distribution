package typings.navigatorLanguagesParser

import typings.navigatorLanguagesParser.navigatorLanguagesParserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("navigator-languages-parser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NavigatorLanguagesParser
  @JSImport("navigator-languages-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getUsersPreferredLanguages(): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getUsersPreferredLanguages")().asInstanceOf[js.UndefOr[js.Array[String]]]
  
  /* static member */
  inline def parseLanguages(acceptedLangs: js.Array[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLanguages")(acceptedLangs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  /* static member */
  inline def parseLanguages(acceptedLangs: js.Array[String], defaultLang: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLanguages")(acceptedLangs.asInstanceOf[js.Any], defaultLang.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseLanguages_false(acceptedLangs: js.Array[String], defaultLang: `false`): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLanguages")(acceptedLangs.asInstanceOf[js.Any], defaultLang.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait NavigatorLanguagesParser extends StObject
}
