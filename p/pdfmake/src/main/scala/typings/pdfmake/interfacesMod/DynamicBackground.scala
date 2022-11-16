package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type DynamicBackground = (currentPage : number, pageSize : pdfmake.pdfmake/interfaces.ContextPageSize): pdfmake.pdfmake/interfaces.Content | null | undefined
}}}
to avoid circular code involving: 
- pdfmake.pdfmake/interfaces.Content
- pdfmake.pdfmake/interfaces.DynamicBackground
*/
@js.native
trait DynamicBackground extends StObject {
  
  def apply(currentPage: Double, pageSize: ContextPageSize): js.UndefOr[Content | Null] = js.native
}
