package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProperties extends StObject {
  
  /**
    * Describes the properties of the bullets at the associated level. A list has at most nine levels of nesting with nesting level 0 corresponding to the top-most level and nesting level
    * 8 corresponding to the most nested level. The nesting levels are returned in ascending order with the least nested returned first.
    */
  var nestingLevels: js.UndefOr[js.Array[NestingLevel]] = js.native
}
object ListProperties {
  
  @scala.inline
  def apply(): ListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProperties]
  }
  
  @scala.inline
  implicit class ListPropertiesMutableBuilder[Self <: ListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNestingLevels(value: js.Array[NestingLevel]): Self = StObject.set(x, "nestingLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelsUndefined: Self = StObject.set(x, "nestingLevels", js.undefined)
    
    @scala.inline
    def setNestingLevelsVarargs(value: NestingLevel*): Self = StObject.set(x, "nestingLevels", js.Array(value :_*))
  }
}
