package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldDatasetMod {
  
  @JSImport("next-seo/lib/jsonld/dataset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideRest: DatasetJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DatasetJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var description: String
    
    var license: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object DatasetJsonLdProps {
    
    inline def apply(description: String, name: String): DatasetJsonLdProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatasetJsonLdProps]
    }
    
    extension [Self <: DatasetJsonLdProps](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
