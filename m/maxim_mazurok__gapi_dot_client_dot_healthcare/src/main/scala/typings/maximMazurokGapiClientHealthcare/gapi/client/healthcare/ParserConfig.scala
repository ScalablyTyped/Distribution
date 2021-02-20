package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserConfig extends StObject {
  
  /** Determines whether messages with no header are allowed. */
  var allowNullHeader: js.UndefOr[Boolean] = js.native
  
  /** Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator. */
  var segmentTerminator: js.UndefOr[String] = js.native
}
object ParserConfig {
  
  @scala.inline
  def apply(): ParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserConfig]
  }
  
  @scala.inline
  implicit class ParserConfigMutableBuilder[Self <: ParserConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNullHeader(value: Boolean): Self = StObject.set(x, "allowNullHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullHeaderUndefined: Self = StObject.set(x, "allowNullHeader", js.undefined)
    
    @scala.inline
    def setSegmentTerminator(value: String): Self = StObject.set(x, "segmentTerminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentTerminatorUndefined: Self = StObject.set(x, "segmentTerminator", js.undefined)
  }
}
