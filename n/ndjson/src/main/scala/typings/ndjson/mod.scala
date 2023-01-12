package typings.ndjson

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndjson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): ThroughStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[ThroughStream]
  inline def parse(opts: ParseOptions): ThroughStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(opts.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  
  inline def stringify(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Transform]
  inline def stringify(opts: DuplexOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  trait ParseOptions extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
