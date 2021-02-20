package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the ShapeView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeViewLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Boolean] = js.native
}
object ShapeViewLoadOptions {
  
  @scala.inline
  def apply(): ShapeViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewLoadOptions]
  }
  
  @scala.inline
  implicit class ShapeViewLoadOptionsMutableBuilder[Self <: ShapeViewLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
  }
}
