package typings.pixiAssets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsConvertToListMod {
  
  @JSImport("@pixi/assets/lib/utils/convertToList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToList[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: T, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T], transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
