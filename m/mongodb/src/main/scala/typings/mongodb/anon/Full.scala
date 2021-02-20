package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceOrMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Full extends StObject {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
}
object Full {
  
  @scala.inline
  def apply(): Full = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
