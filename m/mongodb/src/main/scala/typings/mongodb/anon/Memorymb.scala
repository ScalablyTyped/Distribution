package typings.mongodb.anon

import typings.bson.mod.Int32
import typings.mongodb.mongodbStrings.awsDotlambda
import typings.mongodb.mongodbStrings.azureDotfunc
import typings.mongodb.mongodbStrings.gcpDotfunc
import typings.mongodb.mongodbStrings.vercel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Memorymb extends StObject {
  
  var memory_mb: js.UndefOr[Int32] = js.undefined
  
  var name: awsDotlambda | gcpDotfunc | azureDotfunc | vercel
  
  var region: js.UndefOr[String] = js.undefined
  
  var timeout_sec: js.UndefOr[Int32] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Memorymb {
  
  inline def apply(name: awsDotlambda | gcpDotfunc | azureDotfunc | vercel): Memorymb = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memorymb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Memorymb] (val x: Self) extends AnyVal {
    
    inline def setMemory_mb(value: Int32): Self = StObject.set(x, "memory_mb", value.asInstanceOf[js.Any])
    
    inline def setMemory_mbUndefined: Self = StObject.set(x, "memory_mb", js.undefined)
    
    inline def setName(value: awsDotlambda | gcpDotfunc | azureDotfunc | vercel): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTimeout_sec(value: Int32): Self = StObject.set(x, "timeout_sec", value.asInstanceOf[js.Any])
    
    inline def setTimeout_secUndefined: Self = StObject.set(x, "timeout_sec", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
