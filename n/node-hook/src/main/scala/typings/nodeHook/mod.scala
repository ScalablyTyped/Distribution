package typings.nodeHook

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-hook", JSImport.Namespace)
  @js.native
  val ^ : NodeHook = js.native
  
  @js.native
  trait NodeHook extends StObject {
    
    def hook(extension: String, transform: Transform): Unit = js.native
    def hook(extension: String, transform: Transform, options: Options): Unit = js.native
    def hook(transform: Transform): Unit = js.native
    def hook(transform: Transform, _underscore: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    
    def unhook(): Unit = js.native
    def unhook(extension: String): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type Transform = js.Function2[/* source */ String, /* filename */ String, String]
  
  type _To = NodeHook
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NodeHook = ^
}
