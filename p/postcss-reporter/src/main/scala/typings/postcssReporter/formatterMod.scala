package typings.postcssReporter

import typings.postcssReporter.anon.Messages
import typings.postcssReporter.mod.DefaultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @scala.inline
  def apply(): js.Function1[/* input */ js.UndefOr[Messages], String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* input */ js.UndefOr[Messages], String]]
  @scala.inline
  def apply(options: DefaultOptions): js.Function1[/* input */ js.UndefOr[Messages], String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ js.UndefOr[Messages], String]]
  
  @JSImport("postcss-reporter/lib/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
