package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oid extends StObject {
  
  var oid: String
  
  var path: String
  
  var ref_name: String
  
  var size: Double
}
object Oid {
  
  @scala.inline
  def apply(oid: String, path: String, ref_name: String, size: Double): Oid = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref_name = ref_name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
  
  @scala.inline
  implicit class OidMutableBuilder[Self <: Oid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef_name(value: String): Self = StObject.set(x, "ref_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
