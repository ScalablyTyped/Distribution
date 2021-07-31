package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WKTOptions extends StObject {
  
  var splitCollection: js.UndefOr[Boolean] = js.undefined
}
object WKTOptions {
  
  @scala.inline
  def apply(): WKTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WKTOptions]
  }
  
  @scala.inline
  implicit class WKTOptionsMutableBuilder[Self <: WKTOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplitCollection(value: Boolean): Self = StObject.set(x, "splitCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitCollectionUndefined: Self = StObject.set(x, "splitCollection", js.undefined)
  }
}
