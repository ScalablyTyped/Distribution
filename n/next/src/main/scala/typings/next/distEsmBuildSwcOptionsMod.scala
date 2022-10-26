package typings.next

import typings.next.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmBuildSwcOptionsMod {
  
  @JSImport("next/dist/esm/build/swc/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getJestSWCOptions(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestSWCOptions")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def getLoaderSWCOptions(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoaderSWCOptions")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def getParserOptions(options: Dictkey): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParserOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
