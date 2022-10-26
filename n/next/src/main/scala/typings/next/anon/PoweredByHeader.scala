package typings.next.anon

import typings.next.distServerRenderResultMod.default
import typings.next.distServerSendPayloadMod.PayloadOptions
import typings.next.nextStrings.html
import typings.next.nextStrings.json
import typings.next.nextStrings.rsc
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoweredByHeader extends StObject {
  
  var generateEtags: Boolean
  
  var options: js.UndefOr[PayloadOptions] = js.undefined
  
  var poweredByHeader: Boolean
  
  var req: IncomingMessage
  
  var res: ServerResponse[IncomingMessage]
  
  var result: default
  
  var `type`: html | json | rsc
}
object PoweredByHeader {
  
  inline def apply(
    generateEtags: Boolean,
    poweredByHeader: Boolean,
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    result: default,
    `type`: html | json | rsc
  ): PoweredByHeader = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoweredByHeader]
  }
  
  extension [Self <: PoweredByHeader](x: Self) {
    
    inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PayloadOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
    
    inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResult(value: default): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: html | json | rsc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
