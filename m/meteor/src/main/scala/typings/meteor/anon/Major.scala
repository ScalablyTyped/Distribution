package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Major extends StObject {
  
  var major: String = js.native
  
  var minor: String = js.native
  
  var name: String = js.native
  
  var patch: String = js.native
}
object Major {
  
  @scala.inline
  def apply(major: String, minor: String, name: String, patch: String): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
  
  @scala.inline
  implicit class MajorMutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
