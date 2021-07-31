package typings.nodeJose.mod

import typings.node.Buffer
import typings.nodeJose.mod.JWE.DecryptResult
import typings.nodeJose.mod.JWK.KeyStore
import typings.nodeJose.mod.JWS.VerificationResult
import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parse {
  
  @scala.inline
  def apply(input: String): ParseReturn = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  @scala.inline
  def apply(input: js.Object): ParseReturn = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  @scala.inline
  def apply(input: Buffer): ParseReturn = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  
  @JSImport("node-jose", "parse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compact(input: String): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  @scala.inline
  def compact(input: js.Object): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  @scala.inline
  def compact(input: Buffer): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  
  @scala.inline
  def json(input: String): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  @scala.inline
  def json(input: js.Object): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  @scala.inline
  def json(input: Buffer): ParseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(input.asInstanceOf[js.Any]).asInstanceOf[ParseReturn]
  
  trait ParseReturn extends StObject {
    
    var format: compact | json
    
    var header: js.Object
    
    var input: Buffer | String | js.Object
    
    def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
    
    var `type`: typings.nodeJose.nodeJoseStrings.JWS | typings.nodeJose.nodeJoseStrings.JWE
  }
  object ParseReturn {
    
    @scala.inline
    def apply(
      format: compact | json,
      header: js.Object,
      input: Buffer | String | js.Object,
      perform: KeyStore => js.Promise[DecryptResult | VerificationResult],
      `type`: typings.nodeJose.nodeJoseStrings.JWS | typings.nodeJose.nodeJoseStrings.JWE
    ): ParseReturn = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], perform = js.Any.fromFunction1(perform))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseReturn]
    }
    
    @scala.inline
    implicit class ParseReturnMutableBuilder[Self <: ParseReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: compact | json): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: Buffer | String | js.Object): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerform(value: KeyStore => js.Promise[DecryptResult | VerificationResult]): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: typings.nodeJose.nodeJoseStrings.JWS | typings.nodeJose.nodeJoseStrings.JWE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
