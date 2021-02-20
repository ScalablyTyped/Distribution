package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Feature
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPXOptions extends StObject {
  
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, _]] = js.native
}
object GPXOptions {
  
  @scala.inline
  def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  
  @scala.inline
  implicit class GPXOptionsMutableBuilder[Self <: GPXOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadExtensions(value: (/* feature */ Feature, /* node */ Node) => _): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
  }
}
