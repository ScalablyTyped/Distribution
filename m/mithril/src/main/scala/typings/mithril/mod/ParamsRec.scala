package typings.mithril.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsRec
  extends StObject
     with // Ideally, it'd be this:
// `[key: string | number]: Params | !symbol & !object`
/* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | Params]]
object ParamsRec {
  
  inline def apply(): ParamsRec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsRec]
  }
}
