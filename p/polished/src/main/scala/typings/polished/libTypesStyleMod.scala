package typings.polished

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesStyleMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Styles = {[ruleOrSelector: string] : string | number | polished.polished/lib/types/style.Styles}
  }}}
  to avoid circular code involving: 
  - polished.polished/lib/types/style.Styles
  */
  trait Styles
    extends StObject
       with /* ruleOrSelector */ StringDictionary[String | Double | Styles]
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
  }
}
