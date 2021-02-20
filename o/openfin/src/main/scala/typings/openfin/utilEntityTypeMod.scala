package typings.openfin

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.transportMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilEntityTypeMod {
  
  @JSImport("openfin/_v2/util/entity-type", "getEntityTypeHelpers")
  @js.native
  def getEntityTypeHelpers(entityType: EntityType): EntityTypeHelpers = js.native
  
  @JSImport("openfin/_v2/util/entity-type", "getInstanceByEntityType")
  @js.native
  def getInstanceByEntityType(entityType: String, wire: default, identity: Identity): js.Object = js.native
  
  @js.native
  trait EntityTypeHelpers extends StObject {
    
    var isExternal: Boolean = js.native
    
    var isFrame: Boolean = js.native
    
    var isView: Boolean = js.native
    
    var isWindow: Boolean = js.native
  }
  object EntityTypeHelpers {
    
    @scala.inline
    def apply(isExternal: Boolean, isFrame: Boolean, isView: Boolean, isWindow: Boolean): EntityTypeHelpers = {
      val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], isFrame = isFrame.asInstanceOf[js.Any], isView = isView.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityTypeHelpers]
    }
    
    @scala.inline
    implicit class EntityTypeHelpersMutableBuilder[Self <: EntityTypeHelpers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFrame(value: Boolean): Self = StObject.set(x, "isFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsView(value: Boolean): Self = StObject.set(x, "isView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
    }
  }
}
