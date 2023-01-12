package typings.officeJsPreview.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnorePunct extends StObject {
  
  var ignorePunct: js.UndefOr[Boolean] = js.undefined
  
  var ignoreSpace: js.UndefOr[Boolean] = js.undefined
  
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  var matchPrefix: js.UndefOr[Boolean] = js.undefined
  
  var matchSuffix: js.UndefOr[Boolean] = js.undefined
  
  var matchWholeWord: js.UndefOr[Boolean] = js.undefined
  
  var matchWildcards: js.UndefOr[Boolean] = js.undefined
}
object IgnorePunct {
  
  inline def apply(): IgnorePunct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnorePunct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnorePunct] (val x: Self) extends AnyVal {
    
    inline def setIgnorePunct(value: Boolean): Self = StObject.set(x, "ignorePunct", value.asInstanceOf[js.Any])
    
    inline def setIgnorePunctUndefined: Self = StObject.set(x, "ignorePunct", js.undefined)
    
    inline def setIgnoreSpace(value: Boolean): Self = StObject.set(x, "ignoreSpace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSpaceUndefined: Self = StObject.set(x, "ignoreSpace", js.undefined)
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setMatchPrefix(value: Boolean): Self = StObject.set(x, "matchPrefix", value.asInstanceOf[js.Any])
    
    inline def setMatchPrefixUndefined: Self = StObject.set(x, "matchPrefix", js.undefined)
    
    inline def setMatchSuffix(value: Boolean): Self = StObject.set(x, "matchSuffix", value.asInstanceOf[js.Any])
    
    inline def setMatchSuffixUndefined: Self = StObject.set(x, "matchSuffix", js.undefined)
    
    inline def setMatchWholeWord(value: Boolean): Self = StObject.set(x, "matchWholeWord", value.asInstanceOf[js.Any])
    
    inline def setMatchWholeWordUndefined: Self = StObject.set(x, "matchWholeWord", js.undefined)
    
    inline def setMatchWildcards(value: Boolean): Self = StObject.set(x, "matchWildcards", value.asInstanceOf[js.Any])
    
    inline def setMatchWildcardsUndefined: Self = StObject.set(x, "matchWildcards", js.undefined)
  }
}
