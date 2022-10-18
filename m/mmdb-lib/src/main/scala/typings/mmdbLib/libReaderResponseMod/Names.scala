package typings.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Names extends StObject {
  
  val de: js.UndefOr[String] = js.undefined
  
  val en: String
  
  val es: js.UndefOr[String] = js.undefined
  
  val fr: js.UndefOr[String] = js.undefined
  
  val ja: js.UndefOr[String] = js.undefined
  
  val `pt-BR`: js.UndefOr[String] = js.undefined
  
  val ru: js.UndefOr[String] = js.undefined
  
  val `zh-CN`: js.UndefOr[String] = js.undefined
}
object Names {
  
  inline def apply(en: String): Names = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
  
  extension [Self <: Names](x: Self) {
    
    inline def setDe(value: String): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
    
    inline def setDeUndefined: Self = StObject.set(x, "de", js.undefined)
    
    inline def setEn(value: String): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    inline def setEs(value: String): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    inline def setFr(value: String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
    
    inline def setFrUndefined: Self = StObject.set(x, "fr", js.undefined)
    
    inline def setJa(value: String): Self = StObject.set(x, "ja", value.asInstanceOf[js.Any])
    
    inline def setJaUndefined: Self = StObject.set(x, "ja", js.undefined)
    
    inline def `setPt-BR`(value: String): Self = StObject.set(x, "pt-BR", value.asInstanceOf[js.Any])
    
    inline def `setPt-BRUndefined`: Self = StObject.set(x, "pt-BR", js.undefined)
    
    inline def setRu(value: String): Self = StObject.set(x, "ru", value.asInstanceOf[js.Any])
    
    inline def setRuUndefined: Self = StObject.set(x, "ru", js.undefined)
    
    inline def `setZh-CN`(value: String): Self = StObject.set(x, "zh-CN", value.asInstanceOf[js.Any])
    
    inline def `setZh-CNUndefined`: Self = StObject.set(x, "zh-CN", js.undefined)
  }
}
