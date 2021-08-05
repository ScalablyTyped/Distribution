package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteCollection extends StObject {
  
  // The geographic region code for where this site collection resides. Read-only.
  var dataLocationCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The hostname for the site collection. Read-only.
  var hostname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If present, indicates that this is a root site collection in SharePoint. Read-only.
  var root: js.UndefOr[NullableOption[Root]] = js.undefined
}
object SiteCollection {
  
  inline def apply(): SiteCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteCollection]
  }
  
  extension [Self <: SiteCollection](x: Self) {
    
    inline def setDataLocationCode(value: NullableOption[String]): Self = StObject.set(x, "dataLocationCode", value.asInstanceOf[js.Any])
    
    inline def setDataLocationCodeNull: Self = StObject.set(x, "dataLocationCode", null)
    
    inline def setDataLocationCodeUndefined: Self = StObject.set(x, "dataLocationCode", js.undefined)
    
    inline def setHostname(value: NullableOption[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setRoot(value: NullableOption[Root]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
