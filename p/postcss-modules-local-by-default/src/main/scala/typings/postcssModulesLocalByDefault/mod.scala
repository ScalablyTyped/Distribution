package typings.postcssModulesLocalByDefault

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.global
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.local
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.pure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-modules-local-by-default", JSImport.Namespace)
  @js.native
  val ^ : LocalByDefault = js.native
  
  type LocalByDefault = Plugin_[Options]
  
  @js.native
  trait Options extends StObject {
    
    var mode: js.UndefOr[global | local | pure] = js.native
    
    var rewriteUrl: js.UndefOr[js.Function2[/* global */ Boolean, /* url */ String, String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: global | local | pure): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setRewriteUrl(value: (/* global */ Boolean, /* url */ String) => String): Self = StObject.set(x, "rewriteUrl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRewriteUrlUndefined: Self = StObject.set(x, "rewriteUrl", js.undefined)
    }
  }
  
  type _To = LocalByDefault
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LocalByDefault = ^
}
