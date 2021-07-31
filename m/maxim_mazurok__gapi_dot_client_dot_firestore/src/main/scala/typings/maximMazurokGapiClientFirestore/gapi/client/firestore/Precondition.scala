package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precondition extends StObject {
  
  /** When set to `true`, the target document must exist. When set to `false`, the target document must not exist. */
  var exists: js.UndefOr[Boolean] = js.undefined
  
  /** When set, the target document must exist and have been last updated at that time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Precondition {
  
  @scala.inline
  def apply(): Precondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precondition]
  }
  
  @scala.inline
  implicit class PreconditionMutableBuilder[Self <: Precondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
