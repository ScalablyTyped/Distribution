package typings.pixiAssets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("@pixi/assets/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDataUrl(url: String, mimes: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataUrl")(url.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkDataUrl(url: String, mimes: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataUrl")(url.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkExtension(url: String, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkExtension(url: String, `extension`: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def convertToList[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: T, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T], transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def copySearchParams(targetUrl: String, sourceUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copySearchParams")(targetUrl.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createStringVariations(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringVariations")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isSingleItem(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
