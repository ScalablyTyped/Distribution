package typings.ndjson

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndjson", "parse")
  @js.native
  def parse(): ThroughStream = js.native
  @JSImport("ndjson", "parse")
  @js.native
  def parse(opts: ParseOptions): ThroughStream = js.native
  
  @JSImport("ndjson", "stringify")
  @js.native
  def stringify(): Transform = js.native
  @JSImport("ndjson", "stringify")
  @js.native
  def stringify(opts: DuplexOptions): Transform = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
