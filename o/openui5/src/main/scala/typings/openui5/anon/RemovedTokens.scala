package typings.openui5.anon

import typings.openui5.sapMTokenMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovedTokens extends StObject {
  
  /**
    * The array of tokens that are added. This parameter is used when tokenUpdate type is "added".
    */
  var addedTokens: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * The array of tokens that are removed. This parameter is used when tokenUpdate type is "removed".
    */
  var removedTokens: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Type of tokenChange event. There are two TokenUpdate types: "added", "removed" Use sap.m.Tokenizer.TokenUpdateType.Added
    * for "added" and sap.m.Tokenizer.TokenUpdateType.Removed for "removed".
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object RemovedTokens {
  
  inline def apply(): RemovedTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovedTokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemovedTokens] (val x: Self) extends AnyVal {
    
    inline def setAddedTokens(value: js.Array[default]): Self = StObject.set(x, "addedTokens", value.asInstanceOf[js.Any])
    
    inline def setAddedTokensUndefined: Self = StObject.set(x, "addedTokens", js.undefined)
    
    inline def setAddedTokensVarargs(value: default*): Self = StObject.set(x, "addedTokens", js.Array(value*))
    
    inline def setRemovedTokens(value: js.Array[default]): Self = StObject.set(x, "removedTokens", value.asInstanceOf[js.Any])
    
    inline def setRemovedTokensUndefined: Self = StObject.set(x, "removedTokens", js.undefined)
    
    inline def setRemovedTokensVarargs(value: default*): Self = StObject.set(x, "removedTokens", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
