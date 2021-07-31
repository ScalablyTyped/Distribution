package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemApplicationMod {
  
  trait ApplicationInfo extends StObject {
    
    var isRunning: Boolean
    
    var parentUuid: js.UndefOr[String] = js.undefined
    
    var uuid: String
  }
  object ApplicationInfo {
    
    @scala.inline
    def apply(isRunning: Boolean, uuid: String): ApplicationInfo = {
      val __obj = js.Dynamic.literal(isRunning = isRunning.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationInfo]
    }
    
    @scala.inline
    implicit class ApplicationInfoMutableBuilder[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUuid(value: String): Self = StObject.set(x, "parentUuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUuidUndefined: Self = StObject.set(x, "parentUuid", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
