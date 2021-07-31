package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneChildContainer extends StObject {
  
  /** The zone's nickname for the child container. */
  var nickname: js.UndefOr[String] = js.undefined
  
  /** The child container's public id. */
  var publicId: js.UndefOr[String] = js.undefined
}
object ZoneChildContainer {
  
  @scala.inline
  def apply(): ZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneChildContainer]
  }
  
  @scala.inline
  implicit class ZoneChildContainerMutableBuilder[Self <: ZoneChildContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
  }
}
