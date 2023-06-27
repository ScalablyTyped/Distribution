package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseUnchangedRegions extends StObject {
  
  /**
    * Defaults to false.
    */
  var collapseUnchangedRegions: js.UndefOr[Boolean] = js.undefined
}
object CollapseUnchangedRegions {
  
  inline def apply(): CollapseUnchangedRegions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseUnchangedRegions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapseUnchangedRegions] (val x: Self) extends AnyVal {
    
    inline def setCollapseUnchangedRegions(value: Boolean): Self = StObject.set(x, "collapseUnchangedRegions", value.asInstanceOf[js.Any])
    
    inline def setCollapseUnchangedRegionsUndefined: Self = StObject.set(x, "collapseUnchangedRegions", js.undefined)
  }
}
