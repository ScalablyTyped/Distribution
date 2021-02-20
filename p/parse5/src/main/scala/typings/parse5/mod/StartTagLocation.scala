package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTagLocation extends Location {
  
  /**
    * Start tag attributes' location info
    */
  var attrs: AttributesLocation = js.native
}
object StartTagLocation {
  
  @scala.inline
  def apply(
    attrs: AttributesLocation,
    endCol: Double,
    endLine: Double,
    endOffset: Double,
    startCol: Double,
    startLine: Double,
    startOffset: Double
  ): StartTagLocation = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTagLocation]
  }
  
  @scala.inline
  implicit class StartTagLocationMutableBuilder[Self <: StartTagLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: AttributesLocation): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
  }
}
