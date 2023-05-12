package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  enabled :boolean,   interval :number,   timeout :number,   filePrefix :string}> */
trait Partialenabledbooleaninte extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filePrefix: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Partialenabledbooleaninte {
  
  inline def apply(): Partialenabledbooleaninte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialenabledbooleaninte]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialenabledbooleaninte] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilePrefix(value: String): Self = StObject.set(x, "filePrefix", value.asInstanceOf[js.Any])
    
    inline def setFilePrefixUndefined: Self = StObject.set(x, "filePrefix", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
