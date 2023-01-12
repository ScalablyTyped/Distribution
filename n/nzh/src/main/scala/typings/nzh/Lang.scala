package typings.nzh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lang extends StObject {
  
  var ch: String
  
  var ch_d: String
  
  var ch_f: String
  
  var ch_u: String
  
  var m_t: String
  
  var m_u: String
  
  var m_z: String
}
object Lang {
  
  inline def apply(ch: String, ch_d: String, ch_f: String, ch_u: String, m_t: String, m_u: String, m_z: String): Lang = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], ch_d = ch_d.asInstanceOf[js.Any], ch_f = ch_f.asInstanceOf[js.Any], ch_u = ch_u.asInstanceOf[js.Any], m_t = m_t.asInstanceOf[js.Any], m_u = m_u.asInstanceOf[js.Any], m_z = m_z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
    
    inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setCh_d(value: String): Self = StObject.set(x, "ch_d", value.asInstanceOf[js.Any])
    
    inline def setCh_f(value: String): Self = StObject.set(x, "ch_f", value.asInstanceOf[js.Any])
    
    inline def setCh_u(value: String): Self = StObject.set(x, "ch_u", value.asInstanceOf[js.Any])
    
    inline def setM_t(value: String): Self = StObject.set(x, "m_t", value.asInstanceOf[js.Any])
    
    inline def setM_u(value: String): Self = StObject.set(x, "m_u", value.asInstanceOf[js.Any])
    
    inline def setM_z(value: String): Self = StObject.set(x, "m_z", value.asInstanceOf[js.Any])
  }
}
