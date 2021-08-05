package typings.pickDeep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: js.Object, paths: String): js.Object = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def apply(obj: js.Object, paths: String, separator: String): js.Object = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def apply(obj: js.Object, paths: js.Array[String | js.Array[String]]): js.Object = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def apply(obj: js.Object, paths: js.Array[String | js.Array[String]], separator: String): js.Object = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @JSImport("pick-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
