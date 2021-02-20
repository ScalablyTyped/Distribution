package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadConcern extends StObject {
  
  var level: ReadConcernLevel = js.native
}
object ReadConcern {
  
  @scala.inline
  def apply(level: ReadConcernLevel): ReadConcern = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConcern]
  }
  
  @scala.inline
  implicit class ReadConcernMutableBuilder[Self <: ReadConcern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: ReadConcernLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
