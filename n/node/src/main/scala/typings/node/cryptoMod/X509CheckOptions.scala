package typings.node.cryptoMod

import typings.node.nodeStrings.always
import typings.node.nodeStrings.default
import typings.node.nodeStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CheckOptions extends StObject {
  
  /**
    * @default false
    */
  var multiLabelWildcards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default true
    */
  var partialWildcards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var singleLabelSubdomains: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default 'always'
    */
  var subject: js.UndefOr[always | default | never] = js.undefined
  
  /**
    * @default true
    */
  var wildcards: js.UndefOr[Boolean] = js.undefined
}
object X509CheckOptions {
  
  inline def apply(): X509CheckOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CheckOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CheckOptions] (val x: Self) extends AnyVal {
    
    inline def setMultiLabelWildcards(value: Boolean): Self = StObject.set(x, "multiLabelWildcards", value.asInstanceOf[js.Any])
    
    inline def setMultiLabelWildcardsUndefined: Self = StObject.set(x, "multiLabelWildcards", js.undefined)
    
    inline def setPartialWildcards(value: Boolean): Self = StObject.set(x, "partialWildcards", value.asInstanceOf[js.Any])
    
    inline def setPartialWildcardsUndefined: Self = StObject.set(x, "partialWildcards", js.undefined)
    
    inline def setSingleLabelSubdomains(value: Boolean): Self = StObject.set(x, "singleLabelSubdomains", value.asInstanceOf[js.Any])
    
    inline def setSingleLabelSubdomainsUndefined: Self = StObject.set(x, "singleLabelSubdomains", js.undefined)
    
    inline def setSubject(value: always | default | never): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setWildcards(value: Boolean): Self = StObject.set(x, "wildcards", value.asInstanceOf[js.Any])
    
    inline def setWildcardsUndefined: Self = StObject.set(x, "wildcards", js.undefined)
  }
}
