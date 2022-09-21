package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listToArrayMod {
  
  inline def apply(list: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(list: String, opt_separator: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], opt_separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(list: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(list: js.Array[String], opt_separator: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], opt_separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("@nginstack/engine/lib/array/listToArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
