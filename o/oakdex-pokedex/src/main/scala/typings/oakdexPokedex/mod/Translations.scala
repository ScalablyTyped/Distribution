package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Translations extends StObject {
  
  var cz: js.UndefOr[String] = js.undefined
  
  var de: String
  
  var dk: js.UndefOr[String] = js.undefined
  
  var en: String
  
  var es: js.UndefOr[String] = js.undefined
  
  var fr: js.UndefOr[String] = js.undefined
  
  var gr: js.UndefOr[String] = js.undefined
  
  var it: js.UndefOr[String] = js.undefined
  
  var jp: js.UndefOr[String] = js.undefined
  
  var pl: js.UndefOr[String] = js.undefined
  
  var tr: js.UndefOr[String] = js.undefined
}
object Translations {
  
  inline def apply(de: String, en: String): Translations = {
    val __obj = js.Dynamic.literal(de = de.asInstanceOf[js.Any], en = en.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Translations] (val x: Self) extends AnyVal {
    
    inline def setCz(value: String): Self = StObject.set(x, "cz", value.asInstanceOf[js.Any])
    
    inline def setCzUndefined: Self = StObject.set(x, "cz", js.undefined)
    
    inline def setDe(value: String): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
    
    inline def setDk(value: String): Self = StObject.set(x, "dk", value.asInstanceOf[js.Any])
    
    inline def setDkUndefined: Self = StObject.set(x, "dk", js.undefined)
    
    inline def setEn(value: String): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    inline def setEs(value: String): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    inline def setFr(value: String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
    
    inline def setFrUndefined: Self = StObject.set(x, "fr", js.undefined)
    
    inline def setGr(value: String): Self = StObject.set(x, "gr", value.asInstanceOf[js.Any])
    
    inline def setGrUndefined: Self = StObject.set(x, "gr", js.undefined)
    
    inline def setIt(value: String): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
    
    inline def setItUndefined: Self = StObject.set(x, "it", js.undefined)
    
    inline def setJp(value: String): Self = StObject.set(x, "jp", value.asInstanceOf[js.Any])
    
    inline def setJpUndefined: Self = StObject.set(x, "jp", js.undefined)
    
    inline def setPl(value: String): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    inline def setTr(value: String): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
  }
}
