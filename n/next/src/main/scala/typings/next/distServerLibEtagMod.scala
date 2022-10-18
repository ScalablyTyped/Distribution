package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibEtagMod {
  
  @JSImport("next/dist/server/lib/etag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fnv1a52(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fnv1a52")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def generateETag(payload: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateETag")(payload.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateETag(payload: String, weak: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateETag")(payload.asInstanceOf[js.Any], weak.asInstanceOf[js.Any])).asInstanceOf[String]
}
