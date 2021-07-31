package typings.openfin

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.transportMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilEntityTypeMod {
  
  @JSImport("openfin/_v2/util/entity-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEntityTypeHelpers(entityType: EntityType): EntityTypeHelpers = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntityTypeHelpers")(entityType.asInstanceOf[js.Any]).asInstanceOf[EntityTypeHelpers]
  
  @scala.inline
  def getInstanceByEntityType(entityType: String, wire: default, identity: Identity): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceByEntityType")(entityType.asInstanceOf[js.Any], wire.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait EntityTypeHelpers extends StObject {
    
    var isExternal: Boolean
    
    var isFrame: Boolean
    
    var isView: Boolean
    
    var isWindow: Boolean
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
