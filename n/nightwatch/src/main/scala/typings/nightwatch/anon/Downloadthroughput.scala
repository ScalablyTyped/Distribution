package typings.nightwatch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Downloadthroughput extends StObject {
  
  var download_throughput: Double
  
  var latency: Double
  
  var offline: Boolean
  
  var upload_throughput: Double
}
object Downloadthroughput {
  
  inline def apply(download_throughput: Double, latency: Double, offline: Boolean, upload_throughput: Double): Downloadthroughput = {
    val __obj = js.Dynamic.literal(download_throughput = download_throughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], upload_throughput = upload_throughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadthroughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Downloadthroughput] (val x: Self) extends AnyVal {
    
    inline def setDownload_throughput(value: Double): Self = StObject.set(x, "download_throughput", value.asInstanceOf[js.Any])
    
    inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setUpload_throughput(value: Double): Self = StObject.set(x, "upload_throughput", value.asInstanceOf[js.Any])
  }
}
