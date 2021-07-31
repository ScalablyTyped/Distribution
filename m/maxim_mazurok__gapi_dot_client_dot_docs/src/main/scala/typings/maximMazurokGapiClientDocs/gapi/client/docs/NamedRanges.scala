package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedRanges extends StObject {
  
  /** The name that all the named ranges share. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The NamedRanges that share the same name. */
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
}
object NamedRanges {
  
  @scala.inline
  def apply(): NamedRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedRanges]
  }
  
  @scala.inline
  implicit class NamedRangesMutableBuilder[Self <: NamedRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRanges(value: js.Array[NamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    @scala.inline
    def setNamedRangesVarargs(value: NamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value :_*))
  }
}
