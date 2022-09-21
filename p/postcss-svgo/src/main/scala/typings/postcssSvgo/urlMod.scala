package typings.postcssSvgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("postcss-svgo/types/lib/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-svgo/types/lib/url", "decode")
  @js.native
  val decode: js.Function1[/* encodedURIComponent */ String, String] = js.native
  
  inline def encode(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
