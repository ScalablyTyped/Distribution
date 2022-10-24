package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.nextSeo.nextSeoStrings.Organisation
import typings.nextSeo.nextSeoStrings.Person
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldImageMod {
  
  @JSImport("next-seo/lib/jsonld/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ImageJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Creator extends StObject {
    
    var `@type`: Person | Organisation
    
    var name: String
  }
  object Creator {
    
    inline def apply(`@type`: Person | Organisation, name: String): Creator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Creator]
    }
    
    extension [Self <: Creator](x: Self) {
      
      inline def `set@type`(value: Person | Organisation): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageJsonLd extends StObject {
    
    var acquireLicensePage: js.UndefOr[String] = js.undefined
    
    var contentUrl: js.UndefOr[String] = js.undefined
    
    var copyrightNotice: js.UndefOr[String] = js.undefined
    
    var creator: js.UndefOr[Creator] = js.undefined
    
    var creditText: js.UndefOr[String] = js.undefined
    
    var license: js.UndefOr[String] = js.undefined
  }
  object ImageJsonLd {
    
    inline def apply(): ImageJsonLd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageJsonLd]
    }
    
    extension [Self <: ImageJsonLd](x: Self) {
      
      inline def setAcquireLicensePage(value: String): Self = StObject.set(x, "acquireLicensePage", value.asInstanceOf[js.Any])
      
      inline def setAcquireLicensePageUndefined: Self = StObject.set(x, "acquireLicensePage", js.undefined)
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      inline def setCopyrightNotice(value: String): Self = StObject.set(x, "copyrightNotice", value.asInstanceOf[js.Any])
      
      inline def setCopyrightNoticeUndefined: Self = StObject.set(x, "copyrightNotice", js.undefined)
      
      inline def setCreator(value: Creator): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      inline def setCreditText(value: String): Self = StObject.set(x, "creditText", value.asInstanceOf[js.Any])
      
      inline def setCreditTextUndefined: Self = StObject.set(x, "creditText", js.undefined)
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    }
  }
  
  trait ImageJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var images: js.Array[ImageJsonLd]
  }
  object ImageJsonLdProps {
    
    inline def apply(images: js.Array[ImageJsonLd]): ImageJsonLdProps = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageJsonLdProps]
    }
    
    extension [Self <: ImageJsonLdProps](x: Self) {
      
      inline def setImages(value: js.Array[ImageJsonLd]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: ImageJsonLd*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
}
