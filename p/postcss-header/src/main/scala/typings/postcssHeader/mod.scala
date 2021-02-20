package typings.postcssHeader

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-header", JSImport.Namespace)
  @js.native
  val ^ : Header = js.native
  
  type Header = Plugin_[Options]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The string which will be put at the beginning of the css file.
      */
    var banner: js.UndefOr[String] = js.native
    
    /**
      * The string which will be put at the beginning of the css file.
      * @default ''
      */
    var header: js.UndefOr[String] = js.native
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
      def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  type _To = Header
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Header = ^
}
