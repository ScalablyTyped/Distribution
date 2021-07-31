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
  
  @scala.inline
  def apply(): SiteCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteCollection]
  }
  
  @scala.inline
  implicit class SiteCollectionMutableBuilder[Self <: SiteCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLocationCode(value: NullableOption[String]): Self = StObject.set(x, "dataLocationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocationCodeNull: Self = StObject.set(x, "dataLocationCode", null)
    
    @scala.inline
    def setDataLocationCodeUndefined: Self = StObject.set(x, "dataLocationCode", js.undefined)
    
    @scala.inline
    def setHostname(value: NullableOption[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setRoot(value: NullableOption[Root]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
