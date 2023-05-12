package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.Domain
import typings.miscUtilsOfMineGeneric.anon.ParseBoolean
import typings.miscUtilsOfMineGeneric.anon.ParseParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUrlMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileNameFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileNameFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParametersFromUrl(url: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParametersFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def getParametersFromUrl(url: String, options: ParseBoolean): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersFromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def isAbsoluteUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseUrl(url: String): Domain | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Domain | Null]
  inline def parseUrl(url: String, options: ParseParams): Domain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Domain | Null]
}
