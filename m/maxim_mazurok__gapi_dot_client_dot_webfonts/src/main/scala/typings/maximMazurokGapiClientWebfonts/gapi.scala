package typings.maximMazurokGapiClientWebfonts

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWebfonts.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object webfonts {
      
      trait Webfont extends StObject {
        
        /** The category of the font. */
        var category: js.UndefOr[String] = js.undefined
        
        /** The name of the font. */
        var family: js.UndefOr[String] = js.undefined
        
        /** The font files (with all supported scripts) for each one of the available variants, as a key : value map. */
        var files: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: string}
          */ typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.Webfont & TopLevel[js.Any]
              ] = js.undefined
        
        /** This kind represents a webfont object in the webfonts service. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The date (format "yyyy-MM-dd") the font was modified for the last time. */
        var lastModified: js.UndefOr[String] = js.undefined
        
        /** The scripts supported by the font. */
        var subsets: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The available variants for the font. */
        var variants: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The font version. */
        var version: js.UndefOr[String] = js.undefined
      }
      object Webfont {
        
        @scala.inline
        def apply(): Webfont = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Webfont]
        }
        
        @scala.inline
        implicit class WebfontMutableBuilder[Self <: Webfont] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
          
          @scala.inline
          def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
          
          @scala.inline
          def setFiles(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: string}
            */ typings.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.Webfont & TopLevel[js.Any]
          ): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
          
          @scala.inline
          def setSubsets(value: js.Array[String]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSubsetsUndefined: Self = StObject.set(x, "subsets", js.undefined)
          
          @scala.inline
          def setSubsetsVarargs(value: String*): Self = StObject.set(x, "subsets", js.Array(value :_*))
          
          @scala.inline
          def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
          
          @scala.inline
          def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value :_*))
          
          @scala.inline
          def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        }
      }
      
      trait WebfontList extends StObject {
        
        /** The list of fonts currently served by the Google Fonts API. */
        var items: js.UndefOr[js.Array[Webfont]] = js.undefined
        
        /** This kind represents a list of webfont objects in the webfonts service. */
        var kind: js.UndefOr[String] = js.undefined
      }
      object WebfontList {
        
        @scala.inline
        def apply(): WebfontList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WebfontList]
        }
        
        @scala.inline
        implicit class WebfontListMutableBuilder[Self <: WebfontList] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setItems(value: js.Array[Webfont]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          @scala.inline
          def setItemsVarargs(value: Webfont*): Self = StObject.set(x, "items", js.Array(value :_*))
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        }
      }
      
      @js.native
      trait WebfontsResource extends StObject {
        
        /** Retrieves the list of fonts currently served by the Google Fonts Developer API. */
        def list(): Request[WebfontList] = js.native
        def list(request: Accesstoken): Request[WebfontList] = js.native
      }
    }
  }
}
