package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathSegment extends StObject {
  
  /** If specified, use the key to retrieve the value in a Struct. */
  var key: js.UndefOr[String] = js.native
}
object PathSegment {
  
  @scala.inline
  def apply(): PathSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathSegment]
  }
  
  @scala.inline
  implicit class PathSegmentMutableBuilder[Self <: PathSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
