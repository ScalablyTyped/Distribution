package typings.nodemailerSesTransport

import typings.awsSdk.mod.SES
import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer-ses-transport", JSImport.Namespace)
  @js.native
  def apply(options: SesOptions): Transport = js.native
  
  @js.native
  trait SesOptions extends StObject {
    
    var SES: typings.awsSdk.mod.SES = js.native
    
    var component: js.UndefOr[String] = js.native
    
    var maxConnections: js.UndefOr[Double] = js.native
    
    var sendingRate: js.UndefOr[Double] = js.native
  }
  object SesOptions {
    
    @scala.inline
    def apply(SES: SES): SesOptions = {
      val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
      __obj.asInstanceOf[SesOptions]
    }
    
    @scala.inline
    implicit class SesOptionsMutableBuilder[Self <: SesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setSES(value: SES): Self = StObject.set(x, "SES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendingRate(value: Double): Self = StObject.set(x, "sendingRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendingRateUndefined: Self = StObject.set(x, "sendingRate", js.undefined)
    }
  }
}
