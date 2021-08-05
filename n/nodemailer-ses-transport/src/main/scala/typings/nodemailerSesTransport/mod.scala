package typings.nodemailerSesTransport

import typings.awsSdk.mod.SES
import typings.nodemailer.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: SesOptions): Transport = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  @JSImport("nodemailer-ses-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SesOptions extends StObject {
    
    var SES: typings.awsSdk.mod.SES
    
    var component: js.UndefOr[String] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var sendingRate: js.UndefOr[Double] = js.undefined
  }
  object SesOptions {
    
    inline def apply(SES: SES): SesOptions = {
      val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
      __obj.asInstanceOf[SesOptions]
    }
    
    extension [Self <: SesOptions](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setSES(value: SES): Self = StObject.set(x, "SES", value.asInstanceOf[js.Any])
      
      inline def setSendingRate(value: Double): Self = StObject.set(x, "sendingRate", value.asInstanceOf[js.Any])
      
      inline def setSendingRateUndefined: Self = StObject.set(x, "sendingRate", js.undefined)
    }
  }
}
