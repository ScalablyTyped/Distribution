package typings.openui5.anon

import typings.openui5.sapMTokenMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedTokens extends StObject {
  
  /**
    * the array of tokens that are added. This parameter is used when tokenChange type is "tokenChanged".
    */
  var addedTokens: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * the array of tokens that are removed. This parameter is used when tokenChange type is "tokenChanged".
    */
  var removedTokens: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * the added token or removed token. This parameter is used when tokenChange type is "added" or "removed".
    */
  var token: js.UndefOr[default] = js.undefined
  
  /**
    * the array of removed tokens. This parameter is used when tokenChange type is "removedAll".
    */
  var tokens: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * type of tokenChange event. There are four TokenChange types: "added", "removed", "removedAll", "tokensChanged".
    * Use sap.m.Tokenizer.TokenChangeType.Added for "added", sap.m.Tokenizer.TokenChangeType.Removed for "removed",
    * sap.m.Tokenizer.TokenChangeType.RemovedAll for "removedAll" and sap.m.Tokenizer.TokenChangeType.TokensChanged
    * for "tokensChanged".
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AddedTokens {
  
  inline def apply(): AddedTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddedTokens]
  }
  
  extension [Self <: AddedTokens](x: Self) {
    
    inline def setAddedTokens(value: js.Array[default]): Self = StObject.set(x, "addedTokens", value.asInstanceOf[js.Any])
    
    inline def setAddedTokensUndefined: Self = StObject.set(x, "addedTokens", js.undefined)
    
    inline def setAddedTokensVarargs(value: default*): Self = StObject.set(x, "addedTokens", js.Array(value*))
    
    inline def setRemovedTokens(value: js.Array[default]): Self = StObject.set(x, "removedTokens", value.asInstanceOf[js.Any])
    
    inline def setRemovedTokensUndefined: Self = StObject.set(x, "removedTokens", js.undefined)
    
    inline def setRemovedTokensVarargs(value: default*): Self = StObject.set(x, "removedTokens", js.Array(value*))
    
    inline def setToken(value: default): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTokens(value: js.Array[default]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: default*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
