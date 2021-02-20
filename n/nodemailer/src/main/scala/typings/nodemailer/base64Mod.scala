package typings.nodemailer

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base64Mod {
  
  @JSImport("nodemailer/lib/base64", "Encoder")
  @js.native
  class Encoder () extends Transform {
    def this(options: EncoderOptions) = this()
    
    var inputBytes: Double = js.native
    
    var options: EncoderOptions = js.native
    
    var outputBytes: Double = js.native
  }
  
  @JSImport("nodemailer/lib/base64", "encode")
  @js.native
  def encode(buffer: String): String = js.native
  @JSImport("nodemailer/lib/base64", "encode")
  @js.native
  def encode(buffer: Buffer): String = js.native
  
  @JSImport("nodemailer/lib/base64", "wrap")
  @js.native
  def wrap(str: String): String = js.native
  @JSImport("nodemailer/lib/base64", "wrap")
  @js.native
  def wrap(str: String, lineLength: Double): String = js.native
  
  @js.native
  trait EncoderOptions extends TransformOptions {
    
    var lineLength: js.UndefOr[Double | `false`] = js.native
  }
  object EncoderOptions {
    
    @scala.inline
    def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    @scala.inline
    implicit class EncoderOptionsMutableBuilder[Self <: EncoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineLength(value: Double | `false`): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    }
  }
}
