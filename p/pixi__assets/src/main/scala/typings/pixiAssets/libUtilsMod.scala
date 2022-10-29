package typings.pixiAssets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("@pixi/assets/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToList[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: T, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T], transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def createStringVariations(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringVariations")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isSingleItem(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
