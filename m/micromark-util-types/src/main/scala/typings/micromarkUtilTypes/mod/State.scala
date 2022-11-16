package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type State = (code : micromark-util-types.micromark-util-types.Code): micromark-util-types.micromark-util-types.State | void
}}}
to avoid circular code involving: 
- micromark-util-types.micromark-util-types.Attempt
- micromark-util-types.micromark-util-types.Initializer
- micromark-util-types.micromark-util-types.State
- micromark-util-types.micromark-util-types.Tokenizer
*/
@js.native
trait State extends StObject {
  
  def apply(code: Code): State | Unit = js.native
}
