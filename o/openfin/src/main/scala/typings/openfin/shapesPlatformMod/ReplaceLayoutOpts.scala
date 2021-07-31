package typings.openfin.shapesPlatformMod

import typings.openfin.shapesLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceLayoutOpts extends StObject {
  
  var layout: Layout
}
object ReplaceLayoutOpts {
  
  @scala.inline
  def apply(layout: Layout): ReplaceLayoutOpts = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceLayoutOpts]
  }
  
  @scala.inline
  implicit class ReplaceLayoutOptsMutableBuilder[Self <: ReplaceLayoutOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
