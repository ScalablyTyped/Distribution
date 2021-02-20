package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MajorAxisScale
  extends /* key */ StringDictionary[js.Any] {
  
  var majorAxisScale: String = js.native
  
  var minorAxisScale: String = js.native
  
  var viewportEnd: String = js.native
  
  var viewportStart: String = js.native
}
object MajorAxisScale {
  
  @scala.inline
  def apply(majorAxisScale: String, minorAxisScale: String, viewportEnd: String, viewportStart: String): MajorAxisScale = {
    val __obj = js.Dynamic.literal(majorAxisScale = majorAxisScale.asInstanceOf[js.Any], minorAxisScale = minorAxisScale.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxisScale]
  }
  
  @scala.inline
  implicit class MajorAxisScaleMutableBuilder[Self <: MajorAxisScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajorAxisScale(value: String): Self = StObject.set(x, "majorAxisScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorAxisScale(value: String): Self = StObject.set(x, "minorAxisScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportEnd(value: String): Self = StObject.set(x, "viewportEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportStart(value: String): Self = StObject.set(x, "viewportStart", value.asInstanceOf[js.Any])
  }
}
