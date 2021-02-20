package typings.pngjs

import typings.node.Buffer
import typings.node.zlibMod.Deflate_
import typings.node.zlibMod.ZlibOptions
import typings.pngjs.mod.PNG
import typings.pngjs.mod.PNGWithMetadata
import typings.pngjs.mod.PackerOptions
import typings.pngjs.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Blue extends StObject {
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object Blue {
    
    @scala.inline
    def apply(blue: Double, green: Double, red: Double): Blue = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blue]
    }
    
    @scala.inline
    implicit class BlueMutableBuilder[Self <: Blue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Deflate_ = js.native
    def apply(options: ZlibOptions): Deflate_ = js.native
  }
  
  @js.native
  trait Read extends StObject {
    
    def read(buffer: Buffer): PNGWithMetadata = js.native
    def read(buffer: Buffer, options: ParserOptions): PNGWithMetadata = js.native
    
    def write(png: PNG): Buffer = js.native
    def write(png: PNG, options: PackerOptions): Buffer = js.native
  }
}
