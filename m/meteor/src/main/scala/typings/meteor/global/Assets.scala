package typings.meteor.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Assets {
  
  @JSGlobal("Assets")
  @js.native
  val ^ : js.Any = js.native
  
  inline def absoluteFilePath(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFilePath")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBinary(assetPath: String): js.UndefOr[typings.meteor.EJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.meteor.EJSON]]
  inline def getBinary(assetPath: String, asyncCallback: js.Function): js.UndefOr[typings.meteor.EJSON] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.meteor.EJSON]]
  
  inline def getText(assetPath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getText(assetPath: String, asyncCallback: js.Function): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
