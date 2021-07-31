package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NaptrRecord extends StObject {
  
  var flags: String
  
  var order: Double
  
  var preference: Double
  
  var regexp: String
  
  var replacement: String
  
  var service: String
}
object NaptrRecord {
  
  @scala.inline
  def apply(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String
  ): NaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[NaptrRecord]
  }
  
  @scala.inline
  implicit class NaptrRecordMutableBuilder[Self <: NaptrRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreference(value: Double): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
