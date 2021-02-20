package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOnly extends StObject {
  
  /** Reads documents at the given time. This may not be older than 60 seconds. */
  var readTime: js.UndefOr[String] = js.native
}
object ReadOnly {
  
  @scala.inline
  def apply(): ReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOnly]
  }
  
  @scala.inline
  implicit class ReadOnlyMutableBuilder[Self <: ReadOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
