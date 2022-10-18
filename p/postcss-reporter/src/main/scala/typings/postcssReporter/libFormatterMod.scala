package typings.postcssReporter

import typings.postcssReporter.anon.Messages
import typings.postcssReporter.mod.DefaultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterMod {
  
  inline def apply(): js.Function1[/* input */ Messages, String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* input */ Messages, String]]
  inline def apply(options: DefaultOptions): js.Function1[/* input */ Messages, String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ Messages, String]]
  
  @JSImport("postcss-reporter/lib/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
