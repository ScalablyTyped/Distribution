package typings.octokitOpenapiTypes.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  var labels: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var manifest: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var tag: js.UndefOr[DigestName] = js.undefined
}
object Manifest {
  
  inline def apply(): Manifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: Record[String, Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setManifest(value: Record[String, Any]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setTag(value: DigestName): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
