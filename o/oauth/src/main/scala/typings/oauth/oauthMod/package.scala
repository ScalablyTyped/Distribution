package typings.oauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauthMod {
  import typings.node.Buffer
  import typings.node.httpMod.IncomingMessage
  import typings.oauth.Anon_Data

  type dataCallback = js.Function3[
    /* err */ Anon_Data, 
    /* result */ js.UndefOr[String | Buffer], 
    /* response */ js.UndefOr[IncomingMessage], 
    js.Any
  ]
  type oauth1tokenCallback = js.Function4[
    /* err */ Anon_Data, 
    /* token */ String, 
    /* token_secret */ String, 
    /* parsedQueryString */ js.Any, 
    js.Any
  ]
  type oauth2tokenCallback = js.Function4[
    /* err */ Anon_Data, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* result */ js.Any, 
    js.Any
  ]
}
